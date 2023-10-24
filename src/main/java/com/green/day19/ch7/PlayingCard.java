package com.green.day19.ch7;

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;
    //인터페이스의 멤버필드에는 public static final은 자동으로 기입된다.
    public  abstract String getCardNumber();
    //인터페이스의 메소드에는 public abstract가 자동으로 기입된다.
    String getCarKind();
}
interface PlayingChess extends PlayingCard{
    //인터페이스끼리 상속 할 경우에는 extends 를 사용 가능하다.
    void moveHorese(int x, int y);
}
class Card implements PlayingCard{
    //인터페이스는 extens가 아닌 implements로 상속한다.
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCarKind() {
        return null;
    }

}
class PlayingCardTest{
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
