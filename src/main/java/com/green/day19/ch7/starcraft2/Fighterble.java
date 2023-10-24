package com.green.day19.ch7.starcraft2;

public interface Fighterble extends Movable,Attackable {
    //인터페이스는 구현부가 없기 때문에 다중 상속이 가능하다.
    //스프링에서는 인터페이스를 느슨한 연결이라고 한다.

}

interface Movable  {
    void move (int x, int y);
}
interface Attackable  {
    void attack(Unit u);
}
class Unit{
    private int currentHp;
    private int x;
    private int y;
}
class Fighter extends Unit implements Fighterble{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}
class FighterTest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10,20);
        Fighter fighter = (Fighter) movable;
        fighter.attack(null);
        Attackable attackable = (Attackable) movable;
        attackable.attack(null);
    }
}