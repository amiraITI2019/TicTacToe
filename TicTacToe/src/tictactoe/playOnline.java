package tictactoe;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.VBox;

public class playOnline extends BorderPane implements Runnable {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label id_computerName;
    protected final Label id_playerNameSecond;
    protected final Label id_computerScore;
    protected final Label id_playerScoreSecond;
    protected final Button id_newGame;
    protected final Lighting lighting;
    protected final Button id_back;
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
    protected Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;
    protected int user = 0, computer = 0, index = 0, countRemoved = 0;
    protected ArrayList<Button> availableLocations;
    protected String success1, success2;
    protected boolean result;
    protected boolean flag = true;
    protected static int userScore = 0, computerScore = 0;
    protected Stage stage;
    protected Player player;
    protected ArrayList<Button> AllButons;
    protected Button b;
    protected String selectedXOPlayer = "X";
    protected String selectedXOComputer = "O";
    File f;
    FileWriter fw;
    public Socket s;
    public DataInputStream input;
    public PrintStream output;
    Button[] btn = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
    Thread th;

    public playOnline(Socket s, DataInputStream dis, PrintStream ps) throws IOException {

        this.s = s;
        input=dis;
        output=ps;
//        selectedXOPlayer = "" + player.select;
//        if (selectedXOPlayer.equals("X")) {
//            selectedXOComputer = "O";
//            success1 = "XXX";
//            success2 = "OOO";
//        } else {
//            selectedXOComputer = "X";
//            success1 = "OOO";
//            success2 = "XXX";
//        }
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        id_computerName = new Label();
        id_playerNameSecond = new Label();
        id_computerScore = new Label();
        id_playerScoreSecond = new Label();
        id_newGame = new Button();
        lighting = new Lighting();
        id_back = new Button();
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

        btn1.setFocusTraversable(false);
        btn2.setFocusTraversable(false);
        btn3.setFocusTraversable(false);
        btn4.setFocusTraversable(false);
        btn5.setFocusTraversable(false);
        btn6.setFocusTraversable(false);
        btn7.setFocusTraversable(false);
        btn8.setFocusTraversable(false);
        btn9.setFocusTraversable(false);

        AllButons = new ArrayList<Button>();
        availableLocations = new ArrayList<Button>();

        AllButons.add(btn1);
        AllButons.add(btn2);
        AllButons.add(btn3);
        AllButons.add(btn4);
        AllButons.add(btn5);
        AllButons.add(btn6);
        AllButons.add(btn7);
        AllButons.add(btn8);
        AllButons.add(btn9);

        availableLocations.addAll(AllButons);

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
        id_playerNameSecond.setText("player");
        id_playerNameSecond.setTextFill(javafx.scene.paint.Color.valueOf("#06afe2"));
        id_playerNameSecond.setFont(new Font(16.0));

        id_newGame.setLayoutX(255.0);
        id_newGame.setLayoutY(401.0);
        id_newGame.setMnemonicParsing(false);
        id_newGame.setPrefHeight(34.0);
        id_newGame.setPrefWidth(91.0);
        id_newGame.setText("new game");

        lighting.setDiffuseConstant(1.5);
        id_newGame.setEffect(lighting);
        id_newGame.setFont(new Font(14.0));

        id_back.setLayoutX(140.0);
        id_back.setLayoutY(401.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(34.0);
        id_back.setPrefWidth(91.0);
        id_back.setText("back");

        lighting0.setDiffuseConstant(1.5);
        id_back.setEffect(lighting0);
        id_back.setFont(new Font(14.0));

        label.setLayoutX(132.0);
        label.setLayoutY(37.0);
        label.setText("X");
        label.setTextFill(javafx.scene.paint.Color.RED);
        label.setFont(new Font(50.0));

        label0.setLayoutX(156.0);
        label0.setLayoutY(37.0);
        label0.setText("O");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#00ff16"));
        label0.setFont(new Font(50.0));

        label1.setLayoutX(192.0);
        label1.setLayoutY(41.0);
        label1.setText("Game");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0090f0"));
        label1.setFont(new Font(50.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#00a9d8"));
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

        id_btn8.setLayoutX(199.0);
        id_btn8.setLayoutY(317.0);
        id_btn8.setMnemonicParsing(false);
        id_btn8.setPrefHeight(71.0);
        id_btn8.setPrefWidth(84.0);
        id_btn8.setFont(new Font(33.0));

        id_btn9.setLayoutX(301.0);
        id_btn9.setLayoutY(318.0);
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
        innerShadow.setColor(javafx.scene.paint.Color.valueOf("#008cff"));
        innerShadow.setHeight(100.07);
        innerShadow.setRadius(74.43);
        innerShadow.setWidth(199.65);
        setEffect(innerShadow);

        anchorPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(id_computerName);
        anchorPane.getChildren().add(id_playerNameSecond);
        anchorPane.getChildren().add(id_computerScore);
        anchorPane.getChildren().add(id_playerScoreSecond);
        anchorPane.getChildren().add(id_newGame);
        anchorPane.getChildren().add(id_back);
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
        th = new Thread(this);

        for (Iterator<Button> iterator = AllButons.iterator(); iterator.hasNext();) {
            iterator.next().setStyle("-fx-background-color: gray;");

        }

        id_back.setOnAction((Action) -> {
            userScore = 0;
            computerScore = 0;
            Parent root = new single_PlayerBase(stage);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        id_newGame.setOnAction((Action) -> {
            resetBoard();
        });
        btn1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn1.getText())) {
                        btn1.setText(selectedXOPlayer);
                        ps.println("play,btn1,X");
                        ////fw.write("player btn1 " + selectedXOPlayer);
                        //fw.write(System.getProperty("line.separator"));
//                        playUser();

                    }
                }
            }
        });
        btn2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn2.getText())) {
                        btn2.setText(selectedXOPlayer);
                        try {
                            if(fw!=null){
                            fw.write("player btn2 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));}

                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        playUser();
                        availableLocations.remove(btn2);
                        if (!result) {
                        }
                    }
                }

            }
        });
        btn3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn3.getText())) {
                        btn3.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn3 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn3);
                        if (!result) {
                        }
                    }
                }
            }
        });
        btn4.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn4.getText())) {
                        btn4.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn4 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn4);
                        if (!result) {
                        }
                    }
                }
            }
        });
        btn5.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn5.getText())) {
                        btn5.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn5 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn5);
                        if (!result) {
                        }
                    }
                }
            }
        });
        btn6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn6.getText())) {
                        btn6.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn6 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn6);
                        if (!result) {
                        }
                    }
                }
            }
        });
        btn7.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn7.getText())) {
                        btn7.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn7 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn7);
                        if (!result) {
                        }
                    }
                }
            }
        });
        btn8.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn8.getText())) {
                        btn8.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn8 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn8);
                        if (!result) {
                        }
                    }
                }
            }
        });
        btn9.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (flag) {
                    if ("".equals(btn9.getText())) {
                        btn9.setText(selectedXOPlayer);
                        try {
                            fw.write("player btn9 " + selectedXOPlayer);
                            fw.write(System.getProperty("line.separator"));
                        } catch (IOException ex) {
                            Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        playUser();
                        availableLocations.remove(btn9);
                        if (!result) {
                        }
                    }
                }
            }
        });
