package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for(int i= 0; i<N; i++){
            sum += (int)str.charAt(i)-48;
        }
        bw.write(sum + "\n") ;

        bw.close();
        br.close();
    }
}
