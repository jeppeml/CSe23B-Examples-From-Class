import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish extends Actor
{
    private int speed = 3;
    private double hunger = 100.0; // 100 very hungry, 0 not hungry
    private int hp = 500;
    
    public double getHunger(){
        return hunger;
    }
    
    public int getHp(){
        return hp;
    }
    
    public void act() 
    {
        hunger = hunger + 0.3;
        
        if(hunger>=100){
            hunger = 100;
            hp--;
        }
        checkMovementKeys();
        checkAndEatBurger();
        checkAndEatMushroom();
        
        if(hp<=0){
            getWorld().removeObject(this);
        }
    }   
    
    private void checkAndEatMushroom(){
        Actor mushroom = getOneIntersectingObject(Mushroom.class);
            
        if(mushroom != null){
           getWorld().removeObject(mushroom);
           hp = hp - 250;
           if(hp<0){
               hp = 0;
           }
        }
    }
    
    private void checkAndEatBurger(){
        Actor burger = getOneIntersectingObject(Hamburger.class);
            
            if(burger != null){
                getWorld().removeObject(burger);
                hunger = hunger - 25;
                if(hunger<0){
                    hunger = 0;
                }
            }
    }
    
    
    private void checkMovementKeys(){
        if(Greenfoot.isKeyDown("right")){
            move(speed);
        }
        else if(Greenfoot.isKeyDown("left")){
            move(-speed);
        }
    }
    
}
