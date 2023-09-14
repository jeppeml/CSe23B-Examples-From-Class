import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private List<Waypoint> waypoints = new ArrayList();
    private List<Horse> winners = new ArrayList();
    Odds odds;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1220, 768, 1); 
        createStartInstances();
        //this.odds = odds;
    }
    
    public Waypoint getWaypoint(int id){
        return waypoints.get(id);
    }
    
    public int getLastWaypointId(){
        return waypoints.size()-1;
    }
    
    public void addWinner(Horse horse){
        winners.add(horse);
        odds.setWinner(horse);
    }
    
    public void createStartInstances(){
        // Creates odds and horses
        odds = new Odds();
        odds.createHorseAndOdds();
        odds.placeHorses(this);
        addObject(odds, 604, 411);
        
        // Coordinates for waypoints, in order
        int[][] wps = {
            {811,559},
            {885,442},
            {838,267},
            {605,217},
            {380,251},
            {326,398},
            {373,560},
            {700,609}
        };
        
        for(int i = 0;i<wps.length;i++)
        {
             // Create waypoints for horse navigation
             Waypoint wp = new Waypoint();
             waypoints.add(wp);
             addObject(wp, wps[i][0],wps[i][1]);
        }
       
        
    }
    
    
}
