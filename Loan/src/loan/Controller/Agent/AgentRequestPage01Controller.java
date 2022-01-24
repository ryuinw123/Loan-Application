package loan.Controller.Agent;

import javafx.event.ActionEvent;
import loan.Base.Agent.AgentRequestPage01Base;

public class AgentRequestPage01Controller extends AgentRequestPage01Base {

    public static int Reference;
    public static String Type;

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        AgentNaviBarController.Minimize(actionEvent);
    }
}
