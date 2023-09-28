import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start method called!");
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("CalcView.fxml"));
        
    }
}