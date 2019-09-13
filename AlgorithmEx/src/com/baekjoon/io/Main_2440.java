package com.baekjoon.io;

import java.util.Scanner;

public class Main_2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-->0){
            for (int j = 0; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
