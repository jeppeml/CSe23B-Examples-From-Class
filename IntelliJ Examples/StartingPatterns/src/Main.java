public class Main {
    public static void main(String[] args) {
        LogicManager lm = LogicManager.createLogicManager();

        System.out.println("Hello world!");

        Lion aslan = new Lion();
        aslan.setEatMethod(new Carnivore());

        Giraffe g = new Giraffe();
        g.setEatMethod(new Herbivore());

        while(true){
            g.act();
            aslan.act();
        }
    }
}