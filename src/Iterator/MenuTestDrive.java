package Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {

        BreakfastStoreMenu breakfastStoreMenu = new BreakfastStoreMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(breakfastStoreMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
