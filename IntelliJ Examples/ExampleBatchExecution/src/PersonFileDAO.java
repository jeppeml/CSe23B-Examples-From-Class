import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PersonFileDAO {
    public List<Person> getAll() throws IOException {
        List<String> s = Files.readAllLines(Path.of("MOCK_DATA (1).csv"));
        List<Person> persons = new ArrayList<>();
        for(String line: s){
            String[] data = line.split(",");
            persons.add(new Person(Integer.parseInt(data[0]),data[1],data[2],data[3]));
        }
        return persons;
    }
}
