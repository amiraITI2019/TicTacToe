/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 *
 * @author amira
 */
public class TicTacToe extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = new xo_homeBase(stage);
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("XOGame");
        stage.getIcons().add(new Image(new File("E:\\Java_13\\project\\mergedProject\\TicTacToe\\icon3.jpg").toURI().toString()));
        stage.show();
        AudioClip gameMusic = new AudioClip(new File("E:\\Java_13\\project\\mergedProject\\TicTacToe\\shidelhezam.mp3").toURI().toString());
        gameMusic.setVolume(12.0);
        while (!gameMusic.isPlaying()) {
            gameMusic.play();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
