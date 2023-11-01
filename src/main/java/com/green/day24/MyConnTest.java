package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        Connection con = MyConn.getConn();
        String sql = "INSERT INTO country (country) VALUES ('동하나라')";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyConnTest2 {
    public static void main(String[] args) {
        BoardEntity board = new BoardEntity();
        board.setTitle("123");
        board.setCtnts("123");
        board.setWriter("123");
        BoardDao.insBoard(board);


    }
}
class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(2);

        int row = BoardDao.delBoard(entity);
        System.out.println(entity.getIboard());
    }
}
class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(4);
        entity.setTitle("수정 제목2");
        entity.setCtnts("수정 내용4");
        entity.setWriter("작성자1");

        int row = BoardDao.updBoard(entity);
        System.out.println(row);
    }
}