package tictactoe;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class multi_PlayerBase extends BorderPane {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Button id_play;
    protected final Lighting lighting;
    protected final Button id_back;
    protected final Lighting lighting0;
    protected final TextField id_player1;
    protected final TextField id_player2;
    protected final CheckBox id_record;
    protected final Label label2;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;

    public multi_PlayerBase(Stage stage) {

        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        id_play = new Button();
        lighting = new Lighting();
        id_back = new Button();
        lighting0 = new Lighting();
        id_player1 = new TextField();
        id_player2 = new TextField();
        id_record = new CheckBox();
        label2 = new Label();
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
        rectangle.setHeight(573.0);
        rectangle.setLayoutX(14.0);
        rectangle.setLayoutY(-101.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(463.0);

        label.setLayoutX(110.0);
        label.setLayoutY(91.0);
        label.setText("multi player");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("System Bold Italic", 43.0));

        label0.setLayoutX(107.0);
        label0.setLayoutY(238.0);
        label0.setPrefHeight(65.0);
        label0.setPrefWidth(0.0);
        label0.setText("o");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#00ff42"));
        label0.setFont(new Font(44.0));

        label1.setLayoutX(110.0);
        label1.setLayoutY(179.0);
        label1.setPrefHeight(65.0);
        label1.setPrefWidth(0.0);
        label1.setText("x");
        label1.setTextFill(javafx.scene.paint.Color.RED);
        label1.setFont(new Font(44.0));

        id_play.setLayoutX(266.0);
        id_play.setLayoutY(384.0);
        id_play.setMnemonicParsing(false);
        id_play.setPrefHeight(34.0);
        id_play.setPrefWidth(73.0);
        id_play.setText("Play");
        id_play.setFont(new Font("System Bold Italic", 18.0));

        lighting.setDiffuseConstant(1.69);
        id_play.setEffect(lighting);

        id_back.setLayoutX(139.0);
        id_back.setLayoutY(383.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(34.0);
        id_back.setPrefWidth(73.0);
        id_back.setText("Back");
        id_back.setFont(new Font("System Bold Italic", 18.0));

        lighting0.setDiffuseConstant(1.69);
        id_back.setEffect(lighting0);

        id_player1.setLayoutX(165.0);
        id_player1.setLayoutY(199.0);
        id_player1.setPrefHeight(33.0);
        id_player1.setPrefWidth(173.0);
        id_player1.setPromptText(" player name 1");
        id_player1.setFont(new Font(16.0));

        id_player2.setLayoutX(165.0);
        id_player2.setLayoutY(254.0);
        id_player2.setPrefHeight(33.0);
        id_player2.setPrefWidth(173.0);
        id_player2.setPromptText("player name 2");
        id_player2.setFont(new Font(16.0));

        id_record.setLayoutX(264.0);
        id_record.setLayoutY(328.0);
        id_record.setMnemonicParsing(false);

        label2.setLayoutX(205.0);
        label2.setLayoutY(323.0);
        label2.setText("Record");
        label2.setTextFill(javafx.scene.paint.Color.RED);
        label2.setFont(new Font(18.0));

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
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(id_play);
        anchorPane.getChildren().add(id_back);
        anchorPane.getChildren().add(id_player1);
        anchorPane.getChildren().add(id_player2);
        anchorPane.getChildren().add(id_record);
        anchorPane.getChildren().add(label2);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);
        Player p=new Player();
        secondPlayer sp=new secondPlayer();
        
        
            
         id_back.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.home);
              Parent root = new xo_homeBase(stage);
              Scene scene = new Scene(root);
              stage.setScene(scene);
        });
          id_play.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.playmMultiDesign);
               p.name=id_player1.getText();
               sp.name=id_player2.getText();
              Parent root = new playMultiDesignBase(stage,p,sp);
              Scene scene = new Scene(root);
              stage.setScene(scene);
              
        });

    }
}
