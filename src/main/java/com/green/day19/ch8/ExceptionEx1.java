package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        try {//여기서 예외가 발생하면
            num = 10;
            num /= 0;

        }catch(Exception e){//예외를 확인 후 catch룰 실행한다.
        //여기까지 기본문법
            e.printStackTrace();
            System.out.println("예외 발생");
            num = -1;

        }finally {//무조건 반드시 실행된다.
        //finally는 옵션
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n",num);
        System.out.println("----끝----");
    }
}
class ExceptionEx1_2{
    public static void main(String[] args) {
        div(20);
    }
    public static void div(int num){
        try {//여기서 예외가 발생하면
            num = 10;
            return;

        }catch(Exception e){//예외를 확인 후 catch룰 실행한다.
            //여기까지 기본문법
            e.printStackTrace();
            System.out.println("예외 발생");
            num = -1;

        }finally {//무조건 반드시 실행된다. 앞에 return 키워드가 있어도 반드시 실행한다.
            //finally는 옵션
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n",num);
        System.out.println("----끝----");

    }
}
class ExceptionEx1_3{
    public void sum(){}
    public static void main(String[] args) {
        try {//트라이 문장 밖에서 에러가 터지면 프로그램이 죽어버리나
            //트라이문 안에서는 일단 실행은 되고 에러를 예외시킨다.
            //int num = 10/0; 수학적 에러
            //ExceptionEx1_3 obj = null;
            //obj.sum(); 널포인트 에러
            int[] arr = new int[10];
            arr[10] = 10;
        //catch가 여러개 있으면 순차적으로 진행된다.
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){// |은 or 과 같은 의미
            System.out.println("수학적 예외");
        }catch (NullPointerException e){
            System.out.println("널 포인트 예외");
        }catch (Exception e){//Exception은 모든 예외의 상위 클래스이다.
            System.out.println("모든 예외");
        }
        System.out.println("끝");
    }
}
