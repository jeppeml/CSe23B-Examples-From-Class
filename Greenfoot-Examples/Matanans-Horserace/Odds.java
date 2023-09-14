import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Odds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Odds extends Actor
{
    private int numOfHorses = 5;
    private String[] names = {"Gullash Baronen", "Nakkefun", "Anders And", "Bent Bollefed", "Pelle Haleløs"};
    private List<Horse> horses = new ArrayList();
    private Horse winner = null;
    private int ySpacing = 28;

    public void createHorseAndOdds(){
        horses.clear();
        List<String> horseNames = Arrays.asList(names);
       
        Collections.shuffle(horseNames);

        for(String name : horseNames){
            int randomOdds = Greenfoot.getRandomNumber(4)+5;
            String looks= name.substring(0,1);
            Horse h = new Horse(looks, name, randomOdds);
            horses.add(h);
        }
        drawHorseOdds();
    }

    private void drawHorseOdds(){
        GreenfootImage img = getImage();
        img.clear();
        img.setFont(new Font("Lucida Console", false, false, 20));

        String header  = "N Hest                    Odds  ";
        img.drawString(header, 10, ySpacing);

        String divider = "- ----------------------  ------";
        img.drawString(divider, 10, ySpacing*2);

        for(int i = 0; i<horses.size();i++){
            Horse h = horses.get(i);
            String line = h.getLooks() + " " + h.getName();
            int spaceCount = 25 - h.getName().length();

            if(winner==h)
                spaceCount--;
                
            for(int s = 0;s<spaceCount;s++)
                line+= " ";

            if(winner==h)
                line+= "►";
            line+=h.getOdds();
            img.drawString(line, 10, ySpacing*3+ySpacing*i);
        }
        setImage(img);
    }

    public void setWinner(Horse win)
    {
        if(winner==null)
        {
            winner = win;
            System.out.println(winner.getName());
            drawHorseOdds();
        }
    }

    public void placeHorses(World w){
        for(int i = 0; i<horses.size();i++){
            Horse h = horses.get(i);
            w.addObject(h, 680, 563+ySpacing*i);
        }
    }

    /**
     * Act - do whatever the Odds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
