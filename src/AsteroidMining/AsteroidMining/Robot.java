package AsteroidMining;

import java.io.IOException;

//A system controled Thing and can be died
public class Robot extends Worker{
     //private String id;
    
     //Test case Robot TP
     public void Tp(){
       Testing.methodStart("Robot.Tp()");
       Testing.methodEnd("Robot.Tp()");
     }
     
     //Test case Robot Hide
     public void Hide() {
    	  Testing.methodStart("Robot.Hide()");
       Testing.methodEnd("Robot.Hide()");
     }
     
     //Robot be explode by Asteroid and then move to another Asteroid
     public void HitbyExplode() throws IOException {
      Robot r = new Robot();
    	 r.Travel();
    	 System.out.println("Robot 1 was attacked by explode and landing a neighboring asteroid A2");
     }

     //Robot Die and only died by SunStorm
     public void Die(Field f) {
    	 f.Remove(this);
    	 System.out.println("Robot 1 was attacked by sunstorm and died.");
     }
}
