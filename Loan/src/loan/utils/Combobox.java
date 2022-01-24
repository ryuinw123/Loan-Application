package loan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class Combobox {

    public static void CarCombobox(ComboBox A) {
        ObservableList<String> options = FXCollections.observableArrayList("Microcar", "Subcompact Car", "Compact Car", "Mid-size car", "Entry-level luxury car", "Full-size car", "Mid-size luxury car", "Full-size luxury car", "Sports car", "Grand tourer", "Supercar", "LAV", "Mini MPV", "Compact Minivan", "Minivan", "Mini SUV", "Compact SUV", "Mid-size SUV", "Full-size SUV", "Mini pickup truck", "Mid-size pickup truck", "Full-size pickup truck");
        A.getItems().addAll(options);
    }

    public static void BusinessCombobox(ComboBox A) {
        ObservableList<String> options = FXCollections.observableArrayList("Company Limited", "Partnership Limited", "Public Company Limited", "Incorporated");
        A.getItems().addAll(options);
    }

    public static ObservableList AgentChoose() {
        ObservableList<String> oblist = FXCollections.observableArrayList();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ryuinw123.ddns.net:1433;databaseName=test;user=sa;password=Ryufah12";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from LoginDB3 where Role = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Agent");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                oblist.add(rs.getString("Name"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return oblist;
    }

    public static void careerBox(ComboBox A) {
        ObservableList<String> options = FXCollections.observableArrayList("Government official", "Government  Employee", "Employee", "Self-employed", "Businessman", "Freelance", "Student", "College student", "Agriculturist", "Other(Editcareer)");
        A.getItems().addAll(options);
    }
}
