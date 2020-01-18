package tictactoe;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class friendsBase extends BorderPane {

    protected final InnerShadow innerShadow;
    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final DropShadow dropShadow;
    protected final Button back;
    protected final DropShadow dropShadow0;
    protected final Label label0;
    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane0;
    protected final Label userName;
    protected final Button play;
    protected final AnchorPane anchorPane1;
    

    public friendsBase(Stage s,Socket soc,DataInputStream input,PrintStream output) {

        innerShadow = new InnerShadow();
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        dropShadow = new DropShadow();
        back = new Button();
        dropShadow0 = new DropShadow();
        label0 = new Label();
        scrollPane = new ScrollPane();
        anchorPane0 = new AnchorPane();
        userName = new Label();
        play = new Button();
        anchorPane1 = new AnchorPane();

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
        rectangle.setLayoutX(12.0);
        rectangle.setLayoutY(15.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(2000.0);
        rectangle.setX(2.0);

        label.setLayoutX(134.0);
        label.setLayoutY(72.0);
        label.setPrefHeight(64.0);
        label.setPrefWidth(230.0);
        label.setText("Active players");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label.setFont(new Font(35.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#08a1fc"));
        dropShadow.setHeight(59.3);
        dropShadow.setRadius(23.22);
        dropShadow.setSpread(0.18);
        dropShadow.setWidth(35.58);
        label.setEffect(dropShadow);

        back.setLayoutX(188.0);
        back.setLayoutY(444.0);
        back.setMnemonicParsing(false);
        back.setPrefHeight(26.0);
        back.setPrefWidth(90.0);
        back.setText("Back");
        back.setFont(new Font("System Bold Italic", 23.0));

        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#3889b0"));
        dropShadow0.setHeight(53.98);
        dropShadow0.setRadius(42.6475);
        dropShadow0.setSpread(0.42);
        dropShadow0.setWidth(118.61);
        back.setEffect(dropShadow0);

        label0.setLayoutX(144.0);
        label0.setLayoutY(104.0);
        label0.setText("__________________");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font(26.0));

        scrollPane.setLayoutX(84.0);
        scrollPane.setLayoutY(162.0);
        scrollPane.setPrefHeight(261.0);
        scrollPane.setPrefWidth(298.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(261.0);
        anchorPane0.setPrefWidth(278.0);

        userName.setLayoutX(31.0);
        userName.setLayoutY(24.0);
        userName.setPrefHeight(42.0);
        userName.setPrefWidth(115.0);
        userName.setText("user name");
        userName.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        userName.setFont(new Font(19.0));

        play.setLayoutX(163.0);
        play.setLayoutY(26.0);
        play.setMnemonicParsing(false);
        play.setPrefHeight(44.0);
        play.setPrefWidth(61.0);
        play.setText("play");
        play.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        play.setFont(new Font("System Bold Italic", 17.0));
        scrollPane.setContent(anchorPane0);

        anchorPane1.setMinHeight(0.0);
        anchorPane1.setMinWidth(0.0);
        anchorPane1.setPrefHeight(100.0);
        anchorPane1.setPrefWidth(160.0);
        setBottom(splitPane);

        anchorPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(back);
        anchorPane.getChildren().add(label0);
        anchorPane0.getChildren().add(userName);
        anchorPane0.getChildren().add(play);
        anchorPane.getChildren().add(scrollPane);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane1);
        onlineFriends(soc, input, output);

    }
    public void onlineFriends(Socket s,DataInputStream input,PrintStream output){
        output.println("online a b");
        
    }
}
