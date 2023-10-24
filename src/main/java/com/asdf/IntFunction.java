package com.asdf;

public class IntFunction {
    public static void main(String[] args) {
        int num = 626331;
        for (int i = 1; i <= 500; i++){
            System.out.println("i"+i);
            System.out.println("x" + num);
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            System.out.println("y" + num);
            if (num == 1){
                System.out.println(i);
                break;
            }
        }
    }

}



