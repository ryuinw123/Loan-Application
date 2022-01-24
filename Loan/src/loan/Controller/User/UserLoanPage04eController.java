package loan.Controller.User;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import loan.Base.User.UserLoanPage04eBase;
import loan.utils.ConnectionUtil;

public class UserLoanPage04eController extends UserLoanPage04eBase {

    @Override
    protected void Confirm(ActionEvent actionEvent) {
        ConnectionUtil.ApplyEducationForm();
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
    protected void getBusinessInfo(Label LName, Label LTuition, Label LCost, Label LANAME, Label Lphone, Label Lmail) {
        LName.setText(UserLoanPage02eController.getAcademyname());
        LTuition.setText(UserLoanPage02eController.getTutitionFee());
        LCost.setText(UserLoanPage02eController.getCost());
        LANAME.setText(UserLoanPage03Controller.getName());
        Lphone.setText(UserLoanPage03Controller.getPhone());
        Lmail.setText(UserLoanPage03Controller.getEmail());
    }
}
