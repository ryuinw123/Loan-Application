package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerRequestPage02hBase;
import loan.utils.ConnectionUtil;

public class ManagerRequestPage02hController extends ManagerRequestPage02hBase {

    @Override
    protected void Agree(ActionEvent actionEvent) {
        ConnectionUtil.MHConfirmLoan();
        ManagerRequestPage01Controller a = new ManagerRequestPage01Controller();
        ManagerNaviBarController.changePage(a);
    }

    @Override
    protected void No(ActionEvent actionEvent) {
        ConnectionUtil.MHDeclineLoan();
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
}
