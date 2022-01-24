package loan.Controller.User;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import loan.Base.User.UserLoanPage02bBase;
import loan.utils.Checking;

public class UserLoanPage02bController extends UserLoanPage02bBase {

    public static Boolean isUse = false;

    protected static String Businessname;

    protected static String BusinessType;

    protected static String AddressNo;

    protected static String AddressSubdistrict;

    protected static String AddressDistrict;

    protected static String AddressProvince;

    protected static String AddressCode;

    protected static String amount;

    @Override
    protected void Next(ActionEvent actionEvent) {
        boolean isMyComboBoxEmpty = combobox.getSelectionModel().isEmpty();
        ArrayList<String> checkNull = new ArrayList<String>();
        ArrayList<String> checkInt = new ArrayList<String>();
        checkNull.add(Nametext.getText());
        checkNull.add(Notext.getText());
        checkNull.add(DisText.getText());
        checkNull.add(ProvinceText.getText());
        checkInt.add(PostalText.getText());
        checkInt.add(AmountText.getText());
        if (!Checking.isNull(checkNull) && Checking.isNumeric(checkInt) && !isMyComboBoxEmpty) {
            Businessname = Nametext.getText();
            System.out.println(Nametext.getText() + "A");
            isUse = true;
            BusinessType = combobox.getValue().toString();
            AddressNo = Notext.getText();
            AddressSubdistrict = SubText.getText();
            AddressDistrict = DisText.getText();
            AddressProvince = ProvinceText.getText();
            AddressCode = PostalText.getText();
            amount = AmountText.getText();
            UserLoanPage03Controller home = new UserLoanPage03Controller();
            UserNaviBarBaseController.changePage(home);
        } else {
            lblError.setText("Please enter a valid information");
        }
    }

    public static String getBusinessname() {
        return Businessname;
    }

    public static void setBusinessname(String Businessname) {
        UserLoanPage02bController.Businessname = Businessname;
    }

    public static String getBusinessType() {
        return BusinessType;
    }

    public static void setBusinessType(String BusinessType) {
        UserLoanPage02bController.BusinessType = BusinessType;
    }

    public static String getAddressNo() {
        return AddressNo;
    }

    public static void setAddressNo(String AddressNo) {
        UserLoanPage02bController.AddressNo = AddressNo;
    }

    public static String getAddressSubdistrict() {
        return AddressSubdistrict;
    }

    public static void setAddressSubdistrict(String AddressSubdistrict) {
        UserLoanPage02bController.AddressSubdistrict = AddressSubdistrict;
    }

    public static String getAddressDistrict() {
        return AddressDistrict;
    }

    public static void setAddressDistrict(String AddressDistrict) {
        UserLoanPage02bController.AddressDistrict = AddressDistrict;
    }

    public static String getAddressProvince() {
        return AddressProvince;
    }

    public static void setAddressProvince(String AddressProvince) {
        UserLoanPage02bController.AddressProvince = AddressProvince;
    }

    public static String getAddressCode() {
        return AddressCode;
    }

    public static void setAddressCode(String AddressCode) {
        UserLoanPage02bController.AddressCode = AddressCode;
    }

    public static String getAmount() {
        return amount;
    }

    public static void setAmount(String amount) {
        UserLoanPage02bController.amount = amount;
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
    protected void GetInfo(TextField NameText, ComboBox combobox, TextField Notext, TextField SubText, TextField DisText, TextField ProvinceText, TextField PostalText, TextField AmountText) {
        if (isUse) {
            NameText.setText(Businessname);
            combobox.setValue(BusinessType);
            Notext.setText(AddressNo);
            SubText.setText(AddressSubdistrict);
            DisText.setText(AddressDistrict);
            ProvinceText.setText(AddressProvince);
            PostalText.setText(AddressCode);
            AmountText.setText(amount);
        }
    }
}
