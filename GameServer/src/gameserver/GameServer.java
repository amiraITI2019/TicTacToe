/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author amira
 */
public class GameServer {

    /**
     * @param args the command line arguments
     */
    ServerSocket server;
    public  Socket player;

    public GameServer() throws IOException {
        server=new ServerSocket(2020);
         while(true){
            player=server.accept();
            new ServicesManager(player);
            
            
        }
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       new GameServer();
        
    }
    
}
