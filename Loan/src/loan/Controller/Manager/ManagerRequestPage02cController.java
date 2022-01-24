package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerRequestPage02cBase;
import loan.utils.ConnectionUtil;

public class ManagerRequestPage02cController extends ManagerRequestPage02cBase {

    @Override
    protected void Agree(ActionEvent actionEvent) {
        ConnectionUtil.MCConfirmLoan();
        ManagerRequestPage01Controller a = new ManagerRequestPage01Controller();
        ManagerNaviBarController.changePage(a);
    }

    @Override
    protected void No(ActionEvent actionEvent) {
        ConnectionUtil.MCDeclineLoan();
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
