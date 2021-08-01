package sixthtask.dao;

import sixthtask.model.Item;

import java.util.Arrays;
import java.util.List;

public class ItemsDao {

    private final List<Item> itemsSet = Arrays.asList(
            new Item("Золотые слитки", 1, 600),
            new Item("Бриллианты", 2, 5000),
            new Item("Пачка рублей", 3, 1500),
            new Item("Пачка евро", 2, 4000),
            new Item("Пачка долларов", 1, 10000));

    public List<Item> getItemsSet() {
        return itemsSet;
    }
}
