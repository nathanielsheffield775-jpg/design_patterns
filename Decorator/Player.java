package decorator;

import java.util.ArrayList;

public abstract class Player {
    
   protected String name;
   protected ArrayList<String> character;
   
   public Player(ArrayList<String> character, String name) {
       this.character = character;
       this.name = name;
   }

   public String getName() {
       return name;
   }

   @Override
   public String toString() {
       return "******* " + name + " *******";
   }

}
