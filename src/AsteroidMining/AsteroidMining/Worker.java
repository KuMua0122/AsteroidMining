package AsteroidMining.AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Worker which is a father class of Robot and Settler
//Can do move, drill, Usegate Test case
public class Worker extends Thing {
	public Worker(String string) {
		super(string);
	}

	private int Onwhichasteroiod;
	private String id;
	Field cf = null;// current field, just use to test
	Field nf = null;// neighboring field
	Asteroid ca = null;
	private String status;
	public void SetProtected(){
		status="Protected";
	}
	public void SetUnProtected(){
		status="UnProtected";
	}
	public Field getcf() {
		return cf;
	}

	public void setcf(Field a) {
		cf = a;
	}

	public Asteroid getca() {
		return ca;
	}

	public void setca(Asteroid a) {
		ca = a;
	}

	// Settler/Robot travel Test case
	// Worker travel to another field
	// and then be checked with the Explosion or Sunstorm touch condition
	public void Travel(Asteroid a, Field f) throws IOException {
		movehere(a, f);

		if (ca.getresource().equals("Uranium") && getca().getdistance() <= 2) {
			ca.Explode(cf);
			return;
		}

		for (int i = 0; i < st.getonwhich().size(); i++) {
			if (st.getonwhich().get(i).getid().equals(getca().getid())) {
				st.Touch(this);
				return;
			}
		}
	}

	// Settler/Robot drill Test case
	// Worker drill the asteroid and be checked the asteroid condition and do drill
	// and then be checked with the Explosion or Sunstorm touch condition
	public void Drill() throws IOException {
		String enter;
		System.out.println("If depth of mantle larger than 0?(Yes or No)");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		enter = br2.readLine();
		if (enter.equals("Yes")) {
			System.out.println("Reduce asteroid's depth by 1");
			// Check explosion condition
			System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			enter = br.readLine();
			if (enter.equals("Yes")) {
				ra.Explode(cf);
				return;
			}
			// Check sunstorm condition
			System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			enter = br1.readLine();
			if (enter.equals("Yes")) {
				// for test
				Settler s = new Settler();
				st.Touch(s);
				return;
			}
		}
	}

	public void movehere(Asteroid a, Field f) {
		ca = a;
		cf = f;
	}

	// Settler/Robot TP Test case
	// Worker be checked the gate situition before TP and then TP by using the gate
	public void TP(Teleportaion_Gate tp) throws IOException {
		if (ca.getTPid().equals(tp.getid()) && tp.getneighbor().getTPid() != null) {
			movehere(tp.getneighbor(), tp.getfneighbor());
		}
	}

	public void die() {

	}

	public int GetOnwhichasteroid() {
		return Onwhichasteroiod;
	}

	public String GetId() {
		return id;
	}
}
