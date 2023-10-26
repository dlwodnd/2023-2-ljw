package com.programmers.lessons120812;

import java.util.Arrays;

public class ProgrammersFountain {
    public static void main(String[] args) {
        Fractions fractions = new Fractions();
        int[] arr = {5,2,5,2};
        int[] answer = fractions.solution(arr[0],arr[1],arr[2],arr[3]);
        System.out.println(Arrays.toString(answer));

    }

}
class Fractions {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(numer1 % denom1 == 0){
            numer1 /= denom1;
            denom1 = 1;
        }
        if(numer2 % denom2 == 0){
            numer2 /= denom2;
            denom2 = 1;
        }
        for(int i = 1 ; i <= denom1*denom2; i++){
            if(i % denom1 == 0 && i % denom2 == 0){
                answer[0] = numer1 * i / denom1 + numer2 * i / denom2;
                answer[1] = i;
                break;
            }
        }
        if(answer[1] % answer[0] == 0){
            answer[1] = answer[1] / answer[0];
            answer[0] = 1;
        }
        if(answer[0] % answer[1] == 0){
            answer[0] = answer[0] / answer[1];
            answer[1] = 1;
        }
        return answer;
    }
}