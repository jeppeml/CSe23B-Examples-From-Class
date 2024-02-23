import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class CalcController {

    public Label lblSomething;

    public void plzClick(ActionEvent actionEvent) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Platform.runLater(()->{
                    lblSomething.setText("Slept for a second");
                });

                System.out.println("Slept for a second: " + i);
            }

        });
        t.start();

        Alert a = new Alert(Alert.AlertType.ERROR,"WOWs");
        a.show();
    }
}
