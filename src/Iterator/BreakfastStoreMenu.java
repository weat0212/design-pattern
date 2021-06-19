package Iterator;

import java.util.ArrayList;

public class BreakfastStoreMenu {

    ArrayList menuItems;

    public BreakfastStoreMenu() {
        this.menuItems = new ArrayList();

        addItem("Egg Noodles Combo Breakfast", "Egg Noodles with Pork and Egg", true, 55);
        addItem("Crispy Chicken Burger Breakfast", "Danish Bread with Crispy Chicken leg", false, 80);
        addItem("No.1 Combo Breakfast", "Chicken Nuggets and Black Tea", false, 90);
        addItem("Light Weight Breakfast", "Salad, Blueberry Toast and Soy Milk", true, 60);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}


