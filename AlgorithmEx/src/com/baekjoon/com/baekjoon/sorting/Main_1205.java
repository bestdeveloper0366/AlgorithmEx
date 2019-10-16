package com.baekjoon.com.baekjoon.sorting;

import java.util.Scanner;

// 백준 - 1205 등수구하기
public class Main_1205 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();     //리스트에 있는 점수
        if (N == 0) {
            System.out.println(1);
            return;
        }
        long song = sc.nextLong();
        long P = sc.nextLong();   //랭킹에 올라갈 수 있는 점수
        long[] score = new long[N];
        int rank = 1;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextLong();
        }

        if (N == P && score[N - 1] >= song) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (score[i] > song)
                rank++;
            else
                break;
        }

        System.out.println(rank);
        sc.close();
    }

}
