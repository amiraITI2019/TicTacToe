package tictactoe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class logInBase extends BorderPane {

    protected final InnerShadow innerShadow;
    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final DropShadow dropShadow;
    protected final Button back;
    protected final DropShadow dropShadow0;
    protected final Label label0;
    protected final Label label1;
    protected final TextField name;
    protected final TextField password;
    protected final Label label2;
    protected final Button logIn;
    protected final DropShadow dropShadow1;
    protected final Label error;
    protected final AnchorPane anchorPane0;
    protected Stage stage;

    public logInBase(Stage s) {

        stage = s;
        innerShadow = new InnerShadow();
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        dropShadow = new DropShadow();
        back = new Button();
        dropShadow0 = new DropShadow();
        label0 = new Label();
        label1 = new Label();
        name = new TextField();
        password = new TextField();
        label2 = new Label();
        logIn = new Button();
        dropShadow1 = new DropShadow();
        error = new Label();
        anchorPane0 = new AnchorPane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(590.0);
        setPrefWidth(464.0);

        innerShadow.setChoke(0.78);
        innerShadow.setColor(javafx.scene.paint.Color.valueOf("#008cff"));
        innerShadow.setHeight(248.58);
        innerShadow.setRadius(125.39500000000001);
        innerShadow.setWidth(255.0);
        setEffect(innerShadow);

        BorderPane.setAlignment(splitPane, javafx.geometry.Pos.CENTER);
        splitPane.setDividerPositions(0.9937759336099585);
        splitPane.setPrefHeight(619.0);
        splitPane.setPrefWidth(479.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(537.0);
        anchorPane.setPrefWidth(598.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(2000.0);
        rectangle.setLayoutX(1.0);
        rectangle.setLayoutY(18.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(2000.0);
        rectangle.setX(2.0);

        label.setLayoutX(162.0);
        label.setLayoutY(91.0);
        label.setPrefHeight(73.0);
        label.setPrefWidth(162.0);
        label.setText("Log In");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label.setFont(new Font(50.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#08a1fc"));
        dropShadow.setHeight(59.3);
        dropShadow.setRadius(23.22);
        dropShadow.setSpread(0.18);
        dropShadow.setWidth(35.58);
        label.setEffect(dropShadow);

        back.setLayoutX(105.0);
        back.setLayoutY(372.0);
        back.setMnemonicParsing(false);
        back.setPrefHeight(50.0);
        back.setPrefWidth(101.0);
        back.setText("Back");
        back.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        back.setFont(new Font("System Bold Italic", 23.0));

        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#3889b0"));
        dropShadow0.setHeight(53.98);
        dropShadow0.setRadius(42.6475);
        dropShadow0.setSpread(0.42);
        dropShadow0.setWidth(118.61);
        back.setEffect(dropShadow0);

        label0.setLayoutX(82.0);
        label0.setLayoutY(208.0);
        label0.setPrefHeight(43.0);
        label0.setPrefWidth(99.0);
        label0.setText(" Name :");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label0.setFont(new Font(19.0));

        label1.setLayoutX(84.0);
        label1.setLayoutY(268.0);
        label1.setPrefHeight(43.0);
        label1.setPrefWidth(99.0);
        label1.setText("Password :");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label1.setFont(new Font(19.0));

        name.setLayoutX(187.0);
        name.setLayoutY(214.0);
        name.setPrefHeight(33.0);
        name.setPrefWidth(188.0);

        password.setLayoutX(188.0);
        password.setLayoutY(277.0);
        password.setPrefHeight(33.0);
        password.setPrefWidth(188.0);

        label2.setLayoutX(141.0);
        label2.setLayoutY(115.0);
        label2.setPrefHeight(75.0);
        label2.setPrefWidth(270.0);
        label2.setText("_________");
        label2.setTextFill(javafx.scene.paint.Color.WHITE);
        label2.setFont(new Font(52.0));

        logIn.setLayoutX(257.0);
        logIn.setLayoutY(369.0);
        logIn.setMnemonicParsing(false);
        logIn.setPrefHeight(50.0);
        logIn.setPrefWidth(97.0);
        logIn.setText("log In");
        logIn.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        logIn.setFont(new Font("System Bold Italic", 23.0));

        dropShadow1.setColor(javafx.scene.paint.Color.valueOf("#3889b0"));
        dropShadow1.setHeight(53.98);
        dropShadow1.setRadius(42.6475);
        dropShadow1.setSpread(0.42);
        dropShadow1.setWidth(118.61);
        logIn.setEffect(dropShadow1);

        error.setLayoutX(88.0);
        error.setLayoutY(318.0);
        error.setPrefHeight(32.0);
        error.setPrefWidth(313.0);
        error.setText("");
        error.setTextFill(javafx.scene.paint.Color.BLACK);
        error.setFont(new Font(16.0));

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(160.0);
        setBottom(splitPane);

        anchorPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(back);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(name);
        anchorPane.getChildren().add(password);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(logIn);
        anchorPane.getChildren().add(error);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);

        label.setRotate(360);

        StackPane.setMargin(label, new Insets(0, 0, 1000, 0));

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(javafx.util.Duration.seconds(.3));
        translateTransition.setNode(label);
        translateTransition.setByY(15);
        translateTransition.setCycleCount(1);
        translateTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(javafx.util.Duration.seconds(0.3));
        rotateTransition.setNode(label);
        rotateTransition.setByAngle(-360);
        rotateTransition.setCycleCount(1);
        rotateTransition.setAutoReverse(false);

        SequentialTransition sequentialTransition = new SequentialTransition(label, translateTransition, rotateTransition);

        sequentialTransition.play();

        back.setOnAction((Action) -> {

            Parent root = new loginOrRegBase(stage);
            Scene scene = new Scene(root);
            stage.setScene(scene);

        });

        logIn.setOnAction((Action) -> {
            error.setStyle("-fx-background-color:red;");

            if (name.getText().equals("") && password.getText().equals("")) {

                error.setVisible(true);
                error.setText(" name is empty and password ");

            } else if (name.getText().equals("")) {
                error.setVisible(true);
                error.setText(" name is empty  ");

            } else if (password.getText().equals("")) {

                error.setVisible(true);
                error.setText("password is empty ");

            } else {
                error.setVisible(false);
                try {
                    login();
                } catch (IOException ex) {
                    Logger.getLogger(logInBase.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

    }

    private void login() throws IOException {
        Socket player = new Socket("127.0.0.1", 2020);
        DataInputStream input = new DataInputStream(player.getInputStream());
        PrintStream output = new PrintStream(player.getOutputStream());
        output.println("login,amira,11111");
//        send "login,username,password" to server
        Parent root = null;
        root = new playOnline(player,input,output);
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }
}
