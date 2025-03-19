package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete State for Dinner
 */
public class DinnerState implements State {

    private List<MenuItem> dinnerMenu;

    public DinnerState() {
        dinnerMenu = new ArrayList<>();
        dinnerMenu.add(new MenuItem(1, "Soup", 11.99));
        dinnerMenu.add(new MenuItem(2, "Salad", 12.99));
        dinnerMenu.add(new MenuItem(3, "Steak", 13.99));


    }

    @Override
    public void displayMenu() {
        System.out.println("=== DINNER MENU ===");
        for (MenuItem item : dinnerMenu) {
            System.out.println(item);
        }
    }
}
