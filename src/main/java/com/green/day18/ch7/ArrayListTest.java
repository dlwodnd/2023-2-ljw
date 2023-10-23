package com.green.day18.ch7;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        //Object는 어떤 타입이든 다 수용가능하다.
        list.add(10);//Object타입으로 입력
        Object val1 = list.get(0);//값을 가져올때도 Object타입으로 출력
        int intval = (int)list.get(0);//형변환을 해 줘야 한다.

    }
}
class ArrayListTest2 {
    public static void main(String[] args) {
        int v1 =10;
        Integer v2 = 10;//Integer은 int의 래퍼타입.
        System.out.println(v1 == v2);
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //<> = 제네렉. 각방의 타입을 정하는 것, 래퍼타입만 입력 가능하다.
        System.out.println(list.size());
        //List의 방 크기는 .length가 아니라 .size를 사용한다.
        for(int i = 0; i < list.size() ; i++){
            System.out.printf("[%d] : %d\n",i,list.get(i));
        }
        for(int val : list){
            System.out.println(val);
        }
    }
}
class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(5,200);
        //list의 1번방에 200을 추가하고 기존의 값들은 뒤로 한칸씩 미룬다.
        System.out.println(list);

    }
}
