package loan.Base.Agent;

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
import loan.Controller.Agent.AgentRequestPage01Controller;
import loan.utils.ConnectionUtil;

public abstract class AgentRequestPage02bBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final FontAwesomeIconView ILoanRe;

    protected final Button button;

    protected final FontAwesomeIconView exit;

    protected final Button button0;

    protected final FontAwesomeIconView minimize;

    protected final AnchorPane anchorPane0;

    protected final DropShadow dropShadow;

    protected final FontAwesomeIconView LRiBs;

    protected final Label label0;

    protected final Label label1;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label2;

    protected final Label Bname;

    protected final HBox hBox1;

    protected final Label label3;

    protected final Label BType;

    protected final HBox hBox2;

    protected final Label label4;

    protected final Label BFinancial;

    protected final Label label5;

    protected final Label label6;

    protected final HBox hBox3;

    protected final VBox vBox0;

    protected final HBox hBox4;

    protected final Label label7;

    protected final Label ANo;

    protected final HBox hBox5;

    protected final Label label8;

    protected final Label Asub;

    protected final HBox hBox6;

    protected final Label label9;

    protected final Label Adistract;

    protected final HBox hBox7;

    protected final Label label10;

    protected final Label AProvince;

    protected final HBox hBox8;

    protected final Label label11;

    protected final Label APostalCode;

    protected final HBox hBox9;

    protected final Button button1;

    protected final FontAwesomeIconView Bback;

    protected final AnchorPane anchorPane1;

    protected final Label label12;

    protected final HBox hBox10;

    protected final VBox vBox1;

    protected final HBox hBox11;

    protected final Label label13;

    protected final Label YN;

    protected final HBox hBox12;

    protected final Label label14;

    protected final Label YID;

    protected final HBox hBox13;

    protected final Label label15;

    protected final Label YDOB;

    protected final HBox hBox14;

    protected final Label label16;

    protected final Label YCareer;

    protected final HBox hBox15;

    protected final Label label17;

    protected final Label Yannual;

    protected final Label label18;

    protected final HBox hBox16;

    protected final Label label19;

    protected final Label Yaccount;

    protected final HBox hBox17;

    protected final Label label110;

    protected final Label Yphone;

    protected final HBox hBox18;

    protected final Label label111;

    protected final Label YEmail;

    protected final Label label112;

    protected final Label label113;

    protected final Button button2;

    protected final FontAwesomeIconView submit;

    protected final Button button3;

    protected final FontAwesomeIconView unsub;

    public AgentRequestPage02bBase() {
        anchorPane = new AnchorPane();
        label = new Label();
        ILoanRe = new FontAwesomeIconView();
        button = new Button();
        exit = new FontAwesomeIconView();
        button0 = new Button();
        minimize = new FontAwesomeIconView();
        anchorPane0 = new AnchorPane();
        dropShadow = new DropShadow();
        LRiBs = new FontAwesomeIconView();
        label0 = new Label();
        label1 = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label2 = new Label();
        Bname = new Label();
        hBox1 = new HBox();
        label3 = new Label();
        BType = new Label();
        hBox2 = new HBox();
        label4 = new Label();
        BFinancial = new Label();
        label5 = new Label();
        label6 = new Label();
        hBox3 = new HBox();
        vBox0 = new VBox();
        hBox4 = new HBox();
        label7 = new Label();
        ANo = new Label();
        hBox5 = new HBox();
        label8 = new Label();
        Asub = new Label();
        hBox6 = new HBox();
        label9 = new Label();
        Adistract = new Label();
        hBox7 = new HBox();
        label10 = new Label();
        AProvince = new Label();
        hBox8 = new HBox();
        label11 = new Label();
        APostalCode = new Label();
        hBox9 = new HBox();
        button1 = new Button();
        Bback = new FontAwesomeIconView();
        anchorPane1 = new AnchorPane();
        label12 = new Label();
        hBox10 = new HBox();
        vBox1 = new VBox();
        hBox11 = new HBox();
        label13 = new Label();
        YN = new Label();
        hBox12 = new HBox();
        label14 = new Label();
        YID = new Label();
        hBox13 = new HBox();
        label15 = new Label();
        YDOB = new Label();
        hBox14 = new HBox();
        label16 = new Label();
        YCareer = new Label();
        hBox15 = new HBox();
        label17 = new Label();
        Yannual = new Label();
        label18 = new Label();
        hBox16 = new HBox();
        label19 = new Label();
        Yaccount = new Label();
        hBox17 = new HBox();
        label110 = new Label();
        Yphone = new Label();
        hBox18 = new HBox();
        label111 = new Label();
        YEmail = new Label();
        label112 = new Label();
        label113 = new Label();
        button2 = new Button();
        submit = new FontAwesomeIconView();
        button3 = new Button();
        unsub = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 0px;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File blue = new File("src/loan/css/button/blue.css");
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        ILoanRe.setGlyphName("SEND_ALT");
        ILoanRe.setGlyphSize(70);
        Bback.setGlyphName("ARROW_LEFT");
        Bback.setGlyphSize(40);
        submit.setGlyphName("SEND");
        submit.setGlyphSize(30);
        unsub.setGlyphName("TIMES_CIRCLE");
        unsub.setGlyphSize(30);
        LRiBs.setGlyphName("BALANCE_SCALE");
        LRiBs.setGlyphSize(45);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        submit.setStyle("-fx-fill: white;");
        unsub.setStyle("-fx-fill: white;");
        Bback.setStyle("-fx-fill: white;");
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(980.0);
        anchorPane.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        label.setLayoutX(152.0);
        label.setLayoutY(51.0);
        label.setText("Loan Request");
        label.setFont(new Font("Segoe UI Bold", 40.0));
        ILoanRe.setLayoutX(48.0);
        ILoanRe.setLayoutY(99.0);
        AnchorPane.setRightAnchor(button, 20.0);
        AnchorPane.setTopAnchor(button, 20.0);
        button.setLayoutX(910.0);
        button.setLayoutY(20.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Exit);
        button.setPrefHeight(50.0);
        button.setPrefWidth(50.0);
        button.getStylesheets().add(red.toURI().toString());
        button.setGraphic(exit);
        button0.setLayoutX(849.0);
        button0.setLayoutY(20.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Minimize);
        button0.setPrefHeight(50.0);
        button0.setPrefWidth(50.0);
        button0.getStylesheets().add(gray.toURI().toString());
        button0.setGraphic(minimize);
        anchorPane0.setLayoutX(23.0);
        anchorPane0.setLayoutY(171.0);
        anchorPane0.setPrefHeight(605.0);
        anchorPane0.setPrefWidth(421.0);
        anchorPane0.setStyle("-fx-border-color: #CACC00; -fx-border-width: 3px; -fx-border-radius: 10; -fx-background-color: #FFFF94; -fx-background-radius: 10;");
        dropShadow.setHeight(25.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setRadius(12.0);
        dropShadow.setWidth(25.0);
        anchorPane0.setEffect(dropShadow);
        LRiBs.setLayoutX(17.0);
        LRiBs.setLayoutY(57.0);
        label0.setLayoutX(85.0);
        label0.setLayoutY(29.0);
        label0.setText("BUSINESS");
        label0.setFont(new Font("Segoe UI Bold", 20.0));
        label1.setLayoutX(21.0);
        label1.setLayoutY(98.0);
        label1.setText("Your Business");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        hBox.setLayoutX(21.0);
        hBox.setLayoutY(127.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(380.0);
        hBox.setStyle("-fx-background-color: #5D5D5D;");
        vBox.setLayoutX(14.0);
        vBox.setLayoutY(139.0);
        vBox.setPrefHeight(104.0);
        vBox.setPrefWidth(392.0);
        hBox0.setPrefHeight(160.0);
        hBox0.setPrefWidth(392.0);
        label2.setText("Name :");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(5.0, 0.0, 0.0, 15.0));
        Bname.setText("Label");
        HBox.setMargin(Bname, new Insets(4.0, 0.0, 0.0, 17.0));
        Bname.setFont(new Font(18.0));
        hBox1.setPrefHeight(160.0);
        hBox1.setPrefWidth(392.0);
        label3.setText("Type :");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(5.0, 0.0, 0.0, 15.0));
        BType.setText("Label");
        HBox.setMargin(BType, new Insets(4.0, 0.0, 0.0, 17.0));
        BType.setFont(new Font(18.0));
        hBox2.setPrefHeight(160.0);
        hBox2.setPrefWidth(392.0);
        label4.setText("Financial :");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(5.0, 0.0, 0.0, 15.0));
        BFinancial.setText("Label");
        HBox.setMargin(BFinancial, new Insets(4.0, 0.0, 0.0, 17.0));
        BFinancial.setFont(new Font(18.0));
        label5.setText("Baht");
        HBox.setMargin(label5, new Insets(5.0, 0.0, 0.0, 10.0));
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        label6.setLayoutX(20.0);
        label6.setLayoutY(254.0);
        label6.setText("Address");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        hBox3.setLayoutX(20.0);
        hBox3.setLayoutY(283.0);
        hBox3.setPrefHeight(2.0);
        hBox3.setPrefWidth(380.0);
        hBox3.setStyle("-fx-background-color: #5D5D5D;");
        vBox0.setLayoutX(15.0);
        vBox0.setLayoutY(292.0);
        vBox0.setPrefHeight(180.0);
        vBox0.setPrefWidth(392.0);
        hBox4.setPrefHeight(160.0);
        hBox4.setPrefWidth(392.0);
        label7.setText("No. :");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label7, new Insets(5.0, 0.0, 0.0, 15.0));
        ANo.setText("Label");
        ANo.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(ANo, new Insets(6.0, 0.0, 0.0, 20.0));
        hBox5.setPrefHeight(160.0);
        hBox5.setPrefWidth(392.0);
        label8.setText("Sub-district :");
        label8.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label8, new Insets(5.0, 0.0, 0.0, 15.0));
        Asub.setText("Label");
        Asub.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Asub, new Insets(6.0, 0.0, 0.0, 20.0));
        hBox6.setPrefHeight(160.0);
        hBox6.setPrefWidth(392.0);
        label9.setText("Distract :");
        label9.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label9, new Insets(5.0, 0.0, 0.0, 15.0));
        Adistract.setText("Label");
        HBox.setMargin(Adistract, new Insets(6.0, 0.0, 0.0, 20.0));
        Adistract.setFont(new Font("Segoe UI", 18.0));
        hBox7.setPrefHeight(160.0);
        hBox7.setPrefWidth(392.0);
        label10.setText("Province :");
        label10.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label10, new Insets(5.0, 0.0, 0.0, 15.0));
        AProvince.setText("Label");
        HBox.setMargin(AProvince, new Insets(6.0, 0.0, 0.0, 20.0));
        AProvince.setFont(new Font("Segoe UI", 18.0));
        hBox8.setPrefHeight(160.0);
        hBox8.setPrefWidth(392.0);
        label11.setText("Postal Code :");
        label11.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label11, new Insets(5.0, 0.0, 0.0, 15.0));
        APostalCode.setText("Label");
        HBox.setMargin(APostalCode, new Insets(6.0, 0.0, 0.0, 20.0));
        APostalCode.setFont(new Font("Segoe UI", 18.0));
        hBox9.setLayoutX(21.0);
        hBox9.setLayoutY(74.0);
        hBox9.setPrefHeight(3.0);
        hBox9.setPrefWidth(380.0);
        hBox9.setStyle("-fx-background-color: #5D5D5D;");
        AnchorPane.setBottomAnchor(button1, 20.0);
        AnchorPane.setLeftAnchor(button1, 20.0);
        button1.setLayoutX(28.0);
        button1.setLayoutY(516.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::Back);
        button1.setPrefHeight(60.0);
        button1.setPrefWidth(60.0);
        button1.getStylesheets().add(blue.toURI().toString());
        button1.setGraphic(Bback);
        anchorPane1.setLayoutX(466.0);
        anchorPane1.setLayoutY(171.0);
        anchorPane1.setPrefHeight(389.0);
        anchorPane1.setPrefWidth(494.0);
        anchorPane1.setStyle("-fx-background-color: #E6E6E6; -fx-background-radius: 10;");
        label12.setLayoutX(27.0);
        label12.setLayoutY(10.0);
        label12.setText("CUSTOMER INFO");
        label12.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label12.setFont(new Font("Segoe UI Black", 25.0));
        hBox10.setLayoutX(22.0);
        hBox10.setLayoutY(52.0);
        hBox10.setPrefHeight(2.0);
        hBox10.setPrefWidth(450.0);
        hBox10.setStyle("-fx-background-color: #B6B6B6;");
        vBox1.setLayoutX(9.0);
        vBox1.setLayoutY(65.0);
        vBox1.setPrefHeight(302.0);
        vBox1.setPrefWidth(470.0);
        hBox11.setPrefHeight(50.0);
        hBox11.setPrefWidth(200.0);
        label13.setText("Name");
        label13.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label13, new Insets(13.0, 0.0, 0.0, 10.0));
        YN.setText("Label");
        YN.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YN, new Insets(14.0, 0.0, 0.0, 101.0));
        hBox12.setPrefHeight(25.0);
        hBox12.setPrefWidth(470.0);
        label14.setText("ID Card NO.");
        label14.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label14, new Insets(13.0, 0.0, 0.0, 10.0));
        YID.setText("Label");
        YID.setFont(new Font(18.0));
        HBox.setMargin(YID, new Insets(12.0, 0.0, 0.0, 43.0));
        hBox13.setPrefHeight(50.0);
        hBox13.setPrefWidth(200.0);
        label15.setText("Date of birth");
        label15.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label15, new Insets(13.0, 0.0, 0.0, 10.0));
        YDOB.setText("Label");
        YDOB.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YDOB, new Insets(14.0, 0.0, 0.0, 35.0));
        hBox14.setPrefHeight(50.0);
        hBox14.setPrefWidth(200.0);
        label16.setText("Career");
        label16.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label16, new Insets(13.0, 0.0, 0.0, 10.0));
        YCareer.setText("Label");
        YCareer.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YCareer, new Insets(14.0, 0.0, 0.0, 95.0));
        hBox15.setPrefHeight(50.0);
        hBox15.setPrefWidth(200.0);
        label17.setText("Annual Income");
        label17.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label17, new Insets(13.0, 0.0, 0.0, 10.0));
        Yannual.setText("Label");
        Yannual.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yannual, new Insets(14.0, 0.0, 0.0, 14.0));
        label18.setText("Bath");
        label18.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label18, new Insets(13.0, 0.0, 0.0, 10.0));
        hBox16.setPrefHeight(50.0);
        hBox16.setPrefWidth(200.0);
        label19.setText("Account No.");
        label19.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label19, new Insets(13.0, 0.0, 0.0, 10.0));
        Yaccount.setText("Label");
        Yaccount.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yaccount, new Insets(14.0, 0.0, 0.0, 39.0));
        hBox17.setPrefHeight(50.0);
        hBox17.setPrefWidth(200.0);
        label110.setText("Phone");
        label110.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label110, new Insets(13.0, 0.0, 0.0, 10.0));
        Yphone.setText("Label");
        Yphone.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yphone, new Insets(14.0, 0.0, 0.0, 96.0));
        hBox18.setPrefHeight(50.0);
        hBox18.setPrefWidth(400.0);
        label111.setText("E-mail");
        label111.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label111, new Insets(13.0, 0.0, 0.0, 10.0));
        YEmail.setText("Label");
        YEmail.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YEmail, new Insets(14.0, 0.0, 0.0, 96.0));
        label112.setLayoutX(482.0);
        label112.setLayoutY(586.0);
        label112.setText("Please check the information and documents");
        label112.setFont(new Font("Segoe UI Bold", 20.0));
        label113.setLayoutX(482.0);
        label113.setLayoutY(610.0);
        label113.setText("carefully before submitting a request.");
        label113.setFont(new Font("Segoe UI Bold", 20.0));
        button2.setLayoutX(484.0);
        button2.setLayoutY(672.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::Submit);
        button2.setPrefHeight(60.0);
        button2.setPrefWidth(220.0);
        button2.getStylesheets().add(green.toURI().toString());
        button2.setText("APPROVE");
        button2.setTextFill(javafx.scene.paint.Color.WHITE);
        button2.setFont(new Font("Segoe UI Bold", 25.0));
        button2.setGraphic(submit);
        button3.setLayoutX(721.0);
        button3.setLayoutY(672.0);
        button3.setMnemonicParsing(false);
        button3.setOnAction(this::Unsub);
        button3.setPrefHeight(60.0);
        button3.setPrefWidth(220.0);
        button3.getStylesheets().add(red.toURI().toString());
        button3.setText("DISAPPROVE");
        button3.setTextFill(javafx.scene.paint.Color.WHITE);
        button3.setFont(new Font("Segoe UI Bold", 25.0));
        button3.setGraphic(unsub);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(ILoanRe);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(LRiBs);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(hBox);
        hBox0.getChildren().add(label2);
        hBox0.getChildren().add(Bname);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label3);
        hBox1.getChildren().add(BType);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label4);
        hBox2.getChildren().add(BFinancial);
        hBox2.getChildren().add(label5);
        vBox.getChildren().add(hBox2);
        anchorPane0.getChildren().add(vBox);
        anchorPane0.getChildren().add(label6);
        anchorPane0.getChildren().add(hBox3);
        hBox4.getChildren().add(label7);
        hBox4.getChildren().add(ANo);
        vBox0.getChildren().add(hBox4);
        hBox5.getChildren().add(label8);
        hBox5.getChildren().add(Asub);
        vBox0.getChildren().add(hBox5);
        hBox6.getChildren().add(label9);
        hBox6.getChildren().add(Adistract);
        vBox0.getChildren().add(hBox6);
        hBox7.getChildren().add(label10);
        hBox7.getChildren().add(AProvince);
        vBox0.getChildren().add(hBox7);
        hBox8.getChildren().add(label11);
        hBox8.getChildren().add(APostalCode);
        vBox0.getChildren().add(hBox8);
        anchorPane0.getChildren().add(vBox0);
        anchorPane0.getChildren().add(hBox9);
        anchorPane0.getChildren().add(button1);
        getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(label12);
        anchorPane1.getChildren().add(hBox10);
        hBox11.getChildren().add(label13);
        hBox11.getChildren().add(YN);
        vBox1.getChildren().add(hBox11);
        hBox12.getChildren().add(label14);
        hBox12.getChildren().add(YID);
        vBox1.getChildren().add(hBox12);
        hBox13.getChildren().add(label15);
        hBox13.getChildren().add(YDOB);
        vBox1.getChildren().add(hBox13);
        hBox14.getChildren().add(label16);
        hBox14.getChildren().add(YCareer);
        vBox1.getChildren().add(hBox14);
        hBox15.getChildren().add(label17);
        hBox15.getChildren().add(Yannual);
        hBox15.getChildren().add(label18);
        vBox1.getChildren().add(hBox15);
        hBox16.getChildren().add(label19);
        hBox16.getChildren().add(Yaccount);
        vBox1.getChildren().add(hBox16);
        hBox17.getChildren().add(label110);
        hBox17.getChildren().add(Yphone);
        vBox1.getChildren().add(hBox17);
        hBox18.getChildren().add(label111);
        hBox18.getChildren().add(YEmail);
        vBox1.getChildren().add(hBox18);
        anchorPane1.getChildren().add(vBox1);
        getChildren().add(anchorPane1);
        getChildren().add(label112);
        getChildren().add(label113);
        getChildren().add(button2);
        getChildren().add(button3);
        ConnectionUtil.BLoanRequest(Bname, BType, BFinancial, ANo, Asub, Adistract, AProvince, APostalCode, YN, YID, YDOB, YCareer, Yannual, Yaccount, Yphone, YEmail, AgentRequestPage01Controller.Reference);
    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Submit(javafx.event.ActionEvent actionEvent);

    protected abstract void Unsub(javafx.event.ActionEvent actionEvent);
}
