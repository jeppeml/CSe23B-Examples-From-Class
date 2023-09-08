import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hamburger extends Actor
{
    // Constructor
    public Hamburger(){
        turn(90);
    }
    
    public void act() 
    {
        move(5);
        if(getY()>=699){
            getWorld().removeObject(this);
        }
    }    
}
