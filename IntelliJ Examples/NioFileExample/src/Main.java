import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Wombat henrik = new Wombat(666);
        henrik.setName("Henrik 1st");
        henrik.setWeight(66);
        Wombat henrik2 = new Wombat(999,"Henrik 2nd", 89);
        WombatFileHandler wf = new WombatFileHandler();
        wf.addWombat(henrik);
        wf.addWombat(henrik2);*/
        WombatFileHandler wf = new WombatFileHandler();
        //List<Wombat> wombats = wf.getAllWombats();

        wf.updateWombat(new Wombat(666, "Henrik VERY 1st", 42));
/*
        System.out.println("amount of wombats: " + wombats.size());
        for(Wombat w : wombats){
            System.out.println(w.getId() + ", " + w.getName()+ ", " + w.getWeight());
        }

        System.out.println("Wombat no 2: " + wf.getWombat(666).getName());

        wf.deleteWombat(666);


        System.out.println("amount of wombats: " + wombats.size());
        for(Wombat w : wombats){
            System.out.println(w.getId() + ", " + w.getName()+ ", " + w.getWeight());
        }*/

    }


}