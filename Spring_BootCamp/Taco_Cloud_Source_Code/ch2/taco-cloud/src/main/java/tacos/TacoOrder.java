package tacos;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;
import java.util.List;
import java.util.ArrayList;
import lombok.Data;

//TacoOrder domain class
@Data
public class TacoOrder {//has 9 properties

/* 5 Delivery properties */
  @NotBlank(message="Delivery name is required")
  private String deliveryName;

  @NotBlank(message="Street is required")
  private String deliveryStreet;

  @NotBlank(message="City is required")
  private String deliveryCity;

  @NotBlank(message="State is required")
  private String deliveryState;

  @NotBlank(message="Zip code is required")
  private String deliveryZip;
/*  END OF DELIVERY Properties*/
  
  /*3 payment info properties*/
  @CreditCardNumber(message="Not a valid credit card number")
  private String ccNumber;

  @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
           message="Must be formatted MM/YY")
  private String ccExpiration;

  @Digits(integer=3, fraction=0, message="Invalid CVV")
  private String ccCVV;
  /*END Of Payment INFO Properties*/
  
  
  //ArrayList property for a list of tacos 
  private List<Taco> tacos = new ArrayList<>();

  public void addTaco(Taco taco) {
	  //adds a taco to the order
    this.tacos.add(taco);
  }
}
