package AsteroidMining;


//A class named Asteroid which can contain Resources or workers in the core
public class Asteroid extends Thing{
      
      public Asteroid() {}; 
      //Decide Sun move dircetion to the asteroid and Move Sun Distance by one
      public void Move() {
            Testing.methodStart("Asteroid.Move()");
            //its logic stuff, please omit this
                        //if(distancetosun<period){
                        //          Movedirection=1;
                        //          Step();
                        //    }
                        //if(distancetosun==period){
                        //          Movedirection=-1;
                        //          Step();
                        //    }     
                        //if(distancetosun==0){
                        //          Movedirection=1;
                        //          Step();
                        //    }   
      }
      //Asteroid RemoveResource form core
      public void Removeresource() {
    	      Testing.methodStart("Asteroid.Removeresource()");
            Testing.methodEnd("Asteroid.Removeresource()");
      }
      //Step Asteroid to move sun peroid
      public void Step() {
            Testing.methodStart("Asteroid.Step()");
                  Move();
            Testing.methodEnd("Asteroid.Step()");
            //its logic stuff, please omit this
                  //distancetosun+=Movedirection;
                  // System.out.println("The current distance to sun is:" +distancetosun);
      }
      //Accept settler to the core to protect
      public void Protect(Worker w) {
            Testing.methodStart("Asteroid.Protect()");
            Testing.methodEnd("Asteroid.Protect()");
      }
}