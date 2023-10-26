package com.asdf;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntFunction {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,0,0,0,3,3,3,3,3,3};
        Arrays.sort(arr);
        List<Integer> listArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            listArr.add(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(listArr.lastIndexOf(1));
        System.out.println(listArr.indexOf(1));
    }



}



