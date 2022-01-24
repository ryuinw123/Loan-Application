package loan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;
import loan.Controller.Agent.AgentNaviBarController;
import loan.Controller.Agent.AgentRequestPage01Controller;
import loan.Controller.Agent.AgentRequestPage02bController;
import loan.Controller.Agent.AgentRequestPage02cController;
import loan.Controller.Agent.AgentRequestPage02eController;
import loan.Controller.Agent.AgentRequestPage02hController;
import loan.Controller.Manager.ManagerNaviBarController;
import loan.Controller.Manager.ManagerRequestPage01Controller;
import loan.Controller.Manager.ManagerRequestPage02bController;
import loan.Controller.Manager.ManagerRequestPage02cController;
import loan.Controller.Manager.ManagerRequestPage02eController;
import loan.Controller.Manager.ManagerRequestPage02hController;

public class ModelTable {

    String RDate, Name, AName, LoanType;

    int Reference;

    Button button;

    String SDate, AStatus, MStatus;

    Date Rdate, Sdate;

    public ModelTable(String RDate, String Name, String AName, String SDate, String MStatus, int Reference) {
        this.RDate = RDate;
        this.Name = Name;
        this.AName = AName;
        this.SDate = SDate;
        this.MStatus = MStatus;
    }

    public ModelTable(String RDate, String Name, String AName, String LoanType, int Reference) {
        this.RDate = RDate;
        this.Name = Name;
        this.AName = AName;
        this.LoanType = LoanType;
        this.button = button;
        this.Reference = Reference;
        this.button = new Button("Show");
        this.button.setOnAction(this::MbuttonHandle);
    }

    public ModelTable(Date Rdate, String LoanType, String MStatus, int iso, int kk) {
        this.LoanType = LoanType;
        this.MStatus = MStatus;
        this.Rdate = Rdate;
        Reference = iso;
    }

    public ModelTable(String RDate, String LoanType, String MStatus, int iso, int kk) {
        this.RDate = RDate;
        this.LoanType = LoanType;
        this.MStatus = MStatus;
        Reference = iso;
        this.button = new Button("Show");
        this.button.setOnAction(this::UButtonHandle);
    }

    public ModelTable(String RDate, String Name, String SDate, String AStatus, String MStatus) {
        this.RDate = RDate;
        this.Name = Name;
        this.SDate = SDate;
        this.AStatus = AStatus;
        this.MStatus = MStatus;
    }

    public ModelTable(String RDate, String Name, Date Sdate, String AStatus, String MStatus) {
        this.RDate = RDate;
        this.Name = Name;
        this.AStatus = AStatus;
        this.MStatus = MStatus;
        this.Sdate = Sdate;
    }

    public ModelTable(String Name, String LoanType, int Reference, Date Rdate) {
        this.Name = Name;
        this.LoanType = LoanType;
        this.Reference = Reference;
        this.Rdate = Rdate;
    }

    public ModelTable(String RDate, String Name, String LoanType, int Reference) {
        this.RDate = RDate;
        this.Reference = Reference;
        this.LoanType = LoanType;
        this.Name = Name;
        this.button = new Button("Show");
        this.button.setOnAction(this::AbuttonHandle);
    }

    public ModelTable(Date Rdate, String Name, String AName, String LoanType, int Reference) {
        this.Name = Name;
        this.AName = AName;
        this.LoanType = LoanType;
        this.Reference = Reference;
        this.Rdate = Rdate;
    }

    public ModelTable(String RDate, String Name, String AName, Date Sdate, String MStatus, int Reference) {
        this.RDate = RDate;
        this.Name = Name;
        this.AName = AName;
        this.Reference = Reference;
        this.MStatus = MStatus;
        this.Sdate = Sdate;
    }

    public Date getRdate() {
        return Rdate;
    }

    public void setRdate(Date Rdate) {
        this.Rdate = Rdate;
    }

    public Date getSdate() {
        return Sdate;
    }

