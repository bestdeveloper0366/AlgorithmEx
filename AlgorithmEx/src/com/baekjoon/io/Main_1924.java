package com.baekjoon.io;

import java.time.LocalDate;
import java.util.Scanner;

public class Main_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.nextLine().split(" ");
        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);
        LocalDate localDate = LocalDate.of(2007, month, day);
        System.out.println(localDate.getDayOfWeek().toString().substring(0, 3));
    }
}

