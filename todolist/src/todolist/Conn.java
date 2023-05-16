package todolist;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///todolist", "root", "220720100290@cutm.ac.in");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}