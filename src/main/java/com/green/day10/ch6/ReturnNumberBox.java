package com.green.day10.ch6;

public class ReturnNumberBox {
    int sum(int n1, int n2) {
        return n1 + n2;
        //이 경우는 return 값이 30으로 정의 된다.
        //void가 있으면 return을 하지 않아도 된다.
    }
    int abs(int n1){
        return n1 < 0 ? -n1 : n1;
        /*if(n1 < 0){
            return -n;
        } 위의 식과 동일
         */
        //결과값 수정은 = 이 있어야 한다.
    }
}
