import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class WombatFileHandler {
    private String filename = "wombat.txt";

    public void addWombat(Wombat w){
        try {
            Files.write(Paths.get("wombat.txt"), getStringFromWombat(w).getBytes(), APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String getStringFromWombat(Wombat w){
        String stringWombat = "";

        stringWombat = stringWombat + w.getId() + ";";
        stringWombat = stringWombat + w.getName() + ";";
        stringWombat = stringWombat + w.getWeight() + "\n";

        return stringWombat;
    }
}
