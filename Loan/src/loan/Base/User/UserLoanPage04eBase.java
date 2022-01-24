package loan.Base.User;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public abstract class UserLoanPage04eBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label0;

    protected final Label LNNAME;

    protected final HBox hBox1;

    protected final Label label1;

    protected final Label LNO;

    protected final HBox hBox2;

    protected final Label label2;

    protected final Label LDOB;

    protected final HBox hBox3;

    protected final Label label3;

    protected final Label LCareer;

    protected final HBox hBox4;

    protected final Label label4;

    protected final Label LAnnual;

    protected final Label label5;

    protected final HBox hBox5;

    protected final Label label6;

    protected final Label LAACCC;

    protected final HBox hBox6;

    protected final Label label7;

    protected final Label LPHONE;

    protected final HBox hBox7;

    protected final Label label8;

    protected final Label LEMAIL;

    protected final AnchorPane anchorPane0;

    protected final Label label9;

    protected final FontAwesomeIconView money;

    protected final Label label10;

    protected final FontAwesomeIconView Angle;

    protected final Label label11;

    protected final FontAwesomeIconView Angle2;

    protected final Label label12;

    protected final FontAwesomeIconView Angle3;

    protected final Label label13;

    protected final HBox hBox8;

    protected final AnchorPane anchorPane1;

    protected final DropShadow dropShadow;

    protected final FontAwesomeIconView iedu4;

    protected final Label label14;

    protected final Label label15;

    protected final HBox hBox9;

    protected final VBox vBox0;

    protected final HBox hBox10;

    protected final Label label16;

    protected final Label LName;

    protected final Label label17;

    protected final HBox hBox11;

    protected final VBox vBox1;

    protected final HBox hBox12;

    protected final Label label18;

    protected final Label LTuition;

    protected final Label label19;

    protected final HBox hBox13;

    protected final Label label110;

    protected final Label LCost;

    protected final Label label111;

    protected final Label label112;

    protected final HBox hBox14;

    protected final VBox vBox2;

    protected final HBox hBox15;

    protected final Label label113;

    protected final Label LANAME;

    protected final HBox hBox16;

    protected final Label label114;

    protected final Label Lphone;

    protected final HBox hBox17;

    protected final Label label115;

    protected final Label Lmail;

    protected final Label label116;

    protected final Label label117;

    protected final Button button;

    protected final FontAwesomeIconView confirm;

    protected final Button button0;

    protected final FontAwesomeIconView Bback;

    protected final Button button1;

    protected final FontAwesomeIconView exit;

    protected final Button button2;

    protected final FontAwesomeIconView minimize;

    public UserLoanPage04eBase() {
        anchorPane = new AnchorPane();
        label = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label0 = new Label();
        LNNAME = new Label();
        hBox1 = new HBox();
        label1 = new Label();
        LNO = new Label();
        hBox2 = new HBox();
        label2 = new Label();
        LDOB = new Label();
        hBox3 = new HBox();
        label3 = new Label();
        LCareer = new Label();
        hBox4 = new HBox();
        label4 = new Label();
        LAnnual = new Label();
        label5 = new Label();
        hBox5 = new HBox();
        label6 = new Label();
        LAACCC = new Label();
        hBox6 = new HBox();
        label7 = new Label();
        LPHONE = new Label();
        hBox7 = new HBox();
        label8 = new Label();
        LEMAIL = new Label();
        anchorPane0 = new AnchorPane();
        label9 = new Label();
        money = new FontAwesomeIconView();
        label10 = new Label();
        Angle = new FontAwesomeIconView();
        label11 = new Label();
        Angle2 = new FontAwesomeIconView();
        label12 = new Label();
        Angle3 = new FontAwesomeIconView();
        label13 = new Label();
        hBox8 = new HBox();
        anchorPane1 = new AnchorPane();
        dropShadow = new DropShadow();
        iedu4 = new FontAwesomeIconView();
        label14 = new Label();
        label15 = new Label();
        hBox9 = new HBox();
        vBox0 = new VBox();
        hBox10 = new HBox();
        label16 = new Label();
        LName = new Label();
        label17 = new Label();
        hBox11 = new HBox();
        vBox1 = new VBox();
        hBox12 = new HBox();
        label18 = new Label();
        LTuition = new Label();
        label19 = new Label();
        hBox13 = new HBox();
        label110 = new Label();
        LCost = new Label();
        label111 = new Label();
        label112 = new Label();
        hBox14 = new HBox();
        vBox2 = new VBox();
        hBox15 = new HBox();
        label113 = new Label();
        LANAME = new Label();
        hBox16 = new HBox();
        label114 = new Label();
        Lphone = new Label();
        hBox17 = new HBox();
        label115 = new Label();
        Lmail = new Label();
        label116 = new Label();
        label117 = new Label();
        button = new Button();
        confirm = new FontAwesomeIconView();
        button0 = new Button();
        Bback = new FontAwesomeIconView();
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
        setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 0px;");
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
        iedu4.setGlyphName("GRADUATION_CAP");
        iedu4.setGlyphSize(45);
        confirm.setGlyphName("CHECK_CIRCLE");
        confirm.setGlyphSize(30);
        Bback.setGlyphName("ARROW_LEFT");
        Bback.setGlyphSize(40);
        confirm.setStyle("-fx-fill: white;");
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        Bback.setStyle("-fx-fill: white;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File blue = new File("src/loan/css/button/blue.css");
        anchorPane.setLayoutX(466.0);
        anchorPane.setLayoutY(171.0);
        anchorPane.setPrefHeight(389.0);
        anchorPane.setPrefWidth(494.0);
        anchorPane.setStyle("-fx-background-color: #E6E6E6; -fx-background-radius: 10;");
        label.setLayoutX(27.0);
        label.setLayoutY(10.0);
        label.setText("YOUR INFO");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label.setFont(new Font("Segoe UI Black", 25.0));
        hBox.setLayoutX(22.0);
        hBox.setLayoutY(52.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(450.0);
        hBox.setStyle("-fx-background-color: #B6B6B6;");
        vBox.setLayoutX(9.0);
        vBox.setLayoutY(65.0);
        vBox.setPrefHeight(302.0);
        vBox.setPrefWidth(470.0);
        hBox0.setPrefHeight(50.0);
        hBox0.setPrefWidth(200.0);
        label0.setText("Name");
        label0.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label0, new Insets(13.0, 0.0, 0.0, 10.0));
        LNNAME.setText("Label");
        LNNAME.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LNNAME, new Insets(14.0, 0.0, 0.0, 101.0));
        hBox1.setPrefHeight(25.0);
        hBox1.setPrefWidth(470.0);
        label1.setText("ID Card NO.");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(13.0, 0.0, 0.0, 10.0));
        LNO.setText("Label");
        LNO.setFont(new Font(18.0));
        HBox.setMargin(LNO, new Insets(12.0, 0.0, 0.0, 43.0));
        hBox2.setPrefHeight(50.0);
        hBox2.setPrefWidth(200.0);
        label2.setText("Date of birth");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(13.0, 0.0, 0.0, 10.0));
        LDOB.setText("Label");
        LDOB.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LDOB, new Insets(14.0, 0.0, 0.0, 35.0));
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(200.0);
        label3.setText("Career");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(13.0, 0.0, 0.0, 10.0));
        LCareer.setText("Label");
        LCareer.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LCareer, new Insets(14.0, 0.0, 0.0, 95.0));
        hBox4.setPrefHeight(50.0);
        hBox4.setPrefWidth(200.0);
        label4.setText("Annual Income");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(13.0, 0.0, 0.0, 10.0));
        LAnnual.setText("Label");
        LAnnual.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LAnnual, new Insets(14.0, 0.0, 0.0, 14.0));
        label5.setText("Bath");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label5, new Insets(13.0, 0.0, 0.0, 10.0));
        hBox5.setPrefHeight(50.0);
        hBox5.setPrefWidth(200.0);
        label6.setText("Account No.");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label6, new Insets(13.0, 0.0, 0.0, 10.0));
        LAACCC.setText("Label");
        LAACCC.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LAACCC, new Insets(14.0, 0.0, 0.0, 39.0));
        hBox6.setPrefHeight(50.0);
        hBox6.setPrefWidth(200.0);
        label7.setText("Phone");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label7, new Insets(13.0, 0.0, 0.0, 10.0));
        LPHONE.setText("Label");
        LPHONE.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LPHONE, new Insets(14.0, 0.0, 0.0, 96.0));
        hBox7.setPrefHeight(50.0);
        hBox7.setPrefWidth(400.0);
        label8.setText("E-mail");
        label8.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label8, new Insets(13.0, 0.0, 0.0, 10.0));
        LEMAIL.setText("Label");
        LEMAIL.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LEMAIL, new Insets(14.0, 0.0, 0.0, 96.0));
        anchorPane0.setPrefHeight(150.0);
        anchorPane0.setPrefWidth(980.0);
        anchorPane0.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        label9.setLayoutX(152.0);
        label9.setLayoutY(36.0);
        label9.setText("Loaning Money");
        label9.setFont(new Font("Segoe UI Bold", 40.0));
        money.setLayoutX(48.0);
        money.setLayoutY(99.0);
        label10.setDisable(true);
        label10.setLayoutX(152.0);
        label10.setLayoutY(103.0);
        label10.setText("Type of Loan");
        label10.setFont(new Font("Segoe UI Bold", 25.0));
        Angle.setLayoutX(316.0);
        Angle.setLayoutY(133.0);
        label11.setDisable(true);
        label11.setLayoutX(341.0);
        label11.setLayoutY(103.0);
        label11.setText("Credit INFO");
        label11.setFont(new Font("Segoe UI Bold", 25.0));
        Angle2.setLayoutX(490.0);
        Angle2.setLayoutY(132.0);
        label12.setDisable(true);
        label12.setLayoutX(515.0);
        label12.setLayoutY(102.0);
        label12.setText("Agent Contact");
        label12.setFont(new Font("Segoe UI Bold", 25.0));
        Angle3.setLayoutX(696.0);
        Angle3.setLayoutY(131.0);
        label13.setLayoutX(721.0);
        label13.setLayoutY(101.0);
        label13.setText("Confirm");
        label13.setUnderline(true);
        label13.setWrapText(true);
        label13.setFont(new Font("Segoe UI Bold", 25.0));
        hBox8.setLayoutX(152.0);
        hBox8.setLayoutY(89.0);
        hBox8.setPrefHeight(2.0);
        hBox8.setPrefWidth(800.0);
        hBox8.setStyle("-fx-background-color: #898989;");
        anchorPane1.setLayoutX(23.0);
        anchorPane1.setLayoutY(171.0);
        anchorPane1.setPrefHeight(605.0);
        anchorPane1.setPrefWidth(421.0);
        anchorPane1.setStyle("-fx-border-color: #06DF26; -fx-border-width: 3px; -fx-border-radius: 10; -fx-background-color: #99F5A8; -fx-background-radius: 10;");
        dropShadow.setHeight(25.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setRadius(12.0);
        dropShadow.setWidth(25.0);
        anchorPane1.setEffect(dropShadow);
        iedu4.setLayoutX(15.0);
        iedu4.setLayoutY(56.0);
        label14.setLayoutX(78.0);
        label14.setLayoutY(28.0);
        label14.setText("EDUCATION");
        label14.setFont(new Font("Segoe UI Bold", 20.0));
        label15.setLayoutX(21.0);
        label15.setLayoutY(73.0);
        label15.setText("Academy");
        label15.setFont(new Font("Segoe UI Bold", 20.0));
        hBox9.setLayoutX(21.0);
        hBox9.setLayoutY(102.0);
        hBox9.setPrefHeight(2.0);
        hBox9.setPrefWidth(380.0);
        hBox9.setStyle("-fx-background-color: #5D5D5D;");
        vBox0.setLayoutX(14.0);
        vBox0.setLayoutY(114.0);
        vBox0.setPrefHeight(37.0);
        vBox0.setPrefWidth(392.0);
        hBox10.setPrefHeight(160.0);
        hBox10.setPrefWidth(392.0);
        label16.setText("Name :");
        label16.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label16, new Insets(5.0, 0.0, 0.0, 15.0));
        LName.setText("Label");
        HBox.setMargin(LName, new Insets(4.0, 0.0, 0.0, 17.0));
        LName.setFont(new Font(18.0));
        label17.setLayoutX(20.0);
        label17.setLayoutY(158.0);
        label17.setText("Cost");
        label17.setFont(new Font("Segoe UI Bold", 20.0));
        hBox11.setLayoutX(20.0);
        hBox11.setLayoutY(187.0);
        hBox11.setPrefHeight(2.0);
        hBox11.setPrefWidth(380.0);
        hBox11.setStyle("-fx-background-color: #5D5D5D;");
        vBox1.setLayoutX(15.0);
        vBox1.setLayoutY(201.0);
        vBox1.setPrefHeight(79.0);
        vBox1.setPrefWidth(392.0);
        hBox12.setPrefHeight(160.0);
        hBox12.setPrefWidth(392.0);
        label18.setText("Tuition fee :");
        label18.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label18, new Insets(5.0, 0.0, 0.0, 15.0));
        LTuition.setText("Label");
        LTuition.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LTuition, new Insets(6.0, 0.0, 0.0, 20.0));
        label19.setText("Baht");
        HBox.setMargin(label19, new Insets(5.0, 0.0, 0.0, 10.0));
        label19.setFont(new Font("Segoe UI Bold", 20.0));
        hBox13.setPrefHeight(160.0);
        hBox13.setPrefWidth(392.0);
        label110.setText("Cost / month :");
        label110.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label110, new Insets(5.0, 0.0, 0.0, 15.0));
        LCost.setText("Label");
        LCost.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LCost, new Insets(6.0, 0.0, 0.0, 20.0));
        label111.setText("Baht");
        label111.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label111, new Insets(5.0, 0.0, 0.0, 10.0));
        label112.setLayoutX(21.0);
        label112.setLayoutY(289.0);
        label112.setText("Agent Contact");
        label112.setFont(new Font("Segoe UI Bold", 20.0));
        hBox14.setLayoutX(21.0);
        hBox14.setLayoutY(318.0);
        hBox14.setPrefHeight(2.0);
        hBox14.setPrefWidth(380.0);
        hBox14.setStyle("-fx-background-color: #5D5D5D;");
        vBox2.setLayoutX(15.0);
        vBox2.setLayoutY(327.0);
        vBox2.setPrefHeight(142.0);
        vBox2.setPrefWidth(392.0);
        hBox15.setPrefHeight(160.0);
        hBox15.setPrefWidth(392.0);
        label113.setText("Name :");
        label113.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label113, new Insets(5.0, 0.0, 0.0, 15.0));
        LANAME.setText("Label");
        HBox.setMargin(LANAME, new Insets(6.0, 0.0, 0.0, 20.0));
        LANAME.setFont(new Font("Segoe UI", 18.0));
        hBox16.setPrefHeight(160.0);
        hBox16.setPrefWidth(392.0);
        label114.setText("Phone :");
        label114.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label114, new Insets(5.0, 0.0, 0.0, 15.0));
        Lphone.setText("Label");
        HBox.setMargin(Lphone, new Insets(6.0, 0.0, 0.0, 16.0));
        Lphone.setFont(new Font("Segoe UI", 18.0));
        hBox17.setPrefHeight(160.0);
        hBox17.setPrefWidth(392.0);
        label115.setText("E-mail :");
        label115.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label115, new Insets(5.0, 0.0, 0.0, 15.0));
        Lmail.setText("Label");
        HBox.setMargin(Lmail, new Insets(6.0, 0.0, 0.0, 16.0));
        Lmail.setFont(new Font("Segoe UI", 18.0));
        label116.setLayoutX(482.0);
        label116.setLayoutY(586.0);
        label116.setText("Please check all your information. Before making");
        label116.setFont(new Font("Segoe UI Bold", 20.0));
        label117.setLayoutX(482.0);
        label117.setLayoutY(610.0);
        label117.setText("a transaction.");
        label117.setFont(new Font("Segoe UI Bold", 20.0));
        button.setLayoutX(495.0);
        button.setLayoutY(672.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Confirm);
        button.setPrefHeight(60.0);
        button.setPrefWidth(350.0);
        button.getStylesheets().add(green.toURI().toString());
        button.setText("CONFIRM");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Segoe UI Bold", 25.0));
        button.setGraphic(confirm);
        button0.setLayoutX(867.0);
        button0.setLayoutY(672.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Back);
        button0.setPrefHeight(60.0);
        button0.setPrefWidth(60.0);
        button0.getStylesheets().add(blue.toURI().toString());
        button0.setGraphic(Bback);
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
        button2.setLayoutX(849.0);
        button2.setLayoutY(20.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::Minimize);
        button2.setPrefHeight(50.0);
        button2.setPrefWidth(50.0);
        button2.getStylesheets().add(gray.toURI().toString());
        button2.setGraphic(minimize);
        getBusinessInfo(LName, LTuition, LCost, LANAME, Lphone, Lmail);
        getYourInfo(LNNAME, LNO, LDOB, LCareer, LAnnual, LAACCC, LPHONE, LEMAIL);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(hBox);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(LNNAME);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(LNO);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(LDOB);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label3);
        hBox3.getChildren().add(LCareer);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(label4);
        hBox4.getChildren().add(LAnnual);
        hBox4.getChildren().add(label5);
        vBox.getChildren().add(hBox4);
        hBox5.getChildren().add(label6);
        hBox5.getChildren().add(LAACCC);
        vBox.getChildren().add(hBox5);
        hBox6.getChildren().add(label7);
        hBox6.getChildren().add(LPHONE);
        vBox.getChildren().add(hBox6);
        hBox7.getChildren().add(label8);
        hBox7.getChildren().add(LEMAIL);
        vBox.getChildren().add(hBox7);
        anchorPane.getChildren().add(vBox);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label9);
        anchorPane0.getChildren().add(money);
        anchorPane0.getChildren().add(label10);
        anchorPane0.getChildren().add(Angle);
        anchorPane0.getChildren().add(label11);
        anchorPane0.getChildren().add(Angle2);
        anchorPane0.getChildren().add(label12);
        anchorPane0.getChildren().add(Angle3);
        anchorPane0.getChildren().add(label13);
        anchorPane0.getChildren().add(hBox8);
        getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(iedu4);
        anchorPane1.getChildren().add(label14);
        anchorPane1.getChildren().add(label15);
        anchorPane1.getChildren().add(hBox9);
        hBox10.getChildren().add(label16);
        hBox10.getChildren().add(LName);
        vBox0.getChildren().add(hBox10);
        anchorPane1.getChildren().add(vBox0);
        anchorPane1.getChildren().add(label17);
        anchorPane1.getChildren().add(hBox11);
        hBox12.getChildren().add(label18);
        hBox12.getChildren().add(LTuition);
        hBox12.getChildren().add(label19);
        vBox1.getChildren().add(hBox12);
        hBox13.getChildren().add(label110);
        hBox13.getChildren().add(LCost);
        hBox13.getChildren().add(label111);
        vBox1.getChildren().add(hBox13);
        anchorPane1.getChildren().add(vBox1);
        anchorPane1.getChildren().add(label112);
        anchorPane1.getChildren().add(hBox14);
        hBox15.getChildren().add(label113);
        hBox15.getChildren().add(LANAME);
        vBox2.getChildren().add(hBox15);
        hBox16.getChildren().add(label114);
        hBox16.getChildren().add(Lphone);
        vBox2.getChildren().add(hBox16);
        hBox17.getChildren().add(label115);
        hBox17.getChildren().add(Lmail);
        vBox2.getChildren().add(hBox17);
        anchorPane1.getChildren().add(vBox2);
        getChildren().add(anchorPane1);
        getChildren().add(label116);
        getChildren().add(label117);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
    }

    protected abstract void Confirm(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void getBusinessInfo(Label LName, Label LTuition, Label LCost, Label LANAME, Label Lphone, Label Lmail);

    protected abstract void getYourInfo(Label Yn, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail);
}
