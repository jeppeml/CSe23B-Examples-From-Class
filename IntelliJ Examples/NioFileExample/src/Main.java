import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) throws IOException {
        Wombat henrik = new Wombat(666);
        henrik.setName("Henrik 1st");
        henrik.setWeight(66);
        Wombat henrik2 = new Wombat(999,"Henrik 2nd", 89);
        WombatFileHandler wf = new WombatFileHandler();
        wf.addWombat(henrik);
        wf.addWombat(henrik2);
        System.out.println("Hello world!");
    }


}