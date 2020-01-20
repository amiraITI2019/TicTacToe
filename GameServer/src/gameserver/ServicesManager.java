/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameserver;

import Database.Database;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amira
 */
public class ServicesManager extends Thread {

    DataInputStream input;
    PrintStream output;
    Socket player;
    static Vector<ServicesManager> clientsVector =new Vector<ServicesManager>();

    public ServicesManager(Socket p) throws IOException {
        player = p;
        input = new DataInputStream(player.getInputStream());
        output = new PrintStream(player.getOutputStream());
        start();
            clientsVector.add(this);

    }

    @Override
    public void run() {
        if (!player.isClosed()) {
            while (true) {
                String receivedFromClient = "";
                try {
                    if (input.available() > 0) {
                        receivedFromClient = input.readLine();
                        System.out.println("received " + receivedFromClient);
                        StringTokenizer st = new StringTokenizer(receivedFromClient, ",");
                        String index = st.nextToken();
                        String token1 = st.nextToken();
                        String token2 = st.nextToken();
                        String token3;
                        String token4;
                        switch (index) {
                            case "login":
                                login(token1, token2);
                                break;
                            case "register":
                                token3 = st.nextToken();
                                token4 = st.nextToken();
                                register(token1, token2, token3, token4);
                                break;
                            case "online":
                                onlineFriends();
                                break;
                            case "play":
                                play(token1, token2);
                                break;
                            case "logout":
                                logout();
                                break;

                        }

                    }
                } catch (IOException ex) {
                    System.out.println("else");
                } catch (SQLException ex) {
                    Logger.getLogger(ServicesManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void login(String token1, String token2) {
        System.out.println("login successful");
    }

    private void logout() {
        System.out.println("logout successful");

    }

    private void play(String place, String game) {
       sendMessageToAll(place+","+game);

    }

    private void register(String token1, String token2, String token3, String token4) {
        System.out.println("register successful");

    }

    public static ArrayList<Player> onlineFriends() throws SQLException {
        Database db=new Database();
        db.onlineFriends();

        return new ArrayList<Player>();
    }
  void sendMessageToAll(String msg)
    {
        System.out.println("length of vector is : "+clientsVector.size());
        for(ServicesManager ch : clientsVector)
        {
          System.out.println("server "+msg);
          ch.output.println(msg);
        }
    }
}
