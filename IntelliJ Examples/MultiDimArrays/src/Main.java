import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    String[] game = new String[9];
    String[][] gameMulti = new String[3][3];
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        for (int i = 0; i < gameMulti.length; i++) {
            for (int j = 0; j < gameMulti[0].length; j++) {
                gameMulti[i][j] = "_";
            }
        }
        gameMulti[1][1] = "X";
        for (int i = 0; i < gameMulti.length; i++) {
            System.out.println();
            for (int j = 0; j < gameMulti[0].length; j++) {
                System.out.print(gameMulti[i][j]);
            }
        }

        game[3]="X";
        /*
        for (int i = 0; i < 9; i++) {
            System.out.print(game[i]);
            if(i%3==0)
                System.out.println();
        }
*/
        System.out.println("Start method called!");
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("CalcView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}