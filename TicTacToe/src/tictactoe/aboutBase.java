package tictactoe;

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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class aboutBase extends BorderPane {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final DropShadow dropShadow;
    protected final Label label0;
    protected final DropShadow dropShadow0;
    protected final Label label1;
    protected final DropShadow dropShadow1;
    protected final Label label2;
    protected final DropShadow dropShadow2;
    protected final Label label3;
    protected final DropShadow dropShadow3;
    protected final Label label4;
    protected final DropShadow dropShadow4;
    protected final Label label5;
    protected final DropShadow dropShadow5;
    protected final Button id_back;
    protected final Lighting lighting;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;

    public aboutBase(Stage s) {

        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        label = new Label();
        dropShadow = new DropShadow();
        label0 = new Label();
        dropShadow0 = new DropShadow();
        label1 = new Label();
        dropShadow1 = new DropShadow();
        label2 = new Label();
        dropShadow2 = new DropShadow();
        label3 = new Label();
        dropShadow3 = new DropShadow();
        label4 = new Label();
        dropShadow4 = new DropShadow();
        label5 = new Label();
        dropShadow5 = new DropShadow();
        id_back = new Button();
        lighting = new Lighting();
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

        label.setLayoutX(169.0);
        label.setLayoutY(54.0);
        label.setPrefHeight(50.0);
        label.setPrefWidth(140.0);
        label.setText("About");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label.setFont(new Font(50.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#08a1fc"));
        dropShadow.setHeight(83.02);
        dropShadow.setRadius(29.15);
        dropShadow.setSpread(0.18);
        dropShadow.setWidth(35.58);
        label.setEffect(dropShadow);

        label0.setLayoutX(52.0);
        label0.setLayoutY(161.0);
        label0.setPrefHeight(50.0);
        label0.setPrefWidth(140.0);
        label0.setText("created by :");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label0.setFont(new Font(20.0));

        dropShadow0.setHeight(83.02);
        dropShadow0.setRadius(29.15);
        dropShadow0.setSpread(0.18);
        dropShadow0.setWidth(35.58);
        label0.setEffect(dropShadow0);

        label1.setLayoutX(167.0);
        label1.setLayoutY(159.0);
        label1.setPrefHeight(53.0);
        label1.setPrefWidth(250.0);
        label1.setText("Amera");
        label1.setTextFill(javafx.scene.paint.Color.WHITE);
        label1.setFont(new Font(15.0));

        
        dropShadow1.setHeight(83.02);
        dropShadow1.setRadius(29.15);
        dropShadow1.setSpread(0.18);
        dropShadow1.setWidth(35.58);
        label1.setEffect(dropShadow1);

        label2.setLayoutX(166.0);
        label2.setLayoutY(182.0);
        label2.setPrefHeight(62.0);
        label2.setPrefWidth(250.0);
        label2.setText("Asmaa ");
        label2.setTextFill(javafx.scene.paint.Color.WHITE);
        label2.setFont(new Font(17.0));

      
        dropShadow2.setHeight(83.02);
        dropShadow2.setRadius(29.15);
        dropShadow2.setSpread(0.18);
        dropShadow2.setWidth(35.58);
        label2.setEffect(dropShadow2);

        label3.setLayoutX(167.0);
        label3.setLayoutY(220.0);
        label3.setPrefHeight(53.0);
        label3.setPrefWidth(250.0);
        label3.setText("Ahmed said");
        label3.setTextFill(javafx.scene.paint.Color.WHITE);
        label3.setFont(new Font(15.0));

       
        dropShadow3.setHeight(83.02);
        dropShadow3.setRadius(29.15);
        dropShadow3.setSpread(0.18);
        dropShadow3.setWidth(35.58);
        label3.setEffect(dropShadow3);

        label4.setLayoutX(167.0);
        label4.setLayoutY(248.0);
        label4.setPrefHeight(53.0);
        label4.setPrefWidth(250.0);
        label4.setText("mohamed shidid");
        label4.setTextFill(javafx.scene.paint.Color.WHITE);
        label4.setFont(new Font(15.0));

    
        dropShadow4.setHeight(83.02);
        dropShadow4.setRadius(29.15);
        dropShadow4.setSpread(0.18);
        dropShadow4.setWidth(35.58);
        label4.setEffect(dropShadow4);

        label5.setLayoutX(91.0);
        label5.setLayoutY(324.0);
        label5.setPrefHeight(53.0);
        label5.setPrefWidth(304.0);
        label5.setText("� Copyright 2020 All Rights Reserved to us");
        label5.setTextFill(javafx.scene.paint.Color.WHITE);
        label5.setFont(new Font(15.0));


        dropShadow5.setHeight(83.02);
        dropShadow5.setRadius(29.15);
        dropShadow5.setSpread(0.18);
        dropShadow5.setWidth(35.58);
        label5.setEffect(dropShadow5);

        id_back.setLayoutX(197.0);
        id_back.setLayoutY(382.0);
        id_back.setMnemonicParsing(false);
        id_back.setPrefHeight(42.0);
        id_back.setPrefWidth(76.0);
        id_back.setText("Back");
        id_back.setFont(new Font(19.0));

        lighting.setDiffuseConstant(2.0);
        lighting.setSpecularConstant(2.0);
        lighting.setSpecularExponent(40.0);
        lighting.setSurfaceScale(10.0);
        id_back.setEffect(lighting);

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
        anchorPane.getChildren().add(label3);
        anchorPane.getChildren().add(label4);
        anchorPane.getChildren().add(label5);
        anchorPane.getChildren().add(id_back);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);
        id_back.setOnAction((Action) -> {
//            AppManager.viewPane(AppManager.home);
        Parent root = new xo_homeBase(s);
        Scene scene = new Scene(root);
        s.setScene(scene);
        });

    }
}
