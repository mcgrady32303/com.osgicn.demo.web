package com.osgicn.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @Author www.osgi.com.cn
 * 
 */
@Controller
public class HomeController {

    public static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        
        return "Index";
    }
    
    @RequestMapping(value = "/Target", method = RequestMethod.GET)
    public String transfer(Model model) {
        
        return "Target";
    }
}
