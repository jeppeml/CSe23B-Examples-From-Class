package dk.easv.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import dk.easv.be.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManager implements IPersonManager {
    private final SQLServerDataSource ds;
    public PersonManager() {
        ds = new SQLServerDataSource();
        ds.setDatabaseName("CSe23B_31_School");
        ds.setUser("CSe2023b_e_31");
        ds.setPassword("CSe2023bE31#23");
        ds.setServerName("EASV-DB4");
        ds.setTrustServerCertificate(true);
    }

    @Override
    public Person getPerson(int id) {
        try(Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Persons WHERE id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int pid          = rs.getInt("id");
                String name     = rs.getString("name");
                String email    = rs.getString("email");

                Person p = new Person(pid, name, email);
                return p;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePerson(int id) {
        try(Connection con = ds.getConnection())
        {
            String sql = "DELETE FROM persons WHERE id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePerson(Person p) {
        try(Connection con = ds.getConnection())
        {
            String sql = "UPDATE persons SET name=?, email=? WHERE id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getEmail());
            pstmt.setInt(3, p.getId());
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPerson(Person p) {
        try(Connection con = ds.getConnection())
        {
            String sql = "INSERT INTO persons(name, email) VALUES (?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getEmail());
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Person> getAllPersons() {

        List<Person> persons = new ArrayList<>();

        try(Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Persons";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id          = rs.getInt("id");
                String name     = rs.getString("name");
                String email    = rs.getString("email");

                Person p = new Person(id, name, email);
                persons.add(p);
            }
            return persons;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
