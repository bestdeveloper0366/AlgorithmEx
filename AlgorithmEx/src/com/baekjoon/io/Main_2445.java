package com.baekjoon.io;

import java.util.Scanner;

public class Main_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            for (int j = 0; j < 2 * (N - i - 1); j++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");

            System.out.println(" ");
        }

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N - x; y++)
                System.out.print("*");
            for (int y = 0; y < 2 * x; y++)
                System.out.print(" ");
            for (int y = 0; y < N - x; y++)
                System.out.print("*");

            System.out.println(" ");
        }
    }
}
