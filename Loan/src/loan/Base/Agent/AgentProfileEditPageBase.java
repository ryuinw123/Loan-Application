package loan.Base.Agent;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import loan.utils.ConnectionUtil;

public abstract class AgentProfileEditPageBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final ImageView imageView;

protected final Hyperlink hyperlink0;
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

    protected static TextField EAgName;

    protected final HBox hBox1;

    protected final Label label1;

    protected static TextField EAgID;

    protected final HBox hBox2;

    protected final Label label2;

    protected static DatePicker EAgBirth;

    protected final HBox hBox3;

    protected final Label label3;

    protected static TextField EAgAdd;

    protected final HBox hBox4;

    protected final Label label4;

    protected static TextField EAgPho;

    protected final Button button1;

    protected final FontAwesomeIconView apply;

    protected final Button button2;

    protected final FontAwesomeIconView cancel;
    
         protected static TextArea LEL;
         
         protected static Label lblerror;
           protected final FontAwesomeIconView ichakey1;

    public AgentProfileEditPageBase() {
        hyperlink0 = new Hyperlink();
        ichakey1 = new FontAwesomeIconView();
        lblerror = new Label();
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
        EAgName = new TextField();
        hBox1 = new HBox();
        label1 = new Label();
        EAgID = new TextField();
        hBox2 = new HBox();
        label2 = new Label();
        EAgBirth = new DatePicker();
        hBox3 = new HBox();
        label3 = new Label();
        EAgAdd = new TextField();
        hBox4 = new HBox();
        label4 = new Label();
        EAgPho = new TextField();
        button1 = new Button();
        apply = new FontAwesomeIconView();
        button2 = new Button();
        cancel = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        setStyle("-fx-background-color: white;");
        ichakey1.setGlyphName("IMAGE");
        ichakey1.setGlyphSize(20);
        ichakey1.setStyle("-fx-fill: #0073cf;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File textfiledblue = new File("src/loan/css/textfield/stextfieldblue.css");
        File Ccombo = new File("src/loan/css/textfield/comboblue.css");
        File Datepicker = new File("src/loan/css/textfield/datepicker.css");
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
        apply.setGlyphName("CHECK");
        apply.setGlyphSize(40);
        cancel.setGlyphName("TIMES");
        cancel.setGlyphSize(40);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        cancel.setStyle("-fx-fill: white;");
        apply.setStyle("-fx-fill: white;");
        
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
        label.setText("EDIT PROFILE");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#0073cf"));
        label.setFont(new Font("Segoe UI Black", 25.0));
        hBox.setLayoutX(40.0);
        hBox.setLayoutY(61.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(900.0);
        hBox.setStyle("-fx-background-color: #CCCCCC;");
        vBox.setLayoutX(40.0);
        vBox.setLayoutY(89.0);
        vBox.setPrefHeight(250.0);
        vBox.setPrefWidth(900.0);
        hBox0.setPrefHeight(50.0);
        hBox0.setPrefWidth(200.0);
        label0.setText("Name");
        label0.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label0, new Insets(13.0, 100.0, 0.0, 50.0));
        EAgName.setPrefHeight(40.0);
        EAgName.setPrefWidth(550.0);
        EAgName.setPromptText("Name");
        EAgName.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EAgName, new Insets(5.0, 0.0, 0.0, 50.0));
        hBox1.setPrefHeight(50.0);
        hBox1.setPrefWidth(200.0);
        label1.setText("ID Card NO.");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(13.0, 100.0, 0.0, 50.0));
        EAgID.setPrefHeight(40.0);
        EAgID.setPrefWidth(550.0);
        EAgID.setPromptText("ID Card NO.");
        EAgID.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EAgID, new Insets(5.0, 0.0, 0.0, -7.0));
        hBox2.setPrefHeight(50.0);
        hBox2.setPrefWidth(200.0);
        label2.setText("Date of birth");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(13.0, 100.0, 0.0, 50.0));
        EAgBirth.setPrefHeight(40.0);
        EAgBirth.setPrefWidth(550.0);
        EAgBirth.setPromptText("DD/MM/YYYY");
        EAgBirth.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EAgBirth, new Insets(5.0, 0.0, 0.0, -15.0));
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(200.0);
        label3.setText("Address");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(13.0, 100.0, 0.0, 50.0));
        EAgAdd.setPrefHeight(40.0);
        EAgAdd.setPrefWidth(550.0);
        EAgAdd.setPromptText("Address");
        EAgAdd.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EAgAdd, new Insets(5.0, 0.0, 0.0, 30.0));
        hBox4.setPrefHeight(50.0);
        hBox4.setPrefWidth(200.0);
        label4.setText("Phone");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(13.0, 100.0, 0.0, 50.0));
        EAgPho.setPrefHeight(40.0);
        EAgPho.setPrefWidth(550.0);
        EAgPho.setPromptText("Phone");
        EAgPho.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EAgPho, new Insets(5.0, 0.0, 0.0, 47.0));
        AnchorPane.setBottomAnchor(button1, 55.0);
        AnchorPane.setRightAnchor(button1, 141.0);
        button1.setLayoutX(780.0);
        button1.setLayoutY(557.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::Apply);
        button1.setPrefHeight(60.0);
        button1.setPrefWidth(60.0);
        button1.getStylesheets().add(green.toURI().toString());
        button1.setGraphic(apply);
        AnchorPane.setBottomAnchor(button2, 55.0);
        AnchorPane.setRightAnchor(button2, 70.0);
        button2.setLayoutX(851.0);
        button2.setLayoutY(557.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::Cancel);
        button2.setPrefHeight(60.0);
        button2.setPrefWidth(60.0);
        button2.getStylesheets().add(red.toURI().toString());
        button2.setGraphic(cancel);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(hBox);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(EAgName);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(EAgID);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(EAgBirth);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label3);
        hBox3.getChildren().add(EAgAdd);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(label4);
        hBox4.getChildren().add(EAgPho);
        vBox.getChildren().add(hBox4);
        anchorPane0.getChildren().add(vBox);
        anchorPane0.getChildren().add(button1);
        anchorPane0.getChildren().add(button2);
        lblerror.setLayoutX(299.0);
        lblerror.setLayoutY(366.0);
        lblerror.setTextFill(javafx.scene.paint.Color.RED);
        anchorPane0.getChildren().add(lblerror);
        getChildren().add(anchorPane0);
        hyperlink0.setLayoutX(84.0);
        hyperlink0.setLayoutY(347.0);
        hyperlink0.setOnAction(this::Picture);
        hyperlink0.setText("EditPicture");
        hyperlink0.setTextFill(javafx.scene.paint.Color.valueOf("#58a8e8"));
        hyperlink0.setFont(new Font("Segoe UI Bold", 15.0));

        hyperlink0.setGraphic(ichakey1);
        anchorPane0.getChildren().add(hyperlink0);
        ConnectionUtil.GetProfile(EAgName, EAgID, EAgBirth, EAgAdd, EAgPho);
        LEL.setLayoutX(35.0);
        LEL.setLayoutY(45.0);

 
        LEL.setPrefHeight(125.0);
        LEL.setPrefWidth(677.0);
        LEL.setStyle("-fx-background-color: transparent;");
        LEL.setFont(new Font("Segoe UI Bold", 40.0));
        LEL.getStylesheets().add(transparent.toURI().toString());
        getChildren().add(LEL);
        run();
    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

    protected abstract void Apply(javafx.event.ActionEvent actionEvent);
protected abstract void Picture(javafx.event.ActionEvent actionEvent);
    protected abstract void Cancel(javafx.event.ActionEvent actionEvent);
         public abstract void run();

}
