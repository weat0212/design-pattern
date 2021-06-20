package Iterator;

import java.util.Iterator;

public class Waitress {

    Menu breakfastStoreMenu;
    Menu dinerMenu;

    public Waitress(Menu breakfastStoreMenu, Menu dinerMenu) {
        this.breakfastStoreMenu = breakfastStoreMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = breakfastStoreMenu.createIterator();
        Iterator dinerIterator = (Iterator) dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
