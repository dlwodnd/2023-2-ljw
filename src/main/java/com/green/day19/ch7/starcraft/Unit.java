package com.green.day19.ch7.starcraft;

import java.util.*;

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);
        Unit unit2 = new Tank();
        unit2.move(10, 20);
        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);

    }
}

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);

        Unit unit1 = units.get(units.size()-1);
        Tank tk = (Tank)unit1;
        tk.changeMode();
    }

    public static void moveAll(List<Unit> units, int x, int y) {
        for (Unit unit : units) {
            unit.move(x, y);
        }
        System.out.printf("모든 유닛이 %d . %d로 이동했습니다. ", x, y);
    }
    //인터페이스는 추상 메소드로만 이루어져 있다.
    //추상 메소드로만 구성 되어 있어서.

}

public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y);

    public void stop() {
        System.out.println("현재위치에서 정지");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("마린이 좌표 %d, %d로 이동\n", this.x, this.y);
    }

    public void steamPack() {
        System.out.println("스팀팩 시전");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 %d, %d로 이동\n", this.x, this.y);

    }

    public void changeMode() {
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 헤제되었습니다.");
    }
}

