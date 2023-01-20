/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vanhu
 */
public class Select {
    public static ResultSet getData(String query)
    {
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        try {
            con = ConnecttionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
