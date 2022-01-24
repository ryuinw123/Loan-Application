package loan.Controller.User;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import loan.Base.User.UserLoanPage02eBase;
import loan.utils.Checking;

public class UserLoanPage02eController extends UserLoanPage02eBase {

    public static Boolean isUse = false;

    protected static String Academyname;

    protected static String TutitionFee;

    protected static String Cost;

    @Override
    protected void Next(ActionEvent actionEvent) {
        ArrayList<String> checkNull = new ArrayList<String>();
        ArrayList<String> checkInt = new ArrayList<String>();
        checkNull.add(LName.getText());
        checkInt.add(LtutitionFee.getText());
        checkInt.add(Lcost.getText());
        if (!Checking.isNull(checkNull) && Checking.isNumeric(checkInt)) {
            Cost = Lcost.getText();
            isUse = true;
            TutitionFee = LtutitionFee.getText();
            Academyname = LName.getText();
            UserLoanPage03Controller home = new UserLoanPage03Controller();
            UserNaviBarBaseController.changePage(home);
        } else {
            lblError.setText("Please enter a valid information");
        }
    }

    public static String getAcademyname() {
        return Academyname;
    }

    public static void setAcademyname(String Academyname) {
        UserLoanPage02eController.Academyname = Academyname;
    }

    public static String getTutitionFee() {
        return TutitionFee;
    }

    public static void setTutitionFee(String TutitionFee) {
        UserLoanPage02eController.TutitionFee = TutitionFee;
    }

    public static String getCost() {
        return Cost;
    }

    public static void setCost(String Cost) {
        UserLoanPage02eController.Cost = Cost;
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
    protected void GetInfo(TextField LName, TextField LtutitionFee, TextField Lcost) {
        if (isUse) {
            LName.setText(Academyname);
            LtutitionFee.setText(TutitionFee);
            Lcost.setText(Cost);
        }
    }
}
