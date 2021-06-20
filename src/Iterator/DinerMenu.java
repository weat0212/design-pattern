package Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Spicy Salsa", "tomatoes, onion, cilantro, and plenty of pepper varieties", true, 100);
        addItem("Gyro", "chicken or loaf comprised of ground beef and lamb", false, 150);
        addItem("Southern BBQ Chicken", "Slow-grilling legs", false, 120);
        addItem("Sheet Pan Shrimp and Sausage Bake", "shrimp and sausage bake", false, 140);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, Menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
        return Arrays.stream(menuItems).iterator();
    }
}
