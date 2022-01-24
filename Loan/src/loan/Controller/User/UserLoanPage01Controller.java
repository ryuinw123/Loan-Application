package loan.Controller.User;

import javafx.event.ActionEvent;
import javafx.scene.control.Dialog;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import loan.Base.User.UserLoanPage01Base;
import loan.utils.ConnectionUtil;

public class UserLoanPage01Controller extends UserLoanPage01Base {

    private static String LoneType;

    public static String getLoneType() {
        return LoneType;
    }

    public static void setLoneType(String LoneType) {
        UserLoanPage01Controller.LoneType = LoneType;
    }

    @Override
    protected void LHome(ActionEvent actionEvent) {
        if (!ConnectionUtil.GetCareer().equals("Student") && !ConnectionUtil.GetCareer().equals("College student") && !ConnectionUtil.GetCareer().equals("Agriculturist") && !ConnectionUtil.GetCareer().equals("N/A")) {
            LoneType = "H";
            UserLoanPage02hController home = new UserLoanPage02hController();
            UserNaviBarBaseController.changePage(home);
        } else {
            ChooseLoanNotiController a = new ChooseLoanNotiController();
            Dialog<Boolean> b = new Dialog<Boolean>();
            b.initStyle(StageStyle.UNDECORATED);
            b.setResult(Boolean.TRUE);
            b.getDialogPane().setContent(a);
            b.show();
        }
    }

    @Override
    protected void LCar(ActionEvent actionEvent) {
        if (!ConnectionUtil.GetCareer().equals("Student") && !ConnectionUtil.GetCareer().equals("College student") && !ConnectionUtil.GetCareer().equals("N/A")) {
            LoneType = "C";
            UserLoanPage02cController home = new UserLoanPage02cController();
            UserNaviBarBaseController.changePage(home);
        } else {
            ChooseLoanNotiController a = new ChooseLoanNotiController();
            Dialog<Boolean> b = new Dialog<Boolean>();
            b.initStyle(StageStyle.UNDECORATED);
            b.setResult(Boolean.TRUE);
            b.getDialogPane().setContent(a);
            b.show();
        }
    }

    @Override
    protected void LEdu(ActionEvent actionEvent) {
        if (!ConnectionUtil.GetCareer().equals("Government official") && !ConnectionUtil.GetCareer().equals("Government  Employee") && !ConnectionUtil.GetCareer().equals("Employee") && !ConnectionUtil.GetCareer().equals("Self-employed") && !ConnectionUtil.GetCareer().equals("Businessman") && !ConnectionUtil.GetCareer().equals("Freelance") && !ConnectionUtil.GetCareer().equals("Agriculturist") && !ConnectionUtil.GetCareer().equals("N/A")) {
            LoneType = "E";
            UserLoanPage02eController home = new UserLoanPage02eController();
            UserNaviBarBaseController.changePage(home);
        } else {
            ChooseLoanNotiController a = new ChooseLoanNotiController();
            Dialog<Boolean> b = new Dialog<Boolean>();
            b.initStyle(StageStyle.UNDECORATED);
            b.setResult(Boolean.TRUE);
            b.getDialogPane().setContent(a);
            b.show();
        }
    }

    @Override
    protected void LBusi(ActionEvent actionEvent) {
        if (!ConnectionUtil.GetCareer().equals("Government official") && !ConnectionUtil.GetCareer().equals("Government  Employee") && !ConnectionUtil.GetCareer().equals("Employee") && !ConnectionUtil.GetCareer().equals("Freelance") && !ConnectionUtil.GetCareer().equals("Student") && !ConnectionUtil.GetCareer().equals("College student") && !ConnectionUtil.GetCareer().equals("Agriculturist") && !ConnectionUtil.GetCareer().equals("N/A")) {
            LoneType = "B";
            UserLoanPage02bController home = new UserLoanPage02bController();
            UserNaviBarBaseController.changePage(home);
        } else {
            ChooseLoanNotiController a = new ChooseLoanNotiController();
            Dialog<Boolean> b = new Dialog<Boolean>();
            b.initStyle(StageStyle.UNDECORATED);
            b.setResult(Boolean.TRUE);
            b.getDialogPane().setContent(a);
            b.show();
        }
    }

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        UserNaviBarBaseController.Minimize(actionEvent);
    }
}
