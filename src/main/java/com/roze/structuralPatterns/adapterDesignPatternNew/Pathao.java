package com.roze.structuralPatterns.adapterDesignPatternNew;

import java.util.ArrayList;
import java.util.List;

public class Pathao {
    List<Item> itemList = new ArrayList<>();

    //we have option to add items to list
    public void addItems(Item item) {
        itemList.add(item);
    }
}
