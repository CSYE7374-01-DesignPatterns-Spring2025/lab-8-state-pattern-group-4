package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete State for Lunch
 */
public class LunchState implements State {

    private List<MenuItem> lunchMenu;

    public LunchState() {
        lunchMenu = new ArrayList<>();
        lunchMenu.add(new MenuItem(1, "Hot Dog", 1.99));
        lunchMenu.add(new MenuItem(2, "Salad", 2.99));
        lunchMenu.add(new MenuItem(3, "Hamburger", 3.99));
    }

    @Override
    public void displayMenu() {
        System.out.println("=== LUNCH MENU ===");
        for (MenuItem item : lunchMenu) {
            System.out.println(item);
        }
    }
}
