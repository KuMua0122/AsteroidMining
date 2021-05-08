package AsteroidMining;

//WaterIce resources
public class WaterIce  extends Asteroid {
	//private String Resource="WaterIce";
    public WaterIce() {}
	//WaterIce be sublime in this case
    public void sublime(Field f) {
    	Removeresource();
		f.Remove(this);
    	System.out.println("The waterice asteroid is in the perihelion, thus resource and asteroid evaporated");
    }
}