import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        PersonFileDAO mock = new PersonFileDAO();
        PersonDBDAO db = new PersonDBDAO();
        List<Person> persons = mock.getAll();
        long startTime = System.currentTimeMillis();
        for(Person p : persons){
            db.add(p);
            System.out.println("added: " + p);
        }
        System.out.println("No batch: " + (System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();        
        db.addAllBatch(persons);
        System.out.println("Batch: " + (System.currentTimeMillis()-startTime));
    }
}