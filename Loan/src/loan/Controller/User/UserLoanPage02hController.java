package loan.Controller.User;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import loan.Base.User.UserLoanPage02hBase;
import loan.utils.Checking;

public class UserLoanPage02hController extends UserLoanPage02hBase {

    public static Boolean isUse = false;

    protected static String Homeprice;

    protected static String AddressHome;

    protected static String AddressSub;

    protected static String AddressDistrict;

    protected static String AddressProvince;

    protected static String AddressPostal;

    @Override
    protected void Next(ActionEvent actionEvent) {
        ArrayList<String> checkNull = new ArrayList<String>();
        ArrayList<String> checkInt = new ArrayList<String>();
        checkNull.add(Lhomeno.getText());
        checkNull.add(Lsub.getText());
        checkNull.add(Ldistrict.getText());
        checkNull.add(Lprovince.getText());
        checkInt.add(LhomePrice.getText());
        checkInt.add(Lcode.getText());
        if (!Checking.isNull(checkNull) && Checking.isNumeric(checkInt)) {
            Homeprice = LhomePrice.getText();
            isUse = true;
            AddressHome = Lhomeno.getText();
            AddressSub = Lsub.getText();
            AddressDistrict = Ldistrict.getText();
            AddressProvince = Lprovince.getText();
            AddressPostal = Lcode.getText();
            UserLoanPage03Controller home = new UserLoanPage03Controller();
            UserNaviBarBaseController.changePage(home);
        } else {
            lblError.setText("Please enter a valid information");
        }
    }

    public static String getHomeprice() {
        return Homeprice;
    }

    public static void setHomeprice(String Homeprice) {
        UserLoanPage02hController.Homeprice = Homeprice;
    }

    public static String getAddressHome() {
        return AddressHome;
    }

    public static void setAddressHome(String AddressHome) {
        UserLoanPage02hController.AddressHome = AddressHome;
    }

    public static String getAddressSub() {
        return AddressSub;
    }

    public static void setAddressSub(String AddressSub) {
        UserLoanPage02hController.AddressSub = AddressSub;
    }

    public static String getAddressDistrict() {
        return AddressDistrict;
    }

    public static void setAddressDistrict(String AddressDistrict) {
        UserLoanPage02hController.AddressDistrict = AddressDistrict;
    }

    public static String getAddressProvince() {
        return AddressProvince;
    }

    public static void setAddressProvince(String AddressProvince) {
        UserLoanPage02hController.AddressProvince = AddressProvince;
    }

    public static String getAddressPostal() {
        return AddressPostal;
    }

    public static void setAddressPostal(String AddressPostal) {
        UserLoanPage02hController.AddressPostal = AddressPostal;
    }

    @Override
    protected void Back(ActionEvent actionEvent) {
        UserNaviBarBaseController.CancelLoan();
        UserLoanPage01Controller home = new UserLoanPage01Controller();
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
    protected void GetInfo(TextField LhomePrice, TextField Lhomeno, TextField Lsub, TextField Ldistrict, TextField Lprovince, TextField Lcode) {
        if (isUse) {
            LhomePrice.setText(Homeprice);
            Lhomeno.setText(AddressHome);
            Lsub.setText(AddressSub);
            Ldistrict.setText(AddressDistrict);
            Lprovince.setText(AddressProvince);
            Lcode.setText(AddressPostal);
        }
    }
}
