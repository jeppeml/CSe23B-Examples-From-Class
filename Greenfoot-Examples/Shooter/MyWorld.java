import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private Wombat w1;
    private Wombat w2;
    public static Monkey myMonkey; // BAD 
    
    // visibility return_type name (parameters)
    // public|private void|int|string|Monkey jump(type name, type name2)
    
    public MyWorld() // Constructor
    {    
        super(950, 600, 1); 
        spawnWombats(5000);
        
        spawnMonkey();
    }
    
    private int randomNumber(int min, int max){
        int num = Greenfoot.getRandomNumber(max-min)+min;
        return num;
    }
    
    private void spawnWombats(int amount){
        for(int i=0;i<amount;i++){ // repeat this some amount of times
            w1 = new Wombat();
            addObject(w1,randomNumber(100, 200), randomNumber(100, 400));
            w1.setRotation(15);
        }
    }
    
    private void spawnMonkey(){
        myMonkey = new Monkey();
        int aom = Monkey.amountOfMonkeys; // BAD
        addObject(myMonkey, 700, 300);
        Monkey.amountOfMonkeys = aom + 1; // BAD
    }
}
