package dk.easv.dal;

import dk.easv.PetShopException;
import dk.easv.be.Pet;
import java.util.List;

public interface IPetDAO {
    public Pet getPet(int id);
    public void deletePet(int id);
    public void updatePet(Pet p);
    public void createPet(Pet p);
    public List<Pet> getAllPets();
    public List<Pet> getPetsFromOwner(int ownerId) throws PetShopException;
}
