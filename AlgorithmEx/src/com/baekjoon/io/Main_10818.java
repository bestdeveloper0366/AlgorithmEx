package com.baekjoon.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_10818 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        System.out.println(min + " " + max);
    }
}
