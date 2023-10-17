package com.asdf;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int z = 0;
        for(int i = 1 ; i <= 20 ; i++){
            if ( i % 2 == 0 ){
                x += i * i;
                z++;
            }
        }
        System.out.println(x);
        System.out.println(z);
    }
}
