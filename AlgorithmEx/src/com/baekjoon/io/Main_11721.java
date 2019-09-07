package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_11721 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int cnt = 1;

        for(int i= 0; i<str.length(); i++){
            bw.write(str.charAt(i)) ;
            if(cnt % 10 == 0) {
                bw.write("\n");
            }
            cnt++;
        }
        bw.close();
        br.close();
    }
}
