package tictactoe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class registerBase extends BorderPane {

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
    protected final Label label2;
    protected final Label label3;
    protected final TextField name;
    protected final TextField password;
    protected final TextField age;
    protected final Button choose;
    protected final Label label4;
    protected final Button register;
    protected final DropShadow dropShadow1;
    protected final Label error;
    protected final AnchorPane anchorPane0;

    public registerBase(Stage stage) {

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
        label2 = new Label();
        label3 = new Label();
        name = new TextField();
        password = new TextField();
        age = new TextField();
        choose = new Button();
        label4 = new Label();
        register = new Button();
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

        label.setLayoutX(147.0);
        label.setLayoutY(61.0);
        label.setPrefHeight(73.0);
        label.setPrefWidth(230.0);
        label.setText("Register");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label.setFont(new Font(50.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#08a1fc"));
        dropShadow.setHeight(59.3);
        dropShadow.setRadius(23.22);
        dropShadow.setSpread(0.18);
        dropShadow.setWidth(35.58);
        label.setEffect(dropShadow);

        back.setLayoutX(104.0);
        back.setLayoutY(407.0);
        back.setMnemonicParsing(false);
        back.setPrefHeight(45.0);
        back.setPrefWidth(97.0);
        back.setText("back");
        back.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        back.setFont(new Font("System Bold Italic", 21.0));

        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#3889b0"));
        dropShadow0.setHeight(53.98);
        dropShadow0.setRadius(42.6475);
        dropShadow0.setSpread(0.42);
        dropShadow0.setWidth(118.61);
        back.setEffect(dropShadow0);

        label0.setLayoutX(82.0);
        label0.setLayoutY(147.0);
        label0.setPrefHeight(43.0);
        label0.setPrefWidth(99.0);
        label0.setText(" Name :");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label0.setFont(new Font(19.0));

        label1.setLayoutX(84.0);
        label1.setLayoutY(207.0);
        label1.setPrefHeight(43.0);
        label1.setPrefWidth(99.0);
        label1.setText("Password :");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label1.setFont(new Font(19.0));

        label2.setLayoutX(82.0);
        label2.setLayoutY(315.0);
        label2.setPrefHeight(43.0);
        label2.setPrefWidth(104.0);
        label2.setText("Image :");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label2.setFont(new Font(19.0));

        label3.setLayoutX(77.0);
        label3.setLayoutY(266.0);
        label3.setPrefHeight(43.0);
        label3.setPrefWidth(104.0);
        label3.setText(" Age :");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label3.setFont(new Font(19.0));

        name.setLayoutX(187.0);
        name.setLayoutY(156.0);
        name.setPrefHeight(33.0);
        name.setPrefWidth(188.0);

        password.setLayoutX(187.0);
        password.setLayoutY(217.0);
        password.setPrefHeight(33.0);
        password.setPrefWidth(188.0);

        age.setLayoutX(186.0);
        age.setLayoutY(273.0);
        age.setPrefHeight(33.0);
        age.setPrefWidth(188.0);

        choose.setLayoutX(236.0);
        choose.setLayoutY(324.0);
        choose.setMnemonicParsing(false);
        choose.setPrefHeight(29.0);
        choose.setPrefWidth(75.0);
        choose.setText("choose");
        choose.setTextFill(javafx.scene.paint.Color.valueOf("#eb1818"));
        choose.setFont(new Font("System Bold Italic", 13.0));

        label4.setLayoutX(138.0);
        label4.setLayoutY(104.0);
        label4.setText("__________________");
        label4.setTextFill(javafx.scene.paint.Color.WHITE);
        label4.setFont(new Font(26.0));

        register.setLayoutX(247.0);
        register.setLayoutY(407.0);
        register.setMnemonicParsing(false);
        register.setPrefHeight(44.0);
        register.setPrefWidth(106.0);
        register.setText("register");
        register.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        register.setFont(new Font("System Bold Italic", 20.0));

        dropShadow1.setColor(javafx.scene.paint.Color.valueOf("#3889b0"));
        dropShadow1.setHeight(53.98);
        dropShadow1.setRadius(42.6475);
        dropShadow1.setSpread(0.42);
        dropShadow1.setWidth(118.61);
        register.setEffect(dropShadow1);

        error.setLayoutX(91.0);
        error.setLayoutY(360.0);
        error.setPrefHeight(32.0);
        error.setPrefWidth(276.0);
        error.setText("error");
        error.setFont(new Font(14.0));
        error.setVisible(false);

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
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(label3);
        anchorPane.getChildren().add(name);
        anchorPane.getChildren().add(password);
        anchorPane.getChildren().add(age);
        anchorPane.getChildren().add(choose);
        anchorPane.getChildren().add(label4);
        anchorPane.getChildren().add(register);
        anchorPane.getChildren().add(error);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);

        back.setOnAction((Action) -> {

            Parent root = new loginOrRegBase(stage);
            Scene scene = new Scene(root);
            stage.setScene(scene);

        });

        register.setOnAction((Action) -> {

            error.setStyle("-fx-background-color:red;");

            if (name.getText().equals("") && password.getText().equals("") && age.getText().equals("")) {

                error.setVisible(true);
                error.setText(" name is empty and password and age ");

            } else if (name.getText().equals("") && password.getText().equals("")) {

                error.setVisible(true);
                error.setText(" name is empty and password  ");

            } else if (name.getText().equals("")) {
                error.setVisible(true);
                error.setText(" name is empty  ");

            } else if (password.getText().equals("") && age.getText().equals("")) {

                error.setVisible(true);
                error.setText("password and age is empty ");

            } else if (password.getText().equals("")) {

                error.setVisible(true);
                error.setText("password is empty ");

            } else if (name.getText().equals("") && age.getText().equals("")) {

                error.setVisible(true);
                error.setText("name and age is empty ");

            } else if (age.getText().equals("")) {

                error.setVisible(true);
                error.setText("age is empty ");

            } else {
                error.setVisible(false);
                try {
                    register();
                } catch (IOException ex) {
                    Logger.getLogger(registerBase.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

    }

    private void register() throws IOException {
        Socket player = new Socket("127.0.0.1", 2020);
        DataInputStream input = new DataInputStream(player.getInputStream());
        PrintStream output = new PrintStream(player.getOutputStream());
//        send "register,userData" to server
    }
}
