import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish extends Actor
{
    private double hunger = 100.0; // 100 very hungry, 0 not hungry
    private int maxHp = 1000;
    private int hp = maxHp/2;
    private double speed = 1;
    private double baseSpeed = 3;
    
    
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
        checkAndEatHeart();
        
        if(hp<=0){
            getWorld().removeObject(this);
        }
    }   
    private void checkAndEatHeart(){
        Actor heart = getOneIntersectingObject(Heart.class);
            
        if(heart != null){
           getWorld().removeObject(heart);
           hp = hp + 250;
           if(hp>=maxHp){
               maxHp*=2;
               speed*=1.5;
           }
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
        int movement = (int)(baseSpeed*speed);
        if(movement>10) 
            movement = 10;
            
        if(Greenfoot.isKeyDown("right")){
            move(movement);
        }
        else if(Greenfoot.isKeyDown("left")){
            move(-movement);
        }
    }
    
}
