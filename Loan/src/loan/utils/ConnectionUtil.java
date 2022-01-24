package loan.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JOptionPane;
import loan.Controller.Agent.AgentRequestPage01Controller;
import loan.Controller.ForgetLayerController;
import loan.Controller.LoginMainController;
import loan.Controller.Manager.ManagerRequestPage01Controller;
import loan.Controller.RegNotiController;
import loan.Controller.User.UserLoanPage02bController;
import loan.Controller.User.UserLoanPage02cController;
import loan.Controller.User.UserLoanPage02eController;
import loan.Controller.User.UserLoanPage02hController;
import loan.Controller.User.UserLoanPage03Controller;
import loan.Controller.User.UserNaviBarBaseController;

public class ConnectionUtil {

    private static String Email;

    private static String Password;

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        ConnectionUtil.Password = Password;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        ConnectionUtil.Email = Email;
    }

    public static String swap(String s) {
        String s1 = s.substring(0, 4);
        String s2 = s.substring(4, 8);
        String s3 = s.substring(8, 10);
        return s3 + s2 + s1;
    }

    public static void Login(TextField IdUser, PasswordField Puser) {
        try {
            String CEmail = null;
            String CPassword = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=? and Password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, IdUser.getText());
            pst.setString(2, Puser.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Email = IdUser.getText();
                Password = Puser.getText();
                CEmail = rs.getString("Email");
                CPassword = rs.getString("Password");
                if (Email.equals(CEmail) && Password.equals(CPassword)) {
                    LoginMainController.isLogin = true;
                    LoginMainController.role = rs.getString("Role");
                } else {
                    JOptionPane.showMessageDialog(null, "Username and password not Correct");
                    IdUser.setText("");
                    Puser.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username and password not Correct");
                IdUser.setText("");
                Puser.setText("");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void SignUp(TextField IdUser, PasswordField Puser, TextField Name) {
        try {
            boolean Clone = false;
            ArrayList<String> ID = new ArrayList<String>();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3";
            PreparedStatement pst2 = con.prepareStatement(sql);
            ResultSet rs = pst2.executeQuery();
            while (rs.next()) {
                ID.add(rs.getString("Email"));
            }
            for (String Email2 : ID) {
                if (Email2.equals(IdUser.getText())) {
                    Clone = true;
                }
            }
            if (!Clone) {
                String query = "insert into LoginDB3(Email, Password,Role,Name,IdCard,Career,AnnualIncome,AccountNo,Phone,Address,DOB,Image)values(?,?,?,?,?,?,?,?,?,?,?,?)";
                InputStream is = new FileInputStream(new File("src/loan/image/Noimage.png"));
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, IdUser.getText());
                pst.setString(2, Puser.getText());
                pst.setString(3, "User");
                pst.setString(4, Name.getText());
                pst.setString(5, "N/A");
                pst.setString(6, "N/A");
                pst.setString(7, "N/A");
                pst.setString(8, "N/A");
                pst.setString(9, "N/A");
                pst.setString(10, "N/A");
                pst.setString(11, "DOB");
                pst.setBlob(12, is);
                pst.executeUpdate();
                con.close();
                RegNotiController a = new RegNotiController();
                Dialog<Boolean> b = new Dialog<Boolean>();
                b.initStyle(StageStyle.UNDECORATED);
                b.setResult(Boolean.TRUE);
                b.getDialogPane().setContent(a);
                b.show();
            } else {
                JOptionPane.showMessageDialog(null, "Your email already has in system");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void UserEditProfile(TextField Name, TextField IDcard, DatePicker DOB, TextField Address, ComboBox Career, TextField Annual, TextField AccountNo, TextField Phone) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update LoginDB3 set Name = ?,Idcard = ?,Career = ?,AnnualIncome = ?,AccountNo = ?,Phone = ?,Address = ?,DOB = ? where Email=?";
            PreparedStatement pst = con.prepareStatement(query);
            LocalDate A = DOB.getValue();
            pst.setString(1, Name.getText());
            pst.setString(2, IDcard.getText());
            pst.setString(3, Career.getValue().toString());
            pst.setString(4, Annual.getText());
            pst.setString(5, AccountNo.getText());
            pst.setString(6, Phone.getText());
            pst.setString(7, Address.getText());
            pst.setString(8, A.toString());
            pst.setString(9, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
    }

    public static void UserGetProfileEdit(TextField Name, TextField IDcard, DatePicker DOB, TextField Address, ComboBox Career, TextField Annual, TextField AccountNo, TextField Phone) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
                String dateofbirth = rs.getString("DOB");
                DOB.setValue(CDate.LOCAL_DATE(swap(dateofbirth)));
                IDcard.setText(rs.getString("Idcard"));
                Address.setText(rs.getString("Address"));
                Career.setValue(rs.getString("Career"));
                Annual.setText(rs.getString("AnnualIncome"));
                AccountNo.setText(rs.getString("AccountNo"));
                Phone.setText(rs.getString("Phone"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void GetProfile(Label Name, Label IDcard, Label DOB, Label Address, Label Career, Label Annual, Label AccountNo, Label Phone, Label Email) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
                IDcard.setText(rs.getString("Idcard"));
                DOB.setText(rs.getString("DOB"));
                Address.setText(rs.getString("Address"));
                Career.setText(rs.getString("Career"));
                Annual.setText(rs.getString("AnnualIncome"));
                AccountNo.setText(rs.getString("AccountNo"));
                Phone.setText(rs.getString("Phone"));
                Email.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void GetPage4Profile(Label Name, Label IDcard, Label DOB, Label Career, Label Annual, Label AccountNo, Label Phone, Label Email) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
                IDcard.setText(rs.getString("Idcard"));
                DOB.setText(rs.getString("DOB"));
                Career.setText(rs.getString("Career"));
                Annual.setText(rs.getString("AnnualIncome"));
                AccountNo.setText(rs.getString("AccountNo"));
                Phone.setText(rs.getString("Phone"));
                Email.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void GetName(Label Name) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void GetProfile(TextField Name, TextField IDcard, DatePicker DOB, TextField Address, ComboBox Career, TextField Annual, TextField AccountNo, TextField Phone) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
                String dateofbirth = rs.getString("DOB");
                DOB.setValue(CDate.LOCAL_DATE(swap(dateofbirth)));
                IDcard.setText(rs.getString("Idcard"));
                Address.setText(rs.getString("Address"));
                Career.setValue(rs.getString("Career"));
                Annual.setText(rs.getString("AnnualIncome"));
                AccountNo.setText(rs.getString("AccountNo"));
                Phone.setText(rs.getString("Phone"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void EditProfile(TextField EAgName, TextField EAgID, DatePicker EAgBirth, TextField EAgAdd, TextField EAgPho) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update LoginDB3 set Name = ?,Idcard = ?,Phone = ?,Address = ?,DOB = ? where Email=?";
            PreparedStatement pst = con.prepareStatement(query);
            LocalDate A = EAgBirth.getValue();
            pst.setString(1, EAgName.getText());
            pst.setString(2, EAgID.getText());
            pst.setString(3, EAgPho.getText());
            pst.setString(4, EAgAdd.getText());
            pst.setString(5, A.toString());
            pst.setString(6, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void GetProfile(TextField Name, TextField IDcard, DatePicker DOB, TextField Address, TextField Phone) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
                IDcard.setText(rs.getString("Idcard"));
                String dateofbirth = rs.getString("DOB");
                DOB.setValue(CDate.LOCAL_DATE(swap(dateofbirth)));
                Address.setText(rs.getString("Address"));
                Phone.setText(rs.getString("Phone"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void GetProfile(Label Name, Label IDcard, Label DOB, Label Address, Label Phone, Label Email) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("Name"));
                IDcard.setText(rs.getString("Idcard"));
                DOB.setText(rs.getString("DOB"));
                Address.setText(rs.getString("Address"));
                Phone.setText(rs.getString("Phone"));
                Email.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void BLoanRequest(Label Bname, Label BType, Label BFinancial, Label ANo, Label Asub, Label Adistract, Label AProvince, Label APostalCode, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Bname.setText(rs.getString("Name"));
                BType.setText(rs.getString("Type"));
                BFinancial.setText(rs.getString("Financial"));
                ANo.setText(rs.getString("No"));
                Asub.setText(rs.getString("Subdistrict"));
                Adistract.setText(rs.getString("District"));
                AProvince.setText(rs.getString("Province"));
                APostalCode.setText(rs.getString("PostalCode"));
                CEmail = rs.getString("CEmail");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void CLoanRequest(Label Lcar, Label LCarbrand, Label Lcartype, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from CarLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Lcar.setText(rs.getString("Price"));
                LCarbrand.setText(rs.getString("Brand"));
                Lcartype.setText(rs.getString("Type"));
                CEmail = rs.getString("CEmail");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ELoanRequest(Label LName, Label LTuition, Label LCost, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from EducationLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                LName.setText(rs.getString("Name"));
                LTuition.setText(rs.getString("Tuition"));
                LCost.setText(rs.getString("Cost"));
                CEmail = rs.getString("CEmail");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void HLoanRequest(Label LHOME, Label LNO, Label LSubdistrict, Label LDIstract, Label LProvince, Label Lpostal, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from HomeLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                LHOME.setText(rs.getString("Price"));
                LNO.setText(rs.getString("ANo"));
                LSubdistrict.setText(rs.getString("Subdistrict"));
                LDIstract.setText(rs.getString("District"));
                LProvince.setText(rs.getString("Province"));
                Lpostal.setText(rs.getString("PostalCode"));
                CEmail = rs.getString("CEmail");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void BConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set SDate = ?,AStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Approve");
            pst.setInt(3, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void BDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set SDate = ?,AStatus = ?,MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Decline");
            pst.setString(3, "Decline");
            pst.setInt(4, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void CConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update CarLoan2 set SDate = ?,AStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Approve");
            pst.setInt(3, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void CDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update CarLoan2 set SDate = ?,AStatus = ?,MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Decline");
            pst.setString(3, "Decline");
            pst.setInt(4, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void EConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update EducationLoan2 set SDate = ?,AStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Approve");
            pst.setInt(3, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void EDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update EducationLoan2 set SDate = ?,AStatus = ?,MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Decline");
            pst.setString(3, "Decline");
            pst.setInt(4, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void HConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update HomeLoan2 set SDate = ?,AStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Approve");
            pst.setInt(3, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void HDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update HomeLoan2 set SDate = ?,AStatus = ?,MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            Date d1 = new Date();
            pst.setString(1, d1.toString());
            pst.setString(2, "Decline");
            pst.setString(3, "Decline");
            pst.setInt(4, AgentRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void ShowAgentInfo(String a, Label AgName, Label AgPhone, Label EmAg) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Name=? and Role = ?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, a);
            pst2.setString(2, "Agent");
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                AgName.setText(rs.getString("Name"));
                AgPhone.setText(rs.getString("Phone"));
                EmAg.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ApplyBusinessForm() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into BusinessLoan2(Name, Financial,No,Subdistrict,District,Province,PostalCode,AName,APhone,AEmail,RDate,SDate,AStatus,MStatus,Type,CEmail,CName)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            Date d = new Date();
            pst.setString(1, UserLoanPage02bController.getBusinessname());
            pst.setString(2, UserLoanPage02bController.getAmount());
            pst.setString(3, UserLoanPage02bController.getAddressNo());
            pst.setString(4, UserLoanPage02bController.getAddressSubdistrict());
            pst.setString(5, UserLoanPage02bController.getAddressDistrict());
            pst.setString(6, UserLoanPage02bController.getAddressProvince());
            pst.setString(7, UserLoanPage02bController.getAddressCode());
            pst.setString(8, UserLoanPage03Controller.getAgent());
            pst.setString(9, UserLoanPage03Controller.getPhone());
            pst.setString(10, UserLoanPage03Controller.getEmail());
            pst.setString(11, d.toString());
            pst.setString(12, "N/A");
            pst.setString(13, "InProgress");
            pst.setString(14, "InProgress");
            pst.setString(15, UserLoanPage02bController.getBusinessType());
            pst.setString(16, ConnectionUtil.getEmail());
            pst.setString(17, UserNaviBarBaseController.getUserText().getText());
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ApplyCarForm() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into CarLoan2(Price,Brand,Type,RDate,SDate,AName,APhone,AEmail,AStatus,MStatus,CEmail,CName)values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            Date d = new Date();
            pst.setString(1, UserLoanPage02cController.getCarPrice());
            pst.setString(2, UserLoanPage02cController.getCarBrand());
            pst.setString(3, UserLoanPage02cController.getCartype());
            pst.setString(4, d.toString());
            pst.setString(5, "N/A");
            pst.setString(6, UserLoanPage03Controller.getAgent());
            pst.setString(7, UserLoanPage03Controller.getPhone());
            pst.setString(8, UserLoanPage03Controller.getEmail());
            pst.setString(9, "InProgress");
            pst.setString(10, "InProgress");
            pst.setString(11, ConnectionUtil.getEmail());
            pst.setString(12, UserNaviBarBaseController.getUserText().getText());
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ApplyEducationForm() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into EducationLoan2(Name,Tuition,Cost,RDate,SDate,AName,APhone,AEmail,AStatus,MStatus,CEmail,CName)values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            Date d = new Date();
            pst.setString(1, UserLoanPage02eController.getAcademyname());
            pst.setString(2, UserLoanPage02eController.getTutitionFee());
            pst.setString(3, UserLoanPage02eController.getCost());
            pst.setString(4, d.toString());
            pst.setString(5, "N/A");
            pst.setString(6, UserLoanPage03Controller.getAgent());
            pst.setString(7, UserLoanPage03Controller.getPhone());
            pst.setString(8, UserLoanPage03Controller.getEmail());
            pst.setString(9, "InProgress");
            pst.setString(10, "InProgress");
            pst.setString(11, ConnectionUtil.getEmail());
            pst.setString(12, UserNaviBarBaseController.getUserText().getText());
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ApplyHomeForm() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into HomeLoan2(Price,ANo,Subdistrict,District,Province,PostalCode,RDate,SDate,AName,APhone,AEmail,AStatus,MStatus,CEmail,CName)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            Date d = new Date();
            pst.setString(1, UserLoanPage02hController.getHomeprice());
            pst.setString(2, UserLoanPage02hController.getAddressHome());
            pst.setString(3, UserLoanPage02hController.getAddressSub());
            pst.setString(4, UserLoanPage02hController.getAddressDistrict());
            pst.setString(5, UserLoanPage02hController.getAddressProvince());
            pst.setString(6, UserLoanPage02hController.getAddressPostal());
            pst.setString(7, d.toString());
            pst.setString(8, "N/A");
            pst.setString(9, UserLoanPage03Controller.getAgent());
            pst.setString(10, UserLoanPage03Controller.getPhone());
            pst.setString(11, UserLoanPage03Controller.getEmail());
            pst.setString(12, "InProgress");
            pst.setString(13, "InProgress");
            pst.setString(14, ConnectionUtil.getEmail());
            pst.setString(15, UserNaviBarBaseController.getUserText().getText());
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ChangePassword(PasswordField ChaPassNew) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update LoginDB3 set Password = ? where Email=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, ChaPassNew.getText());
            pst.setString(2, ConnectionUtil.Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MBConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Approve");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            System.out.println(ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MBDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Decline");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MCConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update CarLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Approve");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MCDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update CarLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Decline");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MEConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update EducationLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Approve");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MEDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update EducationLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Decline");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MHConfirmLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update HomeLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Approve");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MHDeclineLoan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update HomeLoan2 set MStatus = ? where sno=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Decline");
            pst.setInt(2, ManagerRequestPage01Controller.Reference);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void MBLoanRequest(Label Bname, Label BType, Label BFinancial, Label ANo, Label Asub, Label Adistract, Label AProvince, Label APostalCode, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference, Label AgName, Label AgPhone, Label AgEmail) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Bname.setText(rs.getString("Name"));
                BType.setText(rs.getString("Type"));
                BFinancial.setText(rs.getString("Financial"));
                ANo.setText(rs.getString("No"));
                Asub.setText(rs.getString("Subdistrict"));
                Adistract.setText(rs.getString("District"));
                AProvince.setText(rs.getString("Province"));
                APostalCode.setText(rs.getString("PostalCode"));
                CEmail = rs.getString("CEmail");
                AgName.setText(rs.getString("AName"));
                AgPhone.setText(rs.getString("APhone"));
                AgEmail.setText(rs.getString("AEmail"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void MCLoanRequest(Label Lcar, Label LCarbrand, Label Lcartype, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference, Label LAname, Label Laphone, Label LAemail) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from CarLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                Lcar.setText(rs.getString("Price"));
                LCarbrand.setText(rs.getString("Brand"));
                Lcartype.setText(rs.getString("Type"));
                CEmail = rs.getString("CEmail");
                LAname.setText(rs.getString("AName"));
                Laphone.setText(rs.getString("APhone"));
                LAemail.setText(rs.getString("AEmail"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void MELoanRequest(Label LName, Label LTuition, Label LCost, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference, Label LANAME, Label Lphone, Label Lmail) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from EducationLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                LName.setText(rs.getString("Name"));
                LTuition.setText(rs.getString("Tuition"));
                LCost.setText(rs.getString("Cost"));
                CEmail = rs.getString("CEmail");
                LANAME.setText(rs.getString("AName"));
                Lphone.setText(rs.getString("APhone"));
                Lmail.setText(rs.getString("AEmail"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void MHLoanRequest(Label LHOME, Label LNO, Label LSubdistrict, Label LDIstract, Label LProvince, Label Lpostal, Label YN, Label YID, Label YDOB, Label YCareer, Label Yannual, Label Yaccount, Label Yphone, Label YEmail, int Reference, Label Lname, Label Lphone, Label Lemail) {
        String CEmail = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from HomeLoan2 where sno=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setInt(1, Reference);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                LHOME.setText(rs.getString("Price"));
                LNO.setText(rs.getString("ANo"));
                LSubdistrict.setText(rs.getString("Subdistrict"));
                LDIstract.setText(rs.getString("District"));
                LProvince.setText(rs.getString("Province"));
                Lpostal.setText(rs.getString("PostalCode"));
                CEmail = rs.getString("CEmail");
                Lname.setText(rs.getString("Aname"));
                Lphone.setText(rs.getString("APhone"));
                Lemail.setText(rs.getString("AEmail"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, CEmail);
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                YN.setText(rs.getString("Name"));
                YID.setText(rs.getString("Idcard"));
                YDOB.setText(rs.getString("DOB"));
                YCareer.setText(rs.getString("Career"));
                Yannual.setText(rs.getString("AnnualIncome"));
                Yaccount.setText(rs.getString("AccountNo"));
                Yphone.setText(rs.getString("Phone"));
                YEmail.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ForgetEmail(TextField textfieldred) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, textfieldred.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                MailUtil.sendEmail(rs.getString("Email"), "LoanProgram", "Your password for loan program account is " + rs.getString("Password"));
                ForgetLayerController.IsEmailTrue = true;
            } else {
                ForgetLayerController.IsEmailTrue = false;
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static String GetCareer() {
        String Career = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ConnectionUtil.Email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Career = rs.getString("Career");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Career;
    }

    public static void UserUpdateProfile(TextField Name) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set CName = ? where CEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update CarLoan2 set CName = ? where CEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update EducationLoan2 set CName = ? where CEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update HomeLoan2 set CName = ? where CEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
    }

    public static void AgentUpdateProfile(TextField Name) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set AName = ? where AEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update CarLoan2 set AName = ? where AEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update EducationLoan2 set AName = ? where AEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update HomeLoan2 set AName = ? where AEmail=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Name.getText());
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Information isn't correct");
        }
    }

    public static String GetName() {
        String A = null;

        try {
            String CEmail = null;
            String CPassword = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                A = rs.getString("Name");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return A;
    }

    public static void UsergetImage(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Email);
            ResultSet rs = pst.executeQuery();
            File file = new File("src/loan/image/new.png");
            FileOutputStream fos = new FileOutputStream(file);
            byte b[];
            Blob blob;
            if (rs.next()) {
                blob = rs.getBlob("image");
                b = blob.getBytes(1, (int) blob.length());
                fos.write(b);

            } else {
                JOptionPane.showMessageDialog(null, "Image fail to load");
            }
            fos.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void UserInsertImage() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update LoginDB3 set Image = ? where Email=?";
            InputStream is = new FileInputStream(new File("src/loan/image/new.png"));
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBlob(1, is);
            pst.setString(2, Email);
            pst.executeUpdate();
            con.close();

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void AgentBInsertFile(File file,int sno) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String query = "Update BusinessLoan2 set FilePdf = ? where sno=?";
            InputStream is = new FileInputStream(file);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBlob(1, is);
            pst.setInt(2, sno);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
public static void AgentCInsertFile(File file,int sno) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            
             String   query = "Update CarLoan2 set FilePdf = ? where sno=?";
           
            InputStream is = new FileInputStream(file);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBlob(1, is);
            pst.setInt(2, sno);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
public static void AgentHInsertFile(File file,int sno) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            
             String   query ="Update HomeLoan2 set FilePdf = ? where sno=?";
            
            InputStream is = new FileInputStream(file);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBlob(1, is);
            pst.setInt(2, sno);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
public static void AgentEInsertFile(File file,int sno) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            
             String   query = "Update EducationLoan2 set FilePdf = ? where sno=?";
            
            InputStream is = new FileInputStream(file);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBlob(1, is);
            pst.setInt(2, sno);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void UserBgetFile(String Lonetype,int sno) {
  
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
              String  sql = "Select * from BusinessLoan2 where sno=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, sno);
            ResultSet rs = pst.executeQuery();
            File file = new File("src/loan/LoanFile/" + Email);
            file.mkdir();
            File file2 = new File("src/loan/LoanFile/" + Email + "/" + sno + Lonetype + ".pdf");
            FileOutputStream fos = new FileOutputStream(file2);
            byte b[];
            Blob blob;
            if (rs.next()) {
                blob = rs.getBlob("FilePdf");
                b = blob.getBytes(1, (int) blob.length());
                fos.write(b);

            } else {
                JOptionPane.showMessageDialog(null, "File fail to load");
            }
            fos.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void UserCgetFile(String Lonetype, int sno) {
  
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from CarLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, sno);
            ResultSet rs = pst.executeQuery();
            File file = new File("src/loan/LoanFile/" + Email);
            file.mkdir();
            File file2 = new File("src/loan/LoanFile/" + Email + "/" + sno + Lonetype + ".pdf");
            FileOutputStream fos = new FileOutputStream(file2);
            byte b[];
            Blob blob;
            if (rs.next()) {
                blob = rs.getBlob("FilePdf");
                b = blob.getBytes(1, (int) blob.length());
                fos.write(b);

            } else {
                JOptionPane.showMessageDialog(null, "File fail to load");
            }
            fos.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void UserHgetFile(String Lonetype, int sno) {
  
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String  sql = "Select * from HomeLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, sno);
            ResultSet rs = pst.executeQuery();
            File file = new File("src/loan/LoanFile/" + Email);
            file.mkdir();
            File file2 = new File("src/loan/LoanFile/" + Email + "/" + sno + Lonetype + ".pdf");
            FileOutputStream fos = new FileOutputStream(file2);
            byte b[];
            Blob blob;
            if (rs.next()) {
                blob = rs.getBlob("FilePdf");
                b = blob.getBytes(1, (int) blob.length());
                fos.write(b);

            } else {
                JOptionPane.showMessageDialog(null, "File fail to load");
            }
            fos.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void UserEgetFile(String Lonetype, int sno) {
  
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
              String  sql = "Select * from EducationLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, sno);
            ResultSet rs = pst.executeQuery();
            File file = new File("src/loan/LoanFile/" + Email);
            file.mkdir();
            File file2 = new File("src/loan/LoanFile/" + Email + "/" + sno + Lonetype + ".pdf");
            FileOutputStream fos = new FileOutputStream(file2);
            byte b[];
            Blob blob;
            if (rs.next()) {
                blob = rs.getBlob("FilePdf");
                b = blob.getBytes(1, (int) blob.length());
                fos.write(b);

            } else {
                JOptionPane.showMessageDialog(null, "File fail to load");
            }
            fos.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static String getBResult(int Reference)
    {
        String Result = null;
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
             String   sql = "Select * from BusinessLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Reference);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
               Result = rs.getString("MStatus");
            } else {
                JOptionPane.showMessageDialog(null, "Username and password not Correct");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Result;
    }
    public static String getCResult(int Reference)
    {
        String Result = null;
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from CarLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Reference);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
               Result = rs.getString("MStatus");
            } else {
                JOptionPane.showMessageDialog(null, "Username and password not Correct");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Result;
    }
    public static String getHResult(int Reference)
    {
  
         try {  
              String Result;
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
             String   sql = "Select * from HomeLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Reference);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
               Result = rs.getString("MStatus");
               return Result;
            } else {
                JOptionPane.showMessageDialog(null, "Username and password not Correct");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         return null;
    }
    public static String getEResult(int Reference)
    {
        String Result = null;
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
             String   sql = "Select * from EducationLoan2 where sno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Reference);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
               Result = rs.getString("MStatus");
            } else {
                JOptionPane.showMessageDialog(null, "Username and password not Correct");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Result;
    }
}
