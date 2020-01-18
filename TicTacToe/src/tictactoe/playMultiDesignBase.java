package tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class playMultiDesignBase extends BorderPane {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label id_playerNameFirst;
    protected final Label id_playerNameSecond;
    protected final Label id_playerScoreFirst;
    protected final Label id_playerScoreSecond;
    protected final Button id_newGame;
    protected final Lighting lighting;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final DropShadow dropShadow;
    protected final Button id_btn1;
    protected final Button id_btn2;
    protected final Button id_btn3;
    protected final Button id_btn6;
    protected final Button id_btn4;
    protected final Button id_btn5;
    protected final Button id_btn9;
    protected final Button id_btn8;
    protected final Button id_btn7;
    protected final Button id_back;
    protected final Lighting lighting0;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;
    int XOCounter = 0;
    int player1 = 0, player2 = 0;
    protected final String success1 = "XXX", success2 = "OOO";
    protected boolean result;
    boolean gamePlayed = true;
    boolean firstPlayed = true;
    Color xForeground = Color.GREEN;
    Color oForeground = Color.RED;
    protected static int Player1Score = 0, Player2Score = 0;
    protected Stage stage;
    protected Player player;
    protected secondPlayer sPlayer;

    public playMultiDesignBase(Stage stage, Player player, secondPlayer sPlayer) {
        this.stage = stage;
        this.player = player;
        this.sPlayer = sPlayer;
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        id_playerNameFirst = new Label();
        id_playerNameSecond = new Label();
        id_playerScoreFirst = new Label();
        id_playerScoreSecond = new Label();
        id_newGame = new Button();
        lighting = new Lighting();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        dropShadow = new DropShadow();
        id_btn1 = new Button();
        id_btn2 = new Button();
        id_btn3 = new Button();
        id_btn6 = new Button();
        id_btn4 = new Button();
        id_btn5 = new Button();
        id_btn9 = new Button();
        id_btn8 = new Button();
        id_btn7 = new Button();
        id_back = new Button();
        lighting0 = new Lighting();
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

        id_playerNameFirst.setLayoutX(98.0);
        id_playerNameFirst.setLayoutY(103.0);
        id_playerNameFirst.setPrefHeight(25.0);
        id_playerNameFirst.setPrefWidth(82.0);
        id_playerNameFirst.setText(player.name);
        id_playerNameFirst.setTextFill(javafx.scene.paint.Color.valueOf("#06afe2"));
        id_playerNameFirst.setFont(new Font(16.0));

        id_playerNameSecond.setLayoutX(316.0);
        id_playerNameSecond.setLayoutY(103.0);
        id_playerNameFirst.setPrefHeight(25.0);
        id_playerNameFirst.setPrefWidth(128.0);
        id_playerNameSecond.setText(sPlayer.name);
        id_playerNameSecond.setTextFill(javafx.scene.paint.Color.valueOf("#06afe2"));
        id_playerNameSecond.setFont(new Font(16.0));

        id_playerScoreFirst.setLayoutX(187.0);
        id_playerScoreFirst.setLayoutY(114.0);
        id_playerScoreFirst.setText("0");
        id_playerScoreFirst.setTextFill(javafx.scene.paint.Color.WHITE);
        id_playerScoreFirst.setFont(new Font(17.0));

        id_playerScoreSecond.setLayoutX(284.0);
        id_playerScoreSecond.setLayoutY(114.0);
        id_playerScoreSecond.setText("0");
        id_playerScoreSecond.setTextFill(javafx.scene.paint.Color.WHITE);
        id_playerScoreSecond.setFont(new Font(17.0));

        id_newGame.setLayoutX(255.0);
        id_newGame.setLayoutY(401.0);
        id_newGame.setMnemonicParsing(false);
        id_newGame.setPrefHeight(34.0);
        id_newGame.setPrefWidth(91.0);
        id_newGame.setText("new game");

        lighting.setDiffuseConstant(1.5);
        id_newGame.setEffect(lighting);
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

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#00a9d8"));
        label1.setEffect(dropShadow);

        id_btn1.setLayoutX(98.0);
        id_btn1.setLayoutY(147.0);
        id_btn1.setMnemonicParsing(false);
        id_btn1.setPrefHeight(71.0);
        id_btn1.setPrefWidth(84.0);
        id_btn1.setFont(new Font(35.0));

        id_btn2.setLayoutX(199.0);
        id_btn2.setLayoutY(147.0);
        id_btn2.setMnemonicParsing(false);
        id_btn2.setPrefHeight(71.0);
        id_btn2.setPrefWidth(84.0);
        id_btn2.setFont(new Font(35.0));

        id_btn3.setLayoutX(300.0);
        id_btn3.setLayoutY(147.0);
        id_btn3.setMnemonicParsing(false);
        id_btn3.setPrefHeight(71.0);
        id_btn3.setPrefWidth(84.0);
        id_btn3.setFont(new Font(35.0));

        id_btn6.setLayoutX(301.0);
        id_btn6.setLayoutY(232.0);
        id_btn6.setMnemonicParsing(false);
        id_btn6.setPrefHeight(71.0);
        id_btn6.setPrefWidth(84.0);
        id_btn6.setFont(new Font(35.0));

        id_btn4.setLayoutX(97.0);
        id_btn4.setLayoutY(232.0);
        id_btn4.setMnemonicParsing(false);
        id_btn4.setPrefHeight(71.0);
        id_btn4.setPrefWidth(84.0);
        id_btn4.setFont(new Font(35.0));

        id_btn5.setLayoutX(199.0);
        id_btn5.setLayoutY(232.0);
        id_btn5.setMnemonicParsing(false);
        id_btn5.setPrefHeight(71.0);
        id_btn5.setPrefWidth(84.0);
        id_btn5.setFont(new Font(35.0));

        id_btn9.setLayoutX(301.0);
        id_btn9.setLayoutY(318.0);
        id_btn9.setMnemonicParsing(false);
        id_btn9.setPrefHeight(71.0);
        id_btn9.setPrefWidth(84.0);
        id_btn9.setFont(new Font(35.0));

        id_btn8.setLayoutX(199.0);
        id_btn8.setLayoutY(317.0);
        id_btn8.setMnemonicParsing(false);
        id_btn8.setPrefHeight(71.0);
        id_btn8.setPrefWidth(84.0);
        id_btn8.setFont(new Font(35.0));

        id_btn7.setLayoutX(97.0);
        id_btn7.setLayoutY(317.0);
        id_btn7.setMnemonicParsing(false);
        id_btn7.setPrefHeight(71.0);
        id_btn7.setPrefWidth(84.0);
        id_btn7.setFont(new Font(35.0));

        id_back.setLayoutX(140.0);
        id_back.setLayoutY(401.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(34.0);
        id_back.setPrefWidth(91.0);
        id_back.setText("back");
        id_back.setStyle("-fx-background-color: #008cff;");
        id_newGame.setStyle("-fx-background-color: #008cff;");
        id_back.setTextFill(javafx.scene.paint.Color.valueOf("#fff"));
        id_newGame.setTextFill(javafx.scene.paint.Color.valueOf("#fff"));

        lighting0.setDiffuseConstant(1.5);
        id_back.setEffect(lighting0);
        id_back.setFont(new Font(14.0));

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
        anchorPane.getChildren().add(id_playerNameFirst);
        anchorPane.getChildren().add(id_playerNameSecond);
        anchorPane.getChildren().add(id_playerScoreFirst);
        anchorPane.getChildren().add(id_playerScoreSecond);
        anchorPane.getChildren().add(id_newGame);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(id_btn1);
        anchorPane.getChildren().add(id_btn2);
        anchorPane.getChildren().add(id_btn3);
        anchorPane.getChildren().add(id_btn6);
        anchorPane.getChildren().add(id_btn4);
        anchorPane.getChildren().add(id_btn5);
        anchorPane.getChildren().add(id_btn9);
        anchorPane.getChildren().add(id_btn8);
        anchorPane.getChildren().add(id_btn7);
        anchorPane.getChildren().add(id_back);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);

        id_btn1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {
                        id_btn1.setTextFill(xForeground);
                        id_btn1.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn1.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {
                                id_btn1.disableProperty();
                                id_btn1.setTextFill(oForeground);
                                id_btn1.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
                        }
                    }
                    draw();

                    setCurrentPlayer(id_btn1);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn1);
                }
            }
        });
        id_btn2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {
                        id_btn2.setTextFill(xForeground);
                        id_btn2.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn2.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {
                                id_btn2.disableProperty();
                                id_btn2.setTextFill(oForeground);
                                id_btn2.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
                        }
                    }
                    draw();
                    setCurrentPlayer(id_btn2);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn2);
                }
            }
        });
        id_btn3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {
                        id_btn3.setTextFill(xForeground);
                        id_btn3.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn3.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {
                                id_btn3.disableProperty();
                                id_btn3.setTextFill(oForeground);
                                id_btn3.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
                        }
                    }
                    draw();

                    setCurrentPlayer(id_btn3);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn3);
                }
            }
        });
        id_btn4.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {
                        id_btn4.setTextFill(xForeground);
                        id_btn4.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn4.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {
                                id_btn4.disableProperty();
                                id_btn4.setTextFill(oForeground);
                                id_btn4.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
                        }
                    }
                    draw();

                    setCurrentPlayer(id_btn4);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn4);
                }
            }
        });
        id_btn5.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {

                        id_btn5.setTextFill(xForeground);
                        id_btn5.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn5.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {

                                id_btn5.setTextFill(oForeground);
                                id_btn5.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
                        }
                    }
                    draw();

                    setCurrentPlayer(id_btn5);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn5);
                }
            }
        });
        id_btn6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {

                        id_btn6.setTextFill(xForeground);
                        id_btn6.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn6.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {

                                id_btn6.setTextFill(oForeground);
                                id_btn6.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
                        }
                    }
                    draw();

                    setCurrentPlayer(id_btn6);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn6);
                }
            }
        });
        id_btn7.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {

                        id_btn7.setTextFill(xForeground);
                        id_btn7.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn7.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {

                                id_btn7.setTextFill(oForeground);
                                id_btn7.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
      
                        }
                    }
                    draw();

                    setCurrentPlayer(id_btn7);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn7);
                }
            }
        });
        id_btn8.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {

                        id_btn8.setTextFill(xForeground);
                        id_btn8.setText("X");
                        player1++;
                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }
                    } else {
                        if ("".equals(id_btn9.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {

                                id_btn8.setTextFill(oForeground);
                                id_btn8.setText("O");
                                player2++;
                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                            }
          
                        }
                    }
                    draw();
                    setCurrentPlayer(id_btn8);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn8);
                }
            }
        });
        id_btn9.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (gamePlayed) {

                    if (firstPlayed) {
                        id_btn9.setTextFill(xForeground);
                        id_btn9.setText("X");
                        player1++;

                        if (player1 >= 3) {
                            result = checkSuccess(success1);
                            if (result) {
                                Player1Score++;
                                player1();
                            }
                        }

                    } else {
                        if ("".equals(id_btn9.getText())) {
                            result = checkSuccess(success1);
                            if (!result) {
                                id_btn9.setTextFill(oForeground);
                                id_btn9.setText("O");
                                player2++;

                                if (player2 >= 3) {
                                    result = checkSuccess(success2);
                                    if (result) {
                                        Player2Score++;
                                        player2();
                                    }
                                }
                                
                            }
                        }
                    }
                    draw();
                    setCurrentPlayer(id_btn9);
                    firstPlayed = !firstPlayed;
                    setCurrentPlayer(id_btn9);
                }
            }
        });

        id_newGame.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.multi);
            gamePlayed = true;
            firstPlayed = !firstPlayed;
            id_btn1.setText("");
            id_btn2.setText("");
            id_btn3.setText("");
            id_btn4.setText("");
            id_btn5.setText("");
            id_btn6.setText("");
            id_btn7.setText("");
            id_btn8.setText("");
            id_btn9.setText("");

            id_btn1.setStyle("-fx-background-color: white;");
            id_btn2.setStyle("-fx-background-color: white;");
            id_btn3.setStyle("-fx-background-color: white;");
            id_btn4.setStyle("-fx-background-color: white;");
            id_btn5.setStyle("-fx-background-color: white;");
            id_btn6.setStyle("-fx-background-color: white;");
            id_btn7.setStyle("-fx-background-color: white;");
            id_btn8.setStyle("-fx-background-color: white;");
            id_btn9.setStyle("-fx-background-color: white;");

            id_btn1.setDisable(false);
            id_btn2.setDisable(false);
            id_btn3.setDisable(false);
            id_btn4.setDisable(false);
            id_btn5.setDisable(false);
            id_btn6.setDisable(false);
            id_btn7.setDisable(false);
            id_btn8.setDisable(false);
            id_btn9.setDisable(false);
        });
        id_back.setOnAction((Action) -> {
            Player1Score = 0;
            Player2Score = 0;
            Parent root = new multi_PlayerBase(stage);
            Scene scene = new Scene(root);
            stage.setScene(scene);

        });
    }

    private void setCurrentPlayer(Button btn) {

        if (firstPlayed == false) {
            btn.setText("X");
            btn.setTextFill(xForeground);

        } else {
            btn.setText("O");
            btn.setTextFill(oForeground);
            btn.setDisable(true);
            btn.setBackground(new Background(new BackgroundFill(Color.AZURE, null, Insets.EMPTY)));
        }

    }

    void changeColor(Button btn1, Button btn2, Button btn3) {
        btn1.setStyle("-fx-background-color: yellow;");
        btn2.setStyle("-fx-background-color: yellow;");
        btn3.setStyle("-fx-background-color: yellow;");
        gamePlayed = false;
    }

    boolean checkSuccess(String success) {
        if ((id_btn1.getText() + id_btn2.getText() + id_btn3.getText()).equals(success)) {
            changeColor(id_btn1, id_btn2, id_btn3);
            return true;
        } else {
            if ((id_btn1.getText() + id_btn4.getText() + id_btn7.getText()).equals(success)) {
                changeColor(id_btn1, id_btn4, id_btn7);
                return true;
            } else {
                if ((id_btn1.getText() + id_btn5.getText() + id_btn9.getText()).equals(success)) {
                    changeColor(id_btn1, id_btn5, id_btn9);
                    return true;
                } else {
                    if ((id_btn4.getText() + id_btn5.getText() + id_btn6.getText()).equals(success)) {
                        changeColor(id_btn4, id_btn5, id_btn6);
                        return true;
                    } else {
                        if ((id_btn3.getText() + id_btn5.getText() + id_btn7.getText()).equals(success)) {
                            changeColor(id_btn3, id_btn5, id_btn7);
                            return true;
                        } else {
                            if ((id_btn7.getText() + id_btn8.getText() + id_btn9.getText()).equals(success)) {
                                changeColor(id_btn7, id_btn8, id_btn9);
                                return true;
                            } else {
                                if ((id_btn3.getText() + id_btn6.getText() + id_btn9.getText()).equals(success)) {
                                    changeColor(id_btn3, id_btn6, id_btn9);
                                    return true;
                                } else {
                                    if ((id_btn2.getText() + id_btn5.getText() + id_btn8.getText()).equals(success)) {
                                        changeColor(id_btn2, id_btn5, id_btn8);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (XOCounter >= 9) {
            gamePlayed = false;
            firstPlayed = false;
            XOCounter = 0;
            
        }

        return false;
    }

    public void player1() {
        playMultiDesignBase pMD = new playMultiDesignBase(stage, player, sPlayer);
        id_playerScoreFirst.setText("" + Player1Score);
        id_playerScoreSecond.setText("" + Player2Score);
        JOptionPane.showMessageDialog(null, "Congratulations    " + id_playerNameFirst.getText());
    }

    public void player2() {
        playMultiDesignBase pMD = new playMultiDesignBase(stage, player, sPlayer);
        id_playerScoreSecond.setText("" + Player2Score);
        id_playerScoreFirst.setText("" + Player1Score);
        JOptionPane.showMessageDialog(null, "Congratulations    " + id_playerNameSecond.getText());
    }
    public void draw(){
        XOCounter++;
        if(XOCounter==9)
        {
            JOptionPane.showMessageDialog(null, "    NO Winner ^_^");
        }
    }
}
