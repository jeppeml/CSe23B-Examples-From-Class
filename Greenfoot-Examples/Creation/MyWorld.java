import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int countActs = 0;
    public MyWorld()
    {    
        super(1200, 700, 1); 
        Fish fishie = new Fish();
        addObject(fishie, 100, 550);
    }
    
    public void act(){
        countActs++;
        if(countActs>=30){
            spawnBurger();
            countActs=0;
        }
        
    }
    
    private void spawnBurger(){
        int x = Greenfoot.getRandomNumber(1200);
        Hamburger burger = new Hamburger();
        addObject(burger, x, 0);
    }
}
