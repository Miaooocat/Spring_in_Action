package com.spring.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller            
// Controller annotation identify this class as a component for component scanning
public class HomeController {

  @GetMapping("/")     
  //  @GetMapping annotation indicate that if an HTTP GET request is received for the root path /, 
  //  then this method should handle that request
  //  This method is just return String 'home'
  public String home() {
    return "home";     // <3>
  }

}