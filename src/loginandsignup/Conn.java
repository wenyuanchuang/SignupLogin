/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package loginandsignup;
import java.sql.*;
/**
 *
 * @author admin
 */
public class Conn{
    Connection conn;
    Statement s;
    public Conn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/basic_signup_login","root","1999");
            s = conn.createStatement();
//            System.out.println(conn);
//            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Conn();
    }
}