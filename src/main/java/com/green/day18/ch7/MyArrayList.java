package com.green.day18.ch7;

import java.util.Arrays;

public class MyArrayList {
    private int[] arr;
    private int i;


    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int a) {
        int[] tmp = new int[arr.length + 1];
        tmp[arr.length] = a;
        System.out.println(Arrays.toString(tmp)+"tmp");
        System.out.println(Arrays.toString(arr)+"arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(tmp)+"tmp");
            System.out.println(Arrays.toString(arr)+"arr");
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    public String toString() {
        String str = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            str += ", " + arr[i];
        }
        return str + "]";
    }

}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println(list);

    }
}
