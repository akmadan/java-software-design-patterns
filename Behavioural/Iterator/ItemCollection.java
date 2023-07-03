package Behavioural.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ItemCollection.java - Aggregate Object
public class ItemCollection implements Iterable<Item> {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}