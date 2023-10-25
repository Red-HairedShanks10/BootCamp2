package tacos;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;


//Taco domain class
@Data//annotation for lombok to generate essential methods a compile time
public class Taco {
	//Taco domain object has two properties
	
  @NotNull
  //adding data validation for the Taco name
  @Size(min=5, message="Name must be at least 5 characters long")
  private String name;

  @NotNull
  //adding data validation for ingredient list
  @Size(min=1, message="You must choose at least 1 ingredient")
  private List<Ingredient> ingredients;//list of ingredients

}