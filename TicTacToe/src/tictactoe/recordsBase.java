package tictactoe;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public abstract class recordsBase extends AnchorPane {

    protected final ListView listView;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;

    public recordsBase() {

        listView = new ListView();
        label = new Label();
        label0 = new Label();
        label1 = new Label();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        listView.setLayoutX(24.0);
        listView.setLayoutY(23.0);
        listView.setPrefHeight(363.0);
        listView.setPrefWidth(552.0);

        label.setLayoutX(62.0);
        label.setLayoutY(56.0);
        label.setText("Label");

        label0.setLayoutX(115.0);
        label0.setLayoutY(56.0);
        label0.setText("Label");

        label1.setLayoutX(181.0);
        label1.setLayoutY(56.0);
        label1.setText("Label");

        getChildren().add(listView);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);

    }
}
