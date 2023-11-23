package dk.easv.gui;

import dk.easv.be.Person;
import dk.easv.be.Pet;
import dk.easv.bll.BLLManager;
import dk.easv.exceptions.PetShopException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
    private final ObservableList<Person> persons;
    private final ObservableList<Pet> pets;

    private BLLManager bll = new BLLManager();

    public Model() {
        persons = FXCollections.observableArrayList();
        pets = FXCollections.observableArrayList();
    }

    public ObservableList<Person> getPersons() {
        return persons;
    }

    public ObservableList<Pet> getPets() {
        return pets;
    }

    public void loadOwners() {
        persons.clear();
        persons.addAll(bll.getAllPersons());
    }

    public void loadPets(Person selected) throws PetShopException {
        pets.clear();
        pets.addAll(bll.getPetsFromOwner(selected));
    }
}
