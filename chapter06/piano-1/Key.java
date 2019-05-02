import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{   /**
      * Instance variable
      */
     //tracks whether the piano key down image has already been set or not. 
     //(isDown is a primitive date types- shows in red, type is lowercase)
     private boolean isDown;
     
     //Track what key is being played and what shound file to play
     // (key and sound are object data types - shows in black, type is Capitalized)
     private String key;
     private String sound;
     private boolean isKeyWhite;
    
    /**
     * Create a new key.
     * Constructor
     */
     
    public Key(String keyName, String soundFile,boolean keyWhite)
    {
        //Key begins in the "up" position
        isDown = false;
        
        //Initialize the key and sound instance variable
        key = keyName;
        sound = soundFile;
        
        // Set what type of key this is instance is
        isKeyWhite = keyWhite;
        
        // By default the piano key is white; when black, change the starting
        // image
        if (isKeyWhite == false)
        {
            setImage("black-key.png");
        }
    }
    
    

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //when the key image is NOT already showing "down"
        //AND
        //the "g" key on the keyboard has been pressed
        //!isDown can also isDown == false
        if ( isDown == false && Greenfoot.isKeyDown(key) == true)
        {
            // Make the piano key appear to be down and play the sound
            keyDown();
            play();
            isDown = true;
        }
        
        // When the piano key is down, and the keyboard key was just released
        if ( isDown == true && Greenfoot.isKeyDown(key) == false )
        {
            // Make the piano key appear to be up
            keyUp();
            isDown = false;
        }
    }
    /**
     * play the note of this key
     */
     public void play()
     {
         Greenfoot.playSound(sound + ".wav");
     }
      private void keyDown()
    {
        if (isKeyWhite == true)
        {
            setImage("white-key-down.png");
        }
        else
        {
            setImage("black-key-down.png");
        }
    }
    
    /**
     * Make the piano key appear to be up.
     */
    private void keyUp()
    {
        if (isKeyWhite == true)
        {
            setImage("white-key.png");
        }
        else
        {
            setImage("black-key.png");
        }
    }
}


