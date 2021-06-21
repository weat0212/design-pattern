package Iterator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    HashMap menuItems = new HashMap();

    public CafeMenu() {
        addItem("Lemon Cake", "Cake with lemon slice", true, 50);
        addItem("Black Coffee", "Espresso with water", true, 80);
        addItem("Homebrew Coffee", "Ethiopia Guji Hamela Buku", true, 120);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
