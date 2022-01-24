package loan.Base;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public abstract class ForgetLayerBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final Circle circle;
    protected final FontAwesomeIconView fontAwesomeIconView;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final TextField textfieldred1;
    protected final Button red2;
    protected final FontAwesomeIconView fontAwesomeIconView0;
    protected final Label lblsuccess;
    protected final Button red1;
    protected final FontAwesomeIconView exit;
    protected final Button blue1;
    protected final FontAwesomeIconView sback;
    protected final Button gray1;
    protected final FontAwesomeIconView minimize;

    public ForgetLayerBase() {

        anchorPane = new AnchorPane();
        circle = new Circle();
        fontAwesomeIconView = new FontAwesomeIconView();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        textfieldred1 = new TextField();
        red2 = new Button();
        fontAwesomeIconView0 = new FontAwesomeIconView();
        lblsuccess = new Label();
        red1 = new Button();
        exit = new FontAwesomeIconView();
        blue1 = new Button();
        sback = new FontAwesomeIconView();
        gray1 = new Button();
        minimize = new FontAwesomeIconView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(460.0);

        File file = new File("src/loan/css/textfield/textfieldred.css");
        
        File gray = new File("src/loan/css/button/gray.css");
        File blue = new File("src/loan/css/button/blue.css");
        File red = new File("src/loan/css/button/red.css");
        
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        sback.setStyle("-fx-fill: white;");
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        sback.setGlyphName("ARROW_LEFT");
        fontAwesomeIconView.setStyle("-fx-fill : white;");
        fontAwesomeIconView0.setStyle("-fx-fill : white;");
        sback.setGlyphSize(30);
        fontAwesomeIconView.setGlyphName("KEY");
        fontAwesomeIconView.setGlyphSize(100);
        fontAwesomeIconView0.setGlyphName("SEND");
        fontAwesomeIconView0.setGlyphSize(22);
        
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(720.0);
        anchorPane.setPrefWidth(460.0);
        anchorPane.setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 1px;");

        circle.setFill(javafx.scene.paint.Color.valueOf("#2b2b2b"));
        circle.setLayoutX(230.0);
        circle.setLayoutY(213.0);
        circle.setRadius(100.0);
        circle.setStroke(javafx.scene.paint.Color.valueOf("#2b2b2b"));
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle.setStrokeWidth(3.0);

        fontAwesomeIconView.setLayoutX(180.0);
        fontAwesomeIconView.setLayoutY(247.0);

        label.setLayoutX(63.0);
        label.setLayoutY(328.0);
        label.setText("Oop! Forget Your Password?");
        label.setFont(new Font("Segoe UI Bold", 25.0));

        label0.setLayoutX(60.0);
        label0.setLayoutY(360.0);
        label0.setPrefHeight(22.0);
        label0.setPrefWidth(349.0);
        label0.setText("No worries! Enter your email and we will send");
        label0.setFont(new Font("Segoe UI", 17.0));

        label1.setLayoutX(147.0);
        label1.setLayoutY(382.0);
        label1.setText("your password to you.");
        label1.setFont(new Font("Segoe UI", 17.0));

        textfieldred1.setLayoutX(50.0);
        textfieldred1.setLayoutY(425.0);
        textfieldred1.setPrefHeight(47.0);
        textfieldred1.setPrefWidth(360.0);
        textfieldred1.setPromptText("Recovery Email");
        textfieldred1.getStylesheets().add(file.toURI().toString());
        textfieldred1.setFont(new Font(17.0));

        red2.setLayoutX(50.0);
        red2.setLayoutY(516.0);
        red2.setMnemonicParsing(false);
        red2.setOnAction(this::Register);
        red2.setPrefHeight(60.0);
        red2.setPrefWidth(360.0);
        red2.getStylesheets().add(red.toURI().toString());
        red2.setText("Send");
        red2.setTextFill(javafx.scene.paint.Color.WHITE);
        red2.setFont(new Font("Segoe UI Bold", 22.0));

        red2.setGraphic(fontAwesomeIconView0);

        lblsuccess.setLayoutX(103.0);
        lblsuccess.setLayoutY(618.0);
        lblsuccess.setPrefHeight(21.0);
        lblsuccess.setPrefWidth(262.0);
        lblsuccess.setTextFill(javafx.scene.paint.Color.valueOf("#05c91f"));
        lblsuccess.setFont(new Font(15.0));

        AnchorPane.setRightAnchor(red1, 20.0);
        AnchorPane.setTopAnchor(red1, 20.0);
        red1.setLayoutX(401.0);
        red1.setLayoutY(28.0);
        red1.setMnemonicParsing(false);
        red1.setOnAction(this::Exit);
        red1.setPrefHeight(50.0);
        red1.setPrefWidth(50.0);
        red1.getStylesheets().add(red.toURI().toString());

        red1.setGraphic(exit);

        blue1.setLayoutX(270.0);
        blue1.setLayoutY(20.0);
        blue1.setMnemonicParsing(false);
        blue1.setOnAction(this::Back);
        blue1.setPrefHeight(50.0);
        blue1.setPrefWidth(50.0);
        blue1.getStylesheets().add(blue.toURI().toString());

        blue1.setGraphic(sback);

        AnchorPane.setRightAnchor(gray1, 80.0);
        AnchorPane.setTopAnchor(gray1, 20.0);
        gray1.setLayoutX(330.0);
        gray1.setLayoutY(20.0);
        gray1.setMnemonicParsing(false);
        gray1.setOnAction(this::Minimize);
        gray1.setPrefHeight(50.0);
        gray1.setPrefWidth(50.0);
        gray1.getStylesheets().add(gray.toURI().toString());

        gray1.setGraphic(minimize);

        anchorPane.getChildren().add(circle);
        anchorPane.getChildren().add(fontAwesomeIconView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(textfieldred1);
        anchorPane.getChildren().add(red2);
        anchorPane.getChildren().add(lblsuccess);
        getChildren().add(anchorPane);
        getChildren().add(red1);
        getChildren().add(blue1);
        getChildren().add(gray1);

    }

    protected abstract void Register(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

}
