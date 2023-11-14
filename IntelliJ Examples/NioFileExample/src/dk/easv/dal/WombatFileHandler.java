package dk.easv.dal;

import dk.easv.be.Wombat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class WombatFileHandler {
    private String filename = "wombat.txt";

    public Wombat getWombat(int id){
        List<Wombat> wombats = getAllWombats();
        for(Wombat w: wombats){
            if(w.getId()==id)
                return w;
        }
        return null;
    }
    public void updateWombat(Wombat wombat){
        List<Wombat> wombats = getAllWombats();
        List<String> wombatsChanged = new ArrayList<>();

        for(Wombat w: wombats){
            if(w.getId()==wombat.getId())
                wombatsChanged.add(getStringFromWombat(wombat));
            else
                wombatsChanged.add(getStringFromWombat(w));
        }
        try {
            Files.write(Paths.get(filename), wombatsChanged, TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteWombat(int id){
        List<Wombat> wombats = getAllWombats();
        List<String> wombatsWithout = new ArrayList<>();

        for(Wombat w: wombats){
            if(w.getId()!=id)
                wombatsWithout.add(getStringFromWombat(w));
        }
        try {
            Files.write(Paths.get(filename), wombatsWithout, TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Wombat> getAllWombats(){
        List<Wombat> wombats = new ArrayList();
        try {
            List<String> lines = Files.lines(Paths.get(filename)).toList();
            for(String line : lines){
                Wombat w = getWombatFromString(line);
                wombats.add(w);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wombats;
    }

    public void addWombat(Wombat w){
        try {
            Files.write(Paths.get(filename), (getStringFromWombat(w)+"\n").getBytes(), APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String getStringFromWombat(Wombat w){
        String stringWombat = "";

        stringWombat = stringWombat + w.getId() + ";";
        stringWombat = stringWombat + w.getName() + ";";
        stringWombat = stringWombat + w.getWeight();

        return stringWombat;
    }

    private Wombat getWombatFromString(String s){
        String[] fields = s.split(";");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        double weight = Double.parseDouble(fields[2]);
        Wombat w = new Wombat(id, name, weight);
        return w;
    }
}
