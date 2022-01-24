package loan.Controller.Manager;

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
import loan.Base.Manager.ManagerNaviBarBase;

public class ManagerNaviBarController extends ManagerNaviBarBase {

    double x = 0;

    double y = 0;

    @Override
    protected void GProfile3(ActionEvent actionEvent) {
        ManagerProfilePageController home = new ManagerProfilePageController();
        setNode(home);
    }

    @Override
    protected void GLR3(ActionEvent actionEvent) {
        ManagerRequestPage01Controller home = new ManagerRequestPage01Controller();
        setNode(home);
    }

    @Override
    protected void GHistory2(ActionEvent actionEvent) {
        ManagerHistoryPageController home = new ManagerHistoryPageController();
        ManagerNaviBarController.changePage(home);
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
    protected void Edit(ActionEvent actionEvent) {
        ManagerProfileEditPageController home = new ManagerProfileEditPageController();
        setNode(home);
    }

    @Override
    protected void Createpage() {
        ManagerProfilePageController home = new ManagerProfilePageController();
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
