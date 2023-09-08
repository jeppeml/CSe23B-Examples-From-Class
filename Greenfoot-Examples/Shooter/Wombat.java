import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends SmoothMover
{
    private int firingRate = 20;
    private int bananaCounter = firingRate;
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        bananaCounter--;
        if(Greenfoot.isKeyDown("space")){
            if (bananaCounter<=0)
            {
                Banana b = new Banana();
                b.setRotation(getRotation());
                getWorld().addObject(b,getX(),getY());
                bananaCounter=firingRate;
            }
            
        }
        
        if(Greenfoot.isKeyDown("right")){
            setRotation(getRotation()+4);
        }
    }    
}
