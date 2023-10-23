package com.green.day18.ch7;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 10);
        map.put("b", 20);
        map.put("b", 30);
        //map.put("b(Key)", 20(Value));
        //Key 값에 Value를 저장한다.
        //순서에는 상관이 없다.

        Object obj = map.get("b");
        //Value값을 가져올때는 Key값을 입력해야 한다.
        int val = (int)obj;
        System.out.println("val : " +val);

    }
}
class HashMapTest2{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tv" , 0 );
        map.put("Computer" , 0 );
        map.put("Audio" , 0 );

        map.put("Tv",map.get("Tv")+1);


        System.out.println("Tv - Count : "  + map.get("Tv"));
    }
}