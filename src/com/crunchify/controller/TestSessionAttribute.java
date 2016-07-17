package com.crunchify.controller;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crunchify.model.LoginBean;

@Controller
public class TestSessionAttribute {
    @RequestMapping("/dosomething")
    public String requestHandlingMethod(Model model, HttpServletRequest request, HttpSession session) {
        System.out.println("Inside of dosomething handler method");

        System.out.println("--- Model data ---");
        Map modelMap = model.asMap();
        for (Object modelKey : modelMap.keySet()) {
            Object modelValue = modelMap.get(modelKey);
            System.out.println(modelKey + " -- " + modelValue);
        }

        System.out.println("=== Request data ===");
        java.util.Enumeration<String> reqEnum = request.getAttributeNames();
        while (reqEnum.hasMoreElements()) {
            String s = reqEnum.nextElement();
            System.out.println(s);
            System.out.println("==" + request.getAttribute(s));
        }

        System.out.println("*** Session data ***");
        Enumeration<String> e = session.getAttributeNames();
        while (e.hasMoreElements()) {
            String s = e.nextElement();
            System.out.println(s);
            System.out.println("**" + session.getAttribute(s));
        }

        return "login";
    }

    @RequestMapping(value = "/getmodel", method = RequestMethod.GET)
    public String getModel(@ModelAttribute("loginForm") LoginBean login) {
        System.out.println(login.getName());
        return "login";
    }

}
