/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uss.sources.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author philip
 */
public class DbConnection {
    public Connection getDbConnection(String url) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        url = url+"?autoReconnect=true&useSSL=false";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
//        String url = "jdbc:mysql://localhost/testdb";
        Connection conn = DriverManager.getConnection(url, "root", "password");
//        System.out.println("..Connected to mySQL DB..");
        return conn;

    }
}
