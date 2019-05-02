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
    //String[] studentNames = { "Sarah", "Chelsea", "Jack", "Maxwell", "Gavin", 
            //"Minah", "Brandon", "Jeewoo", "Peter", "Justy"};
            
    // Track the white keys and notes
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k","l",
    ";", "'", "\\" };
    String[] whiteNotes = {"3c","3d", "3e", "3f", "3g", "3a", "3b", "4c",
    "4d", "4e", "4f", "4g"};
    String[] blackKeys = {"w", "e", "", "t", "y", "u", "", "o", "p", "",
        "]", " "};
    String[] BlackNotes = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#",
        "4d#", "", "4f", ""};
    public Piano() 
    {
        super(800, 340, 1);

        // First draw all of the white piano keys on the screen
        for (int index = 0; index < whiteKeys.length; index += 1)
        {
            // Create a new Key object
            Key newKey = new Key(whiteKeys[index], whiteNotes[index], true);

            // Add the key object to the scenario
            addObject(newKey, 54 + 63 * index, 140);
        }

        // Now draw all of the black piano keys on the screen
        for (int index = 0; index < blackKeys.length; index += 1)
        {
            // Only add a black key if there is a computer keyboard key
            // set in the blackKeys array at this index
            if (blackKeys[index] != "")
            {
                // Create a new black Key object
                Key newKey = new Key(blackKeys[index], blackKeys[index], false);

                // Add the key object to the scenario
                addObject(newKey, 85 + 63 * index, 86);
            }
        }
    }

}

    
    
    
    



