package AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A system controlled Thing which can attack Settler and Robot
public class SunStorm extends Thing implements Stepable{

    Field f = new Field();
    //When Robot or Settler be touched then be called
    //And then check wheather they need be died
    public void Touch(Settler s) throws IOException{
        Testing.methodStart("Touch(Settler)");
        System.out.println("Check if Settler hided");
        System.out.println("If Settler hided input 1");
        System.out.println("If Settler not-hided input 2");
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        String enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num == 1){
            //Settler not die
                System.out.println("Settler is Hideing in an Asteroid, nothing happened");
            }else{
            //Sttler die
                if(num==2) s.Die(f);
            }
        Testing.methodEnd("Touch(Settler)");
    }

    //When robot be touched by Sunstorm 
    //Not be showned in the dialog
    public void Touch(Robot r){}
    //Control Sunstorm to move
    public void Step(){
        Move();
    }

    //Move in the map
    public void Move(){}
    //Disappear when time is there
    public void Disappear(){}
}
