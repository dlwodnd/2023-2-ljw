package com.programmers.lessons120812;

import java.util.*;

public class ModeSolution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3,3,3,3,3,3};
        int answer =sol.solution(arr);
        Arrays.sort(arr);
        System.out.println(answer);
    }


}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < array.length ; i++){
            if (i > 0 && array[i] == array[i-1]){
                continue;
            }
            map.put(array[i],0);
        }
        for (int i = 0; i < array.length; i++){
            map.replace(array[i], map.get(array[i])+1);
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (map.get(array[i]) > max){
                max = map.get(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++){
            if (map.get(array[i]) == max){
                answer = array[i];
                count++;
            }
        }
        return count > 1 ? -1 : answer;
    }
}
