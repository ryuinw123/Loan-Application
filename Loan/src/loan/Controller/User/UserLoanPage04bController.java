package loan.Controller.User;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import loan.Base.User.UserLoanPage04bBase;
import loan.utils.ConnectionUtil;

public class UserLoanPage04bController extends UserLoanPage04bBase {

    @Override
    protected void Confirm(ActionEvent actionEvent) {
        ConnectionUtil.ApplyBusinessForm();
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
    protected void getBusinessInfo(Label Bname, Label BType, Label BFinancial, Label ANo, Label Asub, Label Adistract, Label AProvince, Label APostalCode, Label AgName, Label AgPhone, Label AgEmail) {
        Bname.setText(UserLoanPage02bController.getBusinessname());
        BType.setText(UserLoanPage02bController.getBusinessType());
        BFinancial.setText(UserLoanPage02bController.getAmount());
        ANo.setText(UserLoanPage02bController.getAddressNo());
        Asub.setText(UserLoanPage02bController.getAddressSubdistrict());
        Adistract.setText(UserLoanPage02bController.getAddressDistrict());
        AProvince.setText(UserLoanPage02bController.getAddressProvince());
        APostalCode.setText(UserLoanPage02bController.getAddressCode());
        AgName.setText(UserLoanPage03Controller.getAgent());
        AgPhone.setText(UserLoanPage03Controller.getPhone());
        AgEmail.setText(UserLoanPage03Controller.getEmail());
    }

    @Override
    protected void getYourInfo(Label Yn, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail) {
        ConnectionUtil.GetPage4Profile(Yn, YID, YDOB, YCareer, Yannual, Yaccount, Yphone, YEmail);
    }
}
