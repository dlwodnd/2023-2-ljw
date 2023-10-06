package com.asdf;

public class Test {
    public static void main(String[] args) {
        int [] num_list = {5,7,8,3};
        int answer = 0;
        int numx = 1;
        int nump = 0;
        for (int i = 0 ; i < num_list.length ; i++){
            int x = num_list[i];
            numx *= x;
            nump += x;
        }
        System.out.println(numx);
        System.out.println(nump);
    }
}
