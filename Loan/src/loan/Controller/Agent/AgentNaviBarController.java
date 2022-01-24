package loan.Controller.Agent;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import loan.Controller.LoginMainController;
import loan.Base.Agent.AgentNaviBarBase;

public class AgentNaviBarController extends AgentNaviBarBase {

    double x = 0;

    double y = 0;

    @Override
    protected void Editname2(ActionEvent actionEvent) {
        AgentProfileEditPageController home = new AgentProfileEditPageController();
        setNode(home);
    }

    @Override
    protected void GProfile2(ActionEvent actionEvent) {
        AgentProfilePageController home = new AgentProfilePageController();
        setNode(home);
    }

    @Override
    protected void GLR2(ActionEvent actionEvent) {
        AgentRequestPage01Controller home = new AgentRequestPage01Controller();
        setNode(home);
    }

    @Override
    protected void GHistory(ActionEvent actionEvent) {
        AgentHistoryPageController home = new AgentHistoryPageController();
        AgentNaviBarController.changePage(home);
    }

    @Override
    protected void Createpage() {
        AgentProfilePageController home = new AgentProfilePageController();
        setNode(home);
    }

    protected static void Minimize(ActionEvent event) {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    public static void changePage(Object a) {
        setNode((Node) a);
    }

    private static void setNode(Node node) {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);
        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @Override
    protected void Logout(ActionEvent actionEvent) {
        LoginMainController.logout();
        LoginMainController login = new LoginMainController();
        button.getScene().getWindow().hide();
        Stage signup = new Stage();
        Scene scene = new Scene(login);
        signup.setScene(scene);
        signup.initStyle(StageStyle.UNDECORATED);
        signup.show();
    }

    @Override
    protected void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }

    @Override
    protected void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }
}
