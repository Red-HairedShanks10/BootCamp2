package tacos;

import lombok.Data;
//Ingredient domain class

@Data //anontation for lombok to generate essential methods at compile time
public class Ingredient {
	//each ingredient object has a name, type, id 
  private final String id;
  private final String name;
  private final Type type;//will be an enumeration of Type
  
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
