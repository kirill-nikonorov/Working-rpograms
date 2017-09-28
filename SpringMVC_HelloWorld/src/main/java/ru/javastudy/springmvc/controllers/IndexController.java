package ru.javastudy.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nick on 01.08.2015.
 */
@Controller("indexController")
public class IndexController {

    private String name;
    private String password;

    public String exampleClick() {
        return "WEB-INF/views/secondPage";
    }

    @RequestMapping(value = "/secondPage", method = RequestMethod.GET)
    public ModelAndView secondPage(ModelAndView modelAndView) {
        modelAndView.setViewName("secondPage");
        return modelAndView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