    public void setSdate(Date Sdate) {
        this.Sdate = Sdate;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    public String getRDate() {
        return RDate;
    }

    public void setRDate(String RDate) {
        this.RDate = RDate;
    }

    public String getSDate() {
        return SDate;
    }

    public void setSDate(String SDate) {
        this.SDate = SDate;
    }

    public String getAStatus() {
        return AStatus;
    }

    public void setAStatus(String AStatus) {
        this.AStatus = AStatus;
    }

    public String getMStatus() {
        return MStatus;
    }

    public void setMStatus(String MStatus) {
        this.MStatus = MStatus;
    }

    public String getLoanType() {
        return LoanType;
    }

    public void setLoanType(String LoanType) {
        this.LoanType = LoanType;
    }

    public int getReference() {
        return Reference;
    }

    public void setReference(int Reference) {
        this.Reference = Reference;
    }

    public String getDate() {
        return RDate;
    }

    public void setDate(String Date) {
        this.RDate = Date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public static ObservableList AgentLoanConnectionCreate() {
        ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
        try {
            ArrayList<ModelTable> A = new ArrayList<ModelTable>();
            ModelTable B;
            SimpleDateFormat format = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                    Locale.ENGLISH);
            Date date = new Date();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ConnectionUtil.getEmail());
            pst.setString(2, "InProgress");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                date = format.parse(rs.getString("RDate"));
                A.add(new ModelTable(rs.getString("CName"), "B", rs.getInt("sno"), date));
            }
            String sql2 = "Select * from CarLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.setString(1, ConnectionUtil.getEmail());
            pst2.setString(2, "InProgress");
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                date = format.parse(rs2.getString("RDate"));
                A.add(new ModelTable(rs2.getString("CName"), "C", rs2.getInt("sno"), date));
            }
            String sql3 = "Select * from EducationLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, ConnectionUtil.getEmail());
            pst3.setString(2, "InProgress");
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                date = format.parse(rs3.getString("RDate"));
                A.add(new ModelTable(rs3.getString("CName"), "E", rs3.getInt("sno"), date));
            }
            String sql4 = "Select * from HomeLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst4 = con.prepareStatement(sql4);
            pst4.setString(1, ConnectionUtil.getEmail());
            pst4.setString(2, "InProgress");
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                date = format.parse(rs4.getString("RDate"));
                A.add(new ModelTable(rs4.getString("CName"), "H", rs4.getInt("sno"), date));
            }
            if (A.size() == 1) {
                oblist.add(new ModelTable(A.get(0).Rdate.toString(), A.get(0).Name, A.get(0).LoanType.toString(), A.get(0).Reference));
            } else if (A.size() == 0) {
            } else {
                for (int i = 0; i < A.size() - 1; i++) {
                    for (int j = 0; j < A.size() - 1; j++) {
                        if (A.get(j).Rdate.compareTo(A.get(j + 1).Rdate) < 0) {
                            B = A.get(j);
                            A.set(j, A.get(j + 1));
                            A.set(j + 1, B);
                        }
                    }
                }
                for (int i = 0; i < A.size(); i++) {
                    oblist.add(new ModelTable(A.get(i).Rdate.toString(), A.get(i).Name, A.get(i).LoanType.toString(), A.get(i).Reference));
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return oblist;
    }

    public static ObservableList AgentHistoryConnectionCreate() {
        ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
        try {
            ArrayList<ModelTable> A = new ArrayList<ModelTable>();
            ModelTable B;
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                    Locale.ENGLISH);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ConnectionUtil.getEmail());
            pst.setString(2, "Approve");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                date = format.parse(rs.getString("SDate"));
                A.add(new ModelTable(rs.getString("RDate"), rs.getString("CName"), date, rs.getString("AStatus"), rs.getString("MStatus")));
            }
            String sql2 = "Select * from CarLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.setString(1, ConnectionUtil.getEmail());
            pst2.setString(2, "Approve");
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                date = format.parse(rs2.getString("SDate"));
                A.add(new ModelTable(rs2.getString("RDate"), rs2.getString("CName"), date, rs2.getString("AStatus"), rs2.getString("MStatus")));
            }
            String sql3 = "Select * from EducationLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, ConnectionUtil.getEmail());
            pst3.setString(2, "Approve");
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                date = format.parse(rs3.getString("SDate"));
                A.add(new ModelTable(rs3.getString("RDate"), rs3.getString("CName"), date, rs3.getString("AStatus"), rs3.getString("MStatus")));
            }
            String sql4 = "Select * from HomeLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst4 = con.prepareStatement(sql4);
            pst4.setString(1, ConnectionUtil.getEmail());
            pst4.setString(2, "Approve");
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                date = format.parse(rs4.getString("SDate"));
                A.add(new ModelTable(rs4.getString("RDate"), rs4.getString("CName"), date, rs4.getString("AStatus"), rs4.getString("MStatus")));
            }
            String sql5 = "Select * from BusinessLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst5 = con.prepareStatement(sql5);
            pst5.setString(1, ConnectionUtil.getEmail());
            pst5.setString(2, "Decline");
            ResultSet rs5 = pst5.executeQuery();
            while (rs5.next()) {
                date = format.parse(rs5.getString("SDate"));
                A.add(new ModelTable(rs5.getString("RDate"), rs5.getString("CName"), date, rs5.getString("AStatus"), rs5.getString("MStatus")));
            }
            String sql6 = "Select * from CarLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst6 = con.prepareStatement(sql6);
            pst6.setString(1, ConnectionUtil.getEmail());
            pst6.setString(2, "Decline");
            ResultSet rs6 = pst6.executeQuery();
            while (rs6.next()) {
                date = format.parse(rs6.getString("SDate"));
                A.add(new ModelTable(rs6.getString("RDate"), rs6.getString("CName"), date, rs6.getString("AStatus"), rs6.getString("MStatus")));
            }
            String sql7 = "Select * from EducationLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst7 = con.prepareStatement(sql7);
            pst7.setString(1, ConnectionUtil.getEmail());
            pst7.setString(2, "Decline");
            ResultSet rs7 = pst7.executeQuery();
            while (rs7.next()) {
                date = format.parse(rs7.getString("SDate"));
                A.add(new ModelTable(rs7.getString("RDate"), rs7.getString("CName"), date, rs7.getString("AStatus"), rs7.getString("MStatus")));
            }
            String sql8 = "Select * from HomeLoan2 where AEmail = ? and AStatus = ?";
            PreparedStatement pst8 = con.prepareStatement(sql8);
            pst8.setString(1, ConnectionUtil.getEmail());
            pst8.setString(2, "Decline");
            ResultSet rs8 = pst8.executeQuery();
            while (rs8.next()) {
                date = format.parse(rs8.getString("SDate"));
                A.add(new ModelTable(rs8.getString("RDate"), rs8.getString("CName"), date, rs8.getString("AStatus"), rs8.getString("MStatus")));
            }
            if (A.size() == 1) {
                A.get(0).SDate = A.get(0).Sdate.toString();
                oblist.add(A.get(0));
            } else if (A.size() == 0) {
            } else {
                for (int i = 0; i < A.size() - 1; i++) {
                    for (int j = 0; j < A.size() - 1; j++) {
                        if (A.get(j).Sdate.compareTo(A.get(j + 1).Sdate) < 0) {
                            B = A.get(j);
                            A.set(j, A.get(j + 1));
                            A.set(j + 1, B);
                        }
                    }
                }
                for (int i = 0; i < A.size(); i++) {
                    A.get(i).SDate = A.get(i).Sdate.toString();
                    oblist.add(A.get(i));
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return oblist;
    }

    protected void AbuttonHandle(javafx.event.ActionEvent actionEvent) {
        if (LoanType == "H") {
            AgentRequestPage01Controller.Reference = Reference;
            AgentRequestPage01Controller.Type = LoanType;
            AgentRequestPage02hController A = new AgentRequestPage02hController();
            AgentNaviBarController.changePage(A);
        } else if (LoanType == "C") {
            AgentRequestPage01Controller.Reference = Reference;
            AgentRequestPage01Controller.Type = LoanType;
            AgentRequestPage02cController A = new AgentRequestPage02cController();
            AgentNaviBarController.changePage(A);
        } else if (LoanType == "E") {
            AgentRequestPage01Controller.Reference = Reference;
            AgentRequestPage01Controller.Type = LoanType;
            AgentRequestPage02eController A = new AgentRequestPage02eController();
            AgentNaviBarController.changePage(A);
        } else if (LoanType == "B") {
            AgentRequestPage01Controller.Reference = Reference;
            AgentRequestPage01Controller.Type = LoanType;
            AgentRequestPage02bController A = new AgentRequestPage02bController();
            AgentNaviBarController.changePage(A);
        }
    }

    protected void MbuttonHandle(javafx.event.ActionEvent actionEvent) {
        if (LoanType == "H") {
            ManagerRequestPage01Controller.Reference = Reference;
            ManagerRequestPage02hController A = new ManagerRequestPage02hController();
            ManagerNaviBarController.changePage(A);
        } else if (LoanType == "C") {
            ManagerRequestPage01Controller.Reference = Reference;
            ManagerRequestPage02cController A = new ManagerRequestPage02cController();
            ManagerNaviBarController.changePage(A);
        } else if (LoanType == "E") {
            ManagerRequestPage01Controller.Reference = Reference;
            ManagerRequestPage02eController A = new ManagerRequestPage02eController();
            ManagerNaviBarController.changePage(A);
        } else if (LoanType == "B") {
            ManagerRequestPage01Controller.Reference = Reference;
            ManagerRequestPage02bController A = new ManagerRequestPage02bController();
            ManagerNaviBarController.changePage(A);
        }
    }

    protected void UButtonHandle(javafx.event.ActionEvent actionEvent) {
        System.out.println("OPEN");
        if (LoanType == "BusinessLoan") {
            System.out.println("B");
            String a = ConnectionUtil.getBResult(Reference);
            System.out.println(a);
            if (a.equals("Approve"))
            {
            ConnectionUtil.UserBgetFile(LoanType, Reference);
            JOptionPane.showMessageDialog(null, "Your loan file already download at your " + ConnectionUtil.getEmail() +" folder file name is "+ LoanType + Reference + ".pdf");
            }
            else if (a.equals("InProgress"))
            {
                JOptionPane.showMessageDialog(null, "Please wait a little more we are currently checking your loan request");
            }
            else if (a.equals("Decline"))
            {
                JOptionPane.showMessageDialog(null, "Sorry but your lone was decline");
            }
            
        } else if (LoanType == "CarLoan") {
            System.out.println("C");
            String a = ConnectionUtil.getCResult(Reference);
            System.out.println(a);
             if (a.equals("Approve"))
             {
            ConnectionUtil.UserCgetFile(LoanType, Reference);
            JOptionPane.showMessageDialog(null, "Your loan file already download at your " + ConnectionUtil.getEmail() +" folder file name is "+ LoanType + Reference + ".pdf");
             }
             else if (a.equals("InProgress"))
            {
                JOptionPane.showMessageDialog(null, "Please wait a little more we are currently checking your loan request");
            }
            else if (a.equals("Decline"))
            {
                JOptionPane.showMessageDialog(null, "Sorry but your lone was decline");
            }
            
        } else if (LoanType == "HomeLoan") {
            String a =ConnectionUtil.getHResult(Reference);
             System.out.println(a);
             if (a.equals("Approve"))
             {
            ConnectionUtil.UserHgetFile(LoanType, Reference);
            JOptionPane.showMessageDialog(null, "Your loan file already download at your " + ConnectionUtil.getEmail() +" folder file name is "+ LoanType + Reference + ".pdf");
             }
             else if (a.equals("InProgress"))
            {
                JOptionPane.showMessageDialog(null, "Please wait a little more we are currently checking your loan request");
            }
            else if (a.equals("Decline"))
            {
                JOptionPane.showMessageDialog(null, "Sorry but your lone was decline");
            }
            
        } else if (LoanType == "EducationLoan") { 
            System.out.println("E");
            String a = ConnectionUtil.getEResult(Reference);
            System.out.println(a);
             if (a.equals("Approve"))
             {
                ConnectionUtil.UserEgetFile(LoanType, Reference);
                JOptionPane.showMessageDialog(null, "Your loan file already download at your " + ConnectionUtil.getEmail() +" folder file name is "+ LoanType + Reference + ".pdf");
             }
             else if (a.equals("InProgress"))
            {
                JOptionPane.showMessageDialog(null, "Please wait a little more we are currently checking your loan request");
            }
            else if (a.equals("Decline"))
            {
                JOptionPane.showMessageDialog(null, "Sorry but your lone was decline");
            }
            
    }
    }

    public static ObservableList UserStatusConnection() {
        ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
        ArrayList<ModelTable> A = new ArrayList<ModelTable>();
        ModelTable B;
        SimpleDateFormat format = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);
        Date date = new Date();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where CEmail = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ConnectionUtil.getEmail());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                date = format.parse(rs.getString("RDate"));
                A.add(new ModelTable(date, "BusinessLoan", rs.getString("MStatus"), rs.getInt("sno"), 0));
            }
            String sql2 = "Select * from CarLoan2 where CEmail = ?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.setString(1, ConnectionUtil.getEmail());
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                date = format.parse(rs2.getString("RDate"));
                A.add(new ModelTable(date, "CarLoan", rs2.getString("MStatus"), rs2.getInt("sno"), 0));
            }
            String sql3 = "Select * from EducationLoan2 where CEmail = ?";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, ConnectionUtil.getEmail());
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                date = format.parse(rs3.getString("RDate"));
                A.add(new ModelTable(date, "EducationLoan", rs3.getString("MStatus"), rs3.getInt("sno"), 0));
            }
            String sql4 = "Select * from HomeLoan2 where CEmail = ?";
            PreparedStatement pst4 = con.prepareStatement(sql4);
            pst4.setString(1, ConnectionUtil.getEmail());
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                date = format.parse(rs4.getString("RDate"));
                A.add(new ModelTable(date, "HomeLoan", rs4.getString("MStatus"), rs4.getInt("sno"), 0));
            }
            if (A.size() == 1) {
                oblist.add(new ModelTable(A.get(0).Rdate.toString(), A.get(0).LoanType.toString(), A.get(0).MStatus.toString(), A.get(0).Reference, 0));
            } else if (A.size() == 0) {
            } else {
                for (int i = 0; i < A.size() - 1; i++) {
                    for (int j = 0; j < A.size() - 1; j++) {
                        if (A.get(j).Rdate.compareTo(A.get(j + 1).Rdate) < 0) {
                            B = A.get(j);
                            A.set(j, A.get(j + 1));
                            A.set(j + 1, B);
                        }
                    }
                }
                for (int i = 0; i < A.size(); i++) {
                    oblist.add(new ModelTable(A.get(i).Rdate.toString(), A.get(i).LoanType.toString(), A.get(i).MStatus.toString(), A.get(i).Reference, 0));
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return oblist;
    }

    public static ObservableList ManagerLoanConnectionCreate() {
        ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
        try {
            ArrayList<ModelTable> A = new ArrayList<ModelTable>();
            ModelTable B;
            SimpleDateFormat format = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                    Locale.ENGLISH);
            Date date = new Date();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where AStatus = ? and MStatus = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Approve");
            pst.setString(2, "InProgress");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                date = format.parse(rs.getString("RDate"));
                A.add(new ModelTable(date, rs.getString("CName"), rs.getString("AName"), "B", rs.getInt("sno")));
                System.out.println(date.toString());
            }
            String sql2 = "Select * from CarLoan2 where AStatus = ? and MStatus = ?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.setString(1, "Approve");
            pst2.setString(2, "InProgress");
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                date = format.parse(rs2.getString("RDate"));
                A.add(new ModelTable(date, rs2.getString("CName"), rs2.getString("AName"), "C", rs2.getInt("sno")));
                System.out.println(date.toString());
            }
            String sql3 = "Select * from EducationLoan2 where AStatus = ? and MStatus = ?";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, "Approve");
            pst3.setString(2, "InProgress");
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                date = format.parse(rs3.getString("RDate"));
                A.add(new ModelTable(date, rs3.getString("CName"), rs3.getString("AName"), "E", rs3.getInt("sno")));
                System.out.println(date.toString());
            }
            String sql4 = "Select * from HomeLoan2 where AStatus = ? and MStatus = ?";
            PreparedStatement pst4 = con.prepareStatement(sql4);
            pst4.setString(1, "Approve");
            pst4.setString(2, "InProgress");
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                date = format.parse(rs4.getString("RDate"));
                A.add(new ModelTable(date, rs4.getString("CName"), rs4.getString("AName"), "H", rs4.getInt("sno")));
                System.out.println(date.toString());
            }
            if (A.size() == 1) {
                oblist.add(new ModelTable(A.get(0).Rdate.toString(), A.get(0).Name, A.get(0).AName.toString(), A.get(0).LoanType.toString(), A.get(0).Reference));
            } else if (A.size() == 0) {
            } else {
                for (int i = 0; i < A.size() - 1; i++) {
                    for (int j = 0; j < A.size() - 1; j++) {
                        if (A.get(j).Rdate.compareTo(A.get(j + 1).Rdate) < 0) {
                            B = A.get(j);
                            A.set(j, A.get(j + 1));
                            A.set(j + 1, B);
                        }
                    }
                }
                for (int i = 0; i < A.size(); i++) {
                    oblist.add(new ModelTable(A.get(i).Rdate.toString(), A.get(i).Name, A.get(i).AName.toString(), A.get(i).LoanType.toString(), A.get(i).Reference));
                    System.out.println(A.get(i).Rdate.toString());
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return oblist;
    }

    public static ObservableList ManagerHistoryConnectionCreate() {
        ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
        ArrayList<ModelTable> A = new ArrayList<ModelTable>();
        ModelTable B;
        SimpleDateFormat format = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);
        Date date = new Date();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from BusinessLoan2 where MStatus = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Approve");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                date = format.parse(rs.getString("SDate"));
                A.add(new ModelTable(rs.getString("RDate"), rs.getString("CName"), rs.getString("AName"), date, rs.getString("MStatus"), 0));
            }
            String sql2 = "Select * from CarLoan2 where MStatus = ?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.setString(1, "Approve");
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                date = format.parse(rs2.getString("SDate"));
                A.add(new ModelTable(rs2.getString("RDate"), rs2.getString("CName"), rs2.getString("AName"), date, rs2.getString("MStatus"), 0));
            }
            String sql3 = "Select * from EducationLoan2 where MStatus = ?";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, "Approve");
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                date = format.parse(rs3.getString("SDate"));
                A.add(new ModelTable(rs3.getString("RDate"), rs3.getString("CName"), rs3.getString("AName"), date, rs3.getString("MStatus"), 0));
            }
            String sql4 = "Select * from HomeLoan2 where MStatus = ?";
            PreparedStatement pst4 = con.prepareStatement(sql4);
            pst4.setString(1, "Approve");
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                date = format.parse(rs4.getString("SDate"));
                A.add(new ModelTable(rs4.getString("RDate"), rs4.getString("CName"), rs4.getString("AName"), date, rs4.getString("MStatus"), 0));
            }
            String sql5 = "Select * from BusinessLoan2 where MStatus = ?";
            PreparedStatement pst5 = con.prepareStatement(sql5);
            pst5.setString(1, "Decline");
            ResultSet rs5 = pst5.executeQuery();
            while (rs5.next()) {
                date = format.parse(rs5.getString("SDate"));
                A.add(new ModelTable(rs5.getString("RDate"), rs5.getString("CName"), rs5.getString("AName"), date, rs5.getString("MStatus"), 0));
            }
            String sql6 = "Select * from CarLoan2 where MStatus = ?";
            PreparedStatement pst6 = con.prepareStatement(sql6);
            pst6.setString(1, "Decline");
            ResultSet rs6 = pst6.executeQuery();
            while (rs6.next()) {
                date = format.parse(rs6.getString("SDate"));
                A.add(new ModelTable(rs6.getString("RDate"), rs6.getString("CName"), rs6.getString("AName"), date, rs6.getString("MStatus"), 0));
            }
            String sql7 = "Select * from EducationLoan2 where MStatus = ?";
            PreparedStatement pst7 = con.prepareStatement(sql7);
            pst7.setString(1, "Decline");
            ResultSet rs7 = pst7.executeQuery();
            while (rs7.next()) {
                date = format.parse(rs7.getString("SDate"));
                A.add(new ModelTable(rs7.getString("RDate"), rs7.getString("CName"), rs7.getString("AName"), date, rs7.getString("MStatus"), 0));
            }
            String sql8 = "Select * from HomeLoan2 where MStatus = ?";
            PreparedStatement pst8 = con.prepareStatement(sql8);
            pst8.setString(1, "Decline");
            ResultSet rs8 = pst8.executeQuery();
            while (rs8.next()) {
                date = format.parse(rs8.getString("SDate"));
                A.add(new ModelTable(rs8.getString("RDate"), rs8.getString("CName"), rs8.getString("AName"), date, rs8.getString("MStatus"), 0));
            }
            if (A.size() == 1) {
                A.get(0).SDate = A.get(0).Sdate.toString();
                oblist.add(A.get(0));
            } else if (A.size() == 0) {
            } else {
                for (int i = 0; i < A.size() - 1; i++) {
                    for (int j = 0; j < A.size() - 1; j++) {
                        if (A.get(j).Sdate.compareTo(A.get(j + 1).Sdate) < 0) {
                            B = A.get(j);
                            A.set(j, A.get(j + 1));
                            A.set(j + 1, B);
                        }
                    }
                }
                for (int i = 0; i < A.size(); i++) {
                    A.get(i).SDate = A.get(i).Sdate.toString();
                    oblist.add(A.get(i));
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return oblist;
    }
}
