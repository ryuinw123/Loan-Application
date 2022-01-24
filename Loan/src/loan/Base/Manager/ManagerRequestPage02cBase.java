package loan.Base.Manager;

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
import loan.Controller.Manager.ManagerRequestPage01Controller;
import loan.utils.ConnectionUtil;

public abstract class ManagerRequestPage02cBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final DropShadow dropShadow;

    protected final FontAwesomeIconView LMiCar;

    protected final Label label;

    protected final Label label0;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label1;

    protected final Label Lcar;

    protected final Label label2;

    protected final Label label3;

    protected final HBox hBox1;

    protected final VBox vBox0;

    protected final HBox hBox2;

    protected final Label label4;

    protected final Label LCarbrand;

    protected final HBox hBox3;

    protected final Label label5;

    protected final Label Lcartype;

    protected final Label label6;

    protected final HBox hBox4;

    protected final VBox vBox1;

    protected final HBox hBox5;

    protected final Label label7;

    protected final Label LAname;

    protected final HBox hBox6;

    protected final Label label8;

    protected final Label Laphone;

    protected final HBox hBox7;

    protected final Label label9;

    protected final Label LAemail;

    protected final AnchorPane anchorPane0;

    protected final Label label10;

    protected final HBox hBox8;

    protected final VBox vBox2;

    protected final HBox hBox9;

    protected final Label label11;

    protected final Label YN;

    protected final HBox hBox10;

    protected final Label label12;

    protected final Label YID;

    protected final HBox hBox11;

    protected final Label label13;

    protected final Label YDOB;

    protected final HBox hBox12;

    protected final Label label14;

    protected final Label YCareer;

    protected final HBox hBox13;

    protected final Label label15;

    protected final Label Yannual;

    protected final Label label16;

    protected final HBox hBox14;

    protected final Label label17;

    protected final Label Yaccount;

    protected final HBox hBox15;

    protected final Label label18;

    protected final Label Yphone;

    protected final HBox hBox16;

    protected final Label label19;

    protected final Label YEmail;

    protected final Label label110;

    protected final Label label111;

    protected final AnchorPane anchorPane1;

    protected final Label label112;

    protected final FontAwesomeIconView ILoanRe;

    protected final Button button;

    protected final FontAwesomeIconView agree;

    protected final Button button0;

    protected final FontAwesomeIconView No;

    protected final Button button1;

    protected final FontAwesomeIconView Bback;

    protected final Button button2;

    protected final FontAwesomeIconView exit;

    protected final Button button3;

    protected final FontAwesomeIconView minimize;

    public ManagerRequestPage02cBase() {
        anchorPane = new AnchorPane();
        dropShadow = new DropShadow();
        LMiCar = new FontAwesomeIconView();
        label = new Label();
        label0 = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label1 = new Label();
        Lcar = new Label();
        label2 = new Label();
        label3 = new Label();
        hBox1 = new HBox();
        vBox0 = new VBox();
        hBox2 = new HBox();
        label4 = new Label();
        LCarbrand = new Label();
        hBox3 = new HBox();
        label5 = new Label();
        Lcartype = new Label();
        label6 = new Label();
        hBox4 = new HBox();
        vBox1 = new VBox();
        hBox5 = new HBox();
        label7 = new Label();
        LAname = new Label();
        hBox6 = new HBox();
        label8 = new Label();
        Laphone = new Label();
        hBox7 = new HBox();
        label9 = new Label();
        LAemail = new Label();
        anchorPane0 = new AnchorPane();
        label10 = new Label();
        hBox8 = new HBox();
        vBox2 = new VBox();
        hBox9 = new HBox();
        label11 = new Label();
        YN = new Label();
        hBox10 = new HBox();
        label12 = new Label();
        YID = new Label();
        hBox11 = new HBox();
        label13 = new Label();
        YDOB = new Label();
        hBox12 = new HBox();
        label14 = new Label();
        YCareer = new Label();
        hBox13 = new HBox();
        label15 = new Label();
        Yannual = new Label();
        label16 = new Label();
        hBox14 = new HBox();
        label17 = new Label();
        Yaccount = new Label();
        hBox15 = new HBox();
        label18 = new Label();
        Yphone = new Label();
        hBox16 = new HBox();
        label19 = new Label();
        YEmail = new Label();
        label110 = new Label();
        label111 = new Label();
        anchorPane1 = new AnchorPane();
        label112 = new Label();
        ILoanRe = new FontAwesomeIconView();
        button = new Button();
        agree = new FontAwesomeIconView();
        button0 = new Button();
        No = new FontAwesomeIconView();
        button1 = new Button();
        Bback = new FontAwesomeIconView();
        button2 = new Button();
        exit = new FontAwesomeIconView();
        button3 = new Button();
        minimize = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 0px;");
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        ILoanRe.setGlyphName("SEND_ALT");
        ILoanRe.setGlyphSize(70);
        Bback.setGlyphName("ARROW_LEFT");
        Bback.setGlyphSize(40);
        agree.setGlyphName("CHECK_CIRCLE");
        agree.setGlyphSize(30);
        No.setGlyphName("TIMES_CIRCLE");
        No.setGlyphSize(30);
        LMiCar.setGlyphName("CAR");
        LMiCar.setGlyphSize(45);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        agree.setStyle("-fx-fill: white;");
        No.setStyle("-fx-fill: white;");
        Bback.setStyle("-fx-fill: white;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File blue = new File("src/loan/css/button/blue.css");
        anchorPane.setLayoutX(23.0);
        anchorPane.setLayoutY(171.0);
        anchorPane.setPrefHeight(605.0);
        anchorPane.setPrefWidth(421.0);
        anchorPane.setStyle("-fx-border-color: #CACC00; -fx-border-width: 3px; -fx-border-radius: 10; -fx-background-color: #FFFF94; -fx-background-radius: 10;");
        dropShadow.setHeight(25.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setRadius(12.0);
        dropShadow.setWidth(25.0);
        anchorPane.setEffect(dropShadow);
        LMiCar.setLayoutX(15.0);
        LMiCar.setLayoutY(56.0);
        label.setLayoutX(78.0);
        label.setLayoutY(28.0);
        label.setText("CAR");
        label.setFont(new Font("Segoe UI Bold", 20.0));
        label0.setLayoutX(21.0);
        label0.setLayoutY(73.0);
        label0.setText("Car price");
        label0.setFont(new Font("Segoe UI Bold", 20.0));
        hBox.setLayoutX(21.0);
        hBox.setLayoutY(102.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(380.0);
        hBox.setStyle("-fx-background-color: #5D5D5D;");
        vBox.setLayoutX(14.0);
        vBox.setLayoutY(114.0);
        vBox.setPrefHeight(37.0);
        vBox.setPrefWidth(392.0);
        hBox0.setPrefHeight(160.0);
        hBox0.setPrefWidth(392.0);
        label1.setText("Car price :");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(5.0, 0.0, 0.0, 15.0));
        Lcar.setText("Label");
        HBox.setMargin(Lcar, new Insets(4.0, 0.0, 0.0, 17.0));
        Lcar.setFont(new Font(18.0));
        label2.setText("Baht");
        HBox.setMargin(label2, new Insets(5.0, 0.0, 0.0, 10.0));
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        label3.setLayoutX(20.0);
        label3.setLayoutY(158.0);
        label3.setText("Specification");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        hBox1.setLayoutX(20.0);
        hBox1.setLayoutY(187.0);
        hBox1.setPrefHeight(2.0);
        hBox1.setPrefWidth(380.0);
        hBox1.setStyle("-fx-background-color: #5D5D5D;");
        vBox0.setLayoutX(15.0);
        vBox0.setLayoutY(201.0);
        vBox0.setPrefHeight(79.0);
        vBox0.setPrefWidth(392.0);
        hBox2.setPrefHeight(160.0);
        hBox2.setPrefWidth(392.0);
        label4.setText("Car brand :");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(5.0, 0.0, 0.0, 15.0));
        LCarbrand.setText("Label");
        LCarbrand.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LCarbrand, new Insets(6.0, 0.0, 0.0, 20.0));
        hBox3.setPrefHeight(160.0);
        hBox3.setPrefWidth(392.0);
        label5.setText("Type :");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label5, new Insets(5.0, 0.0, 0.0, 15.0));
        Lcartype.setText("Label");
        Lcartype.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Lcartype, new Insets(6.0, 0.0, 0.0, 20.0));
        label6.setLayoutX(21.0);
        label6.setLayoutY(289.0);
        label6.setText("Agent Contact");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        hBox4.setLayoutX(21.0);
        hBox4.setLayoutY(318.0);
        hBox4.setPrefHeight(2.0);
        hBox4.setPrefWidth(380.0);
        hBox4.setStyle("-fx-background-color: #5D5D5D;");
        vBox1.setLayoutX(15.0);
        vBox1.setLayoutY(327.0);
        vBox1.setPrefHeight(142.0);
        vBox1.setPrefWidth(392.0);
        hBox5.setPrefHeight(160.0);
        hBox5.setPrefWidth(392.0);
        label7.setText("Name :");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label7, new Insets(5.0, 0.0, 0.0, 15.0));
        LAname.setText("Label");
        HBox.setMargin(LAname, new Insets(6.0, 0.0, 0.0, 20.0));
        LAname.setFont(new Font("Segoe UI", 18.0));
        hBox6.setPrefHeight(160.0);
        hBox6.setPrefWidth(392.0);
        label8.setText("Phone :");
        label8.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label8, new Insets(5.0, 0.0, 0.0, 15.0));
        Laphone.setText("Label");
        HBox.setMargin(Laphone, new Insets(6.0, 0.0, 0.0, 16.0));
        Laphone.setFont(new Font("Segoe UI", 18.0));
        hBox7.setPrefHeight(160.0);
        hBox7.setPrefWidth(392.0);
        label9.setText("E-mail :");
        label9.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label9, new Insets(5.0, 0.0, 0.0, 15.0));
        LAemail.setText("Label");
        HBox.setMargin(LAemail, new Insets(6.0, 0.0, 0.0, 16.0));
        LAemail.setFont(new Font("Segoe UI", 18.0));
        anchorPane0.setLayoutX(466.0);
        anchorPane0.setLayoutY(171.0);
        anchorPane0.setPrefHeight(389.0);
        anchorPane0.setPrefWidth(494.0);
        anchorPane0.setStyle("-fx-background-color: #E6E6E6; -fx-background-radius: 10;");
        label10.setLayoutX(27.0);
        label10.setLayoutY(10.0);
        label10.setText("CUSTOMER INFO");
        label10.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label10.setFont(new Font("Segoe UI Black", 25.0));
        hBox8.setLayoutX(22.0);
        hBox8.setLayoutY(52.0);
        hBox8.setPrefHeight(2.0);
        hBox8.setPrefWidth(450.0);
        hBox8.setStyle("-fx-background-color: #B6B6B6;");
        vBox2.setLayoutX(9.0);
        vBox2.setLayoutY(65.0);
        vBox2.setPrefHeight(302.0);
        vBox2.setPrefWidth(470.0);
        hBox9.setPrefHeight(50.0);
        hBox9.setPrefWidth(200.0);
        label11.setText("Name");
        label11.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label11, new Insets(13.0, 0.0, 0.0, 10.0));
        YN.setText("Label");
        YN.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YN, new Insets(14.0, 0.0, 0.0, 101.0));
        hBox10.setPrefHeight(25.0);
        hBox10.setPrefWidth(470.0);
        label12.setText("ID Card NO.");
        label12.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label12, new Insets(13.0, 0.0, 0.0, 10.0));
        YID.setText("Label");
        YID.setFont(new Font(18.0));
        HBox.setMargin(YID, new Insets(12.0, 0.0, 0.0, 43.0));
        hBox11.setPrefHeight(50.0);
        hBox11.setPrefWidth(200.0);
        label13.setText("Date of birth");
        label13.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label13, new Insets(13.0, 0.0, 0.0, 10.0));
        YDOB.setText("Label");
        YDOB.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YDOB, new Insets(14.0, 0.0, 0.0, 35.0));
        hBox12.setPrefHeight(50.0);
        hBox12.setPrefWidth(200.0);
        label14.setText("Career");
        label14.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label14, new Insets(13.0, 0.0, 0.0, 10.0));
        YCareer.setText("Label");
        YCareer.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YCareer, new Insets(14.0, 0.0, 0.0, 95.0));
        hBox13.setPrefHeight(50.0);
        hBox13.setPrefWidth(200.0);
        label15.setText("Annual Income");
        label15.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label15, new Insets(13.0, 0.0, 0.0, 10.0));
        Yannual.setText("Label");
        Yannual.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yannual, new Insets(14.0, 0.0, 0.0, 14.0));
        label16.setText("Bath");
        label16.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label16, new Insets(13.0, 0.0, 0.0, 10.0));
        hBox14.setPrefHeight(50.0);
        hBox14.setPrefWidth(200.0);
        label17.setText("Account No.");
        label17.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label17, new Insets(13.0, 0.0, 0.0, 10.0));
        Yaccount.setText("Label");
        Yaccount.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yaccount, new Insets(14.0, 0.0, 0.0, 39.0));
        hBox15.setPrefHeight(50.0);
        hBox15.setPrefWidth(200.0);
        label18.setText("Phone");
        label18.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label18, new Insets(13.0, 0.0, 0.0, 10.0));
        Yphone.setText("Label");
        Yphone.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yphone, new Insets(14.0, 0.0, 0.0, 96.0));
        hBox16.setPrefHeight(50.0);
        hBox16.setPrefWidth(400.0);
        label19.setText("E-mail");
        label19.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label19, new Insets(13.0, 0.0, 0.0, 10.0));
        YEmail.setText("Label");
        YEmail.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YEmail, new Insets(14.0, 0.0, 0.0, 96.0));
        label110.setLayoutX(482.0);
        label110.setLayoutY(586.0);
        label110.setText("Please check the information and documents");
        label110.setFont(new Font("Segoe UI Bold", 20.0));
        label111.setLayoutX(482.0);
        label111.setLayoutY(610.0);
        label111.setText("carefully before approving a request.");
        label111.setFont(new Font("Segoe UI Bold", 20.0));
        anchorPane1.setPrefHeight(150.0);
        anchorPane1.setPrefWidth(980.0);
        anchorPane1.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        label112.setLayoutX(152.0);
        label112.setLayoutY(51.0);
        label112.setText("Loan Request");
        label112.setFont(new Font("Segoe UI Bold", 40.0));
        ILoanRe.setLayoutX(48.0);
        ILoanRe.setLayoutY(99.0);
        AnchorPane.setBottomAnchor(button, 98.0);
        AnchorPane.setRightAnchor(button, 60.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Agree);
        button.setPrefHeight(60.0);
        button.setPrefWidth(300.0);
        button.getStylesheets().add(green.toURI().toString());
        button.setText("APPROVE");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Segoe UI Bold", 25.0));
        button.setGraphic(agree);
        AnchorPane.setBottomAnchor(button0, 20.0);
        AnchorPane.setRightAnchor(button0, 60.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::No);
        button0.setPrefHeight(60.0);
        button0.setPrefWidth(300.0);
        button0.getStylesheets().add(red.toURI().toString());
        button0.setText("DISAPPROVE");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setGraphic(No);
        button0.setFont(new Font("Segoe UI Bold", 25.0));
        AnchorPane.setBottomAnchor(button1, 58.0);
        AnchorPane.setRightAnchor(button1, 413.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::back);
        button1.setPrefHeight(60.0);
        button1.setPrefWidth(60.0);
        button1.getStylesheets().add(blue.toURI().toString());
        button1.setGraphic(Bback);
        AnchorPane.setRightAnchor(button2, 20.0);
        AnchorPane.setTopAnchor(button2, 20.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::Exit);
        button2.setPrefHeight(50.0);
        button2.setPrefWidth(50.0);
        button2.getStylesheets().add(red.toURI().toString());
        button2.setGraphic(exit);
        AnchorPane.setRightAnchor(button3, 81.0);
        AnchorPane.setTopAnchor(button3, 20.0);
        button3.setMnemonicParsing(false);
        button3.setOnAction(this::Minimize);
        button3.setPrefHeight(50.0);
        button3.setPrefWidth(50.0);
        button3.getStylesheets().add(gray.toURI().toString());
        button3.setGraphic(minimize);
        ConnectionUtil.MCLoanRequest(Lcar, LCarbrand, Lcartype, YN, YID, YDOB, YCareer, Yannual, Yaccount, Yphone, YEmail, ManagerRequestPage01Controller.Reference, LAname, Laphone, LAemail);
        anchorPane.getChildren().add(LMiCar);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(hBox);
        hBox0.getChildren().add(label1);
        hBox0.getChildren().add(Lcar);
        hBox0.getChildren().add(label2);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);
        anchorPane.getChildren().add(label3);
        anchorPane.getChildren().add(hBox1);
        hBox2.getChildren().add(label4);
        hBox2.getChildren().add(LCarbrand);
        vBox0.getChildren().add(hBox2);
        hBox3.getChildren().add(label5);
        hBox3.getChildren().add(Lcartype);
        vBox0.getChildren().add(hBox3);
        anchorPane.getChildren().add(vBox0);
        anchorPane.getChildren().add(label6);
        anchorPane.getChildren().add(hBox4);
        hBox5.getChildren().add(label7);
        hBox5.getChildren().add(LAname);
        vBox1.getChildren().add(hBox5);
        hBox6.getChildren().add(label8);
        hBox6.getChildren().add(Laphone);
        vBox1.getChildren().add(hBox6);
        hBox7.getChildren().add(label9);
        hBox7.getChildren().add(LAemail);
        vBox1.getChildren().add(hBox7);
        anchorPane.getChildren().add(vBox1);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label10);
        anchorPane0.getChildren().add(hBox8);
        hBox9.getChildren().add(label11);
        hBox9.getChildren().add(YN);
        vBox2.getChildren().add(hBox9);
        hBox10.getChildren().add(label12);
        hBox10.getChildren().add(YID);
        vBox2.getChildren().add(hBox10);
        hBox11.getChildren().add(label13);
        hBox11.getChildren().add(YDOB);
        vBox2.getChildren().add(hBox11);
        hBox12.getChildren().add(label14);
        hBox12.getChildren().add(YCareer);
        vBox2.getChildren().add(hBox12);
        hBox13.getChildren().add(label15);
        hBox13.getChildren().add(Yannual);
        hBox13.getChildren().add(label16);
        vBox2.getChildren().add(hBox13);
        hBox14.getChildren().add(label17);
        hBox14.getChildren().add(Yaccount);
        vBox2.getChildren().add(hBox14);
        hBox15.getChildren().add(label18);
        hBox15.getChildren().add(Yphone);
        vBox2.getChildren().add(hBox15);
        hBox16.getChildren().add(label19);
        hBox16.getChildren().add(YEmail);
        vBox2.getChildren().add(hBox16);
        anchorPane0.getChildren().add(vBox2);
        getChildren().add(anchorPane0);
        getChildren().add(label110);
        getChildren().add(label111);
        anchorPane1.getChildren().add(label112);
        anchorPane1.getChildren().add(ILoanRe);
        getChildren().add(anchorPane1);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
        getChildren().add(button3);
    }

    protected abstract void Agree(javafx.event.ActionEvent actionEvent);

    protected abstract void No(javafx.event.ActionEvent actionEvent);

    protected abstract void back(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);


    protected abstract void Back(javafx.event.ActionEvent actionEvent);
}
