package loan.Base.Agent;

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
import loan.Controller.Agent.AgentProfilePageController;
import loan.Controller.LoginMainController;
import loan.utils.ConnectionUtil;

public abstract class AgentProfilePageBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final ImageView imageView;

    protected final AnchorPane anchorPane0;

    protected final Label label;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label0;

    protected final Label PAgName;

    protected final HBox hBox1;

    protected final Label label1;

    protected final Label PAgID;

    protected final HBox hBox2;

    protected final Label label2;

    protected final Label PAgBirth;

    protected final HBox hBox3;

    protected final Label label3;

    protected final Label PAgAdd;

    protected final HBox hBox4;

    protected final Label label4;

    protected final Label PAgPho;

    protected final HBox hBox5;

    protected final Label label5;

    protected final Label PAgEm;

    protected final Button button;

    protected final FontAwesomeIconView minimize;

    protected final Button button0;

    protected final FontAwesomeIconView exit;

    protected final TextArea LEL;

    public AgentProfilePageBase() {
        LEL = new TextArea();
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        anchorPane0 = new AnchorPane();
        label = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label0 = new Label();
        PAgName = new Label();
        hBox1 = new HBox();
        label1 = new Label();
        PAgID = new Label();
        hBox2 = new HBox();
        label2 = new Label();
        PAgBirth = new Label();
        hBox3 = new HBox();
        label3 = new Label();
        PAgAdd = new Label();
        hBox4 = new HBox();
        label4 = new Label();
        PAgPho = new Label();
        hBox5 = new HBox();
        label5 = new Label();
        PAgEm = new Label();
        button = new Button();
        minimize = new FontAwesomeIconView();
        button0 = new Button();
        exit = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File transparent = new File("src/loan/css/transparent/TextArea.css");
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(980.0);
        anchorPane.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        imageView.setFitHeight(125.0);
        imageView.setFitWidth(125.0);
        imageView.setLayoutX(63.0);
        imageView.setLayoutY(13.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        anchorPane0.setLayoutY(150.0);
        anchorPane0.setPrefHeight(650.0);
        anchorPane0.setPrefWidth(980.0);
        anchorPane0.setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 0px 1px 1px 0px;");
        label.setLayoutX(59.0);
        label.setLayoutY(17.0);
        label.setText("AGENT INFO");
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
        PAgName.setText("Label");
        PAgName.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(PAgName, new Insets(13.0, 0.0, 0.0, 50.0));
        hBox1.setPrefHeight(50.0);
        hBox1.setPrefWidth(200.0);
        label1.setText("ID Card NO.");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(13.0, 100.0, 0.0, 50.0));
        PAgID.setText("Label");
        PAgID.setFont(new Font(20.0));
        HBox.setMargin(PAgID, new Insets(13.0, 0.0, 0.0, -7.0));
        hBox2.setPrefHeight(50.0);
        hBox2.setPrefWidth(200.0);
        label2.setText("Date of birth");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(13.0, 100.0, 0.0, 50.0));
        PAgBirth.setText("Label");
        PAgBirth.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(PAgBirth, new Insets(13.0, 0.0, 0.0, -15.0));
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(200.0);
        label3.setText("Address");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(13.0, 100.0, 0.0, 50.0));
        PAgAdd.setText("Label");
        PAgAdd.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(PAgAdd, new Insets(13.0, 0.0, 0.0, 30.0));
        hBox4.setPrefHeight(50.0);
        hBox4.setPrefWidth(200.0);
        label4.setText("Phone");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(13.0, 100.0, 0.0, 50.0));
        PAgPho.setText("Label");
        PAgPho.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(PAgPho, new Insets(13.0, 0.0, 0.0, 46.0));
        hBox5.setPrefHeight(50.0);
        hBox5.setPrefWidth(200.0);
        label5.setText("E-mail");
        label5.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label5, new Insets(13.0, 100.0, 0.0, 50.0));
        PAgEm.setText("Label");
        PAgEm.setFont(new Font("Segoe UI", 20.0));
        HBox.setMargin(PAgEm, new Insets(13.0, 0.0, 0.0, 46.0));
        AnchorPane.setRightAnchor(button, 81.0);
        AnchorPane.setTopAnchor(button, 20.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Minimize);
        button.setPrefHeight(50.0);
        button.setPrefWidth(50.0);
        button.getStylesheets().add(gray.toURI().toString());
        button.setGraphic(minimize);
        AnchorPane.setRightAnchor(button0, 20.0);
        AnchorPane.setTopAnchor(button0, 20.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Exit);
        button0.setPrefHeight(50.0);
        button0.setPrefWidth(50.0);
        button0.getStylesheets().add(red.toURI().toString());
        button0.setGraphic(exit);
        anchorPane.getChildren().add(imageView);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(hBox);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(PAgName);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(PAgID);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(PAgBirth);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label3);
        hBox3.getChildren().add(PAgAdd);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(label4);
        hBox4.getChildren().add(PAgPho);
        vBox.getChildren().add(hBox4);
        hBox5.getChildren().add(label5);
        hBox5.getChildren().add(PAgEm);
        vBox.getChildren().add(hBox5);
        anchorPane0.getChildren().add(vBox);
        getChildren().add(anchorPane0);
        getChildren().add(button);
        getChildren().add(button0);
        ConnectionUtil.GetProfile(PAgName, PAgID, PAgBirth, PAgAdd, PAgPho, PAgEm);
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
            AgentProfilePageController.isAlready = true;
        }
    }

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    public abstract void run();
}
