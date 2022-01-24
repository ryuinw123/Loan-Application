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

public abstract class UserLoanPage04bBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label0;

    protected final Label YN;

    protected final HBox hBox1;

    protected final Label label1;

    protected final Label YID;

    protected final HBox hBox2;

    protected final Label label2;

    protected final Label YDOB;

    protected final HBox hBox3;

    protected final Label label3;

    protected final Label YCareer;

    protected final HBox hBox4;

    protected final Label label4;

    protected final Label Yannual;

    protected final Label label5;

    protected final HBox hBox5;

    protected final Label label6;

    protected final Label Yaccount;

    protected final HBox hBox6;

    protected final Label label7;

    protected final Label Yphone;

    protected final HBox hBox7;

    protected final Label label8;

    protected final Label YEmail;

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

    protected final FontAwesomeIconView ibusi4;

    protected final Label label14;

    protected final Label label15;

    protected final HBox hBox9;

    protected final VBox vBox0;

    protected final HBox hBox10;

    protected final Label label16;

    protected final Label Bname;

    protected final HBox hBox11;

    protected final Label label17;

    protected final Label BType;

    protected final HBox hBox12;

    protected final Label label18;

    protected final Label BFinancial;

    protected final Label label19;

    protected final Label label110;

    protected final HBox hBox13;

    protected final VBox vBox1;

    protected final HBox hBox14;

    protected final Label label111;

    protected final Label ANo;

    protected final HBox hBox15;

    protected final Label label112;

    protected final Label Asub;

    protected final HBox hBox16;

    protected final Label label113;

    protected final Label Adistract;

    protected final HBox hBox17;

    protected final Label label114;

    protected final Label AProvince;

    protected final HBox hBox18;

    protected final Label label115;

    protected final Label APostalCode;

    protected final Label label116;

    protected final HBox hBox19;

    protected final VBox vBox2;

    protected final HBox hBox110;

    protected final Label label117;

    protected final Label AgName;

    protected final HBox hBox111;

    protected final Label label118;

    protected final Label AgPhone;

    protected final HBox hBox112;

    protected final Label label119;

    protected final Label AgEmail;

    protected final Label label1110;

    protected final Label label1111;

    protected final Button button;

    protected final FontAwesomeIconView confirm;

    protected final Button button0;

    protected final FontAwesomeIconView Bback;

    protected final Button button1;

    protected final FontAwesomeIconView exit;

    protected final Button button2;

    protected final FontAwesomeIconView minimize;

    public UserLoanPage04bBase() {
        anchorPane = new AnchorPane();
        label = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label0 = new Label();
        YN = new Label();
        hBox1 = new HBox();
        label1 = new Label();
        YID = new Label();
        hBox2 = new HBox();
        label2 = new Label();
        YDOB = new Label();
        hBox3 = new HBox();
        label3 = new Label();
        YCareer = new Label();
        hBox4 = new HBox();
        label4 = new Label();
        Yannual = new Label();
        label5 = new Label();
        hBox5 = new HBox();
        label6 = new Label();
        Yaccount = new Label();
        hBox6 = new HBox();
        label7 = new Label();
        Yphone = new Label();
        hBox7 = new HBox();
        label8 = new Label();
        YEmail = new Label();
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
        ibusi4 = new FontAwesomeIconView();
        label14 = new Label();
        label15 = new Label();
        hBox9 = new HBox();
        vBox0 = new VBox();
        hBox10 = new HBox();
        label16 = new Label();
        Bname = new Label();
        hBox11 = new HBox();
        label17 = new Label();
        BType = new Label();
        hBox12 = new HBox();
        label18 = new Label();
        BFinancial = new Label();
        label19 = new Label();
        label110 = new Label();
        hBox13 = new HBox();
        vBox1 = new VBox();
        hBox14 = new HBox();
        label111 = new Label();
        ANo = new Label();
        hBox15 = new HBox();
        label112 = new Label();
        Asub = new Label();
        hBox16 = new HBox();
        label113 = new Label();
        Adistract = new Label();
        hBox17 = new HBox();
        label114 = new Label();
        AProvince = new Label();
        hBox18 = new HBox();
        label115 = new Label();
        APostalCode = new Label();
        label116 = new Label();
        hBox19 = new HBox();
        vBox2 = new VBox();
        hBox110 = new HBox();
        label117 = new Label();
        AgName = new Label();
        hBox111 = new HBox();
        label118 = new Label();
        AgPhone = new Label();
        hBox112 = new HBox();
        label119 = new Label();
        AgEmail = new Label();
        label1110 = new Label();
        label1111 = new Label();
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
        ibusi4.setGlyphName("BALANCE_SCALE");
        ibusi4.setGlyphSize(45);
        confirm.setGlyphName("CHECK_CIRCLE_ALT");
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
        YN.setText("Label");
        YN.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YN, new Insets(14.0, 0.0, 0.0, 101.0));
        hBox1.setPrefHeight(25.0);
        hBox1.setPrefWidth(470.0);
        label1.setText("ID Card NO.");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(13.0, 0.0, 0.0, 10.0));
        YID.setText("Label");
        YID.setFont(new Font(18.0));
        HBox.setMargin(YID, new Insets(12.0, 0.0, 0.0, 43.0));
        hBox2.setPrefHeight(50.0);
        hBox2.setPrefWidth(200.0);
        label2.setText("Date of birth");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(13.0, 0.0, 0.0, 10.0));
        YDOB.setText("Label");
        YDOB.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YDOB, new Insets(14.0, 0.0, 0.0, 35.0));
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(200.0);
        label3.setText("Career");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(13.0, 0.0, 0.0, 10.0));
        YCareer.setText("Label");
        YCareer.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YCareer, new Insets(14.0, 0.0, 0.0, 95.0));
        hBox4.setPrefHeight(50.0);
        hBox4.setPrefWidth(200.0);
        label4.setText("Annual Income");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(13.0, 0.0, 0.0, 10.0));
        Yannual.setText("Label");
        Yannual.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yannual, new Insets(14.0, 0.0, 0.0, 14.0));
        label5.setText("Bath");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label5, new Insets(13.0, 0.0, 0.0, 10.0));
        hBox5.setPrefHeight(50.0);
        hBox5.setPrefWidth(200.0);
        label6.setText("Account No.");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label6, new Insets(13.0, 0.0, 0.0, 10.0));
        Yaccount.setText("Label");
        Yaccount.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yaccount, new Insets(14.0, 0.0, 0.0, 39.0));
        hBox6.setPrefHeight(50.0);
        hBox6.setPrefWidth(200.0);
        label7.setText("Phone");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label7, new Insets(13.0, 0.0, 0.0, 10.0));
        Yphone.setText("Label");
        Yphone.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Yphone, new Insets(14.0, 0.0, 0.0, 96.0));
        hBox7.setPrefHeight(50.0);
        hBox7.setPrefWidth(400.0);
        label8.setText("E-mail");
        label8.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label8, new Insets(13.0, 0.0, 0.0, 10.0));
        YEmail.setText("Label");
        YEmail.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(YEmail, new Insets(14.0, 0.0, 0.0, 96.0));
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
        ibusi4.setLayoutX(17.0);
        ibusi4.setLayoutY(57.0);
        label14.setLayoutX(85.0);
        label14.setLayoutY(29.0);
        label14.setText("BUSINESS");
        label14.setFont(new Font("Segoe UI Bold", 20.0));
        label15.setLayoutX(21.0);
        label15.setLayoutY(73.0);
        label15.setText("Your Business");
        label15.setFont(new Font("Segoe UI Bold", 20.0));
        hBox9.setLayoutX(21.0);
        hBox9.setLayoutY(102.0);
        hBox9.setPrefHeight(2.0);
        hBox9.setPrefWidth(380.0);
        hBox9.setStyle("-fx-background-color: #5D5D5D;");
        vBox0.setLayoutX(14.0);
        vBox0.setLayoutY(114.0);
        vBox0.setPrefHeight(104.0);
        vBox0.setPrefWidth(392.0);
        hBox10.setPrefHeight(160.0);
        hBox10.setPrefWidth(392.0);
        label16.setText("Name :");
        label16.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label16, new Insets(5.0, 0.0, 0.0, 15.0));
        Bname.setText("Label");
        HBox.setMargin(Bname, new Insets(4.0, 0.0, 0.0, 17.0));
        Bname.setFont(new Font(18.0));
        hBox11.setPrefHeight(160.0);
        hBox11.setPrefWidth(392.0);
        label17.setText("Type :");
        label17.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label17, new Insets(5.0, 0.0, 0.0, 15.0));
        BType.setText("Label");
        HBox.setMargin(BType, new Insets(4.0, 0.0, 0.0, 17.0));
        BType.setFont(new Font(18.0));
        hBox12.setPrefHeight(160.0);
        hBox12.setPrefWidth(392.0);
        label18.setText("Financial :");
        label18.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label18, new Insets(5.0, 0.0, 0.0, 15.0));
        HBox.setMargin(BFinancial, new Insets(4.0, 0.0, 0.0, 17.0));
        BFinancial.setFont(new Font(18.0));
        label19.setText("Baht");
        HBox.setMargin(label19, new Insets(5.0, 0.0, 0.0, 10.0));
        label19.setFont(new Font("Segoe UI Bold", 20.0));
        label110.setLayoutX(20.0);
        label110.setLayoutY(221.0);
        label110.setText("Address");
        label110.setFont(new Font("Segoe UI Bold", 20.0));
        hBox13.setLayoutX(20.0);
        hBox13.setLayoutY(250.0);
        hBox13.setPrefHeight(2.0);
        hBox13.setPrefWidth(380.0);
        hBox13.setStyle("-fx-background-color: #5D5D5D;");
        vBox1.setLayoutX(15.0);
        vBox1.setLayoutY(259.0);
        vBox1.setPrefHeight(168.0);
        vBox1.setPrefWidth(392.0);
        hBox14.setPrefHeight(160.0);
        hBox14.setPrefWidth(392.0);
        label111.setText("No. :");
        label111.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label111, new Insets(5.0, 0.0, 0.0, 15.0));
        ANo.setText("Label");
        ANo.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(ANo, new Insets(6.0, 0.0, 0.0, 20.0));
        hBox15.setPrefHeight(160.0);
        hBox15.setPrefWidth(392.0);
        label112.setText("Sub-district :");
        label112.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label112, new Insets(5.0, 0.0, 0.0, 15.0));
        Asub.setText("Label");
        Asub.setFont(new Font("Segoe UI", 18.0));
        HBox.setMargin(Asub, new Insets(6.0, 0.0, 0.0, 20.0));
        hBox16.setPrefHeight(160.0);
        hBox16.setPrefWidth(392.0);
        label113.setText("Distract :");
        label113.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label113, new Insets(5.0, 0.0, 0.0, 15.0));
        Adistract.setText("Label");
        HBox.setMargin(Adistract, new Insets(6.0, 0.0, 0.0, 20.0));
        Adistract.setFont(new Font("Segoe UI", 18.0));
        hBox17.setPrefHeight(160.0);
        hBox17.setPrefWidth(392.0);
        label114.setText("Province :");
        label114.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label114, new Insets(5.0, 0.0, 0.0, 15.0));
        AProvince.setText("Label");
        HBox.setMargin(AProvince, new Insets(6.0, 0.0, 0.0, 20.0));
        AProvince.setFont(new Font("Segoe UI", 18.0));
        hBox18.setPrefHeight(160.0);
        hBox18.setPrefWidth(392.0);
        label115.setText("Postal Code :");
        label115.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label115, new Insets(5.0, 0.0, 0.0, 15.0));
        APostalCode.setText("Label");
        HBox.setMargin(APostalCode, new Insets(6.0, 0.0, 0.0, 20.0));
        APostalCode.setFont(new Font("Segoe UI", 18.0));
        label116.setLayoutX(21.0);
        label116.setLayoutY(431.0);
        label116.setText("Agent Contact");
        label116.setFont(new Font("Segoe UI Bold", 20.0));
        hBox19.setLayoutX(21.0);
        hBox19.setLayoutY(460.0);
        hBox19.setPrefHeight(2.0);
        hBox19.setPrefWidth(380.0);
        hBox19.setStyle("-fx-background-color: #5D5D5D;");
        vBox2.setLayoutX(15.0);
        vBox2.setLayoutY(471.0);
        vBox2.setPrefHeight(120.0);
        vBox2.setPrefWidth(392.0);
        hBox110.setPrefHeight(160.0);
        hBox110.setPrefWidth(392.0);
        label117.setText("Name :");
        label117.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label117, new Insets(5.0, 0.0, 0.0, 15.0));
        AgName.setText("Label");
        HBox.setMargin(AgName, new Insets(6.0, 0.0, 0.0, 20.0));
        AgName.setFont(new Font("Segoe UI", 18.0));
        hBox111.setPrefHeight(160.0);
        hBox111.setPrefWidth(392.0);
        label118.setText("Phone :");
        label118.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label118, new Insets(5.0, 0.0, 0.0, 15.0));
        AgPhone.setText("Label");
        HBox.setMargin(AgPhone, new Insets(6.0, 0.0, 0.0, 16.0));
        AgPhone.setFont(new Font("Segoe UI", 18.0));
        hBox112.setPrefHeight(160.0);
        hBox112.setPrefWidth(392.0);
        label119.setText("E-mail :");
        label119.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label119, new Insets(5.0, 0.0, 0.0, 15.0));
        AgEmail.setText("Label");
        HBox.setMargin(AgEmail, new Insets(6.0, 0.0, 0.0, 16.0));
        AgEmail.setFont(new Font("Segoe UI", 18.0));
        label1110.setLayoutX(482.0);
        label1110.setLayoutY(586.0);
        label1110.setText("Please check all your information. Before making");
        label1110.setFont(new Font("Segoe UI Bold", 20.0));
        label1111.setLayoutX(482.0);
        label1111.setLayoutY(610.0);
        label1111.setText("a transaction.");
        label1111.setFont(new Font("Segoe UI Bold", 20.0));
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
        AnchorPane.setTopAnchor(button2, 20.0);
        button2.setLayoutX(849.0);
        button2.setLayoutY(20.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::Minimize);
        button2.setPrefHeight(50.0);
        button2.setPrefWidth(50.0);
        button2.getStylesheets().add(gray.toURI().toString());
        button2.setGraphic(minimize);
        getBusinessInfo(Bname, BType, BFinancial, ANo, Asub, Adistract, AProvince, APostalCode, AgName, AgPhone, AgEmail);
        getYourInfo(YN, YID, YDOB, YCareer, Yannual, Yaccount, Yphone, YEmail);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(hBox);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(YN);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(YID);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(YDOB);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label3);
        hBox3.getChildren().add(YCareer);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(label4);
        hBox4.getChildren().add(Yannual);
        hBox4.getChildren().add(label5);
        vBox.getChildren().add(hBox4);
        hBox5.getChildren().add(label6);
        hBox5.getChildren().add(Yaccount);
        vBox.getChildren().add(hBox5);
        hBox6.getChildren().add(label7);
        hBox6.getChildren().add(Yphone);
        vBox.getChildren().add(hBox6);
        hBox7.getChildren().add(label8);
        hBox7.getChildren().add(YEmail);
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
        anchorPane1.getChildren().add(ibusi4);
        anchorPane1.getChildren().add(label14);
        anchorPane1.getChildren().add(label15);
        anchorPane1.getChildren().add(hBox9);
        hBox10.getChildren().add(label16);
        hBox10.getChildren().add(Bname);
        vBox0.getChildren().add(hBox10);
        hBox11.getChildren().add(label17);
        hBox11.getChildren().add(BType);
        vBox0.getChildren().add(hBox11);
        hBox12.getChildren().add(label18);
        hBox12.getChildren().add(BFinancial);
        hBox12.getChildren().add(label19);
        vBox0.getChildren().add(hBox12);
        anchorPane1.getChildren().add(vBox0);
        anchorPane1.getChildren().add(label110);
        anchorPane1.getChildren().add(hBox13);
        hBox14.getChildren().add(label111);
        hBox14.getChildren().add(ANo);
        vBox1.getChildren().add(hBox14);
        hBox15.getChildren().add(label112);
        hBox15.getChildren().add(Asub);
        vBox1.getChildren().add(hBox15);
        hBox16.getChildren().add(label113);
        hBox16.getChildren().add(Adistract);
        vBox1.getChildren().add(hBox16);
        hBox17.getChildren().add(label114);
        hBox17.getChildren().add(AProvince);
        vBox1.getChildren().add(hBox17);
        hBox18.getChildren().add(label115);
        hBox18.getChildren().add(APostalCode);
        vBox1.getChildren().add(hBox18);
        anchorPane1.getChildren().add(vBox1);
        anchorPane1.getChildren().add(label116);
        anchorPane1.getChildren().add(hBox19);
        hBox110.getChildren().add(label117);
        hBox110.getChildren().add(AgName);
        vBox2.getChildren().add(hBox110);
        hBox111.getChildren().add(label118);
        hBox111.getChildren().add(AgPhone);
        vBox2.getChildren().add(hBox111);
        hBox112.getChildren().add(label119);
        hBox112.getChildren().add(AgEmail);
        vBox2.getChildren().add(hBox112);
        anchorPane1.getChildren().add(vBox2);
        getChildren().add(anchorPane1);
        getChildren().add(label1110);
        getChildren().add(label1111);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
    }

    protected abstract void Confirm(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void getBusinessInfo(Label Bname, Label BType, Label BFinancial, Label ANo, Label Asub, Label Adistract, Label AProvince, Label APostalCode, Label AgName, Label AgPhone, Label AgEmail);

    protected abstract void getYourInfo(Label Yn, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail);
}
