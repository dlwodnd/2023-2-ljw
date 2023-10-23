package com.asdf;

public class IntFunction{
    public static void main(String[] args) {
        int[] x = {1,2,3,5,8,7,4,1,9,10};
        int d = 0;
        String str = "" ;
        String str1 = "" ;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0 ) {
                str += x[i];
            }else {
                str1 += x[i];
            }
        }
        System.out.println(str);
        System.out.println(str1);
        d = Integer.parseInt(str) + Integer.parseInt(str1);
        System.out.println(d);

    }
}


