import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends SmoothMover
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().giveMonkey()
        
        
        
        
        turnTowards(MyWorld.myMonkey.getX(), MyWorld.myMonkey.getY());
        move(3);
        /*
        if(isAtEdge()){
            getWorld().removeObject(this);
            GameOverWorld gow = new GameOverWorld();
            Greenfoot.setWorld(gow);
        }*/
    }    
}
