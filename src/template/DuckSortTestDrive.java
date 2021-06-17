package template;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Andy", 8),
                new Duck("Dewey", 7),
                new Duck("Daffy", 6),
                new Duck("Candy", 6),
                new Duck("Wendy", 5),
        };

        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting: ");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
