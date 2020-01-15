/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import tictactoe.Player;

/**
 *
 * @author Admin
 */
public class Database {
    public Connection conn;
    public Statement state;
    public ResultSet rs;
    
    public PreparedStatement pst;
    public Database() throws SQLException{
          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tictoc", "root", "ASD@asd3340208");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
    public void show()
    {
  
        try {
            FileInputStream fis = null;
            state = conn.createStatement();
            rs = state.executeQuery("select * from players");
            
//            File file =new File(rs.getString("record"));
//            try {
//                fis = new FileInputStream(file);
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//            }
             if(rs!=null)
                {
            while(rs.next())
            {
               System.out.println(rs.getString("record"));
                    System.out.print("id:"+rs.getString("id")+"       "+rs.getString("fullName")+"             "+rs.getLong("score")+"        "+rs.getString("matchName"));
                    System.out.println();
                }

            }
            else
            {
                System.out.println("NoData");
            }
       
            
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    public void addPlayer(Player player) {
       

            try {
                //String exist = rs.getString(1);name="ali";
//                if(name.equals(exist))
//                {
//                    System.out.println("This name already token");
//                }
//                else
//                {
                state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                //rs = state.executeQuery("select * from players");

                pst = conn.prepareStatement("INSERT INTO `tictoc`.`players` (`fullName`,`score`) VALUES (?, ?)");
                pst.setString(1, player.name);
                pst.setLong(2, player.score);
                pst.executeUpdate();
               //rs = state.executeQuery("select * from players");
               // rs.last();
                System.out.println("Player add done");
                //}
                
                    

            } catch (SQLException ex) {
               //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
              ex.printStackTrace();


            }
    }
    public void delete(String name)
    {
                    try
                    {
                       
                      
                       if(rs !=null)
                       {
                             state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        pst = conn.prepareStatement("DELETE FROM `tictoc`.`players` WHERE (`fullName` =?)");
                        pst.setString (1, name);
                        
                        //rs.updateRow();
                        rs = state.executeQuery("select * from players");
                        pst.executeUpdate();
                        System.out.println("Player Deleted");
                       }
                       else
                       {
                           System.out.println("No Player Exist this name");
                       }
                    
                    } catch (SQLException ex) {
                        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    
    }
    public void updated(String match , String record, String Name)
    {
                           try {
                       
                    pst = conn.prepareStatement("UPDATE `tictoc`.`players` SET `matchName` = ?, `record` = ? WHERE (`fullName` = ?)");
                    pst.setString (1,match); 
                    pst.setString(2,record);
                    pst.setString(3,Name);
                    pst.executeUpdate(); 
                        
                    
                     
                   } catch (SQLException ex) {
                       Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                       
                   }
    }
}
