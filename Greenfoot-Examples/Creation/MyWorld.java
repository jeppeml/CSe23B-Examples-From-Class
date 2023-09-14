import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MyWorld extends World
{
    private long countActs = 0;
    private Fish fishie;
    private Counter healthCounter = new Counter("Health:  ");
    private Counter hungerCounter = new Counter("Hunger:  ");
    private Counter levelCounter = new Counter("Level:  ");
    
    public MyWorld()
    {    
        super(1200, 700, 1); 
        fishie = new Fish();
        addObject(fishie, 100, 550);
        addObject(healthCounter, 75, 650);
        addObject(hungerCounter, 75, 680);
        addObject(levelCounter, 75, 620);
        updateCounters();
    }
    
    private void updateCounters(){
        double fishHunger = fishie.getHunger();
        hungerCounter.setValue((int)fishHunger);
        
        int fishHp = fishie.getHp();
        healthCounter.setValue(fishHp);
    }
    
    public void act(){
        countActs++;
        if(countActs%30==0){
            spawnBurger();
        }
        
        if(countActs%150==0){
            spawnMushroom();
        }
        
        if(countActs%450==0){
            spawnHeart();
        }
        
        updateCounters();
        
        List<Hamburger> allBurgersOnScreen = getObjects(Hamburger.class);
        
        Hamburger closest = null;
        int distance = 0;
        /*
        for(int i=0;i<allBurgersOnScreen.size();i++){
            Hamburger someBurger = allBurgersOnScreen.get(i);
            if (someBurger.getY()<distance){
                distance = someBurger.getY();
                closest = someBurger;
                someBurger.setRotation(45);
            }
            else
                someBurger.setRotation(90);
        }*/
        
        for(Hamburger someBurger : allBurgersOnScreen)
        {
            if (someBurger.getY()>=distance){
                distance = someBurger.getY();
                closest = someBurger;
            }
            someBurger.setRotation(90);
        }
        if(closest!=null)
            closest.setRotation(15);
        
        levelCounter.setValue(fishie.getLevel());
    }
    
    private void spawnMushroom(){
        int x = Greenfoot.getRandomNumber(1200);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, x, 0);
    }
    
    private void spawnHeart(){
        int x = Greenfoot.getRandomNumber(1200);
        Heart heart = new Heart();
        addObject(heart, x, 0);
    }
    
    private void spawnBurger(){
        int x = Greenfoot.getRandomNumber(1200);
        Hamburger burger = new Hamburger();
        addObject(burger, x, 0);
    }
}
