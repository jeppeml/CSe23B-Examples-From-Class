import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish extends Actor
{
    private int speed = 3;
    public void act() 
    {
        checkMovementKeys();
        Actor burger = getOneIntersectingObject(Hamburger.class);
        
        if(burger != null){
            getWorld().removeObject(burger);
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
