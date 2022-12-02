package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.DBConnection;
import com.Entity.Accounts;

public class AccountDAO extends DBConnection{
	private Connection conn;
    private PreparedStatement stm ;
    private ResultSet rs;

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
    public Accounts checkLogin(String username, String password) throws SQLException, Exception {
        try {
            Connection conn = super.getConnection();
            if (conn != null) {
                String sql = "SELECT username , password , roleid"
                        + " FROM Accounts WHERE username = ? AND password = ?";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                	Accounts result = new Accounts(
                            rs.getString("username"),
                            rs.getString("password"), 
                            rs.getInt("roleid"));
                	return result;
                }
                else
                {
                	System.out.println("\n\ndatabase user null\n");
                }
            }
            else
            {
            	System.out.println("\n\nconnection null\n");
            }
        } catch (Exception e) {
        } finally {
            closeConnection();
        }
        return null;
    }
}
