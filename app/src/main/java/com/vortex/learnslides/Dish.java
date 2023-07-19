package com.vortex.learnslides;
import androidx.annotation.NonNull;
public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String description, int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }
    @NonNull
    @Override
    public String toString(){
        return title; }
}
