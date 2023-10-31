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
        board.setTitle("오늘 Insert를 배움");
        board.setCtnts("Java를 통해 Board테이블에 값 넣어봄");
        board.setWriter("신난다");
        BoardDao.insBoard(board);


    }
}