package AsteroidMining;

//A initialization type Asteroid called RadioAsteroid
public class RadioAsteroid extends Asteroid{
    //private String Resource="Uranium";
    public RadioAsteroid() {}
    //be exploded
    //and remove by the field
    public void Explode(Field f) {
    	Removeresource();
    	f.Remove(this);
    	System.out.println("The radioactive asteroid is in the perihelion and exploded");
    }
}
