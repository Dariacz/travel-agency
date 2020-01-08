package com.daria.travelagency.controllers;

import com.daria.travelagency.services.SecurityService;
import com.daria.travelagency.services.TripService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.AccessDeniedException;

@Controller
public class HomeController {


    private final SecurityService securityService;
    private final TripService tripService;

    public HomeController(SecurityService securityService, TripService tripService) {
        this.securityService = securityService;
        this.tripService = tripService;
    }

   @GetMapping("/")
  public String getWelcome(Model model) {
      model.addAttribute("trips", tripService.findTripViews());
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
//    @GetMapping("/my-trips")
//    public String getMyTrips(Model model) throws AccessDeniedException {
//        var user = securityService.getLoggedInUser();
//        model.addAttribute("trips", tripService.findTripViewsByUserId(user.getId()));
//        model.addAttribute("user", user);
//        return "welcome";
//    }




}
