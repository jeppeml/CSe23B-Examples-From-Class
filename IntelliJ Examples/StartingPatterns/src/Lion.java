public class Lion {
    private IEat eatMethod;

    public void setEatMethod(IEat method){
        eatMethod = method;
    }

    public void act(){
        // hunt
        eatMethod.eat();
    }
}
