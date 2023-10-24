import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class CalcController implements Initializable, IStringable {
    List<String> aList;
    List<String> linkList;
    List jList;



    public void initialize(URL location, ResourceBundle resources) {
        aList = new ArrayList();
        aList.add("Hello");


        linkList = new LinkedList();
        linkList.add("Rhello");

        jList = new JeppeList();

        System.out.println("It is ALIVE!!!");

    }

    @Override
    public String getObjectAsString() {
        return "This is the CalcController speaking";
    }
}
