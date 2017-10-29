package com.plusonetesting.section9.ListAndArrayList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class GroceryListTest {

    private GroceryList groceryList = new GroceryList();

    private static final String ITEM_MILK = "Milk";
    private static final String ITEM_BREAD = "Bread";

    @Test
    public void canWeCreateAGroceryList() {
        assertThat(groceryList, isA(GroceryList.class));
    }

    @Test
    public void canWeAddAnItemToTheGroceryList() throws Exception {
        groceryList.addGroceryItem(ITEM_MILK);

        assertThat(groceryList.getSize(), is(1));
        assertThat(groceryList.getItem(1), is(ITEM_MILK));
    }

    @Test
    public void canWePrintTheGroceryList() {
        groceryList.addGroceryItem(ITEM_MILK);
        groceryList.addGroceryItem(ITEM_BREAD);

        groceryList.printGroceryList();
        assertThat(groceryList.getSize(), is(2));
    }

    @Test
    public void canWeModifyAGroceryListItem() {
        groceryList.addGroceryItem(ITEM_MILK);
        groceryList.modifyGroceryItem(1, ITEM_BREAD);

        assertThat(groceryList.getItem(1), is(ITEM_BREAD));
    }

    @Test
    public void canWeFindAnExistingListItem() {
        assertThat(groceryList.findItem(ITEM_MILK), is(nullValue()));
        groceryList.addGroceryItem(ITEM_MILK);
        assertThat(groceryList.findItem(ITEM_MILK), is(ITEM_MILK));
    }
}