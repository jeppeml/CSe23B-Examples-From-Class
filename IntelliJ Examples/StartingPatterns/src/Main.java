import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicManager lm = LogicManager.createLogicManager();

        System.out.println("Hello world!");

        Lion aslan = new Lion();
        aslan.setEatMethod(new Carnivore());

        Giraffe g = new Giraffe();
        g.setEatMethod(new Herbivore());

        List<Person> persons = new ArrayList<>();
        Person p1 = new Person(3, "Peter");
        Person p2 = new Person(3, "Peter");

        persons.add(p1);
        persons.add(p2);

        if(p1.equals(p2))
            System.out.println("p1 equals p2");
        else
            System.out.println("p1 is not p2");
        Person other = new Person(3, "Peter");
        System.out.println(persons.contains(other));
    }
}