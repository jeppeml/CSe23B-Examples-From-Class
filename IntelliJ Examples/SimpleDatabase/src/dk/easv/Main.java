package dk.easv;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import dk.easv.be.Person;
import dk.easv.dal.IPersonManager;
import dk.easv.dal.PersonManager;
import dk.easv.gui.MainUI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainUI ui = new MainUI();
        ui.run();
    }
}