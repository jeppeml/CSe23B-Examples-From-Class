package dk.easv.dal;

import dk.easv.be.Person;

import java.util.List;

public interface IPersonDAO {
    public Person getPerson(int id);
    public void deletePerson(int id);
    public void updatePerson(Person p);
    public void createPerson(Person p);
    public List<Person> getAllPersons();
}
