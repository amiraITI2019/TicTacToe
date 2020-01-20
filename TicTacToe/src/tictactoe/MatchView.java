package tictactoe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MatchView extends BorderPane {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label id_computerName;
    protected final Label id_playerNameSecond;
    protected final Label id_computerScore;
    protected final Label id_playerScoreSecond;
    protected final Button id_back;
    protected final Lighting lighting;
    protected final Button id_newGame;
    protected final Lighting lighting0;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final DropShadow dropShadow;
    protected final Button id_btn1;
    protected final Button id_btn5;
    protected final Button id_btn4;
    protected final Button id_btn8;
    protected final Button id_btn9;
    protected final Button id_btn7;
    protected final Button id_btn2;
    protected final Button id_btn3;
    protected final Button id_btn6;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;
    protected Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Thread th;
    FileReader fr;
    BufferedReader br;
    char[] buffer;

    public MatchView(Stage stage) {

        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        id_computerName = new Label();
        id_playerNameSecond = new Label();
        id_computerScore = new Label();
        id_playerScoreSecond = new Label();
        id_back = new Button();
        lighting = new Lighting();
        id_newGame = new Button();
        lighting0 = new Lighting();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        dropShadow = new DropShadow();
        id_btn1 = new Button();
        id_btn5 = new Button();
        id_btn4 = new Button();
        id_btn8 = new Button();
        id_btn9 = new Button();
        id_btn7 = new Button();
        id_btn2 = new Button();
        id_btn3 = new Button();
        id_btn6 = new Button();
        anchorPane0 = new AnchorPane();
        innerShadow = new InnerShadow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(484.0);
        setPrefWidth(479.0);

        BorderPane.setAlignment(splitPane, javafx.geometry.Pos.CENTER);
        splitPane.setDividerPositions(0.992462311557789);
        splitPane.setOrientation(javafx.geometry.Orientation.VERTICAL);
        splitPane.setPrefHeight(200.0);
        splitPane.setPrefWidth(160.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(537.0);
        anchorPane.setPrefWidth(598.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(484.0);
        rectangle.setLayoutX(-7.0);
        rectangle.setLayoutY(1.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(487.0);

        id_computerName.setLayoutX(98.0);
        id_computerName.setLayoutY(103.0);
        id_computerName.setPrefHeight(25.0);
        id_computerName.setPrefWidth(82.0);
        id_computerName.setText("computer");
        id_computerName.setTextFill(javafx.scene.paint.Color.valueOf("#06afe2"));
        id_computerName.setFont(new Font(16.0));

        id_playerNameSecond.setLayoutX(316.0);
        id_playerNameSecond.setLayoutY(103.0);
        id_playerNameSecond.setPrefHeight(25.0);
        id_playerNameSecond.setPrefWidth(128.0);
        id_playerNameSecond.setText("maged ");
        id_playerNameSecond.setTextFill(javafx.scene.paint.Color.valueOf("#06afe2"));
        id_playerNameSecond.setFont(new Font(16.0));

        id_computerScore.setLayoutX(187.0);
        id_computerScore.setLayoutY(114.0);
        id_computerScore.setText("0");
        id_computerScore.setTextFill(javafx.scene.paint.Color.WHITE);
        id_computerScore.setFont(new Font(17.0));

        id_playerScoreSecond.setLayoutX(284.0);
        id_playerScoreSecond.setLayoutY(114.0);
        id_playerScoreSecond.setText("0");
        id_playerScoreSecond.setTextFill(javafx.scene.paint.Color.WHITE);
        id_playerScoreSecond.setFont(new Font(17.0));

        id_back.setLayoutX(140.0);
        id_back.setLayoutY(401.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(34.0);
        id_back.setPrefWidth(91.0);
        id_back.setText("back");

        lighting.setDiffuseConstant(1.5);
        id_back.setEffect(lighting);
        id_back.setFont(new Font(14.0));

        id_newGame.setLayoutX(255.0);
        id_newGame.setLayoutY(401.0);
        id_newGame.setMnemonicParsing(false);
        id_newGame.setPrefHeight(34.0);
        id_newGame.setPrefWidth(91.0);
        id_newGame.setText("new game");

        lighting0.setDiffuseConstant(1.5);
        id_newGame.setEffect(lighting0);
        id_newGame.setFont(new Font(14.0));

        label.setLayoutX(132.0);
        label.setLayoutY(37.0);
        label.setText("x");
        label.setTextFill(javafx.scene.paint.Color.RED);
        label.setFont(new Font(50.0));

        label0.setLayoutX(156.0);
        label0.setLayoutY(37.0);
        label0.setText("o");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#00ff16"));
        label0.setFont(new Font(50.0));

        label1.setLayoutX(192.0);
        label1.setLayoutY(41.0);
        label1.setText("Game");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0090f0"));
        label1.setFont(new Font(50.0));

//        dropShadow.setColor(javafx.scene.paint.Color.#00a9d8);
        label1.setEffect(dropShadow);

        id_btn1.setLayoutX(98.0);
        id_btn1.setLayoutY(147.0);
        id_btn1.setMnemonicParsing(false);
        id_btn1.setPrefHeight(71.0);
        id_btn1.setPrefWidth(84.0);
        id_btn1.setFont(new Font(33.0));

        id_btn5.setLayoutX(199.0);
        id_btn5.setLayoutY(232.0);
        id_btn5.setMnemonicParsing(false);
        id_btn5.setPrefHeight(71.0);
        id_btn5.setPrefWidth(84.0);
        id_btn5.setFont(new Font(33.0));

        id_btn4.setLayoutX(97.0);
        id_btn4.setLayoutY(232.0);
        id_btn4.setMnemonicParsing(false);
        id_btn4.setPrefHeight(71.0);
        id_btn4.setPrefWidth(84.0);
        id_btn4.setFont(new Font(33.0));

        id_btn8.setLayoutX(301.0);
        id_btn8.setLayoutY(318.0);
        id_btn8.setMnemonicParsing(false);
        id_btn8.setPrefHeight(71.0);
        id_btn8.setPrefWidth(84.0);
        id_btn8.setFont(new Font(33.0));

        id_btn9.setLayoutX(199.0);
        id_btn9.setLayoutY(317.0);
        id_btn9.setMnemonicParsing(false);
        id_btn9.setPrefHeight(71.0);
        id_btn9.setPrefWidth(84.0);
        id_btn9.setFont(new Font(33.0));

        id_btn7.setLayoutX(97.0);
        id_btn7.setLayoutY(317.0);
        id_btn7.setMnemonicParsing(false);
        id_btn7.setPrefHeight(71.0);
        id_btn7.setPrefWidth(84.0);
        id_btn7.setFont(new Font(33.0));

        id_btn2.setLayoutX(199.0);
        id_btn2.setLayoutY(147.0);
        id_btn2.setMnemonicParsing(false);
        id_btn2.setPrefHeight(71.0);
        id_btn2.setPrefWidth(84.0);
        id_btn2.setFont(new Font(33.0));

        id_btn3.setLayoutX(300.0);
        id_btn3.setLayoutY(147.0);
        id_btn3.setMnemonicParsing(false);
        id_btn3.setPrefHeight(71.0);
        id_btn3.setPrefWidth(84.0);
        id_btn3.setFont(new Font(33.0));

        id_btn6.setLayoutX(301.0);
        id_btn6.setLayoutY(232.0);
        id_btn6.setMnemonicParsing(false);
        id_btn6.setPrefHeight(71.0);
        id_btn6.setPrefWidth(84.0);
        id_btn6.setFont(new Font(33.0));

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(160.0);
        setCenter(splitPane);

        innerShadow.setChoke(0.64);
//        innerShadow.setColor(javafx.scene.paint.Color.#008cff);
        innerShadow.setHeight(100.07);
        innerShadow.setRadius(74.43);
        innerShadow.setWidth(199.65);
        setEffect(innerShadow);

        anchorPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(id_computerName);
        anchorPane.getChildren().add(id_playerNameSecond);
        anchorPane.getChildren().add(id_computerScore);
        anchorPane.getChildren().add(id_playerScoreSecond);
        anchorPane.getChildren().add(id_back);
        anchorPane.getChildren().add(id_newGame);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(id_btn1);
        anchorPane.getChildren().add(id_btn5);
        anchorPane.getChildren().add(id_btn4);
        anchorPane.getChildren().add(id_btn8);
        anchorPane.getChildren().add(id_btn9);
        anchorPane.getChildren().add(id_btn7);
        anchorPane.getChildren().add(id_btn2);
        anchorPane.getChildren().add(id_btn3);
        anchorPane.getChildren().add(id_btn6);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);
        btn1 = id_btn1;
        btn2 = id_btn2;
        btn3 = id_btn3;
        btn4 = id_btn4;
        btn5 = id_btn5;
        btn6 = id_btn6;
        btn7 = id_btn7;
        btn8 = id_btn8;
        btn9 = id_btn9;
        btn1.setId("btn1");
        btn2.setId("btn2");
        btn3.setId("btn3");
        btn4.setId("btn4");
        btn5.setId("btn5");
        btn6.setId("btn6");
        btn7.setId("btn7");
        btn8.setId("btn8");
        btn9.setId("btn9");
        Button[] btn = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

//                read from file
        try {

            fr = new FileReader("test.txt");
            buffer = new char[30];
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String who = st.nextToken();
                    String where = st.nextToken();
                    String by = st.nextToken();
                    for (int i = 0; i < 9; i++) {
                        if (btn[i].getId().equals(where)) {
                            btn[i].setText(by);

                        }

                    }
                }
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }

            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(MatchView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
