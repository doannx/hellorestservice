package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CrunchifyHelloWorld {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        String message = "<div style='text-align:center;'><h3>HelloWorld</h3></div>";
        return new ModelAndView("welcome", "message", message);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String displayLogin(Model m) {
        return "login";
    }
}
