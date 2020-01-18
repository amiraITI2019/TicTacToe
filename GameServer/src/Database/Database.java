/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Database {
    public Connection conn;
    public Statement state;
    public ResultSet rs;
    public PreparedStatement pst;
    boolean check=true;
        public Database() throws SQLException{
          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/multi_user", "root", "amira1994");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
            public void register(String name,String password,String img,int age)
            {                        
                String query = "SELECT * FROM `multi_user`.`user` WHERE `fullName` =?";
                try {
                        state = conn.createStatement();
                        pst = conn.prepareStatement(query);
                        pst.setString(1, name);
                        rs = pst.executeQuery();
                        if(rs.next())
                        {
                            System.out.println("your name already token");
                        }
                        else{
                                try
                                {
                                    state = conn.createStatement();
                                    pst = conn.prepareStatement("INSERT INTO `multi_user`.`user` (`fullName`, `password`, `image`, `age`) VALUES (?, ?, ?, ?)");
                                    pst.setString(1, name);
                                    pst.setString(2, password);
                                    pst.setString(3, img);
                                    pst.setInt(4, age);
                                    pst.executeUpdate();
                                    System.out.println("done register");
                                } catch (SQLException ex) {
                                   Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                } catch (SQLException ex) {
                    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            public void logIn(String fullname,String pass)
            {
                String query = "SELECT * FROM `multi_user`.`user` WHERE `fullName` =? and `password`=?";
                try {
                        state = conn.createStatement();
                        pst = conn.prepareStatement(query);
                        pst.setString(1, fullname);
                        pst.setString(2, pass);
                        rs = pst.executeQuery();
                        if(rs.next())
                        {
                            System.out.println("Login Done");
//                            update to 1->online
                        }
                        else
                        {
                            System.out.println("fail");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            public void onlineFriends()
            {
            
            }
    
}
