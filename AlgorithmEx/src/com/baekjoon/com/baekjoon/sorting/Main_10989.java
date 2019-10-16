package com.baekjoon.com.baekjoon.sorting;

import java.io.*;


/*
* 수 정렬하기3
* https://www.acmicpc.net/problem/10989
* */
public class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] countArr = new int[10001];
        int cnt = 0;

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        for (int i : arr) {
            countArr[i]++;
        }
        for (int i : countArr) {
            if (i != 0) {
                for (int j = 0; j < i; j++)
                    bw.write(cnt + "\n");
            }
            cnt++;
        }
        bw.close();
        br.close();
    }
}

