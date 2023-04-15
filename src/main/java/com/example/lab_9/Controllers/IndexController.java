package com.example.lab_9.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
@Controller
public class IndexController {

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(Map<String, Object> map){
        return "index";
    }
}
