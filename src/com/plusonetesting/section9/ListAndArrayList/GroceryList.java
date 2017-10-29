package com.plusonetesting.section9.ListAndArrayList;

import java.util.ArrayList;

class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    void addGroceryItem(String item) {
        groceryList.add(item);
    }

    int getSize() {
        return groceryList.size();
    }

    String getItem(int i) {
        return groceryList.get(i - 1);
    }

    void printGroceryList() {
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    void modifyGroceryItem(int i, String item) {
        groceryList.set(i - 1, item);
    }

    String findItem(String item) {
        if (groceryList.contains(item)) {
            return groceryList.get(groceryList.indexOf(item));
        } else {
            return null;
        }
    }
}
