package loan.Base.Manager;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public abstract class ManagerProfileEditPageBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final ImageView imageView;

    protected final Label Utext;

    protected final AnchorPane anchorPane0;

    protected final Label label;

    protected final HBox hBox;

    protected final VBox vBox;

    protected final HBox hBox0;

    protected final Label label0;

    protected final TextField EMgName;

    protected final HBox hBox1;

    protected final Label label1;

    protected final TextField EMgID;

    protected final HBox hBox2;

    protected final Label label2;

    protected final DatePicker EMgBirth;

    protected final HBox hBox3;

    protected final Label label3;

    protected final TextField EMgAdd;

    protected final HBox hBox4;

    protected final Label label4;

    protected final TextField EMgPho;

    protected final Button button;

    protected final FontAwesomeIconView exit;

    protected final Button button0;

    protected final FontAwesomeIconView minimize;
    


    public ManagerProfileEditPageBase() {
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        Utext = new Label();
        anchorPane0 = new AnchorPane();
        label = new Label();
        hBox = new HBox();
        vBox = new VBox();
        hBox0 = new HBox();
        label0 = new Label();
        EMgName = new TextField();
        hBox1 = new HBox();
        label1 = new Label();
        EMgID = new TextField();
        hBox2 = new HBox();
        label2 = new Label();
        EMgBirth = new DatePicker();
        hBox3 = new HBox();
        label3 = new Label();
        EMgAdd = new TextField();
        hBox4 = new HBox();
        label4 = new Label();
        EMgPho = new TextField();
        button = new Button();
        exit = new FontAwesomeIconView();
        button0 = new Button();
        minimize = new FontAwesomeIconView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File green = new File("src/loan/css/button/green.css");
        File textfiledblue = new File("src/loan/css/textfield/stextfieldblue.css");
        File Ccombo = new File("src/loan/css/textfield/comboblue.css");
        File Datepicker = new File("src/loan/css/textfield/datepicker.css");
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
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
        Utext.setLayoutX(63.0);
        Utext.setLayoutY(52.0);
        Utext.setText("Super Admin");
        Utext.setFont(new Font("Segoe UI Bold", 40.0));
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
        EMgName.setPrefHeight(40.0);
        EMgName.setPrefWidth(550.0);
        EMgName.setPromptText("(Can not edit)");
        EMgName.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EMgName, new Insets(5.0, 0.0, 0.0, 50.0));
        hBox1.setPrefHeight(50.0);
        hBox1.setPrefWidth(200.0);
        label1.setText("ID Card NO.");
        label1.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label1, new Insets(13.0, 100.0, 0.0, 50.0));
        EMgID.setPrefHeight(40.0);
        EMgID.setPrefWidth(550.0);
        EMgID.setPromptText("(Can not edit)");
        EMgID.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EMgID, new Insets(5.0, 0.0, 0.0, -7.0));
        hBox2.setPrefHeight(50.0);
        hBox2.setPrefWidth(200.0);
        label2.setText("Date of birth");
        label2.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label2, new Insets(13.0, 100.0, 0.0, 50.0));
        EMgBirth.setPrefHeight(40.0);
        EMgBirth.setPrefWidth(550.0);
        EMgBirth.setPromptText("(Can not edit)");
        EMgBirth.getStylesheets().add(Datepicker.toURI().toString());
        HBox.setMargin(EMgBirth, new Insets(5.0, 0.0, 0.0, -15.0));
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(200.0);
        label3.setText("Address");
        label3.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label3, new Insets(13.0, 100.0, 0.0, 50.0));
        EMgAdd.setPrefHeight(40.0);
        EMgAdd.setPrefWidth(550.0);
        EMgAdd.setPromptText("(Can not edit)");
        EMgAdd.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EMgAdd, new Insets(5.0, 0.0, 0.0, 30.0));
        hBox4.setPrefHeight(50.0);
        hBox4.setPrefWidth(200.0);
        label4.setText("Phone");
        label4.setFont(new Font("Segoe UI Bold", 20.0));
        HBox.setMargin(label4, new Insets(13.0, 100.0, 0.0, 50.0));
        EMgPho.setPrefHeight(40.0);
        EMgPho.setPrefWidth(550.0);
        EMgPho.setPromptText("(Can not edit)");
        EMgPho.getStylesheets().add(textfiledblue.toURI().toString());
        HBox.setMargin(EMgPho, new Insets(5.0, 0.0, 0.0, 47.0));
        AnchorPane.setRightAnchor(button, 20.0);
        AnchorPane.setTopAnchor(button, 20.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Exit);
        button.setPrefHeight(50.0);
        button.setPrefWidth(50.0);
        button.getStylesheets().add(red.toURI().toString());
        button.setGraphic(exit);
        AnchorPane.setRightAnchor(button0, 81.0);
        AnchorPane.setTopAnchor(button0, 20.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Minimize);
        button0.setPrefHeight(50.0);
        button0.setPrefWidth(50.0);
        button0.getStylesheets().add(gray.toURI().toString());
        button0.setGraphic(minimize);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(Utext);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(hBox);
        hBox0.getChildren().add(label0);
        hBox0.getChildren().add(EMgName);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(EMgID);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(EMgBirth);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(label3);
        hBox3.getChildren().add(EMgAdd);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(label4);
        hBox4.getChildren().add(EMgPho);
        vBox.getChildren().add(hBox4);
        anchorPane0.getChildren().add(vBox);
        getChildren().add(anchorPane0);
        getChildren().add(button);
        getChildren().add(button0);
    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);


    protected abstract void Apply(javafx.event.ActionEvent actionEvent);

    protected abstract void Cancel(javafx.event.ActionEvent actionEvent);
}
