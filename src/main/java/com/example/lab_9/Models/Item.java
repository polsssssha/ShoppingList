package com.example.lab_9.Models;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {
    private int id;
    private String text;
    private boolean done;
    public Item(int id, String text, boolean done){
        this.id = id;
        this.text = text;
        this.done = done;
    }
    public String isDoneStr(){
        return done ? "Uncheck" : "Check";
    }

    public boolean switchIsDone(){
        this.done = !this.done;
        return this.done;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Item product = (Item) o;
        return id == product.id && text.equals(product.text);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, text);
    }
    @Override
    public String toString(){
        return text;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
