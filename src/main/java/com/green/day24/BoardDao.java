package com.green.day24;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Dao = data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        /*String sql = "INSERT INTO board(title,ctnts,writer)" +
                "VALUES " + "(?,?,?)";
        */
        String sql ="INSERT INTO board " +
                        "SET title = ? " +
                        ", ctnts =? " +
                        ", writer = ?";

        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }


        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM board WHERE iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at " +
                "FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {//레코드가 있는 수 만큼 반목
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String created_at = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(created_at);

                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    public static int updBoard(BoardEntity entity) {
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
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static BoardEntity selBoardId(int iboard) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT iboard, title, writer, ctnts, created_at, updated_at" +
                " FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();
            if (rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;
    }

}
