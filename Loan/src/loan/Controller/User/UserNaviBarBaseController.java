package loan.Controller.User;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import loan.Controller.LoginMainController;
import loan.Base.User.UserNaviBarBase;

public class UserNaviBarBaseController extends UserNaviBarBase {

    double x = 0;

    double y = 0;

    private static void setNode(Node node) {
        HolderPane.getChildren().clear();
        HolderPane.getChildren().add((Node) node);
        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    protected static void changePage(Object a) {
        setNode((Node) a);
    }

    @Override
    protected void Logout(ActionEvent actionEvent) {
        LoginMainController.logout();
        CancelLoan();
        LoginMainController login = new LoginMainController();
        button.getScene().getWindow().hide();
        Stage signup = new Stage();
        Scene scene = new Scene(login);
        signup.setScene(scene);
        signup.initStyle(StageStyle.UNDECORATED);
        signup.show();
    }

    @Override
    protected void Editname(ActionEvent actionEvent) {
        CancelLoan();
        UserProfileEditPageController home = new UserProfileEditPageController();
        UserNaviBarBaseController.changePage(home);
    }

    public static Label getUserText() {
        return UserText;
    }

    public static void setUserText(Label UserText) {
        UserNaviBarBase.UserText = UserText;
    }

    @Override
    protected void GProfile(ActionEvent actionEvent) {
        CancelLoan();
        UserProfilePageController home = new UserProfilePageController();
        UserNaviBarBaseController.changePage(home);
    }

    @Override
    protected void Gloan(ActionEvent actionEvent) {
        CancelLoan();
        UserLoanPage01Controller home = new UserLoanPage01Controller();
        UserNaviBarBaseController.changePage(home);
    }

    @Override
    protected void GSTATUS(ActionEvent actionEvent) {
        CancelLoan();
        UserStatusPageController home = new UserStatusPageController();
        UserNaviBarBaseController.changePage(home);
    }

    @Override
    protected void Createpage() {
        UserProfilePageController home = new UserProfilePageController();
        setNode(home);
    }

    protected static void Minimize(ActionEvent event) {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    protected static void CancelLoan() {
        UserLoanPage02bController.isUse = false;
        UserLoanPage02bController.Businessname = null;
        UserLoanPage02bController.BusinessType = null;
        UserLoanPage02bController.AddressNo = null;
        UserLoanPage02bController.AddressSubdistrict = null;
        UserLoanPage02bController.AddressDistrict = null;
        UserLoanPage02bController.AddressProvince = null;
        UserLoanPage02bController.AddressCode = null;
        UserLoanPage02bController.amount = null;
        UserLoanPage02cController.isUse = false;
        UserLoanPage02cController.CarPrice = null;
        UserLoanPage02cController.CarBrand = null;
        UserLoanPage02cController.cartype = null;
        UserLoanPage02eController.isUse = false;
        UserLoanPage02eController.Academyname = null;
        UserLoanPage02eController.TutitionFee = null;
        UserLoanPage02eController.Cost = null;
        UserLoanPage02hController.isUse = false;
        UserLoanPage02hController.Homeprice = null;
        UserLoanPage02hController.AddressHome = null;
        UserLoanPage02hController.AddressSub = null;
        UserLoanPage02hController.AddressDistrict = null;
        UserLoanPage02hController.AddressProvince = null;
        UserLoanPage02hController.AddressPostal = null;
        UserLoanPage03Controller.isUse = false;
        UserLoanPage03Controller.Agent = null;
        UserLoanPage03Controller.Name = null;
        UserLoanPage03Controller.Phone = null;
        UserLoanPage03Controller.Email = null;
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
