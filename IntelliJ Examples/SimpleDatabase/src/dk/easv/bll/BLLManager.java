package dk.easv.bll;

import dk.easv.exceptions.PetShopException;
import dk.easv.be.Person;
import dk.easv.be.Pet;
import dk.easv.dal.IPersonDAO;
import dk.easv.dal.IPetDAO;
import dk.easv.dal.PersonDAO;
import dk.easv.dal.PetDAO;

import java.util.List;

public class BLLManager {
    IPersonDAO personDAO = new PersonDAO();
    IPetDAO petDAO = new PetDAO();
    public void createPerson(Person p) throws PetShopException {
        if(!isEmailValid(p.getEmail()))
            throw new PetShopException("Email is not valid: " + p.getEmail());
        personDAO.createPerson(p);
    }

    private boolean isEmailValid(String email){
        return (email.contains("@"));
    }

    public List<Person> getAllPersons() {
        return personDAO.getAllPersons();
    }

    public List<Pet> getPetsFromOwner(Person selected) throws PetShopException {
        return petDAO.getPetsFromOwner(selected.getId());
    }
}
