package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.Parent;
//import com.green.day15.ch7.*; = 클래스명 대신 *[와일드카드]을 입력하게 되면 ch7에 포함된 모든 클래스를 import한 것과 같다.
import static com.green.day13.ch6.MyMath2.print;
//import static 은 스태틱 멤버필드를 사용하고싶을 때 사용한다.
public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        //final//
        //클래스 앞에 선언 하면 상속 불가능
        //메소드 앞에 선언하면 오버라이딩 불가능
        print();
    }
}
/*
private를 적용한 멤버필드에 값을 넣는법
1. 생성자를 이용하는방법
2. 메소드를 이용하는 방법
private를 적용한 멤버필드에 값을 가져오는 방법
메소드를 이용하는 밖에 없다.
 */
