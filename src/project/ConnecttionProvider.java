/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package project;

import java.sql.*;

/**
 *
 * @author vanhu
 */
public class ConnecttionProvider {
    public static Connection getCon()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/hotel";
            var userName = "root";
            var password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, password);
            return con;
        } catch (Exception e)
        {
            return null;
        }
    }

}
