package loan.Base.Agent;

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

public abstract class AgentRequestPage01Base extends AnchorPane {

    protected final AnchorPane anchorPane;

    protected final Label label;

    protected final FontAwesomeIconView ILoanRe;

    protected final Button button;

    protected final FontAwesomeIconView exit;

    protected final Button button0;

    protected final FontAwesomeIconView minimize;

    protected final AnchorPane anchorPane0;

    protected final TableView tableView;

    protected final TableColumn col_role;

    protected final TableColumn col_Username;

    protected final TableColumn col_password;

    protected final DropShadow dropShadow;

    public AgentRequestPage01Base() {
        anchorPane = new AnchorPane();
        label = new Label();
        ILoanRe = new FontAwesomeIconView();
        button = new Button();
        exit = new FontAwesomeIconView();
        button0 = new Button();
        minimize = new FontAwesomeIconView();
        anchorPane0 = new AnchorPane();
        tableView = new TableView();
        col_role = new TableColumn();
        col_Username = new TableColumn();
        col_password = new TableColumn();
        dropShadow = new DropShadow();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(980.0);
        setStyle("-fx-background-color: white;");
        File gray = new File("src/loan/css/button/gray.css");
        File red = new File("src/loan/css/button/red.css");
        ILoanRe.setGlyphName("SEND_ALT");
        ILoanRe.setGlyphSize(70);
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
        label.setText("Loan Request");
        label.setFont(new Font("Segoe UI Bold", 40.0));
        ILoanRe.setLayoutX(48.0);
        ILoanRe.setLayoutY(99.0);
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
        tableView.setLayoutY(44.0);
        tableView.setPrefHeight(525.0);
        tableView.setPrefWidth(850.0);
        col_role.setPrefWidth(200.0);
        col_role.setText("Date Request Receiving");
        col_Username.setPrefWidth(469.0);
        col_Username.setText("Customer Name");
        col_password.setPrefWidth(180.0);
        col_password.setText("Details");
        tableView.setEffect(dropShadow);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(ILoanRe);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);
        tableView.getColumns().add(col_role);
        tableView.getColumns().add(col_Username);
        tableView.getColumns().add(col_password);
        anchorPane0.getChildren().add(tableView);
        getChildren().add(anchorPane0);
        col_Username.setCellValueFactory(new PropertyValueFactory("RDate"));
        col_role.setCellValueFactory(new PropertyValueFactory("Name"));
        col_password.setCellValueFactory(new PropertyValueFactory("button"));
        tableView.setItems(ModelTable.AgentLoanConnectionCreate());
    }

    protected abstract void Exit(javafx.event.ActionEvent actionEvent);

    protected abstract void Minimize(javafx.event.ActionEvent actionEvent);
}
