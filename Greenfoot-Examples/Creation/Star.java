import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends SmoothMover
{
    private int speed = -(Greenfoot.getRandomNumber(3)+1);
    private double incSpeed = speed;
    private int countWait = Greenfoot.getRandomNumber(2000);
    public Star(){
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act() 
    {
        speed = (int)incSpeed;
        
        countWait--;
        if(countWait<0)
        {
            move(speed);
            if(getX()<1 || getX()>=1199 || getY()<1 || getY()>=699){
                this.setLocation(600,360);
                speed = -(Greenfoot.getRandomNumber(3)+1);
                incSpeed=speed;
            }
        }
        
        incSpeed*=1.01;
    }    
}
