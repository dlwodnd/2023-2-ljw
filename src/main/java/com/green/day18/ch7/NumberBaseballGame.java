package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();
    }
}
class NumberBaseball {
    private final int GAME_COUNT;
    private final int[] gameNumbers;
    public NumberBaseball(int count){
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }
    public void start(){
        setRandomNumNotDuplicate();
        getUserInput();
    }
    private void getUserInput(){
        Scanner scan = new Scanner(System.in);
        int[] userArr = new int[GAME_COUNT];
        for(int i = 0; i < GAME_COUNT; i++){
            System.out.printf("%d 숫자", i+1);
            userArr[i] = scan.nextInt();
        }
        boolean r = isContinueCheckResult(userArr);

        scan.close();
    }
    public boolean isContinueCheckResult(int[] arr){
        int strike = 0, ball = 0, out;
        for (int i = 0; i < GAME_COUNT ; i++){
            for(int z = 0; z <arr.length; z++){
                if(gameNumbers[i] == arr[z]){
                    if(i==z){
                        strike++;
                    }
                    else{
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        return true;
    }
    public void setRandomNumNotDuplicate(){
        for (int i = 0; i < gameNumbers.length; i++){
            int rVal = (int)(Math.random() * 10);
            gameNumbers[i] = rVal;
            for(int j = 0; j < i; j++){
                if(gameNumbers[i] == gameNumbers[j]){
                    i--;
                    break;
                }
            }
        }
    }
}
