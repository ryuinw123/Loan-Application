package loan.Controller.User;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import loan.Base.User.UserProfileEditPageBase;
import loan.utils.ConnectionUtil;
import loan.utils.Constants;
import loan.utils.MessageParser;

public class UserProfileEditPageController extends UserProfileEditPageBase {

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
    protected static void ConfirmApply()
    {
        if (Ename.getText().toString().length() > 20)
        {
        lblerror.setText("Name can't have word more than 20");
        }
        else if(Eidcard.getText().toString().length() > 30){
            lblerror.setText("ID Card NO. can't have word more than 30");
        }
        else if(Eadd.getText().toString().length() > 30){
            lblerror.setText("Address can't have word more than 30");
        }
        else if(Ecar.getValue().toString().length() > 30){
            lblerror.setText("Career can't have word more than 30");
        }
        else if(Eannu.getText().toString().length() > 30){
            lblerror.setText("Annual Income can't have word more than 30");
        }
        else if(Epho.getText().toString().length() > 30){
            lblerror.setText("Phone can't have word more than 30");
        }
        else if(Eacc.getText().toString().length() > 30){
            lblerror.setText("Account No. can't have word more than 30");
        }
        else
        {
        ConnectionUtil.UserEditProfile(Ename, Eidcard, Ebirth, Eadd, Ecar, Eannu, Eacc, Epho);
        ConnectionUtil.GetName(UserNaviBarBaseController.UserText);
        ConnectionUtil.UserUpdateProfile(Ename);
        LEL.setText(ConnectionUtil.GetName());
        }
        
    }
    protected static void ConfirmCancel()
    {
        lblerror.setText("");
        ConnectionUtil.GetProfile(Ename, Eidcard, Ebirth, Eadd, Ecar, Eannu, Eacc, Epho);
    }
    @Override
    protected void Apply(ActionEvent actionEvent) {
        SaveProfileApplyController a = new SaveProfileApplyController();
        Dialog<Boolean> b = new Dialog<Boolean>();
        b.initStyle(StageStyle.UNDECORATED);
        b.setResult(Boolean.TRUE);
        b.getDialogPane().setContent(a);
        b.show();
    }

    @Override
    protected void Cancel(ActionEvent actionEvent) {
        SaveProfileCancelController a = new SaveProfileCancelController();
        Dialog<Boolean> b = new Dialog<Boolean>();
        b.initStyle(StageStyle.UNDECORATED);
        b.setResult(Boolean.TRUE);
        b.getDialogPane().setContent(a);
        b.show();
    }

    @Override
    protected void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    protected void Minimize(ActionEvent actionEvent) {
        UserNaviBarBaseController.Minimize(actionEvent);
    }

    @Override
    protected void ChangePassword(ActionEvent actionEvent) {
        UserChaPassController a = new UserChaPassController();
        Dialog<Boolean> b = new Dialog<Boolean>();
        b.initStyle(StageStyle.UNDECORATED);
        b.setResult(Boolean.TRUE);
        b.getDialogPane().setContent(a);
        b.show();
    }

    @Override
    protected void EditProfile(Event event) {
        try {
            if (("Other(Editcareer)").equals(Ecar.getValue().toString())) {
                Ecar.setEditable(true);
            } else {
                Ecar.setEditable(false);
            }
        } catch (Exception ex) {
            System.out.println("JustEditProfile");
        }
    }

    @Override
    protected void Picture(ActionEvent actionEvent){
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter imageFilter = new FileNameExtensionFilter(
    "Image files", ImageIO.getReaderFileSuffixes());
        jfc.setFileFilter(imageFilter);

        File file = new File("src/loan/image/new.png");
        String path = null;
		int returnValue = jfc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
                        path = selectedFile.getAbsolutePath();
			System.out.println(selectedFile.getAbsolutePath());
		}
       String s1 = file.toURI().toString().substring(6);       
        try {
            resize(path,s1,125,125);
            Image image = new Image(file.toURI().toString());
            ConnectionUtil.UserInsertImage();
             UserNaviBarBaseController.imageView.setImage(image);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "This image file isn't support");
        }
        
 
    }
 
     public static void resize(String inputImagePath,
            String outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
        // reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
 
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();
 
        // extracts extension of output file
        String formatName = outputImagePath.substring(outputImagePath
                .lastIndexOf(".") + 1);
 
        // writes to output file
        ImageIO.write(outputImage, formatName, new File(outputImagePath));
    }
    }

