package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerRequestPage01Base;

public class ManagerRequestPage01Controller extends ManagerRequestPage01Base {

    public static int Reference;

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        ManagerNaviBarController.Minimize(actionEvent);
    }
}
