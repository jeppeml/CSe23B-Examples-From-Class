public abstract class Animal {
    private int hunger = 100;
    public abstract void makeSound();

    public void eat(){
        System.out.println("Animal eating something");
    }
}
