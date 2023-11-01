package com.programmers.lessons120812;
import java.util.*;

public class PgsFive {
    public static void main(String[] args) {
        SolutionFive five = new SolutionFive();
        int[] arr= five.solution(5,555);
        System.out.println(Arrays.toString(arr));
    }
}

class SolutionFive {
    public int[] solution(int l, int r) {
        int[] arrx = {-1};
        List<Integer> list = new ArrayList();
        for(int i = l; i <= r ; i++){
            String str = "" + i;
            char[] chararr = str.toCharArray();
            int count = 0;
            for(int j = 0; j < chararr.length; j++){
                if(chararr[j] == '0' || chararr[j] == '5'){
                    count++;
                }else{
                    break;
                }
            }
            if(count == chararr.length){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        int num = 0;
        for(Integer i : list){
            answer[num++] = (int)i;
        }
        if(answer.length == 0){
            return arrx;
        }
        return answer;
    }
}