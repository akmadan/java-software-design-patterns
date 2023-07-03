package Behavioural.Iterator;

import java.util.Iterator;



public class Main {
    public static void main(String[] args) {
        ItemCollection collection = new ItemCollection();

        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");

        collection.addItem(item1);
        collection.addItem(item2);
        collection.addItem(item3);

        Iterator<Item> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getName());
        }
    }
}
