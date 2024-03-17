package com.jwt_rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PageController {

    @GetMapping("/")
    public ModelAndView redirect(){
        return new ModelAndView("redirect:/login");
    }


    @GetMapping
    @RequestMapping("/login")
    public String getLoginPage(){
        return "login";
    }

}
