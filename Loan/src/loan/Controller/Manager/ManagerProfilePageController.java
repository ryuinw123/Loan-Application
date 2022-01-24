package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerProfilePageBase;

public class ManagerProfilePageController extends ManagerProfilePageBase {

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        ManagerNaviBarController.Minimize(actionEvent);
    }
}
