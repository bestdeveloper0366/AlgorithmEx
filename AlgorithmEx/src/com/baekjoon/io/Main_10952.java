package com.baekjoon;

import java.util.Scanner;

public class Main_10952 {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

       while(true){
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x==0 && y==0) break;
           System.out.println(x+y);
       }
    }
}
