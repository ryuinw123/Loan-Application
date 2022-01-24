package loan.Base.Agent;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import static loan.Base.User.UserNaviBarBase.imageView;
import loan.utils.ConnectionUtil;

public abstract class AgentNaviBarBase extends AnchorPane {

    public static AnchorPane anchorPane;

    protected final AnchorPane anchorPane0;

    protected final Label label;

    protected final HBox hBox;

    protected final AnchorPane anchorPane1;

    protected final Label label0;

    protected final AnchorPane anchorPane2;

    public static ImageView imageView;

    protected final AnchorPane anchorPane3;

    protected final HBox hBox0;

    protected final Button button;

    protected final FontAwesomeIconView EXIT;

    public static Label UserText2;

    protected final Label label1;

    protected final Button button0;

    protected final FontAwesomeIconView EDIT;

    protected final DropShadow dropShadow;

    protected final Button navi;

    protected final FontAwesomeIconView PROF;

    protected final Button navi1;

    protected final FontAwesomeIconView LOANRE;

    protected final Button navi2;

    protected final FontAwesomeIconView HISTORY;

    public static AnchorPane holderPane;

    protected final DropShadow dropShadow0;

    public AgentNaviBarBase() {
        ConnectionUtil.UsergetImage();
        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        label = new Label();
        hBox = new HBox();
        anchorPane1 = new AnchorPane();
        label0 = new Label();
        anchorPane2 = new AnchorPane();
        imageView = new ImageView();
        anchorPane3 = new AnchorPane();
        hBox0 = new HBox();
        button = new Button();
        EXIT = new FontAwesomeIconView();
        UserText2 = new Label();
        label1 = new Label();
        button0 = new Button();
        EDIT = new FontAwesomeIconView();
        dropShadow = new DropShadow();
        navi = new Button();
        PROF = new FontAwesomeIconView();
        navi1 = new Button();
        LOANRE = new FontAwesomeIconView();
        navi2 = new Button();
        HISTORY = new FontAwesomeIconView();
        holderPane = new AnchorPane();
        dropShadow0 = new DropShadow();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(1340.0);
        setStyle("-fx-background-color: #ECECEC;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        File navix = new File("src/loan/css/button/navi.css");
        File lightgreen = new File("src/loan/css/button/lightgreen.css");
        PROF.setGlyphName("USER");
        PROF.setGlyphSize(40);
        LOANRE.setGlyphName("PAPER_PLANE_ALT");
        LOANRE.setGlyphSize(40);
        HISTORY.setGlyphName("HISTORY");
        HISTORY.setGlyphSize(40);
        EDIT.setGlyphName("PENCIL");
        EDIT.setGlyphSize(30);
        EXIT.setGlyphName("SIGN_OUT");
        EXIT.setGlyphSize(30);
        EXIT.setStyle("-fx-fill: white;");
        EDIT.setStyle("-fx-fill: white;");
        anchorPane.setPrefHeight(800.0);
        anchorPane.setPrefWidth(360.0);
        anchorPane.setStyle("-fx-background-color: #E6E6E6; -fx-border-color: #5D5D5D; -fx-border-width: 1px 0px 1px 1px;");
        anchorPane.setOnMouseDragged(this::dragged);
        anchorPane.setOnMousePressed(this::pressed);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(360.0);
        label.setLayoutX(41.0);
        label.setLayoutY(20.0);
        label.setText("Agent");
        label.setFont(new Font("Segoe UI Bold", 50.0));
        hBox.setLayoutX(30.0);
        hBox.setLayoutY(98.0);
        hBox.setPrefHeight(2.0);
        hBox.setPrefWidth(300.0);
        hBox.setStyle("-fx-background-color: #B6B6B6;");
        anchorPane1.setLayoutY(100.0);
        anchorPane1.setPrefHeight(50.0);
        anchorPane1.setPrefWidth(360.0);
        label0.setLayoutX(30.0);
        label0.setLayoutY(13.0);
        label0.setText("INFORMATIONS");
        label0.setFont(new Font("Segoe UI Black", 20.0));
        AnchorPane.setBottomAnchor(anchorPane2, 20.0);
        AnchorPane.setLeftAnchor(anchorPane2, 20.0);
        AnchorPane.setRightAnchor(anchorPane2, 20.0);
        anchorPane2.setLayoutX(20.0);
        anchorPane2.setLayoutY(462.0);
        anchorPane2.setPrefHeight(310.0);
        anchorPane2.setPrefWidth(320.0);
        anchorPane2.setStyle("-fx-background-color: transparent;");
        imageView.setFitHeight(125.0);
        imageView.setFitWidth(125.0);
        imageView.setLayoutX(98.0);
        imageView.setLayoutY(24.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setEffect(dropShadow0);
        anchorPane3.setLayoutY(98.0);
        anchorPane3.setPrefHeight(220.0);
        anchorPane3.setPrefWidth(320.0);
        anchorPane3.setStyle("-fx-background-color: #CCCCCC; -fx-background-radius: 10;");
        hBox0.setLayoutY(144.0);
        hBox0.setPrefHeight(2.0);
        hBox0.setPrefWidth(320.0);
        hBox0.setStyle("-fx-background-color: #A0A0A0;");
        AnchorPane.setBottomAnchor(button, 12.0);
        AnchorPane.setLeftAnchor(button, 258.0);
        AnchorPane.setRightAnchor(button, 12.0);
        AnchorPane.setTopAnchor(button, 158.0);
        button.setLayoutX(258.0);
        button.setLayoutY(158.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::Logout);
        button.setPrefHeight(50.0);
        button.setPrefWidth(50.0);
        button.getStylesheets().add(red.toURI().toString());
        button.setGraphic(EXIT);
        UserText2.setLayoutX(28.0);
        UserText2.setLayoutY(70.0);
        UserText2.setText("Name");
        UserText2.setFont(new Font("Segoe UI Bold", 25.0));
        label1.setLayoutX(28.0);
        label1.setLayoutY(102.0);
        label1.setText("Class : AGENT");
        label1.setFont(new Font("Segoe UI Bold", 18.0));
        AnchorPane.setRightAnchor(button0, 75.0);
        button0.setLayoutX(195.0);
        button0.setLayoutY(158.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::Editname2);
        button0.setPrefHeight(50.0);
        button0.setPrefWidth(50.0);
        button0.getStylesheets().add(lightgreen.toURI().toString());
        button0.setGraphic(EDIT);
        dropShadow.setHeight(40.0);
        dropShadow.setOffsetY(4.0);
        dropShadow.setRadius(19.5);
        dropShadow.setWidth(40.0);
        anchorPane3.setEffect(dropShadow);
        AnchorPane.setLeftAnchor(navi, 0.0);
        AnchorPane.setRightAnchor(navi, 0.0);
        navi.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        navi.setLayoutY(150.0);
        navi.setMnemonicParsing(false);
        navi.setOnAction(this::GProfile2);
        navi.setPrefHeight(75.0);
        navi.setPrefWidth(360.0);
        navi.getStylesheets().add(navix.toURI().toString());
        navi.setText("Profile");
        navi.setFont(new Font("Segoe UI Bold", 20.0));
        navi.setGraphic(PROF);
        navi.setOpaqueInsets(new Insets(0.0));
        navi1.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        navi1.setLayoutY(233.0);
        navi1.setMnemonicParsing(false);
        navi1.setOnAction(this::GLR2);
        navi1.setPrefHeight(75.0);
        navi1.setPrefWidth(360.0);
        navi1.getStylesheets().add(navix.toURI().toString());
        navi1.setText("Loan Request");
        navi1.setFont(new Font("Segoe UI Bold", 20.0));
        navi1.setGraphic(LOANRE);
        navi1.setOpaqueInsets(new Insets(0.0));
        navi2.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        navi2.setLayoutY(316.0);
        navi2.setMnemonicParsing(false);
        navi2.setOnAction(this::GHistory);
        navi2.setPrefHeight(75.0);
        navi2.setPrefWidth(360.0);
        navi2.getStylesheets().add(navix.toURI().toString());
        navi2.setText("History");
        navi2.setFont(new Font("Segoe UI Bold", 20.0));
        navi2.setGraphic(HISTORY);
        navi2.setOpaqueInsets(new Insets(0.0));
        holderPane.setLayoutX(360.0);
        holderPane.setPrefHeight(800.0);
        holderPane.setPrefWidth(980.0);
        holderPane.setStyle("-fx-background-color: white; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 1px 0px;");
        holderPane.setEffect(dropShadow0);
        Createpage();
        File file = new File("src/loan/image/new.png");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
        ConnectionUtil.GetName(UserText2);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(hBox);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(label0);
        anchorPane.getChildren().add(anchorPane1);
        anchorPane3.getChildren().add(hBox0);
        anchorPane3.getChildren().add(button);
        anchorPane3.getChildren().add(UserText2);
        anchorPane3.getChildren().add(label1);
        anchorPane3.getChildren().add(button0);
        anchorPane2.getChildren().add(anchorPane3);
        anchorPane2.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane2);
        anchorPane.getChildren().add(navi);
        anchorPane.getChildren().add(navi1);
        anchorPane.getChildren().add(navi2);
        getChildren().add(anchorPane);
        getChildren().add(holderPane);
    }

    protected abstract void Logout(javafx.event.ActionEvent actionEvent);

    protected abstract void Editname2(javafx.event.ActionEvent actionEvent);

    protected abstract void GProfile2(javafx.event.ActionEvent actionEvent);

    protected abstract void GLR2(javafx.event.ActionEvent actionEvent);

    protected abstract void GHistory(javafx.event.ActionEvent actionEvent);

    protected abstract void dragged(javafx.scene.input.MouseEvent mouseEvent);

    protected abstract void pressed(javafx.scene.input.MouseEvent mouseEvent);

    protected abstract void Createpage();
}
