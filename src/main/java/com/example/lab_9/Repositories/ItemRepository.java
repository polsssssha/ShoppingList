package com.example.lab_9.Repositories;

import com.example.lab_9.Models.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemRepository {
    private final Map<Integer, Item> entryMap = new HashMap<>();

    public void add(Item todo){
        entryMap.put(todo.getId(), todo);
    }

    public Collection<Item> getAll(){
        return entryMap.values();
    }

    public boolean switchIsDone(Integer id){
        return entryMap.get(id).switchIsDone();
    }

    public void remove(int id){
        entryMap.remove(id);
    }
}
