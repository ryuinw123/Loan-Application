package loan.Base.User;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import loan.Controller.LoginMainController;
import loan.Controller.User.UserProfilePageController;
import loan.utils.ConnectionUtil;

public abstract class UserProfilePageBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final ImageView imageView;

    protected final Button button;

    protected final FontAwesomeIconView exit;

    protected final Button button0;

    protected final FontAwesomeIconView minimize;

    protected final AnchorPane anchorPane0;

    protected final Label label;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label0;

    protected final Label NameT;

    protected final HBox hBox1;

    protected final Label label1;

    protected final Label IDT;

    protected final HBox hBox2;

    protected final Label label2;

    protected final Label DOBT;

    protected final HBox hBox3;

    protected final Label label3;

    protected final Label ADDT;

    protected final HBox hBox4;

    protected final Label label4;

    protected final Label CAREERT;

    protected final HBox hBox5;

    protected final Label label5;

    protected final Label IncomeT;

    protected final Label label6;

    protected final HBox hBox6;

    protected final Label label7;

    protected final Label NoT;

    protected final HBox hBox7;

    protected final Label label8;

    protected final Label PT;

    protected final HBox hBox8;

    protected final Label label9;

    protected final Label EmailT;

    protected static TextArea LEL;

    public UserProfilePageBase() {
        LEL = new TextArea();
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        button = new Button();
        exit = new FontAwesomeIconView();
        button0 = new Button();
        minimize = new FontAwesomeIconView();
        anchorPane0 = new AnchorPane();
        label = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label0 = new Label();
        NameT = new Label();
        hBox1 = new HBox();
        label1 = new Label();
        IDT = new Label();
        hBox2 = new HBox();
        label2 = new Label();
        DOBT = new Label();
        hBox3 = new HBox();
        label3 = new Label();
        ADDT = new Label();
        hBox4 = new HBox();
        label4 = new Label();
        CAREERT = new Label();
        hBox5 = new HBox();
        label5 = new Label();
        IncomeT = new Label();
        label6 = new Label();
        hBox6 = new HBox();
        label7 = new Label();
        NoT = new Label();
        hBox7 = new HBox();
        label8 = new Label();
        PT = new Label();
        hBox8 = new HBox();
        label9 = new Label();
        EmailT = new Label();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File transparent = new File("src/loan/css/transparent/TextArea.css");
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(980.0);
        anchorPane.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        imageView.setFitHeight(125.0);
        imageView.setFitWidth(125.0);
        imageView.setLayoutX(63.0);
        imageView.setLayoutY(13.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        AnchorPane.setBottomAnchor(button, 80.0);
        AnchorPane.setLeftAnchor(button, 910.0);
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
        anchorPane0.setLayoutY(150.0);
        anchorPane0.setPrefHeight(650.0);
        anchorPane0.setPrefWidth(980.0);
        anchorPane0.setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 0px;");
        label.setLayoutX(59.0);
        label.setLayoutY(17.0);
        label.setText("MY INFO");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label.setFont(new Font("Segoe UI Black", 25.0));
        hBox.setLayoutX(40.0);
        hBox.setLayoutY(61.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(900.0);
        hBox.setStyle("-fx-background-color: #CCCCCC;");
        vBox.setLayoutX(40.0);
        vBox.setLayoutY(89.0);
        vBox.setPrefHeight(520.0);
        vBox.setPrefWidth(900.0);
        hBox0.setPrefHeight(50.0);
        hBox0.setPrefWidth(200.0);
        label0.setText("Name");
        label0.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label0, new Insets(13.0, 100.0, 0.0, 50.0));
        NameT.setText("Label");
        NameT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(NameT, new Insets(13.0, 0.0, 0.0, 50.0));
        hBox1.setPrefHeight(50.0);
        hBox1.setPrefWidth(200.0);
        label1.setText("ID Card NO.");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(13.0, 100.0, 0.0, 50.0));
        IDT.setText("Label");
        IDT.setFont(new Font(20.0));
        HBox.setMargin(IDT, new Insets(13.0, 0.0, 0.0, -7.0));
        hBox2.setPrefHeight(50.0);
        hBox2.setPrefWidth(200.0);
        label2.setText("Date of birth");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(13.0, 100.0, 0.0, 50.0));
        DOBT.setText("Label");
        DOBT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(DOBT, new Insets(13.0, 0.0, 0.0, -15.0));
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(200.0);
        label3.setText("Address");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(13.0, 100.0, 0.0, 50.0));
        ADDT.setText("Label");
        ADDT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(ADDT, new Insets(13.0, 0.0, 0.0, 30.0));
        hBox4.setPrefHeight(50.0);
        hBox4.setPrefWidth(200.0);
        label4.setText("Career");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(13.0, 100.0, 0.0, 50.0));
        CAREERT.setText("Label");
        CAREERT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(CAREERT, new Insets(13.0, 0.0, 0.0, 45.0));
        hBox5.setPrefHeight(50.0);
        hBox5.setPrefWidth(200.0);
        label5.setText("Annual Income");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label5, new Insets(13.0, 100.0, 0.0, 50.0));
        IncomeT.setText("Label");
        IncomeT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(IncomeT, new Insets(13.0, 0.0, 0.0, -36.0));
        label6.setText("Baht");
        label6.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label6, new Insets(13.0, 0.0, 0.0, 25.0));
        hBox6.setPrefHeight(50.0);
        hBox6.setPrefWidth(200.0);
        label7.setText("Account No.");
        label7.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label7, new Insets(13.0, 100.0, 0.0, 50.0));
        NoT.setText("Label");
        NoT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(NoT, new Insets(13.0, 0.0, 0.0, -11.0));
        hBox7.setPrefHeight(50.0);
        hBox7.setPrefWidth(200.0);
        label8.setText("Phone");
        label8.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label8, new Insets(13.0, 100.0, 0.0, 50.0));
        PT.setText("Label");
        PT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(PT, new Insets(13.0, 0.0, 0.0, 46.0));
        hBox8.setPrefHeight(50.0);
        hBox8.setPrefWidth(200.0);
        label9.setText("E-mail");
        label9.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label9, new Insets(13.0, 100.0, 0.0, 50.0));
        EmailT.setText("Label");
        EmailT.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(EmailT, new Insets(13.0, 0.0, 0.0, 46.0));
        ConnectionUtil.GetProfile(NameT, IDT, DOBT, ADDT, CAREERT, IncomeT, NoT, PT, EmailT);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(hBox);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(NameT);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(IDT);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(DOBT);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label3);
        hBox3.getChildren().add(ADDT);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(label4);
        hBox4.getChildren().add(CAREERT);
        vBox.getChildren().add(hBox4);
        hBox5.getChildren().add(label5);
        hBox5.getChildren().add(IncomeT);
        hBox5.getChildren().add(label6);
        vBox.getChildren().add(hBox5);
        hBox6.getChildren().add(label7);
        hBox6.getChildren().add(NoT);
        vBox.getChildren().add(hBox6);
        hBox7.getChildren().add(label8);
        hBox7.getChildren().add(PT);
        vBox.getChildren().add(hBox7);
        hBox8.getChildren().add(label9);
        hBox8.getChildren().add(EmailT);
        vBox.getChildren().add(hBox8);
        anchorPane0.getChildren().add(vBox);
        getChildren().add(anchorPane0);
        LEL.setLayoutX(35.0);
        LEL.setLayoutY(45.0);
        LEL.setPrefHeight(125.0);
        LEL.setPrefWidth(677.0);
        LEL.setStyle("-fx-background-color: transparent;");
        LEL.setFont(new Font("Segoe UI Bold", 40.0));
        LEL.getStylesheets().add(transparent.toURI().toString());
        getChildren().add(LEL);
        if (LoginMainController.isLogin == true) {
            run();
        } else if (LoginMainController.isLogin == false) {
            UserProfilePageController.isAlready = true;
        }

    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    public abstract void run();

}
