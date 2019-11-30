package com.daria.travelagency.controllers;

import com.daria.travelagency.services.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    private final SecurityService securityService;

    public HomeController(SecurityService securityService) {
        this.securityService = securityService;
    }

//    @GetMapping("/")
//    public String getWelcome(Model model) {
//        model.addAttribute("questions", questionService.findQuestionViews());
//        return "welcome";
//    }

//    @GetMapping("/my-questions")
//    public String getMyQuestions(Model model) {
//        var userId = securityService.getLoggedInUser().getId();
//        model.addAttribute("questions", questionService.findQuestionViewsByUserId(userId));
//        return "welcome";
//    }

    @GetMapping("/login")
    public String getLogin(Model model, @RequestParam(defaultValue = "false") boolean error) {
        model.addAttribute("error", error);
        return "login";
    }


}
