import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Wombat w = new Wombat();
        Horse h = new Horse();
        Horse h2 = new Horse();
        Chicken chick = new Chicken();
        animals.add(w);
        animals.add(h);
        animals.add(h2);
        animals.add(chick);
        chick.fly();

        List<IFlyable> flyingAnimals = new ArrayList<>();
        flyingAnimals.add(chick);

        flyingAnimals.get(0).fly();
        for (Animal a:animals) {
            a.makeSound();
        }

        }
    }

