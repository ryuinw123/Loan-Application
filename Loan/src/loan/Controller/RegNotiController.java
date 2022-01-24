/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan.Controller;

import javafx.event.ActionEvent;
import loan.Base.RegNotiBase;

/**
 *
 * @author ryu
 */
public class RegNotiController extends RegNotiBase{

    @Override
    protected void Close(ActionEvent actionEvent) {
        button.getScene().getWindow().hide();
    }
    
}
