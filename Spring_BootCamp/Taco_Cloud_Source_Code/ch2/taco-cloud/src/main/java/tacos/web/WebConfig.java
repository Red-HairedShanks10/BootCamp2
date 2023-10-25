package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//the WebConfig implements the WebMvcConfigurer interface
//which uses its methods to Configure the MVC
//in this case we replace the HomeController since it doesnt have much content

@Configuration
public class WebConfig implements WebMvcConfigurer {

	
  @Override
  //overriding the addViewControllers()
 //use this method to register the "/" path for the home view 
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("home");
  }

}
