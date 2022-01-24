package loan.Base.Agent;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public abstract class AgentSendDocsBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final Button button;
    protected final Button button0;
    protected final AnchorPane anchorPane0;
    protected final HBox hBox;
    protected final Button button1;
    protected final Label label;
    protected final AnchorPane anchorPane1;
    protected final DropShadow dropShadow;
    protected final FontAwesomeIconView ILOCK;
    protected final Label label0;

    public AgentSendDocsBase() {

        anchorPane = new AnchorPane();
        button = new Button();
        button0 = new Button();
        anchorPane0 = new AnchorPane();
        hBox = new HBox();
        button1 = new Button();
        label = new Label();
        anchorPane1 = new AnchorPane();
        dropShadow = new DropShadow();
        ILOCK = new FontAwesomeIconView();
        label0 = new Label();

        ILOCK.setGlyphName("FILE_ZIP_ALT");
        ILOCK.setGlyphSize(60);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(280.0);
        setPrefWidth(500.0);

        File notired = new File("src/loan/css/button/notired.css");
        File notigreen = new File("src/loan/css/button/notigreen.css");
        File notiblue = new File("src/loan/css/button/notiblue.css");
        anchorPane.setLayoutY(220.0);
        anchorPane.setPrefHeight(80.0);
        anchorPane.setPrefWidth(500.0);
        anchorPane.setStyle("-fx-background-color: #ECECEC; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 1px;");

        AnchorPane.setBottomAnchor(button, 20.0);
        AnchorPane.setRightAnchor(button, 20.0);
        AnchorPane.setTopAnchor(button, 20.0);
        button.setLayoutX(376.0);
        button.setLayoutY(20.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Upload);
        button.setPrefHeight(40.0);
        button.setPrefWidth(100.0);
        button.getStylesheets().add(notiblue.toURI().toString());
        button.setText("Upload");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Segoe UI Bold", 20.0));

        button0.setLayoutX(260.0);
        button0.setLayoutY(20.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Reset);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(100.0);
        button0.getStylesheets().add(notired.toURI().toString());
        button0.setText("Reset");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Segoe UI Bold", 20.0));

        anchorPane0.setLayoutY(120.0);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(500.0);
        anchorPane0.setStyle("-fx-background-color: #ECECEC; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 0px 1px;");

        hBox.setLayoutX(2.0);
        hBox.setLayoutY(98.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(496.0);
        hBox.setStyle("-fx-background-color: #B6B6B6;");

        AnchorPane.setBottomAnchor(button1, 30.0);
        AnchorPane.setLeftAnchor(button1, 30.0);
        AnchorPane.setTopAnchor(button1, 30.0);
        button1.setLayoutX(31.0);
        button1.setLayoutY(30.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::Choosfile);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(140.0);
        button1.getStylesheets().add(notigreen.toURI().toString());
        button1.setText("Choose File");
        button1.setTextFill(javafx.scene.paint.Color.WHITE);
        button1.setFont(new Font("Segoe UI Bold", 20.0));

        label.setLayoutX(190.0);
        label.setLayoutY(40.0);
        label.setPrefHeight(21.0);
        label.setPrefWidth(291.0);
        label.setText("Choose your file to User");

        anchorPane1.setPrefHeight(120.0);
        anchorPane1.setPrefWidth(500.0);
        anchorPane1.setStyle("-fx-background-color: #DFDFDF; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 1px;");

        anchorPane1.setEffect(dropShadow);

        ILOCK.setLayoutX(39.0);
        ILOCK.setLayoutY(80.0);

        label0.setLayoutX(110.0);
        label0.setLayoutY(41.0);
        label0.setText("Send Documents");
        label0.setFont(new Font("Segoe UI Bold", 30.0));

        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(hBox);
        anchorPane0.getChildren().add(button1);
        anchorPane0.getChildren().add(label);
        getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(ILOCK);
        anchorPane1.getChildren().add(label0);
        getChildren().add(anchorPane1);

    }

    protected abstract void Upload(javafx.event.ActionEvent actionEvent);

    protected abstract void Reset(javafx.event.ActionEvent actionEvent);

    protected abstract void Choosfile(javafx.event.ActionEvent actionEvent);

}
