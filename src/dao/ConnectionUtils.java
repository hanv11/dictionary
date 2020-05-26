/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguyenha
 */
public class ConnectionUtils {
     private static ConnectionUtils instance;
    private Connection conn;

    private static final String URL = "jdbc:mysql://localhost:3306/dictionary?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "12345678";

    private ConnectionUtils() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ConnectionUtils getInstance() throws SQLException {
        if(instance == null || instance.getConnection().isClosed()) {
            instance = new ConnectionUtils();
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        return conn;
    }
    
}
