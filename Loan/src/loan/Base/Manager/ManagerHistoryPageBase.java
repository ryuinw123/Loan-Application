package loan.Base.Manager;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import loan.utils.ModelTable;

public abstract class ManagerHistoryPageBase extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final FontAwesomeIconView MiHis;

    protected final Button button;

    protected final FontAwesomeIconView exit;

    protected final Button button0;

    protected final FontAwesomeIconView minimize;

    protected final AnchorPane anchorPane0;

    protected final TableView tableView;

    protected final TableColumn Rdate;

    protected final TableColumn CName;

    protected final TableColumn AName;

    protected final TableColumn SDate;

    protected final TableColumn Status;

    protected final DropShadow dropShadow;


    public ManagerHistoryPageBase() {
        anchorPane = new AnchorPane();
        label = new Label();
        MiHis = new FontAwesomeIconView();
        button = new Button();
        exit = new FontAwesomeIconView();
        button0 = new Button();
        minimize = new FontAwesomeIconView();
        anchorPane0 = new AnchorPane();
        tableView = new TableView();
        Rdate = new TableColumn();
        CName = new TableColumn();
        AName = new TableColumn();
        SDate = new TableColumn();
        Status = new TableColumn();
        dropShadow = new DropShadow();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        MiHis.setGlyphName("HISTORY");
        MiHis.setGlyphSize(70);
        minimize.setGlyphName("MINUS");
        minimize.setGlyphSize(30);
        exit.setGlyphName("TIMES");
        exit.setGlyphSize(30);
        minimize.setStyle("-fx-fill: white;");
        exit.setStyle("-fx-fill: white;");
        anchorPane.setPrefHeight(150.0);
        anchorPane.setPrefWidth(980.0);
        anchorPane.setStyle("-fx-background-color: #D2D2D2; -fx-border-color: #5D5D5D; -fx-border-width: 1px 1px 0px 0px;");
        label.setLayoutX(152.0);
        label.setLayoutY(51.0);
        label.setText("History");
        label.setFont(new Font("Segoe UI Bold", 40.0));
        MiHis.setLayoutX(48.0);
        MiHis.setLayoutY(99.0);
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
        tableView.setLayoutX(65.0);
        tableView.setLayoutY(65.0);
        tableView.setPrefHeight(525.0);
        tableView.setPrefWidth(851.0);
        Rdate.setPrefWidth(125.0);
        Rdate.setText("Sent Date");
        CName.setPrefWidth(250.0);
        CName.setText("Customer Name");
        AName.setPrefWidth(250.0);
        AName.setText("Agent Name");
        SDate.setMinWidth(0.0);
        SDate.setPrefWidth(125.0);
        SDate.setText("Received Date");
        Status.setMinWidth(0.0);
        Status.setPrefWidth(100.0);
        Status.setText("Status");
        dropShadow.setHeight(25.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setRadius(12.0);
        dropShadow.setWidth(25.0);
        tableView.setEffect(dropShadow);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(MiHis);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);
        tableView.getColumns().add(Rdate);
        tableView.getColumns().add(CName);
        tableView.getColumns().add(AName);
        tableView.getColumns().add(SDate);
        tableView.getColumns().add(Status);
        anchorPane0.getChildren().add(tableView);
        getChildren().add(anchorPane0);
        Rdate.setCellValueFactory(new PropertyValueFactory("SDate"));
        CName.setCellValueFactory(new PropertyValueFactory("Name"));
        AName.setCellValueFactory(new PropertyValueFactory("AName"));
        SDate.setCellValueFactory(new PropertyValueFactory("RDate"));
        Status.setCellValueFactory(new PropertyValueFactory("MStatus"));
        tableView.setItems(ModelTable.ManagerHistoryConnectionCreate());
    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);

}
