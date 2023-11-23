package dk.easv.gui;

import dk.easv.bll.BLLManager;
import dk.easv.exceptions.PetShopException;
import dk.easv.be.Person;
import dk.easv.be.Pet;
import dk.easv.dal.IPersonDAO;
import dk.easv.dal.IPetDAO;
import dk.easv.dal.PersonDAO;
import dk.easv.dal.PetDAO;

public class MainUI {
    public void run(){

        IPersonDAO mgr = new PersonDAO();
        IPetDAO petDAO = new PetDAO();

        for(Person p: mgr.getAllPersons()){
            System.out.println("Person: " + p);
        }
        try {
            for(Pet p: petDAO.getPetsFromOwner(3)){
                System.out.println("Pet: " + p);
            }
        } catch (PetShopException e) {
            System.err.println("You have a problem: " + e.getMessage());
        }

        BLLManager bll = new BLLManager();

        try {
            bll.createPerson(new Person("Jeppe", "invalidmail"));
        } catch (PetShopException e) {
            System.err.println("There is a problem: " +  e.getMessage());
        }


        //Person per = new Person(5,"Henrik the nice guy", "hk3st@easv.dk");
        //mgr.createPerson(per);
        //mgr.updatePerson(per);
        //mgr.deletePerson(6);
        Person p = mgr.getPerson(5);
        System.out.println("Person no 5: " + p);
        /*
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        for(Person p: mgr.getAllPersons()){
            System.out.println("Person: " + p);
        }
        */

        System.out.println("Done...");
    }
}
