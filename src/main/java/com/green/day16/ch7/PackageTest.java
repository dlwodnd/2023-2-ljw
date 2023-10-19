package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.Parent;
//import com.green.day15.ch7.*; = ch7에 포함된 모든 클래스를 import한 것과 같다.
import static com.green.day13.ch6.MyMath2.print;
public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        print();
    }
}
/*
private를 적용한 멤버필드에 값을 넣는법
1. 생성자를 이용하는방법

2. 메소드를 이용하는 방법
 */
/*
private를 적용한 멤버필드에 값을 가져오는 방법
메소드를 이용하는 밖에 없다.
 */
