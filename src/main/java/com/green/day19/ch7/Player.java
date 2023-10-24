package com.green.day19.ch7;
class PlayerTest{
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player p = new AudioPlayer();
        p.play(20);
    }
}

public abstract class Player {
    //추상클래스 : 클래스 안에 메소드 중 추상 메소드가 하나라도 있으면
    //추상 메소드가 없어도 추상 클래스는 생성 가능하다.
    //추상 클래스는 객체화는 안되지만 부모 클래스로는 사용 가능하다.
    public abstract void play(int pos);
    //추상 메소드: 구현부가 없는 메소드.
    //추상 메소드는 오버라이딩을 강제한다.
    //하위 클래스가 상위클래스의 메소드 내용의 사용빈도가 적을 경우 생성한다.
}
class AudioPlayer extends Player {
    @Override
    public void play(int pos){
        System.out.println("Audio Play 위치 : " + pos);
    }
}
class VideoPlayer extends Player{
    @Override
    public void play(int pos){
        System.out.println("Video Play 위치 : " + pos);
    }
}
