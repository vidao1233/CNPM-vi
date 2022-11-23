package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.DBConnection;
import com.Entity.Users;

public class UserDAO extends DBConnection{
	private Connection conn = null;
    private PreparedStatement stm = null;
    private ResultSet rs = null;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    public Users checkLogin(String ID, String password) throws SQLException, Exception {
        Users result = null;
        try {
            conn = super.getConnection();
            if (conn != null) {
                
                String sql = "SELECT userid , username , password , roleid"
                        + " FROM Users WHERE userid = ? AND password = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, ID);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    result = new Users(rs.getString("userid"),
                            rs.getString("username"),
                            "***", rs.getInt("roleid"));
                }
            }
        } catch (Exception e) {
        } finally {
            closeConnection();
        }
        return result;
    }
}
