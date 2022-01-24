/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan.Controller.User;

import javafx.event.ActionEvent;
import loan.Base.User.ChooseLoanNotiBase;

/**
 *
 * @author ryu
 */
public class ChooseLoanNotiController extends ChooseLoanNotiBase{

    @Override
    protected void Close(ActionEvent actionEvent) {
        button.getScene().getWindow().hide();
    }
    
}
