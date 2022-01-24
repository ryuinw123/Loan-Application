package loan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import loan.Controller.Agent.AgentSendDocsController;
import loan.Controller.LoginMainController;

public class Loan extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        LoginMainController main = new LoginMainController();
        AgentSendDocsController a = new AgentSendDocsController();
        Scene LScene = new Scene(main);
        stage.setScene(LScene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
