package loan.Controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import loan.Base.LoginMainBase;
import loan.utils.ConnectionUtil;

public class LoginMainController extends LoginMainBase {

    public static Boolean isSplashLoaded = false;

    public static Boolean isLogin = false;

    public static String role;

    double x = 0;

    double y = 0;

    @Override
    public void Login(ActionEvent event) {
        AnimationLoadingBaseController AA = new AnimationLoadingBaseController();
        Dialog<Boolean> b = new Dialog<Boolean>();
        b.initStyle(StageStyle.UNDECORATED);
        b.getDialogPane().setContent(AA);
        b.setResult(Boolean.TRUE);
        b.show();
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.setOnFinished( ev->{
    ConnectionUtil.Login(textfieldblue1, textfieldblue2);
    b.close();
    if (isLogin) {
        if (checkBox.isSelected())
            try {
                usingBufferedWritter(textfieldblue1, textfieldblue2, "1");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        else
            try {
                usingBufferedWritter(textfieldblue1, textfieldblue2, "0");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        BlankAnchorPageController a = new BlankAnchorPageController();
        blue1.getScene().getWindow().hide();
        Stage B = new Stage();
        Scene scene = new Scene(a);
        B.setScene(scene);
        B.initStyle(StageStyle.UNDECORATED);
        B.show();
    } else {
        label2.setText("This account does not exist or is incorrect.");
    }
});
        pt.play();
    }

    @Override
    public void SignUp(ActionEvent event) {
        SignUpMainController SignUp = new SignUpMainController();
        blue1.getScene().getWindow().hide();
        Stage signup = new Stage();
        Scene scene = new Scene(SignUp);
        signup.setScene(scene);
        signup.initStyle(StageStyle.UNDECORATED);
        signup.show();
    }

    public static void logout() {
        isLogin = false;
        isSplashLoaded = false;
        role = "";
    }

    public static Boolean getIsSplashLoaded() {
        return isSplashLoaded;
    }

    public static void setIsSplashLoaded(Boolean isSplashLoaded) {
        LoginMainController.isSplashLoaded = isSplashLoaded;
    }

    public static Boolean getIsLogin() {
        return isLogin;
    }

    public static void setIsLogin(Boolean isLogin) {
        LoginMainController.isLogin = isLogin;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        LoginMainController.role = role;
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

    @Override
    protected void Forget(ActionEvent actionEvent) {
        ForgetLayerController a = new ForgetLayerController();
        blue1.getScene().getWindow().hide();
        Stage signup = new Stage();
        Scene scene = new Scene(a);
        signup.setScene(scene);
        signup.initStyle(StageStyle.UNDECORATED);
        signup.show();
    }

    public static void usingBufferedWritter(TextField textfieldblue1, TextField textfieldblue2, String Isrememberme) throws IOException {
        File file = new File("src/loan/css/remember.txt");
        file.delete();
        PrintWriter writer = new PrintWriter(file.toString(), "UTF-8");
        writer.println(Isrememberme);
        writer.println(textfieldblue1.getText());
        writer.println(textfieldblue2.getText());
        writer.close();
    }

    @Override
    protected void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }

    @Override
    protected void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }
}
