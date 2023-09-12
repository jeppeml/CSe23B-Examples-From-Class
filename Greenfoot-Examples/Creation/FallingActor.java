import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingActor extends Actor
{
    // Constructor
    public FallingActor(){
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
