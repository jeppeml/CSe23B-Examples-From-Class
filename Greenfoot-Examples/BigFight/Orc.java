import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orc extends Actor
{
    int timeLeftToLive = 140;
    public void act() 
    {
        timeLeftToLive = timeLeftToLive - 1;
        move(3);
        turnTowards(93,282);
        if(timeLeftToLive < 0)
            getWorld().removeObject(this);
        
    }    
}
