/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan.Controller.Agent;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import loan.Controller.User.UserNaviBarBaseController;
import static loan.Controller.User.UserProfileEditPageController.resize;
import loan.Base.Agent.AgentSendDocsBase;
import loan.utils.ConnectionUtil;

/**
 *
 * @author ryu
 */
public class AgentSendDocsController extends AgentSendDocsBase{

    File selectedFile;
    String path;
    protected void Upload(ActionEvent actionEvent) {
        if (selectedFile != null)
        {
        if (AgentRequestPage01Controller.Type == "B")
        {
            ConnectionUtil.AgentBInsertFile(selectedFile,AgentRequestPage01Controller.Reference);
            ConnectionUtil.BConfirmLoan();
        }
        else if (AgentRequestPage01Controller.Type == "C")
        {
            ConnectionUtil.AgentCInsertFile(selectedFile,AgentRequestPage01Controller.Reference);
            ConnectionUtil.CConfirmLoan();
        }
        else if (AgentRequestPage01Controller.Type == "H")
        {
            ConnectionUtil.AgentHInsertFile(selectedFile,AgentRequestPage01Controller.Reference);
            ConnectionUtil.HConfirmLoan();
            
        }
        else if (AgentRequestPage01Controller.Type == "E")
        {
            
            ConnectionUtil.AgentEInsertFile(selectedFile,AgentRequestPage01Controller.Reference);
             ConnectionUtil.EConfirmLoan();
        }
        AgentRequestPage01Controller a = new AgentRequestPage01Controller();
        AgentNaviBarController.changePage(a);
        button.getScene().getWindow().hide();
    }
        else
             JOptionPane.showMessageDialog(null, "No file selected");
    }

    @Override
    protected void Reset(ActionEvent actionEvent) {
       selectedFile = null;
       label.setText("");
    }

    @Override
    protected void Choosfile(ActionEvent actionEvent) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter pdf = new FileNameExtensionFilter("Pdf file(.pdf)", "pdf");
        jfc.setFileFilter(pdf);
		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			selectedFile = jfc.getSelectedFile();
                        path = selectedFile.getAbsolutePath();
                        label.setText(selectedFile.getName());
			System.out.println(selectedFile.getAbsolutePath());
		}
                
    }
    
}
