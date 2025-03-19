package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete State for Breakfast
 */
public class OptionalState implements State {

    private List<MenuItem> optionalMenu;

    public OptionalState() {
        optionalMenu = new ArrayList<>();
        optionalMenu.add(new MenuItem(1, "salmon", 14.99));
        optionalMenu.add(new MenuItem(2, "chicken", 15.99));
    }

    @Override
    public void displayMenu() {
        System.out.println("=== OPTIONAL MENU ===");
        for (MenuItem item : optionalMenu) {
            System.out.println(item);
        }
    }
}

