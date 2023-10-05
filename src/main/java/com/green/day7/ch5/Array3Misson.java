package com.green.day7.ch5;

public class Array3Misson {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15,20,12,13,14};

        int[] arr2 = new int[arr1.length + 1];
        //arr2는 길이가 4이고, arr1과 같은 방은 같은 값을 가지고 있고
        //3번 방은 20을 갖고 있는 배열을 만들어 주세요.


        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[arr1.length] = 20;
        for (int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }
}