package com.daria.travelagency.controllers;

import com.daria.travelagency.services.SecurityService;
import com.daria.travelagency.services.TripsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    private final SecurityService securityService;
    private final TripsService tripsService;

    public HomeController(SecurityService securityService, TripsService tripsService) {
        this.securityService = securityService;
        this.tripsService = tripsService;
    }

   @GetMapping("/")
  public String getWelcome(Model model) {
      model.addAttribute("trips", tripsService);
      return "welcome";
  }

//  @GetMapping("/admin")
//  public String getLogin(Model model, @RequestParam() boolean error) {
//      model.addAttribute("error", error);
//      return "login";
//   }

    @GetMapping("/login")
    public String getLogin(Model model, @RequestParam(defaultValue = "false") boolean error) {
        model.addAttribute("error", error);
        return "login";
    }


}
