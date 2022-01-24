package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerProfileEditPageBase;

public class ManagerProfileEditPageController extends ManagerProfileEditPageBase {

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        ManagerNaviBarController.Minimize(actionEvent);
    }

    protected void Apply(ActionEvent actionEvent) {
    }

    protected void Cancel(ActionEvent actionEvent) {
    }
}
