package com.green.day16.ch7;

public class Time {
    private int hour, minute, second;

    //private 값을 변경하거나 넣는 방법.
    //.1 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    //2. setter 메소드.
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    @Override
    public String toString() {
        return hour + "시" + minute + "분" + second + "초";
    }
}

class TiemTest {
    public static void main(String[] args) {
        Time time = new Time(12, 20, 37);
        time.setHour(10);
        time.setMinute(30);
        time.setSecond(30);
        System.out.println(time);
        // time.hour = 10; : private한 값은 다른 클래스에서 불러올 수 없다.
    }
}
