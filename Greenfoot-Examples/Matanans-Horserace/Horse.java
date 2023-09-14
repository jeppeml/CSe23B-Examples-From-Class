import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Horse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Horse extends StaticSmoothMover
{
    private String asciiLook;
    private String name;
    private int odds;
    private int waypointId=0;
    private int randomX=Greenfoot.getRandomNumber(40)-20;
    private int randomY=Greenfoot.getRandomNumber(40)-20;
    private boolean keepMoving=true;

    public Horse(String asciiLook, String name, int odds){
        this.asciiLook = asciiLook;
        this.name = name;
        this.odds = odds;
        Color bgColor = new Color(0,142,0);
        GreenfootImage gimg = new GreenfootImage(32,32);
        gimg.setFont(new Font("Lucida Console", false, false, 20));
        gimg.setColor(Color.BLACK);
        gimg.drawString(asciiLook, 0, 32);
        setImage(gimg);
    } 

    public String getLooks(){
        return asciiLook;
    }

    public String getName(){
        return name;
    }

    public int getOdds(){
        return odds;
    }

    /**
     * Act - do whatever the Horse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(keepMoving)
        {
            MyWorld mw = (MyWorld)getWorld();
            int last = mw.getLastWaypointId();
            Waypoint wp = mw.getWaypoint(waypointId);
            if(waypointId==last)
            {
                randomX=10;
                if(wp.getX()<=this.getX())
                {
                    keepMoving=false;
                    mw.addWinner(this);
                }
            }
            if(calcDistance(wp, this)<30 && waypointId<last)
            {
                waypointId++;
                randomX = Greenfoot.getRandomNumber(40)-20;
                randomY = Greenfoot.getRandomNumber(40)-20;
            }

            moveTowards(wp.getX()+randomX, wp.getY()+randomY, Greenfoot.getRandomNumber(3)+1);
            

            int booster = Greenfoot.getRandomNumber(7)+0;
            if(booster==0)
            {
                Greenfoot.getRandomNumber(4);
            }
        }
    }
    /*
    private void moveTowards(int x, int y, int moveLength){
        
        turnTowards(x,y);
        move(moveLength);
        
    }*/

    private int calcDistance(Actor a, Actor b){
        double distance = Math.sqrt(
                Math.pow(a.getX()-b.getX(),2) + 
                Math.pow(a.getY()-b.getY(),2)
            );
        return (int)distance;
    }
}
