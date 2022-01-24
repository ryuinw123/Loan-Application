package loan.Controller.Agent;

import javafx.event.ActionEvent;
import javafx.scene.control.Dialog;
import javafx.stage.StageStyle;
import loan.Base.Agent.AgentRequestPage02bBase;
import loan.utils.ConnectionUtil;

public class AgentRequestPage02bController extends AgentRequestPage02bBase {

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        AgentNaviBarController.Minimize(actionEvent);
    }

    @Override
    protected void Submit(ActionEvent actionEvent) {
        
        AgentSendDocsController a = new AgentSendDocsController();
        Dialog<Boolean> b = new Dialog<Boolean>();
        b.initStyle(StageStyle.UNDECORATED);
        b.setResult(Boolean.TRUE);
        b.getDialogPane().setContent(a);
        b.show();
        
    }

    @Override
    protected void Unsub(ActionEvent actionEvent) {
        ConnectionUtil.BDeclineLoan();
        AgentRequestPage01Controller a = new AgentRequestPage01Controller();
        AgentNaviBarController.changePage(a);
    }

    @Override
    protected void Back(ActionEvent actionEvent) {
        AgentRequestPage01Controller a = new AgentRequestPage01Controller();
        AgentNaviBarController.changePage(a);
    }
}
