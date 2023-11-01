package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Dao = data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        String sql ="INSERT INTO board" +
                        "(title,ctnts,writer)" +
                        "VALUES " + "(?,?,?)";


        System.out.println(sql);
        Connection con= null;
        PreparedStatement ps = null;

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1,entity.getTitle());
            ps.setString(2,entity.getCtnts());
            ps.setString(3,entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con,ps);
        }


        return result;
    }
    public static int delBoard(BoardEntity entity){
        int result = 0;
        String sql = "DELETE FROM board WHERE iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1,entity.getIboard());
            result = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps);
        }
        return result;
    }
    public static int updBoard(BoardEntity entity){
        int result = 0;
        String sql = "UPDATE board " +
                "SET title = ?" +
                ", ctnts = ?" +
                ", writer = ?" +
                ", updated_at = now()" +
                "WHERE iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1,entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4,entity.getIboard());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps);
        }
        return result;
    }
}
