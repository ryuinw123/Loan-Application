package loan.Controller.User;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import loan.Base.User.UserChaPassBase;
import loan.utils.Checking;
import loan.utils.ConnectionUtil;

public class UserChaPassController extends UserChaPassBase {

    @Override
    protected void Apply(ActionEvent actionEvent) {
        ArrayList<String> checkNull = new ArrayList<String>();
        checkNull.add(ChaPassOld.getText());
        checkNull.add(ChaPassNew.getText());
        checkNull.add(ChaPassCon.getText());
        if (!Checking.isNull(checkNull) && ChaPassOld.getText().equals(ConnectionUtil.getPassword()) && ChaPassNew.getText().equals(ChaPassCon.getText())) {
            ConnectionUtil.ChangePassword(ChaPassNew);
            button.getScene().getWindow().hide();
        } else {
            lblError.setText("please enter a valid information");
        }
    }

    @Override
    protected void Cancel(ActionEvent actionEvent) {
        button.getScene().getWindow().hide();
    }
}
