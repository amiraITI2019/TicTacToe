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

public class xo_homeBase extends BorderPane {

    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle;
    protected final Button id_single;
    protected final Lighting lighting;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final DropShadow dropShadow;
    protected final Button id_multi;
    protected final Lighting lighting0;
    protected final Button id_playOnline;
    protected final Lighting lighting1;
    protected final Button id_about;
    protected final Button matches;

    protected final Lighting lighting2;
    protected final AnchorPane anchorPane0;
    protected final InnerShadow innerShadow;

    public xo_homeBase(Stage s) {

        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        rectangle = new Rectangle();
        id_single = new Button();
        lighting = new Lighting();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        dropShadow = new DropShadow();
        id_multi = new Button();
        lighting0 = new Lighting();
        id_playOnline = new Button();
        lighting1 = new Lighting();
        id_about = new Button();
        matches = new Button();
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

        id_single.setLayoutX(178.0);
        id_single.setLayoutY(152.0);
        id_single.setMnemonicParsing(false);
        id_single.setPrefHeight(42.0);
        id_single.setPrefWidth(135.0);
        id_single.setText("Single Player");
        id_single.setTextFill(javafx.scene.paint.Color.valueOf("#1e1f1f"));
        id_single.setFont(new Font("System Italic", 19.0));

        lighting.setDiffuseConstant(1.71);
        lighting.setSpecularConstant(2.0);
        lighting.setSpecularExponent(40.0);
        lighting.setSurfaceScale(0.0);
        id_single.setEffect(lighting);

        label.setLayoutX(138.0);
        label.setLayoutY(43.0);
        label.setPrefHeight(75.0);
        label.setPrefWidth(86.0);
        label.setText("X");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ef0000"));
        label.setFont(new Font(71.0));

        label0.setLayoutX(170.0);
        label0.setLayoutY(44.0);
        label0.setText("O");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#00ff5e"));
        label0.setFont(new Font(70.0));

        label1.setLayoutX(224.0);
        label1.setLayoutY(64.0);
        label1.setPrefHeight(50.0);
        label1.setPrefWidth(140.0);
        label1.setText("Game");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0088ff"));
        label1.setFont(new Font(50.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#08a1fc"));
        dropShadow.setHeight(83.02);
        dropShadow.setRadius(29.15);
        dropShadow.setSpread(0.18);
        dropShadow.setWidth(35.58);
        label1.setEffect(dropShadow);

        id_multi.setLayoutX(178.0);
        id_multi.setLayoutY(214.0);
        id_multi.setMnemonicParsing(false);
        id_multi.setPrefHeight(42.0);
        id_multi.setPrefWidth(135.0);
        id_multi.setText("Multi Player");
        id_multi.setTextFill(javafx.scene.paint.Color.valueOf("#1e1f1f"));
        id_multi.setFont(new Font("System Italic", 19.0));

        lighting0.setDiffuseConstant(1.71);
        lighting0.setSpecularConstant(2.0);
        lighting0.setSpecularExponent(40.0);
        lighting0.setSurfaceScale(0.0);
        id_multi.setEffect(lighting0);

        id_playOnline.setLayoutX(178.0);
        id_playOnline.setLayoutY(275.0);
        id_playOnline.setMnemonicParsing(false);
        id_playOnline.setPrefHeight(42.0);
        id_playOnline.setPrefWidth(135.0);
        id_playOnline.setText("Online");
        id_playOnline.setTextFill(javafx.scene.paint.Color.valueOf("#1e1f1f"));
        id_playOnline.setFont(new Font("System Italic", 19.0));

        lighting1.setDiffuseConstant(1.71);
        lighting1.setSpecularConstant(2.0);
        lighting1.setSpecularExponent(40.0);
        lighting1.setSurfaceScale(0.0);
        id_playOnline.setEffect(lighting1);

        id_about.setLayoutX(178.0);
        id_about.setLayoutY(393.0);
        id_about.setMnemonicParsing(false);
        id_about.setPrefHeight(42.0);
        id_about.setPrefWidth(135.0);
        id_about.setText("About");
        id_about.setTextFill(javafx.scene.paint.Color.valueOf("#1e1f1f"));
        id_about.setFont(new Font("System Italic", 19.0));

        lighting2.setDiffuseConstant(1.71);
        lighting2.setSpecularConstant(2.0);
        lighting2.setSpecularExponent(40.0);
        lighting2.setSurfaceScale(0.0);
        id_about.setEffect(lighting2);

        matches.setLayoutX(178.0);
        matches.setLayoutY(334.0);
        matches.setMnemonicParsing(false);
        matches.setPrefHeight(42.0);
        matches.setPrefWidth(135.0);
        matches.setText("Matches");
        matches.setTextFill(javafx.scene.paint.Color.valueOf("#1e1f1f"));
        matches.setFont(new Font("System Italic", 19.0));

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
        anchorPane.getChildren().add(id_single);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(id_multi);
        anchorPane.getChildren().add(id_playOnline);
        anchorPane.getChildren().add(id_about);
        anchorPane.getChildren().add(matches);
        splitPane.getItems().add(anchorPane);
        splitPane.getItems().add(anchorPane0);

        id_single.setOnAction((Action) -> {
            Parent root = new single_PlayerBase(s);
            Scene scene = new Scene(root);
            s.setScene(scene);

        });

        id_multi.setOnAction((Action) -> {
            Parent root = new multi_PlayerBase(s);
            Scene scene = new Scene(root);
            s.setScene(scene);
        });

        id_multi.setOnAction((Action) -> {
            Parent root = new multi_PlayerBase(s);
            Scene scene = new Scene(root);
            s.setScene(scene);
        });

        id_about.setOnAction((Action) -> {
            Parent root = new aboutBase(s);
            Scene scene = new Scene(root);
            s.setScene(scene);
        });
        id_playOnline.setOnAction((Action) -> {
            Parent root = new loginOrRegBase(s);
            Scene scene = new Scene(root);
            s.setScene(scene);
        });
        matches.setOnAction((Action) -> {
            Parent root = new recordsBase(s);
            Scene scene = new Scene(root);
            s.setScene(scene);
        });

    }
}
