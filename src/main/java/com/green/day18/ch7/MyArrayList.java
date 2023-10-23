package com.green.day18.ch7;

public class MyArrayList {
    private int[] arr;


    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int a) {
        int[] tmp = new int[arr.length + 1];
        tmp[arr.length] = a;
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    public void add(int n1, int n2) {
        int[] tmp = new int[arr.length + 1];
        int x = 0;
        tmp[n1] = n2;
        for (int i = 0; i < tmp.length; i++) {
            if (i == n1) {
                continue;
            }
            tmp[i] = arr[x++];
        }
        arr = tmp;
    }
    public void add2(int n1 ,int n2){
        int[] tmp = new int[arr.length + 1];
        tmp[n1] = n2;
        for(int i = 0; i<arr.length;i++){
            tmp[i < n1 ? i : i+1] = arr[i];
        }
        arr = tmp;
    }

    public void add3(int n1, int n2){
        int[] tmp = new int[arr.length + 1];
        tmp[n1] = n2;
        for (int i = 0 ; i < n1 ;i++){
            tmp[i] = arr[i];
        }
        for(int i = n1; i <arr.length; i++){
            tmp[i+1] = arr[i];
        }
        arr = tmp;
    }

    public String toString() {
        if (arr.length == 0) {
            return "[]'";
        }
        String str = "[" + arr[0];
        for (int i = 1; i < arr.length; i++) {
            str += ", " + arr[i];
        }
        return str + "]";

    }

}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        System.out.println(list);
        list.add(3, 40);
        System.out.println(list);
        list.add2(2,20);
        System.out.println(list);
        list.add3(0,55);
        System.out.println(list);


    }
}
