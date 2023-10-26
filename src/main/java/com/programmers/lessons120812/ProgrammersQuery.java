package com.programmers.lessons120812;

import com.green.day7.ch5.Array;

import java.util.Arrays;

public class ProgrammersQuery {
    public static void main(String[] args) {
        SolutionQuery query = new SolutionQuery();
        int[] arr ={0, 1, 2, 3, 4};
        int[][] multiarr={{0, 3},{1, 2},{1, 4}};
        int[] answer = query.solution(arr,multiarr);
        System.out.println(Arrays.toString(answer));

    }

}
class SolutionQuery {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++){
            int tmp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = tmp;
        }
        return answer;
    }
}