package com.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 모의고사
public class Solution {

    public static int[] solution(int[] answers) {

        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(0);
        }

        for (int i = 0; i < answers.length; i++) {
            if (std1[i % 5] == answers[i]) {
                list.set(0, list.get(0) + 1);
            } else if (std2[i % 8] == answers[i]) {
                list.set(1, list.get(1) + 1);
            } else if (std3[i % 10] == answers[i]) {
                list.set(2, list.get(2) + 1);
            }
        }

        int max = Collections.max(list);

        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (max == list.get(i)) {
                returnList.add(i + 1);
            }
        }

        int[] answer = new int[returnList.size()];
        for (int i = 0; i < returnList.size(); i++) {
            answer[i] = returnList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2};
        System.out.print(Arrays.toString(solution(answer)));
        System.out.print(Arrays.toString(solution(answer2)));

    }
}
