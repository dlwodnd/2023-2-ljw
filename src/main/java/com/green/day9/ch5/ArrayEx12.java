package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for(int i = 0; i<names.length ; i++){
            System.out.printf("names[%d] : %s\n",i,names[i]);
        }

        names [1] = "Woo";
        System.out.println(Arrays.toString(names));

        for(String str : names){ //foreach문(index문 사용불가)
            System.out.println(str);
        }
        System.out.println("========================");

        for (int str = 0 ; str <names.length ; str++ ){
            System.out.println(names[str]);
        }
    }
}
