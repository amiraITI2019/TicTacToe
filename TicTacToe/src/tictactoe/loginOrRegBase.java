package tictactoe;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class loginOrRegBase extends BorderPane {

    protected final InnerShadow innerShadow;
    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final DropShadow dropShadow;
    protected final Label label2;
    protected final Button login;
    protected final Button register;
    protected final Label label3;
    protected final Button back;
    protected final AnchorPane anchorPane0;

    public loginOrRegBase(Stage stage) {

        innerShadow = new InnerShadow();
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        dropShadow = new DropShadow();
        label2 = new Label();
        login = new Button();
        register = new Button();
        label3 = new Label();
        back = new Button();
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
        rectangle.setLayoutY(1.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(2000.0);
        rectangle.setX(2.0);

        label.setLayoutX(138.0);
        label.setLayoutY(83.0);
        label.setPrefHeight(75.0);
        label.setPrefWidth(86.0);
        label.setText("x");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ef0000"));
        label.setFont(new Font(71.0));

        label0.setLayoutX(170.0);
        label0.setLayoutY(84.0);
        label0.setText("o");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#00ff5e"));
        label0.setFont(new Font(70.0));

        label1.setLayoutX(224.0);
        label1.setLayoutY(104.0);
        label1.setPrefHeight(50.0);
        label1.setPrefWidth(140.0);
        label1.setText("Game");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label1.setFont(new Font(50.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#08a1fc"));
        dropShadow.setHeight(59.3);
        dropShadow.setRadius(23.22);
        dropShadow.setSpread(0.18);
        dropShadow.setWidth(35.58);
        label1.setEffect(dropShadow);

        label2.setLayoutX(169.0);
        label2.setLayoutY(201.0);
        label2.setPrefHeight(50.0);
        label2.setPrefWidth(140.0);
        label2.setText("Choose");
        label2.setTextFill(javafx.scene.paint.Color.RED);
        label2.setFont(new Font(38.0));

        login.setLayoutX(260.0);
        login.setLayoutY(275.0);
        login.setMnemonicParsing(false);
        login.setPrefHeight(64.0);
        login.setPrefWidth(120.0);
        login.setText("Log in");
        login.setFont(new Font("System Bold Italic", 23.0));

        register.setLayoutX(95.0);
        register.setLayoutY(274.0);
        register.setMnemonicParsing(false);
        register.setPrefHeight(64.0);
        register.setPrefWidth(120.0);
        register.setText("Register");
        register.setFont(new Font("System Bold Italic", 23.0));

        label3.setLayoutX(218.0);
        label3.setLayoutY(348.0);
        label3.setPrefHeight(55.0);
        label3.setPrefWidth(43.0);
        label3.setText("or");
        label3.setTextFill(javafx.scene.paint.Color.RED);
        label3.setFont(new Font(38.0));

        back.setLayoutX(180.0);
        back.setLayoutY(410.0);
        back.setMnemonicParsing(false);
        back.setPrefHeight(64.0);
        back.setPrefWidth(120.0);
        back.setText("Back");
        back.setFont(new Font("System Bold Italic", 23.0));

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(160.0);
        setBottom(splitPane);

        anchorPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(login);
        anchorPane.getChildren().add(register);
        anchorPane.getChildren().add(label3);
        anchorPane.getChildren().add(back);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);
            register.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.playmMultiDesign);
          
              Parent root = new registerBase(stage);
              Scene scene = new Scene(root);
              stage.setScene(scene);
              
        });
        
         login.setOnAction((Action) -> {
          
              Parent root = new logInBase(stage);
              Scene scene = new Scene(root);
              stage.setScene(scene);
              
        });
         
          back.setOnAction((Action) -> {
          
              Parent root = new xo_homeBase(stage);
              Scene scene = new Scene(root);
              stage.setScene(scene);
              
        });

    }
}
