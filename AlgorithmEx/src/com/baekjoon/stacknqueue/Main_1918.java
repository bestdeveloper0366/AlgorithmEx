package com.baekjoon.stacknqueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


//1918번 후위표기식
public class Main_1918 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        System.out.println(postFixPrint(c));

        br.close();
    }

    public static String postFixPrint(char[] c){

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i =0; i< c.length; i++){

            if(Character.isLetter(c[i])){
                sb.append(c[i]);
            }else if(c[i] == '('){
                st.push(c[i]);
            }else if(c[i] == ')'){
                while(st.size() > 0 && st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
            }else{
                if(c[i]== '*' || c[i]=='/'){
                    while (st.size() > 0 && (st.peek() == '*' || st.peek() == '/' )){
                        sb.append(st.pop());
                    }
                }else if(c[i] == '+' || c[i] == '-'){
                    while (st.size() > 0 &&(st.peek() == '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/')){
                        sb.append(st.pop());
                    }
                }
                st.push(c[i]);
            }
        }

        while (!st.isEmpty()) {
           sb.append(st.pop());
        }

        return sb.toString();
    }

}
