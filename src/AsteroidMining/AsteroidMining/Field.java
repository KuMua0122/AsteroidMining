package AsteroidMining;

import java.util.ArrayList;

//A class which contains some Thing in a field
public class Field {

   // neigbour Fields
   public ArrayList<Field> field = new ArrayList<Field>();

   //Accept Thing into this Field
   public void Accept(Thing t){
      Testing.methodStart("Field.Accept(t)");
      Testing.methodEnd("Field.Accept(t)");
   }
   //Remove Thing from this Field
   public void Remove(Thing t){
      Testing.methodStart("Field.Remove(thing)");
      Testing.methodEnd("Field.Remove(thing)");
   }
   //Return Neighbour fields
   public ArrayList<Field> GetNeighours(){
      ArrayList<Field> f = new ArrayList<Field>();
      Testing.methodStart("Field.Remove(thing)");
      Testing.methodEnd("Field.Remove(thing)");
      return f ;

   }

}
