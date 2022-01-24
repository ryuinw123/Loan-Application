/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan.Controller.User;

import javafx.event.ActionEvent;
import loan.utils.SaveProfileNotiBase;

/**
 *
 * @author ryu
 */
public class SaveProfileCancelController extends SaveProfileNotiBase{

    @Override
    protected void CANCEL(ActionEvent actionEvent) {
        button.getScene().getWindow().hide();
    }

    @Override
    protected void OK(ActionEvent actionEvent) {
        button.getScene().getWindow().hide();
        UserProfileEditPageController.ConfirmCancel();
    }
    
}
