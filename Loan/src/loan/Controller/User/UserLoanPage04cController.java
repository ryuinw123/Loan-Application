package loan.Controller.User;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import loan.Base.User.UserLoanPage04cBase;
import loan.utils.ConnectionUtil;

public class UserLoanPage04cController extends UserLoanPage04cBase {

    @Override
    protected void Confirm(ActionEvent actionEvent) {
        ConnectionUtil.ApplyCarForm();
        UserLoanPage01Controller home = new UserLoanPage01Controller();
        UserNaviBarBaseController.changePage(home);
        UserNaviBarBaseController.CancelLoan();
    }

    @Override
    protected void Back(ActionEvent actionEvent) {
        UserLoanPage03Controller home = new UserLoanPage03Controller();
        UserNaviBarBaseController.changePage(home);
    }

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        UserNaviBarBaseController.Minimize(actionEvent);
    }

    @Override
    protected void getYourInfo(Label Yn, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail) {
        ConnectionUtil.GetPage4Profile(Yn, YID, YDOB, YCareer, Yannual, Yaccount, Yphone, YEmail);
    }

    @Override
    protected void getBusinessInfo(Label Lcar, Label LCarbrand, Label Lcartype, Label LAname, Label Laphone, Label LAemail) {
        Lcar.setText(UserLoanPage02cController.getCarPrice());
        LCarbrand.setText(UserLoanPage02cController.getCarBrand());
        Lcartype.setText(UserLoanPage02cController.getCartype());
        LAname.setText(UserLoanPage03Controller.getName());
        Laphone.setText(UserLoanPage03Controller.getPhone());
        LAemail.setText(UserLoanPage03Controller.getEmail());
    }
}
