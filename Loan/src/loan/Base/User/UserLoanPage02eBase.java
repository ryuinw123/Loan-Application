package loan.Base.User;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public abstract class UserLoanPage02eBase extends AnchorPane {

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

    protected final AnchorPane anchorPane0;

    protected final AnchorPane anchorPane1;

    protected final FontAwesomeIconView iedu2;

    protected final Label label4;

    protected final HBox hBox0;

    protected final TextField LtutitionFee;

    protected final Label label5;

    protected final Label label6;

    protected final HBox hBox1;

    protected final Label label7;

    protected final HBox hBox2;

    protected final TextField LName;

    protected final TextField Lcost;

    protected final Label label8;

    protected final Label label9;

    protected final HBox hBox3;

    protected final Label lblError;

    protected final DropShadow dropShadow;

    protected final Label label10;

    protected final Button button;

    protected final FontAwesomeIconView go;

    protected final Button button0;

    protected final FontAwesomeIconView back;

    protected final Button button1;

    protected final FontAwesomeIconView exit;

    protected final Button button2;

    protected final FontAwesomeIconView minimize;

    public UserLoanPage02eBase() {
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
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        iedu2 = new FontAwesomeIconView();
        label4 = new Label();
        hBox0 = new HBox();
        LtutitionFee = new TextField();
        label5 = new Label();
        label6 = new Label();
        hBox1 = new HBox();
        label7 = new Label();
        hBox2 = new HBox();
        LName = new TextField();
        Lcost = new TextField();
        label8 = new Label();
        label9 = new Label();
        hBox3 = new HBox();
        lblError = new Label();
        dropShadow = new DropShadow();
        label10 = new Label();
        button = new Button();
        go = new FontAwesomeIconView();
        button0 = new Button();
        back = new FontAwesomeIconView();
        button1 = new Button();
        exit = new FontAwesomeIconView();
        button2 = new Button();
        minimize = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        money.setGlyphName("MONEY");
        money.setGlyphSize(70);
        Angle.setGlyphName("ANGLE_RIGHT");
        Angle.setGlyphSize(40);
        Angle2.setGlyphName("ANGLE_RIGHT");
        Angle2.setGlyphSize(40);
        Angle3.setGlyphName("ANGLE_RIGHT");
        Angle3.setGlyphSize(40);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        go.setGlyphName("ARROW_CIRCLE_RIGHT");
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        go.setStyle("-fx-fill: white;");
        back.setStyle("-fx-fill: white;");
        go.setGlyphSize(30);
        back.setGlyphName("ARROW_CIRCLE_LEFT");
        back.setGlyphSize(30);
        iedu2.setGlyphName("GRADUATION_CAP");
        iedu2.setGlyphSize(50);
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File blue = new File("src/loan/css/button/blue.css");
        File textfiledblue = new File("src/loan/css/textfield/stextfieldblue.css");
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(980.0);
        anchorPane.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        label.setLayoutX(152.0);
        label.setLayoutY(36.0);
        label.setText("Loaning Money");
        label.setFont(new Font("Segoe UI Bold", 40.0));
        money.setLayoutX(48.0);
        money.setLayoutY(99.0);
        label0.setDisable(true);
        label0.setLayoutX(152.0);
        label0.setLayoutY(103.0);
        label0.setText("Type of Loan");
        label0.setFont(new Font("Segoe UI Bold", 25.0));
        Angle.setLayoutX(316.0);
        Angle.setLayoutY(133.0);
        label1.setLayoutX(341.0);
        label1.setLayoutY(103.0);
        label1.setText("Credit INFO");
        label1.setUnderline(true);
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
        anchorPane0.setLayoutY(150.0);
        anchorPane0.setPrefHeight(650.0);
        anchorPane0.setPrefWidth(980.0);
        anchorPane0.setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 0px;");
        anchorPane1.setLayoutX(49.0);
        anchorPane1.setLayoutY(45.0);
        anchorPane1.setPrefHeight(560.0);
        anchorPane1.setPrefWidth(520.0);
        anchorPane1.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        iedu2.setLayoutX(29.0);
        iedu2.setLayoutY(61.0);
        label4.setLayoutX(106.0);
        label4.setLayoutY(28.0);
        label4.setText("EDUCATION");
        label4.setFont(new Font("Segoe UI Bold", 25.0));
        hBox0.setLayoutX(25.0);
        hBox0.setLayoutY(76.0);
        hBox0.setPrefHeight(3.0);
        hBox0.setPrefWidth(470.0);
        hBox0.setStyle("-fx-background-color: #CCCCCC;");
        LtutitionFee.setLayoutX(38.0);
        LtutitionFee.setLayoutY(287.0);
        LtutitionFee.setPrefHeight(40.0);
        LtutitionFee.setPrefWidth(308.0);
        LtutitionFee.setPromptText("Tuition fee");
        LtutitionFee.getStylesheets().add(textfiledblue.toURI().toString());
        label5.setLayoutX(41.0);
        label5.setLayoutY(235.0);
        label5.setText("Tuition fee");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        label6.setLayoutX(357.0);
        label6.setLayoutY(295.0);
        label6.setText("Baht");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        hBox1.setLayoutX(36.0);
        hBox1.setLayoutY(270.0);
        hBox1.setPrefHeight(2.0);
        hBox1.setPrefWidth(449.0);
        hBox1.setStyle("-fx-background-color: #CCCCCC;");
        label7.setLayoutX(41.0);
        label7.setLayoutY(115.0);
        label7.setText("Academy");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        hBox2.setLayoutX(36.0);
        hBox2.setLayoutY(152.0);
        hBox2.setPrefHeight(2.0);
        hBox2.setPrefWidth(449.0);
        hBox2.setStyle("-fx-background-color: #CCCCCC;");
        LName.setLayoutX(38.0);
        LName.setLayoutY(167.0);
        LName.setPrefHeight(40.0);
        LName.setPrefWidth(308.0);
        LName.setPromptText("Name");
        LName.getStylesheets().add(textfiledblue.toURI().toString());
        Lcost.setLayoutX(38.0);
        Lcost.setLayoutY(406.0);
        Lcost.setPrefHeight(40.0);
        Lcost.setPrefWidth(308.0);
        Lcost.setPromptText("Cost");
        Lcost.getStylesheets().add(textfiledblue.toURI().toString());
        label8.setLayoutX(41.0);
        label8.setLayoutY(354.0);
        label8.setText("Cost per month");
        label8.setFont(new Font("Segoe UI Bold", 20.0));
        label9.setLayoutX(357.0);
        label9.setLayoutY(414.0);
        label9.setText("Baht");
        label9.setFont(new Font("Segoe UI Bold", 20.0));
        hBox3.setLayoutX(36.0);
        hBox3.setLayoutY(389.0);
        hBox3.setPrefHeight(2.0);
        hBox3.setPrefWidth(449.0);
        hBox3.setStyle("-fx-background-color: #CCCCCC;");
        lblError.setLayoutX(50.0);
        lblError.setLayoutY(466.0);
        lblError.setTextFill(javafx.scene.paint.Color.RED);
        dropShadow.setHeight(25.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setRadius(12.0);
        dropShadow.setWidth(25.0);
        anchorPane1.setEffect(dropShadow);
        label10.setLayoutX(605.0);
        label10.setLayoutY(98.0);
        label10.setText("Please fill up this form.");
        label10.setFont(new Font("Segoe UI Bold", 20.0));
        button.setLayoutX(600.0);
        button.setLayoutY(415.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Next);
        button.setPrefHeight(60.0);
        button.setPrefWidth(350.0);
        button.getStylesheets().add(green.toURI().toString());
        button.setText("NEXT");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Segoe UI Bold", 25.0));
        button.setGraphic(go);
        button0.setLayoutX(600.0);
        button0.setLayoutY(501.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Back);
        button0.setPrefHeight(60.0);
        button0.setPrefWidth(350.0);
        button0.getStylesheets().add(blue.toURI().toString());
        button0.setText("BACK");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Segoe UI Bold", 25.0));
        button0.setGraphic(back);
        AnchorPane.setRightAnchor(button1, 20.0);
        AnchorPane.setTopAnchor(button1, 20.0);
        button1.setLayoutX(910.0);
        button1.setLayoutY(20.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::Exit);
        button1.setPrefHeight(50.0);
        button1.setPrefWidth(50.0);
        button1.getStylesheets().add(red.toURI().toString());
        button1.setGraphic(exit);
        AnchorPane.setTopAnchor(button2, 20.0);
        button2.setLayoutX(849.0);
        button2.setLayoutY(20.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::Minimize);
        button2.setPrefHeight(50.0);
        button2.setPrefWidth(50.0);
        button2.getStylesheets().add(gray.toURI().toString());
        button2.setGraphic(minimize);
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
        anchorPane1.getChildren().add(iedu2);
        anchorPane1.getChildren().add(label4);
        anchorPane1.getChildren().add(hBox0);
        anchorPane1.getChildren().add(LtutitionFee);
        anchorPane1.getChildren().add(label5);
        anchorPane1.getChildren().add(label6);
        anchorPane1.getChildren().add(hBox1);
        anchorPane1.getChildren().add(label7);
        anchorPane1.getChildren().add(hBox2);
        anchorPane1.getChildren().add(LName);
        anchorPane1.getChildren().add(Lcost);
        anchorPane1.getChildren().add(label8);
        anchorPane1.getChildren().add(label9);
        anchorPane1.getChildren().add(hBox3);
        anchorPane1.getChildren().add(lblError);
        anchorPane0.getChildren().add(anchorPane1);
        anchorPane0.getChildren().add(label10);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(button0);
        getChildren().add(anchorPane0);
        getChildren().add(button1);
        getChildren().add(button2);
        GetInfo(LName, LtutitionFee, Lcost);
    }

    protected abstract void Next(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void GetInfo(TextField LName, TextField LtutitionFee, TextField Lcost);
}
