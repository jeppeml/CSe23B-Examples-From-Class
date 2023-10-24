import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.List;

public class CalcController implements Initializable {
    @FXML
    private FlowPane flow;
    private String[] names = {"Jeppes", "Rhello", "Gnurli", "Knitello", "Fnitello"};
    private String[][] tictac = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List list = new MyList();
        List javaList = new ArrayList();

        // names[5] = "wrong";
        tictac[1][1] = "x";
        for (int x = 0; x < tictac.length; x++) {
            for (int y = 0; y < tictac[x].length; y++) {
                flow.getChildren().add(new Button(tictac[x][y]));

            }
        }
        /*
        for (int i = 0; i < names.length; i++) {
            flow.getChildren().add(new Button(names[i]));
        }
*/
        Concrete c = new Concrete();
        c.saySomething();
        c.saySomethingConcrete();
    }
}
