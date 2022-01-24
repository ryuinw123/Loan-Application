/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan.Controller;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import loan.Base.ForgetLayerBase;
import loan.utils.ConnectionUtil;

/**
 *
 * @author ryu
 */
public class ForgetLayerController extends ForgetLayerBase {

    public static boolean IsEmailTrue = true;

    @Override
    protected void Register(ActionEvent actionEvent) {
        ConnectionUtil.ForgetEmail(textfieldred1);
        if (IsEmailTrue) {
            lblsuccess.setTextFill(javafx.scene.paint.Color.valueOf("#05c91f"));
            lblsuccess.setText("Email has sent successfully");
        } else if (!IsEmailTrue) {
            lblsuccess.setTextFill(javafx.scene.paint.Color.valueOf("#ff0000"));
            lblsuccess.setText("Unvalid email address");
        }
    }

    @Override
    protected void Back(ActionEvent actionEvent) {
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

}
