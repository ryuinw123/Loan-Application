package loan.Controller.Manager;

import javafx.event.ActionEvent;
import loan.Base.Manager.ManagerHistoryPageBase;

public class ManagerHistoryPageController extends ManagerHistoryPageBase {

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        ManagerNaviBarController.Minimize(actionEvent);
    }
}
