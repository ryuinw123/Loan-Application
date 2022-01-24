package loan.Controller.Agent;

import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.util.Duration;
import loan.Base.Agent.AgentProfilePageBase;
import loan.utils.Constants;
import loan.utils.MessageParser;

public class AgentProfilePageController extends AgentProfilePageBase {
   public static boolean isAlready = false;
 private Timeline timeline;
    private MessageParser messageParser = new MessageParser();
    private Timer timer = new Timer();

    @Override
    public void run() {
        timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(Duration.millis(Constants.TEXT_INTERVAL), (ActionEvent event) -> {
            handleText();
        });
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void handleText() {
        Character next = messageParser.getNext();
        if (null == next) {
            stopAnimation();
            return;
        } else {
            switch (next) {
                default:
                    break;
            }
        }
        LEL.appendText(String.valueOf(next));
        sleep(Constants.TEXT_INTERVAL);
    }

    private void stopAnimation() {
        timeline.stop();
         LEL.setEditable(false);
    }

    private void sleep(Long time) {
        timeline.pause();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeline.play();
            }
        }, time);
    }
    
    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        AgentNaviBarController.Minimize(actionEvent);
    }
}
