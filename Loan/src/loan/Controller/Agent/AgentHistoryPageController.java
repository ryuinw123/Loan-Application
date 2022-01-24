package loan.Controller.Agent;

import javafx.event.ActionEvent;
import loan.Base.Agent.AgentHistoryPageBase;

public class AgentHistoryPageController extends AgentHistoryPageBase {

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        AgentNaviBarController.Minimize(actionEvent);
    }
}
