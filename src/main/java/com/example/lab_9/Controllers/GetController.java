package com.example.lab_9.Controllers;

import com.example.lab_9.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
@Controller
public class GetController {
    @Autowired
    private ItemService _itemService;
    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(Map<String, Object> map){
        return "index";
    }
}
