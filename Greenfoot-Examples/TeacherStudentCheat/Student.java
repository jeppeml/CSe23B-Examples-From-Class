import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Student extends Actor
{
    private boolean isCheating = false;
    private int cheatCounter = 0;
    
    public void act() 
    {
        cheatCounter = cheatCounter + 1;
        if(cheatCounter>Greenfoot.getRandomNumber(600)){
            isCheating = true;
            cheatCounter = 0;
        }
        
        if(isCheating){
            setImage("boy2.png");
        }
        else{
            setImage("boy1.png");
        }
        
    }    
}
