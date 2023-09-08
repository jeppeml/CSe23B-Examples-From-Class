import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    public Classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        Teacher mrT = new Teacher();
        addObject(mrT, 460, 600);
        
        // First row
        Table t = new Table();
        addObject(t, 160, 200);
        addObject(new Student(), 160, 150);
        
        Table t2 = new Table();
        addObject(t2, 460, 200);
        addObject(new Student(), 460, 150);
        
        Table t3 = new Table();
        addObject(t3, 760, 200);
        addObject(new Student(), 760, 150);
        
        // Second row
        Table t4 = new Table();
        addObject(t4, 160, 350);
        addObject(new Student(), 160, 300);
        
        Table t5 = new Table();
        addObject(t5, 460, 350);
        addObject(new Student(), 460, 300);
        
        Table t6 = new Table();
        addObject(t6, 760, 350);
        addObject(new Student(), 760, 300);
        
    }
}
