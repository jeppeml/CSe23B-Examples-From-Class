import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonDBDAO {
    private ConnectionManager cm = new ConnectionManager();
    public void add(Person p){

        try(Connection con = cm.getConnection()){
            String sql = "INSERT INTO PersonsTest VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,p.getId());
            ps.setString(2, p.getFirst_name());
            ps.setString(3, p.getLast_name());
            ps.setString(4, p.getEmail());
            ps.executeUpdate();

        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addAll(List<Person> persons){
        for(Person p: persons) {
            try (Connection con = cm.getConnection()) {
                String sql = "INSERT INTO PersonsTest VALUES(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, p.getId());
                ps.setString(2, p.getFirst_name());
                ps.setString(3, p.getLast_name());
                ps.setString(4, p.getEmail());
                ps.executeUpdate();
            } catch (SQLServerException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void addAllBatch(List<Person> persons){
        try (Connection con = cm.getConnection()) {
            String sql = "INSERT INTO PersonsTest VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            for(Person p: persons) {
                ps.setInt(1, p.getId());
                ps.setString(2, p.getFirst_name());
                ps.setString(3, p.getLast_name());
                ps.setString(4, p.getEmail());
                ps.addBatch();
            }
            ps.executeBatch();
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
