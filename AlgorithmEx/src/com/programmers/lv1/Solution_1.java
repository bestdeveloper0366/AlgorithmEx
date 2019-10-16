package com.programmers.lv1;

import java.util.*;

//Lv1. 완주하지 못한 선수
public class Solution_1 {

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
        System.out.println(solution2(participant, completion));

    }

    // 배열 사용
    static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }

    // Hash-Map 사용
    // keySet :
    // getOrDefault :
    static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for(String p : participant)
            hm.put(p, hm.getOrDefault(p, 0)+1);
        for(String p : completion)
            hm.put(p, 0);

        for(String key : hm.keySet()){
            if(hm.get(key) != 0)
                answer = key;
        }
        return answer;
    }
}
