package com.example.lab_9.Services;

import com.example.lab_9.Models.Item;
import com.example.lab_9.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private int index = 0;

    @Autowired
    private ItemRepository repository;


    public List<Item> getAll(){
        return new ArrayList<>(repository.getAll());
    }

    public boolean switchIsDone(int id){
        return repository.switchIsDone(id);
    }

    public Item add(String label){
        Item res = new Item(++index, label, false);
        repository.add(res);
        return res;
    }

    public void remove(int id){
        repository.remove(id);
    }
}
