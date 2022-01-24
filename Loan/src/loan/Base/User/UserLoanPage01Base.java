package loan.Base.User;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public abstract class UserLoanPage01Base extends AnchorPane {

    protected final Button button;

    protected final FontAwesomeIconView home;

    protected final Button button0;

    protected final FontAwesomeIconView education;

    protected final Button button1;

    protected final FontAwesomeIconView car;

    protected final Button button2;

    protected final FontAwesomeIconView business;

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final FontAwesomeIconView money;

    protected final Label label0;

    protected final FontAwesomeIconView Angle;

    protected final Label label1;

    protected final FontAwesomeIconView Angle2;

    protected final Label label2;

    protected final FontAwesomeIconView Angle3;

    protected final Label label3;

    protected final HBox hBox;

    protected final Label label4;

    protected final Label label5;

    protected final Label label6;

    protected final Button button3;

    protected final FontAwesomeIconView exit;

    protected final Button button4;

    protected final FontAwesomeIconView minimize;

    public UserLoanPage01Base() {
        button = new Button();
        home = new FontAwesomeIconView();
        button0 = new Button();
        education = new FontAwesomeIconView();
        button1 = new Button();
        car = new FontAwesomeIconView();
        button2 = new Button();
        business = new FontAwesomeIconView();
        anchorPane = new AnchorPane();
        label = new Label();
        money = new FontAwesomeIconView();
        label0 = new Label();
        Angle = new FontAwesomeIconView();
        label1 = new Label();
        Angle2 = new FontAwesomeIconView();
        label2 = new Label();
        Angle3 = new FontAwesomeIconView();
        label3 = new Label();
        hBox = new HBox();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        button3 = new Button();
        exit = new FontAwesomeIconView();
        button4 = new Button();
        minimize = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 1px 0px;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File loanchoice = new File("src/loan/css/button/loanchoice.css");
        home.setGlyphName("HOME");
        home.setGlyphSize(150);
        car.setGlyphName("CAR");
        car.setGlyphSize(120);
        education.setGlyphName("GRADUATION_CAP");
        education.setGlyphSize(120);
        business.setGlyphName("BALANCE_SCALE");
        business.setGlyphSize(120);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        money.setGlyphName("MONEY");
        money.setGlyphSize(70);
        Angle.setGlyphName("ANGLE_RIGHT");
        Angle.setGlyphSize(40);
        Angle2.setGlyphName("ANGLE_RIGHT");
        Angle2.setGlyphSize(40);
        Angle3.setGlyphName("ANGLE_RIGHT");
        Angle3.setGlyphSize(40);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        button.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        button.setLayoutX(279.0);
        button.setLayoutY(201.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::LHome);
        button.setPrefHeight(250.0);
        button.setPrefWidth(300.0);
        button.getStylesheets().add(loanchoice.toURI().toString());
        button.setText("HOME");
        button.setFont(new Font("Segoe UI Bold", 30.0));
        button.setGraphic(home);
        button0.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        button0.setLayoutX(279.0);
        button0.setLayoutY(504.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::LEdu);
        button0.setPrefHeight(250.0);
        button0.setPrefWidth(300.0);
        button0.getStylesheets().add(loanchoice.toURI().toString());
        button0.setText("EDUCATION");
        button0.setFont(new Font("Segoe UI Bold", 30.0));
        button0.setGraphic(education);
        button1.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        button1.setLayoutX(631.0);
        button1.setLayoutY(201.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::LCar);
        button1.setPrefHeight(250.0);
        button1.setPrefWidth(300.0);
        button1.getStylesheets().add(loanchoice.toURI().toString());
        button1.setText("CAR");
        button1.setFont(new Font("Segoe UI Bold", 30.0));
        button1.setGraphic(car);
        button2.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        button2.setLayoutX(631.0);
        button2.setLayoutY(504.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::LBusi);
        button2.setPrefHeight(250.0);
        button2.setPrefWidth(300.0);
        button2.getStylesheets().add(loanchoice.toURI().toString());
        button2.setText("BUSINESS");
        button2.setFont(new Font("Segoe UI Bold", 30.0));
        button2.setGraphic(business);
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(980.0);
        anchorPane.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        label.setLayoutX(152.0);
        label.setLayoutY(36.0);
        label.setText("Loaning Money");
        label.setFont(new Font("Segoe UI Bold", 40.0));
        money.setLayoutX(48.0);
        money.setLayoutY(99.0);
        label0.setLayoutX(152.0);
        label0.setLayoutY(103.0);
        label0.setText("Type of Loan");
        label0.setUnderline(true);
        label0.setFont(new Font("Segoe UI Bold", 25.0));
        Angle.setLayoutX(316.0);
        Angle.setLayoutY(133.0);
        label1.setDisable(true);
        label1.setLayoutX(341.0);
        label1.setLayoutY(103.0);
        label1.setText("Credit INFO");
        label1.setFont(new Font("Segoe UI Bold", 25.0));
        Angle2.setLayoutX(490.0);
        Angle2.setLayoutY(132.0);
        label2.setDisable(true);
        label2.setLayoutX(515.0);
        label2.setLayoutY(102.0);
        label2.setText("Agent Contact");
        label2.setFont(new Font("Segoe UI Bold", 25.0));
        Angle3.setLayoutX(696.0);
        Angle3.setLayoutY(131.0);
        label3.setDisable(true);
        label3.setLayoutX(721.0);
        label3.setLayoutY(101.0);
        label3.setText("Confirm");
        label3.setFont(new Font("Segoe UI Bold", 25.0));
        hBox.setLayoutX(152.0);
        hBox.setLayoutY(89.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(800.0);
        hBox.setStyle("-fx-background-color: #898989;");
        label4.setLayoutX(40.0);
        label4.setLayoutY(201.0);
        label4.setPrefHeight(24.0);
        label4.setPrefWidth(208.0);
        label4.setText("Please, choose the");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        label5.setLayoutX(40.0);
        label5.setLayoutY(225.0);
        label5.setPrefHeight(24.0);
        label5.setPrefWidth(208.0);
        label5.setText("type of loan that you ");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        label6.setLayoutX(40.0);
        label6.setLayoutY(249.0);
        label6.setPrefHeight(24.0);
        label6.setPrefWidth(208.0);
        label6.setText("want to make a loan.");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        AnchorPane.setRightAnchor(button3, 20.0);
        AnchorPane.setTopAnchor(button3, 20.0);
        button3.setLayoutX(910.0);
        button3.setLayoutY(20.0);
        button3.setMnemonicParsing(false);
        button3.setOnAction(this::Exit);
        button3.setPrefHeight(50.0);
        button3.setPrefWidth(50.0);
        button3.getStylesheets().add(red.toURI().toString());
        button3.setGraphic(exit);
        button4.setLayoutX(849.0);
        button4.setLayoutY(20.0);
        button4.setMnemonicParsing(false);
        button4.setOnAction(this::Minimize);
        button4.setPrefHeight(50.0);
        button4.setPrefWidth(50.0);
        button4.getStylesheets().add(gray.toURI().toString());
        button4.setGraphic(minimize);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(money);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(Angle);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(Angle2);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(Angle3);
        anchorPane.getChildren().add(label3);
        anchorPane.getChildren().add(hBox);
        getChildren().add(anchorPane);
        getChildren().add(label4);
        getChildren().add(label5);
        getChildren().add(label6);
        getChildren().add(button3);
        getChildren().add(button4);
    }

    protected abstract void LHome(javafx.event.ActionEvent actionEvent);

    protected abstract void LEdu(javafx.event.ActionEvent actionEvent);

    protected abstract void LCar(javafx.event.ActionEvent actionEvent);

    protected abstract void LBusi(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);
}
