package com.crunchify.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.crunchify.model.LoginBean;
import com.crunchify.model.TestCheckbox;

@RequestMapping("InstallationEquipmentDetail")
@Controller
public class TestController {
    public String testSingleton = "Kimmy";
    

    @InitBinder
    public void bindingPreparation(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy*MM*dd");
        binder.registerCustomEditor(Date.class, "birthdate", new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/checkbox", method = RequestMethod.POST)
    public String displayLogin(@ModelAttribute("inputFrmPrevScreen") TestCheckbox inputModel, WebRequest request,
            Model model) {
        inputModel.setCheckBox("checked");
        model.addAttribute("inputFrmPrevScreen", inputModel);
        System.out.println(this.testSingleton);
        return "login";
    }

    @RequestMapping(value = "/testform", method = RequestMethod.POST)
    public String displayLogin(LoginBean bean) {
        System.out.println("First:" + this.testSingleton);
        System.out.println(bean.getName());
        this.testSingleton = bean.getName();
        System.out.println("Second:" + this.testSingleton);
        return "login";
    }
}
