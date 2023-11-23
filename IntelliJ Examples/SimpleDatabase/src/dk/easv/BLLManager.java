package dk.easv;

import dk.easv.be.Person;
import dk.easv.dal.IPersonDAO;
import dk.easv.dal.PersonDAO;

public class BLLManager {
    IPersonDAO personDAO = new PersonDAO();
    public void createPerson(Person p) throws PetShopException {
        if(!isEmailValid(p.getEmail()))
            throw new PetShopException("Email is not valid: " + p.getEmail());
        personDAO.createPerson(p);
    }

    private boolean isEmailValid(String email){
        return false;
    }
}
