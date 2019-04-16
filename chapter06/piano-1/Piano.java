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
            
    // Track the white keys and notes
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k","l",
    ";", "'", "\\" };
    String[] whiteNotes = {"3c","3d", "3e", "3f", "3g", "3a", "3b", "4c",
    "4d", "4e", "4f", "4g"};
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
        //Every second say hello to the next person in the list
        //statements in the conditional run only when both conditions are true
        //Boolean AND = &&
        //this block of code runs once per second until the end of the 
        //whiteKyes array
        //NOTE : whiteKyes length automatically returns the corret number
        // of values in the array (so that
        if ( (frames % 60 == 0) && (frames / 60 < whiteKeys.length) )
        {
            
            //showText("Hello" + studentNames[frames / 60], 400, 170);
            
        }
 
        //keep track of the frames 
        frames +=1;
        
        //show current frame
        showText(""+ frames,100,100);
        
        
    }

}

