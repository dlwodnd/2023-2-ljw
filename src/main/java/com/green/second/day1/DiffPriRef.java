package com.green.second.day1;

public class DiffPriRef {

    public void changeVal(int num){
        num = 10;
    }
    public void changeVal(NumBox nb){
        nb = new NumBox();
        nb.num = 20;
    }

    public static void main(String[] args) {
        int num = 1;
        DiffPriRef diff = new DiffPriRef();
        diff.changeVal(num);
        System.out.println(num);

        NumBox nb = new NumBox();
        nb.num = 1;
        diff.changeVal(nb);
        System.out.println("nb.num : " + nb.num);


    }
}
class DiffPriRef2 {

    public static void changeVal(int num){
        num = 10;
    }
    public void changeVal(NumBox nb){
        nb.num  = 10;
    }

    public static void main(String[] args) {
        int num =1 ;
        changeVal(num);


    }
}
class NumBox{
    int num;
}
