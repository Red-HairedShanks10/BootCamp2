package tacos.web;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import lombok.extern.slf4j.Slf4j;
import tacos.TacoOrder;

@Slf4j
@Controller
@RequestMapping("/orders")//handle all requests within this path 
@SessionAttributes("tacoOrder")
public class OrderController {

  @GetMapping("/current")//handle GET requests within this specific path
  public String orderForm() {
    return "orderForm"; //return a logical view 
  }

/*
  @PostMapping
  public String processOrder(TacoOrder order,
		  SessionStatus sessionStatus) {
    log.info("Order submitted: {}", order);
    sessionStatus.setComplete();

    return "redirect:/";
  }
*/

  @PostMapping//then handle the POST requests to process the order
  public String processOrder(@Valid TacoOrder order, Errors errors,
		  SessionStatus sessionStatus) {
    if (errors.hasErrors()) {
      return "orderForm";
    }

    log.info("Order submitted: {}", order);
    sessionStatus.setComplete();

    return "redirect:/";
  }
}