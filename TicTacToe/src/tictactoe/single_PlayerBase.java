package tictactoe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class single_PlayerBase extends BorderPane {
    
    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Button id_play;
    protected final Lighting lighting;
    protected final Button id_back;
    protected final Lighting lighting0;
    protected final TextField id_playerName;
    protected final CheckBox id_record;
    protected final Label label4;
    protected final Label warning;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;
    protected boolean checked = false;
    protected final RadioButton selectX;
    protected final RadioButton selectO;
    protected char selectedXO = 'X';
    protected Player player;
    
    public single_PlayerBase(Stage stage) {
        
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        selectX = new RadioButton();
        selectO = new RadioButton();
        warning = new Label();
        id_play = new Button();
        lighting = new Lighting();
        id_back = new Button();
        lighting0 = new Lighting();
        id_playerName = new TextField();
        id_record = new CheckBox();
        label4 = new Label();
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
        
        label.setLayoutX(82.0);
        label.setLayoutY(189.0);
        label.setText("player name :");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#00aeff"));
        label.setFont(new Font(23.0));
        
        label0.setLayoutX(110.0);
        label0.setLayoutY(91.0);
        label0.setText("single player");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("System Bold Italic", 43.0));
        
        label1.setLayoutX(147.0);
        label1.setLayoutY(235.0);
        label1.setPrefHeight(62.0);
        label1.setPrefWidth(20.0);
        label1.setText("x");
        label1.setTextFill(javafx.scene.paint.Color.RED);
        label1.setFont(new Font(42.0));
        
        label2.setLayoutX(275.0);
        label2.setLayoutY(234.0);
        label2.setPrefHeight(65.0);
        label2.setPrefWidth(0.0);
        label2.setText("o");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#00ff42"));
        label2.setFont(new Font(44.0));
        
        selectX.setLayoutX(177.0);
        selectX.setLayoutY(263.0);
        selectX.setMnemonicParsing(false);
        selectX.setSelected(true);
        
        selectO.setLayoutX(312.0);
        selectO.setLayoutY(261.0);
        selectO.setMnemonicParsing(false);
        warning.setLayoutX(129.0);
        warning.setLayoutY(229.0);
        warning.setPrefHeight(17.0);
        warning.setPrefWidth(233.0);
        warning.setText("you must enter your name to start playing :)");
        warning.setTextFill(javafx.scene.paint.Color.valueOf("#eb2e2e"));
        warning.setVisible(false);
        
        id_play.setLayoutX(259.0);
        id_play.setLayoutY(383.0);
        id_play.setMnemonicParsing(false);
        id_play.setPrefHeight(38.0);
        id_play.setPrefWidth(85.0);
        id_play.setText("Play");
        id_play.setFont(new Font("System Bold Italic", 17.0));
        
        lighting.setDiffuseConstant(1.56);
        id_play.setEffect(lighting);
        
        id_back.setLayoutX(120.0);
        id_back.setLayoutY(384.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(36.0);
        id_back.setPrefWidth(85.0);
        id_back.setText("Back");
        id_back.setFont(new Font("System Bold Italic", 16.0));
        
        lighting0.setDiffuseConstant(1.56);
        id_back.setEffect(lighting0);
        
        id_playerName.setLayoutX(240.0);
        id_playerName.setLayoutY(185.0);
        id_playerName.setPrefHeight(37.0);
        id_playerName.setPrefWidth(187.0);
        id_playerName.setPromptText("Enter your name");
        id_playerName.setFont(new Font(15.0));
        
        id_record.setLayoutX(261.0);
        id_record.setLayoutY(320.0);
        id_record.setMnemonicParsing(false);
        id_record.setPrefHeight(34.0);
        id_record.setPrefWidth(19.0);
        id_record.setTextFill(javafx.scene.paint.Color.RED);
        id_record.setFont(new Font(13.0));
        
        label4.setLayoutX(195.0);
        label4.setLayoutY(322.0);
        label4.setText("Record");
        label4.setTextFill(javafx.scene.paint.Color.RED);
        label4.setFont(new Font(18.0));
        
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
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(selectX);
        anchorPane.getChildren().add(selectO);
        anchorPane.getChildren().add(id_play);
        anchorPane.getChildren().add(id_back);
        anchorPane.getChildren().add(id_playerName);
        anchorPane.getChildren().add(id_record);
        anchorPane.getChildren().add(label4);
        anchorPane.getChildren().add(warning);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);
        
        id_record.setOnAction((event) -> {
            if (checked) {
                checked = false;
            } else {
                checked = true;
            }
        });
        selectX.setOnAction((event) -> {
            selectedXO = 'X';
            selectO.setSelected(false);
            
        });
        selectO.setOnAction((event) -> {
            selectedXO = 'O';
            selectX.setSelected(false);
            
        }
        );
        
        id_back.setOnAction((Action) -> {
            Parent root = new xo_homeBase(stage);
            Scene scene = new Scene(root);
            stage.setScene(scene);
        });
        id_play.setOnAction((Action) -> {
            if (!"".equals(id_playerName.getText())) {
                player = new Player();
                player.name = id_playerName.getText();
                player.select = selectedXO;
                player.score = 0;
                if (checked) {
                    player.match = "match1";
                }
                else{
                     player.match = "";
                
                }

                //Parent root = new levelsBase(stage, player);
                Parent root = null;
                try {
                    root = new playComputerDesign(stage, player);
                } catch (IOException ex) {
                    Logger.getLogger(single_PlayerBase.class.getName()).log(Level.SEVERE, null, ex);
                }
                Scene scene = new Scene(root);
                stage.setScene(scene);
            } else {
                warning.setVisible(true);
            }
        });
        
    }
}
