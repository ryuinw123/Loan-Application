package loan.Controller.User;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import loan.Base.User.UserLoanPage02cBase;
import loan.utils.Checking;

public class UserLoanPage02cController extends UserLoanPage02cBase {

    public static Boolean isUse = false;

    protected static String CarPrice;

    protected static String CarBrand;

    protected static String cartype;

    public static String getCarPrice() {
        return CarPrice;
    }

    public static void setCarPrice(String CarPrice) {
        UserLoanPage02cController.CarPrice = CarPrice;
    }

    public static String getCarBrand() {
        return CarBrand;
    }

    public static void setCarBrand(String CarBrand) {
        UserLoanPage02cController.CarBrand = CarBrand;
    }

    public static String getCartype() {
        return cartype;
    }

    public static void setCartype(String cartype) {
        UserLoanPage02cController.cartype = cartype;
    }

    @Override
    protected void Next(ActionEvent actionEvent) {
        boolean isMyComboBoxEmpty = Ltype.getSelectionModel().isEmpty();
        ArrayList<String> checkNull = new ArrayList<String>();
        ArrayList<String> checkInt = new ArrayList<String>();
        checkNull.add(LCarbrand.getText());
        checkInt.add(LCarprice.getText());
        if (!Checking.isNull(checkNull) && Checking.isNumeric(checkInt) && !isMyComboBoxEmpty) {
            cartype = Ltype.getValue().toString();
            isUse = true;
            CarPrice = LCarprice.getText();
            CarBrand = LCarbrand.getText();
            UserLoanPage03Controller home = new UserLoanPage03Controller();
            UserNaviBarBaseController.changePage(home);
        } else {
            lblError.setText("Please enter a valid information");
        }
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
    protected void GetInfo(TextField LCarprice, TextField LCarbrand, ComboBox Ltype) {
        if (isUse) {
            LCarprice.setText(CarPrice);
            Ltype.setValue(cartype);
            LCarbrand.setText(CarBrand);
        }
    }
}
