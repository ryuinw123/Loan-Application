package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerRequestPage02bBase;
import loan.utils.ConnectionUtil;

public class ManagerRequestPage02bController extends ManagerRequestPage02bBase {

    @Override
    protected void Agree(ActionEvent actionEvent) {
        ConnectionUtil.MBConfirmLoan();
        ManagerRequestPage01Controller a = new ManagerRequestPage01Controller();
        ManagerNaviBarController.changePage(a);
    }

    @Override
    protected void No(ActionEvent actionEvent) {
        ConnectionUtil.MBDeclineLoan();
        ManagerRequestPage01Controller a = new ManagerRequestPage01Controller();
        ManagerNaviBarController.changePage(a);
    }

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        ManagerNaviBarController.Minimize(actionEvent);
    }

    @Override
    protected void back(ActionEvent actionEvent) {
        ManagerRequestPage01Controller a = new ManagerRequestPage01Controller();
        ManagerNaviBarController.changePage(a);
    }

    protected void Back(ActionEvent actionEvent) {
    }
}
