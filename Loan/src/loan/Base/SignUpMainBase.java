package loan.Base;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public abstract class SignUpMainBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final ImageView imageView;

    protected final Label label;

    protected final HBox hBox;

    protected final FontAwesomeIconView ipro;

    protected final Label label0;

    protected final TextField textfieldgreen1;

    protected final FontAwesomeIconView ikey;

    protected final Label label1;

    protected final Button neongreen1;

    protected final FontAwesomeIconView iname;

    protected final Label label2;

    protected final TextField textfieldgreen3;

    protected final PasswordField textfieldgreen2;

    protected final Button red1;

    protected final FontAwesomeIconView exit;

    protected final Button blue1;

    protected final FontAwesomeIconView sback;

    protected final Button gray1;

    protected final FontAwesomeIconView minimize;

    public SignUpMainBase() {
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        hBox = new HBox();
        ipro = new FontAwesomeIconView();
        label0 = new Label();
        textfieldgreen1 = new TextField();
        ikey = new FontAwesomeIconView();
        label1 = new Label();
        neongreen1 = new Button();
        iname = new FontAwesomeIconView();
        label2 = new Label();
        textfieldgreen3 = new TextField();
        textfieldgreen2 = new PasswordField();
        red1 = new Button();
        exit = new FontAwesomeIconView();
        blue1 = new Button();
        sback = new FontAwesomeIconView();
        gray1 = new Button();
        minimize = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(460.0);
        File file = new File("src/loan/image/OkaneW.jpg");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File blue = new File("src/loan/css/button/blue.css");
        File neon = new File("src/loan/css/button/neongreen.css");
        File gtextfield = new File("src/loan/css/textfield/textfieldgreen.css");
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        sback.setStyle("-fx-fill: white;");
        ipro.setGlyphName("USER");
        ipro.setGlyphSize(40);
        ikey.setGlyphName("KEY");
        ikey.setGlyphSize(40);
        iname.setGlyphName("SMILE_ALT");
        iname.setGlyphSize(40);
        sback.setGlyphName("ARROW_LEFT");
        sback.setGlyphSize(30);
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
        label.setText("Sign Up");
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
        textfieldgreen1.setLayoutX(50.0);
        textfieldgreen1.setLayoutY(318.0);
        textfieldgreen1.setPrefHeight(47.0);
        textfieldgreen1.setPrefWidth(360.0);
        textfieldgreen1.setPromptText("username@example.com");
        textfieldgreen1.getStylesheets().add(gtextfield.toURI().toString());
        textfieldgreen1.setFont(new Font(17.0));
        ikey.setLayoutX(61.0);
        ikey.setLayoutY(409.0);
        label1.setLayoutX(116.0);
        label1.setLayoutY(377.0);
        label1.setText("Password");
        label1.setFont(new Font("Segoe UI Bold", 30.0));
        neongreen1.setLayoutX(50.0);
        neongreen1.setLayoutY(617.0);
        neongreen1.setMnemonicParsing(false);
        neongreen1.setOnAction(this::Register);
        neongreen1.setPrefHeight(60.0);
        neongreen1.setPrefWidth(360.0);
        neongreen1.getStylesheets().add(neon.toURI().toString());
        neongreen1.setText("Register Now!");
        neongreen1.setTextFill(javafx.scene.paint.Color.valueOf("#2b2b2b"));
        neongreen1.setFont(new Font("Segoe UI Bold", 22.0));
        iname.setLayoutX(63.0);
        iname.setLayoutY(516.0);
        label2.setLayoutX(116.0);
        label2.setLayoutY(484.0);
        label2.setText("Name");
        label2.setFont(new Font("Segoe UI Bold", 30.0));
        textfieldgreen3.setLayoutX(50.0);
        textfieldgreen3.setLayoutY(530.0);
        textfieldgreen3.setPrefHeight(47.0);
        textfieldgreen3.setPrefWidth(360.0);
        textfieldgreen3.setPromptText("Name");
        textfieldgreen3.getStylesheets().add(gtextfield.toURI().toString());
        textfieldgreen3.setFont(new Font(17.0));
        textfieldgreen2.setLayoutX(50.0);
        textfieldgreen2.setLayoutY(425.0);
        textfieldgreen2.getStylesheets().add(gtextfield.toURI().toString());
        textfieldgreen2.setPrefHeight(47.0);
        textfieldgreen2.setPrefWidth(360.0);
        textfieldgreen2.setFont(new Font(17.0));
        textfieldgreen2.setPromptText("Password");

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
        blue1.setLayoutX(270.0);
        blue1.setLayoutY(20.0);
        blue1.setMnemonicParsing(false);
        blue1.setOnAction(this::Back);
        blue1.setPrefHeight(50.0);
        blue1.setPrefWidth(50.0);
        blue1.getStylesheets().add(blue.toURI().toString());
        blue1.setGraphic(sback);
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
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(hBox);
        anchorPane.getChildren().add(ipro);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(textfieldgreen1);
        anchorPane.getChildren().add(ikey);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(neongreen1);
        anchorPane.getChildren().add(iname);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(textfieldgreen3);
        anchorPane.getChildren().add(textfieldgreen2);
        getChildren().add(anchorPane);
        getChildren().add(red1);
        getChildren().add(blue1);
        getChildren().add(gray1);
    }

    protected abstract void Register(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Back(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void dragged(javafx.scene.input.MouseEvent mouseEvent);

    protected abstract void pressed(javafx.scene.input.MouseEvent mouseEvent);

}
