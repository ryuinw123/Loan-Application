package loan.Base;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public abstract class LoginMainBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final ImageView imageView;

    protected final Label label;

    protected final HBox hBox;

    protected final FontAwesomeIconView ipro;

    protected final Label label0;

    protected final TextField textfieldblue1;

    protected final FontAwesomeIconView ikey;

    protected final Label label1;

    protected final PasswordField textfieldblue2;

    protected final CheckBox checkBox;

    protected final Hyperlink hyperlink;

    protected final Button blue1;

    protected final Button neongreen1;

    protected final Label label2;

    protected final Button red1;

    protected final FontAwesomeIconView exit;

    protected final Button gray1;

    protected final FontAwesomeIconView minimize;

    public LoginMainBase() {
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        hBox = new HBox();
        ipro = new FontAwesomeIconView();
        label0 = new Label();
        textfieldblue1 = new TextField();
        ikey = new FontAwesomeIconView();
        label1 = new Label();
        textfieldblue2 = new PasswordField();
        checkBox = new CheckBox();
        hyperlink = new Hyperlink();
        blue1 = new Button();
        neongreen1 = new Button();
        label2 = new Label();
        red1 = new Button();
        exit = new FontAwesomeIconView();
        gray1 = new Button();
        minimize = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(460.0);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        ipro.setGlyphName("USER");
        ipro.setGlyphSize(40);
        ikey.setGlyphName("KEY");
        ikey.setGlyphSize(40);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        File file = new File("src/loan/image/OkaneW.jpg");
        File textblue = new File("src/loan/css/textfield/textfieldblue.css");
        File neongreen = new File("src/loan/css/button/neongreen.css");
        File gray = new File("src/loan/css/button/gray.css");
        File blue = new File("src/loan/css/button/blue.css");
        File red = new File("src/loan/css/button/red.css");
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(720.0);
        anchorPane.setPrefWidth(460.0);
        anchorPane.setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 1px;");
        anchorPane.setOnMouseDragged(this::dragged);
        anchorPane.setOnMousePressed(this::pressed);
        imageView.setFitHeight(180.0);
        imageView.setFitWidth(286.0);
        imageView.setLayoutX(101.0);
        imageView.setLayoutY(103.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
        AnchorPane.setLeftAnchor(label, 35.0);
        AnchorPane.setTopAnchor(label, 25.0);
        label.setLayoutX(35.0);
        label.setLayoutY(21.0);
        label.setText("Sign In");
        label.setFont(new Font("Segoe UI Bold", 50.0));
        hBox.setLayoutX(30.0);
        hBox.setLayoutY(100.0);
        hBox.setPrefHeight(3.0);
        hBox.setPrefWidth(400.0);
        hBox.setStyle("-fx-background-color: #5D5D5D;");
        ipro.setLayoutX(65.0);
        ipro.setLayoutY(302.0);
        label0.setLayoutX(116.0);
        label0.setLayoutY(270.0);
        label0.setText("Username");
        label0.setFont(new Font("Segoe UI Bold", 30.0));
        textfieldblue1.setLayoutX(50.0);
        textfieldblue1.setLayoutY(318.0);
        textfieldblue1.setPrefHeight(47.0);
        textfieldblue1.setPrefWidth(360.0);
        textfieldblue1.setPromptText("username@example.com");
        textfieldblue1.getStylesheets().add(textblue.toURI().toString());
        textfieldblue1.setFont(new Font(17.0));
        ikey.setLayoutX(61.0);
        ikey.setLayoutY(409.0);
        label1.setLayoutX(116.0);
        label1.setLayoutY(377.0);
        label1.setText("Password");
        label1.setFont(new Font("Segoe UI Bold", 30.0));
        textfieldblue2.setLayoutX(50.0);
        textfieldblue2.setLayoutY(425.0);
        textfieldblue2.setPrefHeight(47.0);
        textfieldblue2.setPrefWidth(360.0);
        textfieldblue2.setPromptText("password");
        textfieldblue2.getStylesheets().add(textblue.toURI().toString());
        textfieldblue2.setFont(new Font(17.0));
        checkBox.setLayoutX(50.0);
        checkBox.setLayoutY(485.0);
        checkBox.setMnemonicParsing(false);
        checkBox.setText("Remember Me");
        checkBox.setFont(new Font("Segoe UI Bold", 15.0));
        hyperlink.setLayoutX(276.0);
        hyperlink.setLayoutY(482.0);
        hyperlink.setText("Forget Password?");
        hyperlink.setTextFill(javafx.scene.paint.Color.valueOf("#58a8e8"));
        hyperlink.setUnderline(true);
        hyperlink.setFont(new Font("Segoe UI Bold", 15.0));
        hyperlink.setOnAction(this::Forget);
        blue1.setLayoutX(50.0);
        blue1.setLayoutY(525.0);
        blue1.setMnemonicParsing(false);
        blue1.setOnAction(this::Login);
        blue1.setPrefHeight(60.0);
        blue1.setPrefWidth(360.0);
        blue1.getStylesheets().add(blue.toURI().toString());
        blue1.setText("LOGIN");
        blue1.setTextFill(javafx.scene.paint.Color.WHITE);
        blue1.setFont(new Font("Segoe UI Bold", 22.0));
        neongreen1.setLayoutX(50.0);
        neongreen1.setLayoutY(615.0);
        neongreen1.setMnemonicParsing(false);
        neongreen1.setOnAction(this::SignUp);
        neongreen1.setPrefHeight(60.0);
        neongreen1.setPrefWidth(360.0);
        neongreen1.getStylesheets().add(neongreen.toURI().toString());
        neongreen1.setText("Register / Sign Up");
        neongreen1.setTextFill(javafx.scene.paint.Color.valueOf("#2c2c2c"));
        neongreen1.setFont(new Font("Segoe UI Bold", 22.0));
        label2.setLayoutX(52.0);
        label2.setLayoutY(589.0);
        label2.setText("");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c91818"));
        label2.setFont(new Font("Segoe UI Bold", 18.0));
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
        String Isforget = null;
        String ID = null;
        String Password = null;
        int lineNumber;
        try {
            File refile = new File("src/loan/css/remember.txt");
            FileReader readfile = new FileReader(refile.toString());
            BufferedReader readbuffer = new BufferedReader(readfile);
            for (lineNumber = 0; lineNumber < 3; lineNumber++) {
                if (lineNumber == 0) {
                    Isforget = readbuffer.readLine();
                } else if (lineNumber == 1) {
                    ID = readbuffer.readLine();
                } else if (lineNumber == 2) {
                    Password = readbuffer.readLine();
                } else {
                    readbuffer.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Isforget.equals("1")) {
            checkBox.setSelected(true);
            textfieldblue1.setText(ID);
            textfieldblue2.setText(Password);
        }
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(hBox);
        anchorPane.getChildren().add(ipro);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(textfieldblue1);
        anchorPane.getChildren().add(ikey);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(textfieldblue2);
        anchorPane.getChildren().add(checkBox);
        anchorPane.getChildren().add(hyperlink);
        anchorPane.getChildren().add(blue1);
        anchorPane.getChildren().add(neongreen1);
        anchorPane.getChildren().add(label2);
        getChildren().add(anchorPane);
        getChildren().add(red1);
        getChildren().add(gray1);
    }

    protected abstract void Login(javafx.event.ActionEvent actionEvent);

    protected abstract void SignUp(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void Forget(javafx.event.ActionEvent actionEvent);

    protected abstract void dragged(javafx.scene.input.MouseEvent mouseEvent);

    protected abstract void pressed(javafx.scene.input.MouseEvent mouseEvent);


}
