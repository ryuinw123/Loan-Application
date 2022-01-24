package loan.Controller.User;

import javafx.event.ActionEvent;
import loan.Base.User.UserStatusPageBase;

public class UserStatusPageController extends UserStatusPageBase {

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        UserNaviBarBaseController.Minimize(actionEvent);
    }
}
