package loan.Controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import loan.Base.SignUpMainBase;
import loan.utils.Checking;
import loan.utils.ConnectionUtil;

public class SignUpMainController extends SignUpMainBase {

    double x = 0;

    double y = 0;

    @Override
    public void Register(ActionEvent event) {
        if (Checking.isValidEmailAddress(textfieldgreen1.getText())) {
            ConnectionUtil.SignUp(textfieldgreen1, textfieldgreen2, textfieldgreen3);
        } else {
            JOptionPane.showMessageDialog(null, "Email Error");
        }
    }

    @Override
    public void Back(ActionEvent event) {
        LoginMainController login = new LoginMainController();
        red1.getScene().getWindow().hide();
        Stage signup = new Stage();
        Scene scene = new Scene(login);
        signup.setScene(scene);
        signup.initStyle(StageStyle.UNDECORATED);
        signup.show();
    }

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent event) {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    protected void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }

    @Override
    protected void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }
}
