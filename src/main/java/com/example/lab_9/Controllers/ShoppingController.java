package com.example.lab_9.Controllers;

import com.example.lab_9.Models.Item;
import com.example.lab_9.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequestMapping("/api/products")
public class ShoppingController {

    @Autowired
    private ItemService _itemService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Item> getAllItems(){
        return _itemService.getAll();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public Map<String, Object> add(@ModelAttribute("label") String label){
        Item res = _itemService.add(label);
        return Map.of(
                "label", label,
                "id", res.getId(),
                "updTxt", res.isDoneStr()
        );
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public Map<String, Boolean> switchIsDone(@PathVariable("id") int id){
        boolean state = _itemService.switchIsDone(id);
        return Map.of("state", state);
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public String remove(@PathVariable("id") int id){
        _itemService.remove(id);
        return "";
    }

}