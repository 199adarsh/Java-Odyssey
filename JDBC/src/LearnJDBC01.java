import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class LearnJDBC01 {

    static void main(String[] args) {

        try {
            //01: Load DB
            Class.forName("Path_to_Driver_Class");

            //02: Connect to DB
            String url = "URL_TO_DB";
            String username = "USERNAME";
            String pass = "PASSWORD";
            Connection c = DriverManager.getConnection(url,username,pass);

            //03: Create Statement
            Statement s = c.createStatement();

            //04: Execute Statement
            String sql = "SQL_Statement_Here";
            s.executeUpdate(sql);

            //05: Close Resources
            s.close();
            c.close();

        } catch (Exception e) {throw new RuntimeException(e);}


    }
}