package loan.Controller.User;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import loan.Base.User.UserLoanPage04hBase;
import loan.utils.ConnectionUtil;

public class UserLoanPage04hController extends UserLoanPage04hBase {

    @Override
    protected void Confirm(ActionEvent actionEvent) {
        ConnectionUtil.ApplyHomeForm();
        UserLoanPage01Controller home = new UserLoanPage01Controller();
        UserNaviBarBaseController.changePage(home);
        UserNaviBarBaseController.CancelLoan();
    }

    @Override
    protected void Cancel(ActionEvent actionEvent) {
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
    protected void getBusinessInfo(Label LHOME, Label LNO, Label LSubdistrict, Label LDIstract, Label LProvince, Label Lpostal, Label Lname, Label Lphone, Label Lemail) {
        LHOME.setText(UserLoanPage02hController.getHomeprice());
        LNO.setText(UserLoanPage02hController.getAddressHome());
        LSubdistrict.setText(UserLoanPage02hController.getAddressSub());
        LDIstract.setText(UserLoanPage02hController.getAddressDistrict());
        LProvince.setText(UserLoanPage02hController.getAddressProvince());
        Lpostal.setText(UserLoanPage02hController.getAddressPostal());
        Lname.setText(UserLoanPage03Controller.getAgent());
        Lphone.setText(UserLoanPage03Controller.getPhone());
        Lemail.setText(UserLoanPage03Controller.getName());
    }
}
