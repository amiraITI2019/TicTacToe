package tictactoe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class levelsBase extends BorderPane {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final Button id_easy;
    protected final Lighting lighting;
    protected final Button id_medium;
    protected final Lighting lighting0;
    protected final Button id_hard;
    protected final Lighting lighting1;
    protected final Button id_back;
    protected final Lighting lighting2;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;

    public levelsBase(Stage stage,Player player) {

        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        id_easy = new Button();
        lighting = new Lighting();
        id_medium = new Button();
        lighting0 = new Lighting();
        id_hard = new Button();
        lighting1 = new Lighting();
        id_back = new Button();
        lighting2 = new Lighting();
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
        label.setText("Choose Level");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("System Bold Italic", 43.0));

        id_easy.setLayoutX(154.0);
        id_easy.setLayoutY(175.0);
        id_easy.setMnemonicParsing(false);
        id_easy.setPrefHeight(31.0);
        id_easy.setPrefWidth(169.0);
        id_easy.setText("Easy");
        id_easy.setFont(new Font("System Italic", 23.0));

        lighting.setDiffuseConstant(1.71);
        id_easy.setEffect(lighting);

        id_medium.setLayoutX(154.0);
        id_medium.setLayoutY(238.0);
        id_medium.setMnemonicParsing(false);
        id_medium.setPrefHeight(31.0);
        id_medium.setPrefWidth(169.0);
        id_medium.setText("Medium");
        id_medium.setFont(new Font("System Italic", 23.0));

        lighting0.setDiffuseConstant(1.71);
        id_medium.setEffect(lighting0);

        id_hard.setLayoutX(154.0);
        id_hard.setLayoutY(305.0);
        id_hard.setMnemonicParsing(false);
        id_hard.setPrefHeight(31.0);
        id_hard.setPrefWidth(169.0);
        id_hard.setText("Hard");
        id_hard.setFont(new Font("System Italic", 23.0));

        lighting1.setDiffuseConstant(1.74);
        id_hard.setEffect(lighting1);

        id_back.setLayoutX(195.0);
        id_back.setLayoutY(380.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(37.0);
        id_back.setPrefWidth(90.0);
        id_back.setText("Back");
        id_back.setFont(new Font("System Bold Italic", 22.0));

        lighting2.setDiffuseConstant(2.0);
        lighting2.setSpecularConstant(0.0);
        lighting2.setSpecularExponent(40.0);
        lighting2.setSurfaceScale(10.0);
        id_back.setEffect(lighting2);

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
        anchorPane.getChildren().add(id_easy);
        anchorPane.getChildren().add(id_medium);
        anchorPane.getChildren().add(id_hard);
        anchorPane.getChildren().add(id_back);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);
        
         id_back.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.single);
              Parent root = new single_PlayerBase(stage);
              Scene scene = new Scene(root);
              stage.setScene(scene);
        });
         
          id_easy.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.playComputerDesign);
              Parent root = null;
            try {
                root = new playComputerDesign(stage,player);
            } catch (IOException ex) {
                Logger.getLogger(levelsBase.class.getName()).log(Level.SEVERE, null, ex);
            }
              Scene scene = new Scene(root);
              stage.setScene(scene);
        });
          
           id_medium.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.playComputerDesign);
              Parent root = null;
            try {
                root = new playComputerDesign(stage,player);
            } catch (IOException ex) {
                Logger.getLogger(levelsBase.class.getName()).log(Level.SEVERE, null, ex);
            }
              Scene scene = new Scene(root);
              stage.setScene(scene);
        });
           
            id_hard.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.playComputerDesign);
              Parent root = null;
            try {
                root = new playComputerDesign(stage,player);
            } catch (IOException ex) {
                Logger.getLogger(levelsBase.class.getName()).log(Level.SEVERE, null, ex);
            }
              Scene scene = new Scene(root);
              stage.setScene(scene);
        });

    }
}
