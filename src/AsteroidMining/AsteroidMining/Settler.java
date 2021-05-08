package AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


//to the teacher for some reasons, the functions code is too long 
//because we was not able to put all SunStorm Touch and Radio explosion condition into one single function
//Sorry for making read


//A user control Thing which can be died
public class Settler extends Worker implements CanDie{

    //settler current field
    Field f = new Field();
    //settler current asteroid
    Asteroid a = new Asteroid();
    //resources in the settler bag
    ArrayList<String> resources = new ArrayList<String>();
    //teleport gate ID
    int teleportaion_Gate;
    //teleport gate
    Teleportaion_Gate gate = new Teleportaion_Gate();
    //resources be carried by settler
    Resource r = new Resource();

    //Mine
    //Settler get resource from Asteroid
    // and at same time Asteroid remove it by core
    public void Mine(Asteroid a) throws IOException{
        Settler s= new Settler();
        Testing.methodStart(" Settler.Mine()");
        
       
       
        //Settler get resource from Asteroid a
        s.GetResource();
        //Asteroid a remove resource
        a.Removeresource();
       Testing.methodEnd(" Settler.Mine()");

       //Check explosion condition
     
    }

    //Add resource to the Asteroid
    //Settler add resource into Asteroid
    //And check wheather the resource is waterice which will be sublime in the perihelion
    public void AddResource(Resource r, Asteroid a) throws IOException{
        Testing.methodStart(" Settler.Addresource(r,Asteroid)");
        //Asteroid take resource from settler
       System.out.println("Asteroid put specific resource.");
       System.out.println("Check if Asteroid is in the perihelion");
       System.out.println("If Asteroid is in the perihelion input 1");
       System.out.println("If Asteroid is not in the perihelion input 2");
       BufferedReader br = new BufferedReader(new 
       InputStreamReader(System.in));
       String enter = br.readLine();
       int num = Integer.parseInt(enter);
       if(num == 1){
        System.out.println("Check if resources is WaterIce or Uranium");
        this.Removeresources(r);

        System.out.println("If resources is WaterIce input 1");
        System.out.println("If resources is Uranium input 2");
        System.out.println("If resources is not-both of them input 3");
        if(num==1){
            WaterIce w = new WaterIce();
            w.sublime(f);
        }
        if(num==2){
            RadioAsteroid rd = new RadioAsteroid();
            rd.Explode(f);
            this.Die(f);
        }
        if(num==3){ 
            //if not WaterIce or Uranuim
            if(num == 2){
                //End by do nothing else
             Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
             return;
            }
        }
    }else{
        //if not in perhelion not do anything
       if(num == 2){
        //End by do nothing else
        Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
        return;
       }
    }
    //End by do nothing else
        Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
}

    // return the resources in the Settler
    //Not in the Test case
    public ArrayList<String> GetResource(){
        Testing.methodStart(" Settler.Getresource()");
        Testing.methodEnd("Settler.Getresource()");
        return resources;
    }


    //Settler Remove its own resources
    //not in the testcase
    public void Removeresources(Resource r){
        Testing.methodStart("Settler.Removeresources(Resources r)");
        Testing.methodEnd(" Settler.Removeresources(Resources r)");
    }

    //Settler Hide Test case
    //Settler hide into an asteroid
    public void Hide(){
        Testing.methodStart("Settler.Hide()");
        //Add Settler into Asteroid
        a.Protect(this);
        Testing.methodEnd("Settler.Hide()");
    }

    //Settler construct Robot Test case
    //Settler create a robot and spend resources and then put into the field
    public void Constructrobot(Field f){
        Testing.methodStart("Settler.Constructrobot()");
        //settler create robot
        Testing.methodStart("Settler.CreateRobot");
        Robot r = new Robot();
        System.out.println("Use resources to build resources");
        Testing.methodEnd("Settler.CreateRobot");
        f.Accept(r);
        Testing.methodEnd("Settler.Constructrobot()");
    }

    //Settler constructgate Test case
    //Settler create gate by spending resources
    public void Constructgate(Field f){
        Testing.methodStart("Settler.Constructgate()");
        //settler ConstructGate
        Testing.methodStart("Settler.CreateTeleportaion-gate");
        //Teleportaion_Gate tp = new Teleportaion_Gate();
        System.out.println("Gate-1.");
        Testing.methodEnd("Settler.CreateTeleportaion-gate");
        Testing.methodEnd("Settler.Constructgate()");
    }

    //Settler BuildGate Test case
    //Settler build gate in the field and field will accept it
    //Check the sunstorm and perihelion explosion condition same time
    public void BuildGate() throws IOException{
        //settler build gate in the asteroid
        Testing.methodStart("Settler.BuildGate()");
        System.out.println("Gate-1.");
        //field and asteroid accept gate
        f.Accept(this.gate);

        //Check explosion condition
        String enter;
        System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        enter = br.readLine();
        if(enter.equals("Yes"))
        {
           ra.Explode(cf);
           return;
        }
        //Check sunstorm condition
        System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        enter = br1.readLine();
        if(enter.equals("Yes"))
        {
            //for test
        Settler s =new Settler();
           st.Touch(s);
           return;
        }
        Testing.methodEnd("Settler.BuildGate()");
    }

    //die
    //Settler died and be removed by the field
    public void Die(Field f){
        Testing.methodStart(" Settler.Die()");
        //field remove settler 
        f.Remove(this);
        //remove resources
        System.out.println("Lost all resources.");
        //Asteroid remove settler
        f.Remove(this);
        Testing.methodEnd(" Settler.Die()");
    }
    //SettlerBuildSpaceStation Test case
    //Settler Check the resources and the asteroid. 
    //then Build Space Station
    public void SettlerBuildSpaceStation() throws IOException{
        Testing.methodStart("Settler.SettlerBuildSpaceStation()");
        //check resources
        System.out.println("Check if resources is enough");
        System.out.println("If resources is enough input 1");
        System.out.println("If resources is not-enough input 2");
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        String enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num == 1){
            //check settler in the Asteroid
            System.out.println("Check if Settler is in an exist Asteroid");
            System.out.println("Check if Settler is in an exist Asteroid input 1");
            System.out.println("Check if Settler is in an not exist Asteroid input 2");
            enter = br.readLine();
            num = Integer.parseInt(enter);
            if(num==1) {
            //Settler build station and EndGame
            System.out.println("You build a station successfully");
            Testing.methodStart("EndGame()");
            }else{
                if(num==2)
                System.out.println("Settler is not in an exist Asteroid");
                System.out.println("EndGame");
            }
        }
        else{
            if(num==2)
            System.out.println("Resource is not enough");
        }
        Testing.methodEnd("Settler.SettlerBuildSpaceStation()");
    }

}