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
        if (hour > 23) {
            hour = 23;
        } else if (hour < 0) {
            hour = 0;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute % 60;
    }

    public void setSecond(int second) {
        this.second = second % 60;
    }

    //pritave한 전역변수 값을 가져오는방법
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second) ;
    }
}

class TiemTest {
    public static void main(String[] args) {
        Time time = new Time(12, 20, 37);
        time.setHour(3);
        time.setMinute(3);
        time.setSecond(3);
        System.out.println(time);
        // time.hour = 10; : private한 값은 다른 클래스에서 불러올 수 없다.
    }
}
