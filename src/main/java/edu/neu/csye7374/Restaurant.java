package edu.neu.csye7374;

/**
 * The Context in the State pattern. Maintains a reference to a State object.
 * Clients call displayMenu() on this object, which delegates to the current state.
 */
public class Restaurant {

    private State currentState;

    public Restaurant() {

        // You can choose a default state here
        currentState = new LunchState();;  // default to lunch
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getLunchState() {
        return this.currentState;
    }

    public void displayMenu() {
        currentState.displayMenu();
    }


    public static void demo() {
        Restaurant restaurant = new Restaurant();

        // Display menu in the default state (Lunch)
        restaurant.displayMenu();

        // Switch to Dinner
        System.out.println();
        System.out.println("Switching to Dinner...");
        restaurant.setState(new DinnerState());
        restaurant.displayMenu();

        // Switch to Breakfast (our optional state)
        System.out.println();
        System.out.println("Switching to Breakfast...");
        restaurant.setState(new OptionalState());
        restaurant.displayMenu();
    }
}

