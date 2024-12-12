import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a chosen dataset
 */
public class DataScene extends Scene {

    // Initialize arrays for planet data
    private String[] planets;      // 1D array of planet names
    private int[] NumberMoons;     // 1D array of number of moons
    private double[] gravity;      // 1D array of gravity values
    private String[] HasRingSystem; // 1D array of ring system (yes or no)

    /** Constructor */
    public DataScene() {
        planets = FileReader.toStringArray("Planets.txt");
        gravity = FileReader.toDoubleArray("gravity.txt");
        NumberMoons = FileReader.toIntArray("NumberMoons.txt");
        HasRingSystem = FileReader.toStringArray("HasRingSystem.txt");
    }

    /**
     * Top-level method to draw the animation
     */
  // Intro screen
    public void drawScene() {
        clear("black");

     setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);

        drawText("Planets of our Solar System!", 42, 190);
        pause(5.0);

        clear("gray");
        pause(0.5);

        // Mercury information - displays gravity and if has rings system (yes or no) (each section)
        drawImage("Screenshot-2024-12-05-10.35.52-AM.png", 0, 0, 150);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Mercury!", 42, 190);
        drawText("Information:", 22, 210);
      drawText ("Gravity: 3.7",33,298);
    drawText("Has Ring System: No", 33, 258);

    

        // Check if Mercury has more than 10 moons 
      // traverses through the NumberMoons.txt and alternates with each planet if has more than 10 moons outputs text
        if (NumberMoons[0] > 10) {
            drawText(planets[0] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);
      
//defines a variable to randomly outputs the location of the image on line 210 
    int randomNum = (int) (Math.random() * 10) + 200;
   
      
        //Venus information
        drawImage("Screenshot-2024-12-05-2.50.03-PM.png", 0, 0, 150);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Venus!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 8.9", 33, 298);
      drawText("Has Ring System: No", 33, 278); 
     

        // Check if Venus has more than 10 moons
        if (NumberMoons[1] > 10) {
            drawText(planets[1] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);
     

        // Mars information
        drawImage("Screenshot-2024-12-05-2.51.32-PM.png", 0, 0, 150);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Mars!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 3.7", 33, 298);
      drawText("Has Ring System: No", 33, 318);
   


        // Check if Mars has more than 10 moons
        if (NumberMoons[2] > 10) {
            drawText(planets[2] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);

   

        //Jupiter information
        drawImage("Screenshot-2024-12-05-2.52.04-PM.png", 0, 0, 150);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Jupiter!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 23.1", 33, 298);
      drawText("Has Ring System: Yes", 33, 338);

    

        // Check if Jupiter has more than 10 moons
        if (NumberMoons[3] > 10) {
            drawText(planets[3] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);

      

        // Saturn information
        drawImage("Screenshot-2024-12-05-2.57.35-PM.png", 0, 0, 280);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Saturn!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 9", 33, 298);
      drawText("Has Ring System: Yes", 33, 358); 

    

        // Check if Saturn has more than 10 moons
        if (NumberMoons[4] > 10) {
            drawText(planets[4] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);

        // Uranus information
        drawImage("Screenshot-2024-12-05-3.02.24-PM.png", 0, 0, 280);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Uranus!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 8.7", 33, 298);
      drawText("Has Ring System: Yes", 33, 378);  
  
 

        // Check if Uranus has more than 10 moons
        if (NumberMoons[5] > 10) {
            drawText(planets[5] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);

        //Neptune information
        drawImage("Screenshot-2024-12-05-3.02.48-PM.png", 0, 0, 150);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Neptune!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 11", 33, 298);
drawText("Has Ring System: Yes", 66, 326); 



        // Check if Neptune has more than 10 moons
        if (NumberMoons[6] > 10) {
            drawText(planets[6] + " has more than 10 moons!", 22, 230);
        }
        pause(2.9);

        clear("gray");
        pause(0.5);
    
        // Pluto information
        drawImage("Screenshot-2024-12-05-3.03.05-PM.png", 0, 0, 150);
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Pluto!", 42, 190);
        drawText("Information:", 22, 210);
      drawText("Gravity: 0.7", 33, 298);
      drawText("Has Ring System: No", 33, 318); 
    
  
        // Check if Pluto has more than 10 moons
        if (NumberMoons[7] > 10) {
            drawText(planets[7] + " has more than 10 moons!", 22, 230);
        }

        pause(2.9);

        clear("black");
       pause(0.5);
      
      // randomly draws image of rocket on Earth screen at random location 
      randomNum = (int) (Math.random() * 10) + 200;
       drawImage("download-(1).jpeg", randomNum, randomNum, 200);
      
      //Earth Information 
       drawImage("Screenshot-2024-12-05-2.50.39-PM.png",0,0,150);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
    drawText("Back to Earth! Our planet!",42,190);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
    drawText("Information:",22,210);
      drawText("Gravity: 9.8", 33, 298);
      drawText("Has Ring System: No", 33, 318);
      
    pause(2.9);

      clear ("black");

    pause(0.5);

      
// Thank you message
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("Thank you for learning about", 23, 214);
      pause(0.1);
  
        setTextColor("white");
        setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
        drawText("the Solar System with us!", 90, 260);

    }
  

 

}
