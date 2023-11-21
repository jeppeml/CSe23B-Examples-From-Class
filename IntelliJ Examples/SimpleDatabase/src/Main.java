import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setDatabaseName("CSe23B_31_School");
        ds.setUser("CSe2023b_e_31");
        ds.setPassword("CSe2023bE31#23");
        ds.setServerName("EASV-DB4");
        ds.setTrustServerCertificate(true);

        try(Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Persons";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id          = rs.getInt("id");
                String name     = rs.getString("name");
                String email    = rs.getString("email");

                System.out.println(id + ", "+ name + ", " + email);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done...");
    }
}