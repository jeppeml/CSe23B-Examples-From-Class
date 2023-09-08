import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int countActs = 0;
    private Fish fishie;
    private Counter healthCounter = new Counter("Health:  ");
    private Counter hungerCounter = new Counter("Hunger:  ");
    
    public MyWorld()
    {    
        super(1200, 700, 1); 
        fishie = new Fish();
        addObject(fishie, 100, 550);
        addObject(healthCounter, 75, 650);
        addObject(hungerCounter, 75, 680);
    }
    
    public void act(){
        countActs++;
        if(countActs>=30){
            spawnBurger();
            countActs=0;
        }
        
        double fishHunger = fishie.getHunger();
        hungerCounter.setValue((int)fishHunger);
        
        int fishHp = fishie.getHp();
        healthCounter.setValue(fishHp);
        
    }
    
    private void spawnBurger(){
        int x = Greenfoot.getRandomNumber(1200);
        Hamburger burger = new Hamburger();
        addObject(burger, x, 0);
    }
}
