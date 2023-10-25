package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            //Exception e = new Exception("일부러 에러 터트림");
            //System.out.println("ddd");
            //throw e;
            throw new Exception("일부러 에러 터트림");
            //throw되는 순간 문장은 끝이난다.
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("끝");
    }
}
