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
     
    /**
     * Create a new key.
     * Constructor
     */
     
    public Key(String keyName, String soundFile)
    {
        //Key begins in the "up" position
        isDown = false;
        
        //Initialize the key and sound instance variable
        key = keyName;
        sound = soundFile;
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
        if (!isDown && Greenfoot.isKeyDown(key) )
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
        }
        
        if (isDown == true && Greenfoot.isKeyDown(key) == false)
        {
            setImage("white-key.png");
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
     
}

