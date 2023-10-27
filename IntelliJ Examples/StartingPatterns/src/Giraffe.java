public class Giraffe {

    private IEat eatMethod;

    public void setEatMethod(IEat method){
        eatMethod = method;
    }

    public void act(){
        // look for nice trees with some cool fruit to take with long neck
        eatMethod.eat();
    }
}
