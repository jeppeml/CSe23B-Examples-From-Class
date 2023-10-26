import java.util.ArrayList;
import java.util.List;

public class Main {

    private int health = 100;
    private static int staticHealth = 100;
    public static void main(String[] args) {
        List<Integer> someNumbers = new ArrayList<>();
        Integer[] someNumberArray = new Integer[5];

        someNumberArray[0] = 1;
        someNumberArray[1] = 6;
        someNumberArray[2] = 9;
        someNumberArray[3] = 13;
        someNumberArray[4] = 3;

        someNumbers.add(1);
        someNumbers.add(6);
        someNumbers.add(9);
        someNumbers.add(13);
        someNumbers.add(3);

        for (Integer i: someNumbers){
            System.out.println(i);
        }

        for (Integer i: someNumbers){
            if(i==19)
                System.out.println("Found number 19");
        }
        Main m =  new Main();
        System.out.println(m.getIndex(someNumbers, 9));


        System.out.println(Main.getIndexStatic(someNumbers, 9));
    }
    private static int getIndexStatic(List<Integer> list, Integer number){
        System.out.println(staticHealth);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==number)
                return i;
        }
        return -1;
    }
    private int getIndex(List<Integer> list, Integer number){
        System.out.println(this.health);
        System.out.println(staticHealth);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==number)
                return i;
        }
        return -1;
    }
}