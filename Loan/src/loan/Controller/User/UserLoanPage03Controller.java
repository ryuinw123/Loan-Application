package loan.Controller.User;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import loan.Base.User.UserLoanPage03Base;
import loan.utils.ConnectionUtil;

public class UserLoanPage03Controller extends UserLoanPage03Base {

    public static boolean isUse = false;

    protected static String Agent;

    protected static String Name;

    protected static String Phone;

    protected static String Email;

    @Override
    protected void Next(ActionEvent actionEvent) {
        boolean isMyComboBoxEmpty = ChooseAg.getSelectionModel().isEmpty();
        if (!isMyComboBoxEmpty) {
            Agent = ChooseAg.getValue().toString();
            Name = AgName.getText();
            Phone = AgPhone.getText();
            Email = EmAg.getText();
            isUse = true;
            if (UserLoanPage01Controller.getLoneType() == "B") {
                UserLoanPage04bController home = new UserLoanPage04bController();
                UserNaviBarBaseController.changePage(home);
            } else if (UserLoanPage01Controller.getLoneType() == "C") {
                UserLoanPage04cController home = new UserLoanPage04cController();
                UserNaviBarBaseController.changePage(home);
            } else if (UserLoanPage01Controller.getLoneType() == "E") {
                UserLoanPage04eController home = new UserLoanPage04eController();
                UserNaviBarBaseController.changePage(home);
            } else if (UserLoanPage01Controller.getLoneType() == "H") {
                UserLoanPage04hController home = new UserLoanPage04hController();
                UserNaviBarBaseController.changePage(home);
            }
        }
    }

    @Override
    protected void Cancel(ActionEvent actionEvent) {
        if (UserLoanPage01Controller.getLoneType() == "B") {
            UserLoanPage02bController home = new UserLoanPage02bController();
            UserNaviBarBaseController.changePage(home);
        } else if (UserLoanPage01Controller.getLoneType() == "C") {
            UserLoanPage02cController home = new UserLoanPage02cController();
            UserNaviBarBaseController.changePage(home);
        } else if (UserLoanPage01Controller.getLoneType() == "E") {
            UserLoanPage02eController home = new UserLoanPage02eController();
            UserNaviBarBaseController.changePage(home);
        } else if (UserLoanPage01Controller.getLoneType() == "H") {
            UserLoanPage02hController home = new UserLoanPage02hController();
            UserNaviBarBaseController.changePage(home);
        }
    }

    public static String getAgent() {
        return Agent;
    }

    public static void setAgent(String Agent) {
        UserLoanPage03Controller.Agent = Agent;
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
    protected void ShowInfo(Event event) {
        ConnectionUtil.ShowAgentInfo(ChooseAg.getValue().toString(), AgName, AgPhone, EmAg);
    }

    @Override
    protected void GetInfo(ComboBox ChooseAg, Label AgName, Label AgPhone, Label EmAg) {
        if (isUse) {
            ChooseAg.setValue(Agent);
            AgName.setText(Name);
            AgPhone.setText(Phone);
            EmAg.setText(Email);
        }
    }

    public static boolean isIsUse() {
        return isUse;
    }

    public static void setIsUse(boolean isUse) {
        UserLoanPage03Controller.isUse = isUse;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        UserLoanPage03Controller.Name = Name;
    }

    public static String getPhone() {
        return Phone;
    }

    public static void setPhone(String Phone) {
        UserLoanPage03Controller.Phone = Phone;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        UserLoanPage03Controller.Email = Email;
    }
}
