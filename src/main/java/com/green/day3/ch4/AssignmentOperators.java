package com.green.day3.ch4;

public class AssignmentOperators {
    public static void main(String[] args){
        //복합 대입 연산자.

        int n1,n2,n3;
        n3=10;
        n1=n2=n3;
        //대입연산자를 만나면 오른쪽으로.
        //대입연산자를 또만나면 더 오른쪽으로 이동함.
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n",n1,n2,n3);


        n1=n1+4;    // n1+=4;

        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n",n1,n2,n3);

        n2++;
        ++n2;
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n",n1,n2,n3);


        n3--;
        --n3;
        System.out.printf("n1 : %d, n2 : %d, n3 : %d",n1,n2,n3);




    }
}
