package loan.Base.User;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import loan.utils.ConnectionUtil;

public abstract class UserChaPassBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final DropShadow dropShadow;

    protected final FontAwesomeIconView ILOCK;

    protected final Label label;

    protected final Label label0;

    protected final Label label1;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label2;

    protected final Label Usertxt;

    protected final HBox hBox1;

    protected final Label label3;

    protected final PasswordField ChaPassOld;

    protected final HBox hBox2;

    protected final Label label4;

    protected final PasswordField ChaPassNew;

    protected final HBox hBox3;

    protected final Label label5;

    protected final PasswordField ChaPassCon;

    protected final Button button;

    protected final FontAwesomeIconView comfirm;

    protected final Button button0;

    protected final FontAwesomeIconView cancel;

    protected final Label lblError;
    

    public UserChaPassBase() {
        anchorPane = new AnchorPane();
        dropShadow = new DropShadow();
        ILOCK = new FontAwesomeIconView();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label2 = new Label();
        Usertxt = new Label();
        hBox1 = new HBox();
        label3 = new Label();
        ChaPassOld = new PasswordField();
        hBox2 = new HBox();
        label4 = new Label();
        ChaPassNew = new PasswordField();
        hBox3 = new HBox();
        label5 = new Label();
        ChaPassCon = new PasswordField();
        button = new Button();
        comfirm = new FontAwesomeIconView();
        button0 = new Button();
        cancel = new FontAwesomeIconView();
        lblError = new Label();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(460.0);
        setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D;");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File pass = new File("src/loan/css/textfield/spassfield.css");
        ILOCK.setGlyphName("LOCK");
        ILOCK.setGlyphSize(70);
        comfirm.setGlyphName("CHECK_CIRCLE");
        comfirm.setGlyphSize(30);
        cancel.setGlyphName("TIMES_CIRCLE");
        cancel.setGlyphSize(30);
        comfirm.setStyle("-fx-fill: white;");
        cancel.setStyle("-fx-fill: white;");
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(460.0);
        anchorPane.setStyle("-fx-background-color: #DFDFDF; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 1px;");
        anchorPane.setEffect(dropShadow);
        ILOCK.setLayoutX(37.0);
        ILOCK.setLayoutY(99.0);
        label.setLayoutX(110.0);
        label.setLayoutY(39.0);
        label.setText("Change");
        label.setFont(new Font("Segoe UI Bold", 30.0));
        label0.setLayoutX(110.0);
        label0.setLayoutY(75.0);
        label0.setText("Password");
        label0.setFont(new Font("Segoe UI Bold", 30.0));
        label1.setLayoutX(30.0);
        label1.setLayoutY(175.0);
        label1.setText("PASSWORD");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label1.setFont(new Font("Segoe UI Black", 25.0));
        hBox.setLayoutX(30.0);
        hBox.setLayoutY(220.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(400.0);
        hBox.setStyle("-fx-background-color: #CCCCCC;");
        AnchorPane.setBottomAnchor(vBox, 224.0);
        AnchorPane.setLeftAnchor(vBox, 30.0);
        AnchorPane.setRightAnchor(vBox, 30.0);
        vBox.setLayoutX(30.0);
        vBox.setLayoutY(243.0);
        vBox.setPrefHeight(250.0);
        vBox.setPrefWidth(400.0);
        hBox0.setPrefHeight(450.0);
        hBox0.setPrefWidth(400.0);
        label2.setText("Username");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(20.0, 0.0, 0.0, 0.0));
        Usertxt.setText("N/A");
        Usertxt.setFont(new Font(17.0));
        HBox.setMargin(Usertxt, new Insets(20.0, 0.0, 0.0, 26.0));
        hBox1.setPrefHeight(450.0);
        hBox1.setPrefWidth(400.0);
        label3.setPrefHeight(24.0);
        label3.setPrefWidth(86.0);
        label3.setText("*Old");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(20.0, 0.0, 0.0, 0.0));
        ChaPassOld.setPrefHeight(42.0);
        ChaPassOld.setPrefWidth(280.0);
        ChaPassOld.setPromptText("Old Password");
        ChaPassOld.getStylesheets().add(pass.toURI().toString());
        ChaPassOld.setFont(new Font(17.0));
        HBox.setMargin(ChaPassOld, new Insets(11.0, 0.0, 0.0, 32.0));
        hBox2.setPrefHeight(450.0);
        hBox2.setPrefWidth(400.0);
        label4.setPrefHeight(24.0);
        label4.setPrefWidth(95.0);
        label4.setText("*New");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(20.0, 0.0, 0.0, 0.0));
        ChaPassNew.setPrefHeight(42.0);
        ChaPassNew.setPrefWidth(280.0);
        ChaPassNew.setPromptText("New Password");
        ChaPassNew.getStylesheets().add(pass.toURI().toString());
        ChaPassNew.setFont(new Font(17.0));
        HBox.setMargin(ChaPassNew, new Insets(11.0, 0.0, 0.0, 23.0));
        hBox3.setPrefHeight(450.0);
        hBox3.setPrefWidth(400.0);
        label5.setPrefHeight(24.0);
        label5.setPrefWidth(128.0);
        label5.setText("*Confirm");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label5, new Insets(20.0, 0.0, 0.0, 0.0));
        ChaPassCon.setPrefHeight(42.0);
        ChaPassCon.setPrefWidth(280.0);
        ChaPassCon.setPromptText("New Password");
        ChaPassCon.getStylesheets().add(pass.toURI().toString());
        ChaPassCon.setFont(new Font(17.0));
        HBox.setMargin(ChaPassCon, new Insets(11.0, 0.0, 0.0, -10.0));
        button.setLayoutX(50.0);
        button.setLayoutY(535.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Apply);
        button.setPrefHeight(60.0);
        button.setPrefWidth(360.0);
        button.getStylesheets().add(green.toURI().toString());
        button.setText("APPLY");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Segoe UI Bold", 22.0));
        button.setGraphic(comfirm);
        button0.setLayoutX(50.0);
        button0.setLayoutY(610.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Cancel);
        button0.setPrefHeight(60.0);
        button0.setPrefWidth(360.0);
        button0.getStylesheets().add(red.toURI().toString());
        button0.setText("CANCEL");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Segoe UI Bold", 22.0));
        button0.setGraphic(cancel);
        lblError.setLayoutX(193.0);
        lblError.setLayoutY(487.0);
        lblError.setTextFill(javafx.scene.paint.Color.RED);
        anchorPane.getChildren().add(ILOCK);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        getChildren().add(anchorPane);
        getChildren().add(label1);
        getChildren().add(hBox);
        hBox0.getChildren().add(label2);
        hBox0.getChildren().add(Usertxt);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label3);
        hBox1.getChildren().add(ChaPassOld);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label4);
        hBox2.getChildren().add(ChaPassNew);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label5);
        hBox3.getChildren().add(ChaPassCon);
        vBox.getChildren().add(hBox3);
        getChildren().add(vBox);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(lblError);
        Usertxt.setText(ConnectionUtil.getEmail());
    }

    protected abstract void Apply(javafx.event.ActionEvent actionEvent);

    protected abstract void Cancel(javafx.event.ActionEvent actionEvent);


}
