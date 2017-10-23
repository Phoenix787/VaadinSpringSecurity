package com.sergeeva.VaadinSpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * This is how we handle our custom login screen. It has nothing to do with Vaadin at all.
 */
@Controller
public class LoginController {
//        @Autowired
//        ServerProperties serverProperties;

    @RequestMapping("/login")
        public String login(@RequestParam(value = "error", required = false) String error,
                                  @RequestParam(value = "logged-out", required = false) String loggedOut,
                                  Model model) {
           // ModelAndView modelAndView = new ModelAndView();

                model.addAttribute("error", error != null);
                model.addAttribute("loggedOut", loggedOut != null);

            //model.addAttribute("contextPath", serverProperties.getContextPath());
           return "login";
        }

}