//        FILE
//        if (player.match.equals("match1")) {
//            try {
//                f = new File("test.txt");
//                fw = new FileWriter(f);
//
//            } catch (IOException ex) {
//                Logger.getLogger(playOnline.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

    }

    void changeColor(Button btn1, Button btn2, Button btn3) {
        btn1.setStyle("-fx-background-color: yellow;");
        btn2.setStyle("-fx-background-color: yellow;");
        btn3.setStyle("-fx-background-color: yellow;");
        flag = false;

    }

    boolean checkSuccess(String success) {
        if ((btn1.getText() + btn2.getText() + btn3.getText()).equals(success)) {
            changeColor(btn1, btn2, btn3);
            return true;
        } else {
            if ((btn1.getText() + btn4.getText() + btn7.getText()).equals(success)) {
                changeColor(btn1, btn4, btn7);
                return true;
            } else {
                if ((btn1.getText() + btn5.getText() + btn9.getText()).equals(success)) {
                    changeColor(btn1, btn5, btn9);
                    return true;
                } else {
                    if ((btn4.getText() + btn5.getText() + btn6.getText()).equals(success)) {
                        changeColor(btn4, btn5, btn6);
                        return true;
                    } else {
                        if ((btn3.getText() + btn5.getText() + btn7.getText()).equals(success)) {
                            changeColor(btn3, btn5, btn7);
                            return true;
                        } else {
                            if ((btn7.getText() + btn8.getText() + btn9.getText()).equals(success)) {
                                changeColor(btn7, btn8, btn9);
                                return true;
                            } else {
                                if ((btn3.getText() + btn6.getText() + btn9.getText()).equals(success)) {
                                    changeColor(btn3, btn6, btn9);
                                    return true;
                                } else {
                                    if ((btn2.getText() + btn5.getText() + btn8.getText()).equals(success)) {
                                        changeColor(btn2, btn5, btn8);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    void playUser() {
        user++;
        if (user >= 3) {
            result = checkSuccess(success1);
            if (result) {
                userScore++;
//                Task<Void> sleeper = new Task<Void>() {
//                    @Override
//                    protected Void call() throws Exception {
//                        try {
//                            Thread.sleep(5000);
//                        } catch (InterruptedException e) {
//                        }
//                        return null;
//                    }
//                };
//                sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
//                    @Override
//                    public void handle(WorkerStateEvent event) {
                /* //id_playerScoreSecond.setText("" + );
                        Scene scene = new Scene(new Group(), 540, 540);

                        // Create the media source.
                        URL mediaUrl = getClass().getResource("AhmedHelmy.mp4");
                        String mediaStringUrl = mediaUrl.toExternalForm();

                        //String source = "farah.mp4";
                        Media media = new Media(mediaStringUrl);

                        // Create the player and set to play automatically.
                        MediaPlayer mediaPlayer = new MediaPlayer(media);
                        // mediaPlayer.setAutoPlay(false);
                        mediaPlayer.play();

                        // Create the view and add it to the Scene.
                        MediaView mediaView = new MediaView(mediaPlayer);
                        ((Group) scene.getRoot()).getChildren().add(mediaView);
                        stage.setScene(scene);
                        mediaView.getMediaPlayer().setOnEndOfMedia(new Runnable() {
                            @Override
                            public void run() {
                                ((Group) scene.getRoot()).getChildren().remove(mediaView);
                                Parent root = new playComputerDesign(stage, player);
                                Scene scene = new Scene(root);
                                stage.setScene(scene);
                                id_playerScoreSecond.setText("" + userScore);
                                id_computerScore.setText("" + computerScore);
                                mediaView.setVisible(false);
                                System.out.println("end of media");

                            }
                        }
                        );*/
                String path = "src//resources//AhmedHelmy.mp4";
                Media media = new Media(new File(path).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                MediaView mediaView = new MediaView(mediaPlayer);
                mediaPlayer.setAutoPlay(true);
                Label winning = new Label("Congratulations");
                winning.setAlignment(Pos.CENTER);
                VBox content = new VBox(10, winning, mediaView);
                content.setAlignment(Pos.CENTER);
                Dialog d = new Dialog();
                d.setResizable(true);
                d.getDialogPane().getButtonTypes().addAll(ButtonType.CANCEL);
                d.getDialogPane().setContent(content);
                d.getDialogPane().setMinHeight(430);
                d.getDialogPane().setMinWidth(430);

                d.setOnShowing(e -> mediaPlayer.play());
                d.setOnCloseRequest(e -> mediaPlayer.stop());
                d.show();

                resetBoard();
//                    }
//                });
//                new Thread(sleeper).start();
//                mediaView.getMediaPlayer().getOnEndOfMedia().run();
            }
        }
        th.start();

    }

    void resetBoard() {
        for (Iterator<Button> iterator = AllButons.iterator(); iterator.hasNext();) {
            iterator.next().setText("");

        }
        for (Iterator<Button> iterator = AllButons.iterator(); iterator.hasNext();) {
            iterator.next().setStyle("-fx-background-color: gray;");

        }
        availableLocations.removeAll(availableLocations);
        availableLocations.addAll(AllButons);
        id_computerScore.setText("" + computerScore);
        id_playerScoreSecond.setText("" + userScore);
        flag = true;

    }

    @Override
    public void run() {
        String receive = null;
        
        while (true) {
            try {
                if (input.available() > 0) {
                    receive = input.readLine();

                }
                System.out.println(receive + "     mhg");
                StringTokenizer st = new StringTokenizer(receive, ",");
                String bttn = st.nextToken();
                String game = st.nextToken();
                for (int i = 0; i < btn.length; i++) {
                    System.out.println(btn[i].getText());
                    if (btn[i].getId().equals(bttn)) {
                        btn[i].setText(game);

                    }

                }

            } catch (IOException ex) {
                System.out.println("error");
            }
        }

    }

}
