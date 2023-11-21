package dk.easv.gui;

import dk.easv.be.Person;
import dk.easv.dal.IPersonManager;
import dk.easv.dal.PersonManager;

public class MainUI {
    public void run(){
        IPersonManager mgr = new PersonManager();

        for(Person p: mgr.getAllPersons()){
            System.out.println("Person: " + p);
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
