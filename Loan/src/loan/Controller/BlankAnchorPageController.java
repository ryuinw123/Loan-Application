package loan.Controller;

import javafx.animation.FadeTransition;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import loan.Controller.Agent.AgentNaviBarController;
import loan.Controller.Manager.ManagerNaviBarController;
import loan.Controller.User.UserNaviBarBaseController;
import loan.Base.BlankAnchorBase;

public class BlankAnchorPageController extends BlankAnchorBase {

    @Override
    protected void loadSplashScreen() {
        LoginMainController.isSplashLoaded = true;
        SplashBaseController b = new SplashBaseController();
        StackPane pane = b;
        getChildren().setAll(pane);
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setCycleCount(1);
        fadeIn.play();
        fadeIn.setOnFinished(( e)->{
    fadeOut.play();
});
        fadeOut.setOnFinished(( e)->{
    if (LoginMainController.role.equals("User")) {
        UserNaviBarBaseController a = new UserNaviBarBaseController();
        AnchorPane pane2 = a;
        getChildren().setAll(pane2);
    } else if (LoginMainController.role.equals("Agent")) {
        AgentNaviBarController a = new AgentNaviBarController();
        AnchorPane pane2 = a;
        getChildren().setAll(pane2);
    } else if (LoginMainController.role.equals("Manager")) {
        ManagerNaviBarController a = new ManagerNaviBarController();
        AnchorPane pane2 = a;
        getChildren().setAll(pane2);
    }
});
    }
}
