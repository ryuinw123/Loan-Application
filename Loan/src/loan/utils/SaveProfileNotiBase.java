package loan.utils;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public abstract class SaveProfileNotiBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final FontAwesomeIconView fontAwesomeIconView;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final AnchorPane anchorPane0;
    protected final HBox hBox;
    protected final Button button;
    protected final Button button0;

    public SaveProfileNotiBase() {

        anchorPane = new AnchorPane();
        fontAwesomeIconView = new FontAwesomeIconView();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        anchorPane0 = new AnchorPane();
        hBox = new HBox();
        button = new Button();
        button0 = new Button();
        fontAwesomeIconView.setGlyphName("QUESTION_CIRCLE");
        fontAwesomeIconView.setGlyphSize(70);
        fontAwesomeIconView.setStyle("-fx-fill: blue;");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(180.0);
        setPrefWidth(400.0);
        setStyle("-fx-background-color: white;");

        File notiblue = new File("src/loan/css/button/notiblue.css");
        File notigray = new File("src/loan/css/button/notigray.css");

        anchorPane.setPrefHeight(130.0);
        anchorPane.setPrefWidth(400.0);
        anchorPane.setStyle("-fx-background-color: #ECECEC; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 1px;");

        AnchorPane.setLeftAnchor(fontAwesomeIconView, 25.0);
        AnchorPane.setTopAnchor(fontAwesomeIconView, 29.0);
        fontAwesomeIconView.setLayoutX(26.0);
        fontAwesomeIconView.setLayoutY(89.0);

        label.setLayoutX(102.0);
        label.setLayoutY(35.0);
        label.setText("Are you sure you want to change?");
        label.setFont(new Font("Segoe UI Bold", 17.0));

        label0.setLayoutX(102.0);
        label0.setLayoutY(58.0);
        label0.setText("Press OK to change, or Cancel to stay");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#ffb81f"));
        label0.setFont(new Font("Segoe UI Bold", 15.0));

        label1.setLayoutX(102.0);
        label1.setLayoutY(77.0);
        label1.setText("on the current page.");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#ffb81f"));
        label1.setFont(new Font("Segoe UI Bold", 15.0));

        anchorPane0.setLayoutY(130.0);
        anchorPane0.setPrefHeight(70.0);
        anchorPane0.setPrefWidth(400.0);
        anchorPane0.setStyle("-fx-background-color: #ECECEC; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 1px;");

        hBox.setLayoutX(2.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(396.0);
        hBox.setStyle("-fx-background-color: #B6B6B6;");

        AnchorPane.setBottomAnchor(button, 14.0);
        AnchorPane.setRightAnchor(button, 14.0);
        button.setLayoutX(286.0);
        button.setLayoutY(15.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::CANCEL);
        button.setPrefHeight(40.0);
        button.setPrefWidth(100.0);
        button.getStylesheets().add(notigray.toURI().toString());
        button.setText("Cancel");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Segoe UI Bold", 20.0));

        button0.setLayoutX(173.0);
        button0.setLayoutY(15.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::OK);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(100.0);
        button0.getStylesheets().add(notiblue.toURI().toString());
        button0.setText("OK");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Segoe UI Bold", 20.0));

        anchorPane.getChildren().add(fontAwesomeIconView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(hBox);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(button0);
        getChildren().add(anchorPane0);

    }

    protected abstract void CANCEL(javafx.event.ActionEvent actionEvent);

    protected abstract void OK(javafx.event.ActionEvent actionEvent);

}
