import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables (can be used anywhere below)
     */
    //primitive date type
    int frames;
    //object date type... square brackets[] indicate an array(a list)
    String[] studentNames = { "Sarah", "Chelsea", "Jack", "Maxwell", "Gavin", 
            "Minah", "Brandon", "Jeewoo", "Peter", "Justy"};
    public Piano() 
    {
        super(800, 340, 1);
        
        //start tracking frames
        frames = 0;
        
        //initialie the array of names
        
    }
    
    /**
     * Act - called repeatedly to create animation
     */
    public void act()
    {
        //keep track of the frames 
        frames +=1;
        
        //show current frame
        showText(""+ frames,100,100);
    }
}