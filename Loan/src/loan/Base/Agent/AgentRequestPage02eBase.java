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

public abstract class AgentRequestPage02eBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final FontAwesomeIconView ILoanRe;

    protected final Button button;

    protected final FontAwesomeIconView exit;

    protected final Button button0;

    protected final FontAwesomeIconView minimize;

    protected final AnchorPane anchorPane0;

    protected final DropShadow dropShadow;

    protected final FontAwesomeIconView LRiEdu;

    protected final Label label0;

    protected final Label label1;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label2;

    protected final Label LName;

    protected final Label label3;

    protected final HBox hBox1;

    protected final VBox vBox0;

    protected final HBox hBox2;

    protected final Label label4;

    protected final Label LTuition;

    protected final Label label5;

    protected final HBox hBox3;

    protected final Label label6;

    protected final Label LCost;

    protected final Label label7;

    protected final HBox hBox4;

    protected final Button button1;

    protected final FontAwesomeIconView Bback;

    protected final AnchorPane anchorPane1;

    protected final Label label8;

    protected final HBox hBox5;

    protected final VBox vBox1;

    protected final HBox hBox6;

    protected final Label label9;

    protected final Label YN;

    protected final HBox hBox7;

    protected final Label label10;

    protected final Label YID;

    protected final HBox hBox8;

    protected final Label label11;

    protected final Label YDOB;

    protected final HBox hBox9;

    protected final Label label12;

    protected final Label YCareer;

    protected final HBox hBox10;

    protected final Label label13;

    protected final Label Yannual;

    protected final Label label14;

    protected final HBox hBox11;

    protected final Label label15;

    protected final Label Yaccount;

    protected final HBox hBox12;

    protected final Label label16;

    protected final Label Yphone;

    protected final HBox hBox13;

    protected final Label label17;

    protected final Label YEmail;

    protected final Label label18;

    protected final Label label19;

    protected final Button button2;

    protected final FontAwesomeIconView submit;

    protected final Button button3;

    protected final FontAwesomeIconView unsub;

    public AgentRequestPage02eBase() {
        anchorPane = new AnchorPane();
        label = new Label();
        ILoanRe = new FontAwesomeIconView();
        button = new Button();
        exit = new FontAwesomeIconView();
        button0 = new Button();
        minimize = new FontAwesomeIconView();
        anchorPane0 = new AnchorPane();
        dropShadow = new DropShadow();
        LRiEdu = new FontAwesomeIconView();
        label0 = new Label();
        label1 = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label2 = new Label();
        LName = new Label();
        label3 = new Label();
        hBox1 = new HBox();
        vBox0 = new VBox();
        hBox2 = new HBox();
        label4 = new Label();
        LTuition = new Label();
        label5 = new Label();
        hBox3 = new HBox();
        label6 = new Label();
        LCost = new Label();
        label7 = new Label();
        hBox4 = new HBox();
        button1 = new Button();
        Bback = new FontAwesomeIconView();
        anchorPane1 = new AnchorPane();
        label8 = new Label();
        hBox5 = new HBox();
        vBox1 = new VBox();
        hBox6 = new HBox();
        label9 = new Label();
        YN = new Label();
        hBox7 = new HBox();
        label10 = new Label();
        YID = new Label();
        hBox8 = new HBox();
        label11 = new Label();
        YDOB = new Label();
        hBox9 = new HBox();
        label12 = new Label();
        YCareer = new Label();
        hBox10 = new HBox();
        label13 = new Label();
        Yannual = new Label();
        label14 = new Label();
        hBox11 = new HBox();
        label15 = new Label();
        Yaccount = new Label();
        hBox12 = new HBox();
        label16 = new Label();
        Yphone = new Label();
        hBox13 = new HBox();
        label17 = new Label();
        YEmail = new Label();
        label18 = new Label();
        label19 = new Label();
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
        LRiEdu.setGlyphName("GRADUATION_CAP");
        LRiEdu.setGlyphSize(45);
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
        LRiEdu.setLayoutX(15.0);
        LRiEdu.setLayoutY(56.0);
        label0.setLayoutX(78.0);
        label0.setLayoutY(28.0);
        label0.setText("EDUCATION");
        label0.setFont(new Font("Segoe UI Bold", 20.0));
        label1.setLayoutX(21.0);
        label1.setLayoutY(95.0);
        label1.setText("Academy");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        hBox.setLayoutX(21.0);
        hBox.setLayoutY(124.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(380.0);
        hBox.setStyle("-fx-background-color: #5D5D5D;");
        vBox.setLayoutX(14.0);
        vBox.setLayoutY(136.0);
        vBox.setPrefHeight(37.0);
        vBox.setPrefWidth(392.0);
        hBox0.setPrefHeight(160.0);
        hBox0.setPrefWidth(392.0);
        label2.setText("Name :");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(5.0, 0.0, 0.0, 15.0));
        LName.setText("Label");
        HBox.setMargin(LName, new Insets(4.0, 0.0, 0.0, 17.0));
        LName.setFont(new Font(18.0));
        label3.setLayoutX(20.0);
        label3.setLayoutY(182.0);
        label3.setText("Cost");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        hBox1.setLayoutX(20.0);
        hBox1.setLayoutY(211.0);
        hBox1.setPrefHeight(2.0);
        hBox1.setPrefWidth(380.0);
        hBox1.setStyle("-fx-background-color: #5D5D5D;");
        vBox0.setLayoutX(15.0);
        vBox0.setLayoutY(225.0);
        vBox0.setPrefHeight(79.0);
        vBox0.setPrefWidth(392.0);
        hBox2.setPrefHeight(160.0);
        hBox2.setPrefWidth(392.0);
        label4.setText("Tuition fee :");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(5.0, 0.0, 0.0, 15.0));
        LTuition.setText("Label");
        LTuition.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LTuition, new Insets(6.0, 0.0, 0.0, 20.0));
        label5.setText("Baht");
        HBox.setMargin(label5, new Insets(5.0, 0.0, 0.0, 10.0));
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        hBox3.setPrefHeight(160.0);
        hBox3.setPrefWidth(392.0);
        label6.setText("Cost / month :");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label6, new Insets(5.0, 0.0, 0.0, 15.0));
        LCost.setText("Label");
        LCost.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(LCost, new Insets(6.0, 0.0, 0.0, 20.0));
        label7.setText("Baht");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label7, new Insets(5.0, 0.0, 0.0, 10.0));
        hBox4.setLayoutX(21.0);
        hBox4.setLayoutY(70.0);
        hBox4.setPrefHeight(3.0);
        hBox4.setPrefWidth(380.0);
        hBox4.setStyle("-fx-background-color: #5D5D5D;");
        AnchorPane.setBottomAnchor(button1, 20.0);
        AnchorPane.setLeftAnchor(button1, 20.0);
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
        label8.setLayoutX(27.0);
        label8.setLayoutY(10.0);
        label8.setText("CUSTOMER INFO");
        label8.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label8.setFont(new Font("Segoe UI Black", 25.0));
        hBox5.setLayoutX(22.0);
        hBox5.setLayoutY(52.0);
        hBox5.setPrefHeight(2.0);
        hBox5.setPrefWidth(450.0);
        hBox5.setStyle("-fx-background-color: #B6B6B6;");
        vBox1.setLayoutX(9.0);
        vBox1.setLayoutY(65.0);
        vBox1.setPrefHeight(302.0);
        vBox1.setPrefWidth(470.0);
        hBox6.setPrefHeight(50.0);
        hBox6.setPrefWidth(200.0);
        label9.setText("Name");
        label9.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label9, new Insets(13.0, 0.0, 0.0, 10.0));
        YN.setText("Label");
        YN.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YN, new Insets(14.0, 0.0, 0.0, 101.0));
        hBox7.setPrefHeight(25.0);
        hBox7.setPrefWidth(470.0);
        label10.setText("ID Card NO.");
        label10.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label10, new Insets(13.0, 0.0, 0.0, 10.0));
        YID.setText("Label");
        YID.setFont(new Font(18.0));
        HBox.setMargin(YID, new Insets(12.0, 0.0, 0.0, 43.0));
        hBox8.setPrefHeight(50.0);
        hBox8.setPrefWidth(200.0);
        label11.setText("Date of birth");
        label11.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label11, new Insets(13.0, 0.0, 0.0, 10.0));
        YDOB.setText("Label");
        YDOB.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YDOB, new Insets(14.0, 0.0, 0.0, 35.0));
        hBox9.setPrefHeight(50.0);
        hBox9.setPrefWidth(200.0);
        label12.setText("Career");
        label12.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label12, new Insets(13.0, 0.0, 0.0, 10.0));
        YCareer.setText("Label");
        YCareer.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YCareer, new Insets(14.0, 0.0, 0.0, 95.0));
        hBox10.setPrefHeight(50.0);
        hBox10.setPrefWidth(200.0);
        label13.setText("Annual Income");
        label13.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label13, new Insets(13.0, 0.0, 0.0, 10.0));
        Yannual.setText("Label");
        Yannual.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yannual, new Insets(14.0, 0.0, 0.0, 14.0));
        label14.setText("Bath");
        label14.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label14, new Insets(13.0, 0.0, 0.0, 10.0));
        hBox11.setPrefHeight(50.0);
        hBox11.setPrefWidth(200.0);
        label15.setText("Account No.");
        label15.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label15, new Insets(13.0, 0.0, 0.0, 10.0));
        Yaccount.setText("Label");
        Yaccount.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yaccount, new Insets(14.0, 0.0, 0.0, 39.0));
        hBox12.setPrefHeight(50.0);
        hBox12.setPrefWidth(200.0);
        label16.setText("Phone");
        label16.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label16, new Insets(13.0, 0.0, 0.0, 10.0));
        Yphone.setText("Label");
        Yphone.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yphone, new Insets(14.0, 0.0, 0.0, 96.0));
        hBox13.setPrefHeight(50.0);
        hBox13.setPrefWidth(400.0);
        label17.setText("E-mail");
        label17.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label17, new Insets(13.0, 0.0, 0.0, 10.0));
        YEmail.setText("Label");
        YEmail.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YEmail, new Insets(14.0, 0.0, 0.0, 96.0));
        label18.setLayoutX(482.0);
        label18.setLayoutY(586.0);
        label18.setText("Please check the information and documents");
        label18.setFont(new Font("Segoe UI Bold", 20.0));
        label19.setLayoutX(482.0);
        label19.setLayoutY(610.0);
        label19.setText("carefully before approving a request.");
        label19.setFont(new Font("Segoe UI Bold", 20.0));
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
        anchorPane0.getChildren().add(LRiEdu);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(hBox);
        hBox0.getChildren().add(label2);
        hBox0.getChildren().add(LName);
        vBox.getChildren().add(hBox0);
        anchorPane0.getChildren().add(vBox);
        anchorPane0.getChildren().add(label3);
        anchorPane0.getChildren().add(hBox1);
        hBox2.getChildren().add(label4);
        hBox2.getChildren().add(LTuition);
        hBox2.getChildren().add(label5);
        vBox0.getChildren().add(hBox2);
        hBox3.getChildren().add(label6);
        hBox3.getChildren().add(LCost);
        hBox3.getChildren().add(label7);
        vBox0.getChildren().add(hBox3);
        anchorPane0.getChildren().add(vBox0);
        anchorPane0.getChildren().add(hBox4);
        anchorPane0.getChildren().add(button1);
        getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(label8);
        anchorPane1.getChildren().add(hBox5);
        hBox6.getChildren().add(label9);
        hBox6.getChildren().add(YN);
        vBox1.getChildren().add(hBox6);
        hBox7.getChildren().add(label10);
        hBox7.getChildren().add(YID);
        vBox1.getChildren().add(hBox7);
        hBox8.getChildren().add(label11);
        hBox8.getChildren().add(YDOB);
        vBox1.getChildren().add(hBox8);
        hBox9.getChildren().add(label12);
        hBox9.getChildren().add(YCareer);
        vBox1.getChildren().add(hBox9);
        hBox10.getChildren().add(label13);
        hBox10.getChildren().add(Yannual);
        hBox10.getChildren().add(label14);
        vBox1.getChildren().add(hBox10);
        hBox11.getChildren().add(label15);
        hBox11.getChildren().add(Yaccount);
        vBox1.getChildren().add(hBox11);
        hBox12.getChildren().add(label16);
        hBox12.getChildren().add(Yphone);
        vBox1.getChildren().add(hBox12);
        hBox13.getChildren().add(label17);
        hBox13.getChildren().add(YEmail);
        vBox1.getChildren().add(hBox13);
        anchorPane1.getChildren().add(vBox1);
        getChildren().add(anchorPane1);
        getChildren().add(label18);
        getChildren().add(label19);
        getChildren().add(button2);
        getChildren().add(button3);
        ConnectionUtil.ELoanRequest(LName, LTuition, LCost, YN, YID, YDOB, YCareer, Yannual, Yaccount, Yphone, YEmail, AgentRequestPage01Controller.Reference);
    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Submit(javafx.event.ActionEvent actionEvent);

    protected abstract void Unsub(javafx.event.ActionEvent actionEvent);
}
