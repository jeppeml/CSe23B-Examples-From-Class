package dk.easv.bll;

import dk.easv.JeppeException;
import dk.easv.be.Wombat;
import dk.easv.dal.WombatFileHandler;

import java.util.ArrayList;
import java.util.List;

public class BLLManager {
    private double leastWeight=15;
    private double highestWeight=140;
    private WombatFileHandler wf = new WombatFileHandler();
    public void updateWombat(Wombat wombat) {
        if(wombat.getWeight()>15 &&
           wombat.getWeight()<140) {
            wf.updateWombat(wombat);
        }
    }

    public List<Wombat> getHeavyWombats(double minWeight){
        List<Wombat> wombats = wf.getAllWombats();
        List<Wombat> heavyWombats = new ArrayList<>();
        for(Wombat w: wombats)
        {
            if (w.getWeight()>=minWeight)
                heavyWombats.add(w);
        }
        return heavyWombats;
    }

    public Wombat getWombat(int id) throws JeppeException {
        return wf.getWombat(id);
    }

    public void deleteWombat(int id){
        wf.deleteWombat(id);
    }

    public List<Wombat> getAllWombats(){
        return wf.getAllWombats();
    }
}
