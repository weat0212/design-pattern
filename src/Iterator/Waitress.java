package Iterator;


public class Waitress {

    BreakfastStoreMenu breakfastStoreMenu;
    DinerMenu dinerMenu;

    public Waitress(BreakfastStoreMenu breakfastStoreMenu, DinerMenu dinerMenu) {
        this.breakfastStoreMenu = breakfastStoreMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = breakfastStoreMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
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
