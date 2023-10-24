public class Chicken extends Animal implements IFlyable, IEggLaying{
    @Override
    public void makeSound() {
        System.out.println("GOOOOK!");
    }

    @Override
    public void fly() {
        System.out.println("Chicken: Weeee! i'm flying, look at me!");
    }

    @Override
    public void a() {

    }

    @Override
    public void layEgg() {
        makeSound();
        System.out.println("<Chicken lays egg>");
    }
}
