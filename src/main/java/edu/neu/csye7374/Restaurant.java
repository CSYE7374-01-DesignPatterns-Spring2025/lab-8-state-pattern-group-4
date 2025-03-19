package edu.neu.csye7374;

/**
 * The Context in the State pattern. Maintains a reference to a State object.
 * Clients call displayMenu() on this object, which delegates to the current state.
 */
public class Restaurant {

    private State lunchState;
    private State dinnerState;
    private State breakfastState;

    private State currentState;

    public Restaurant() {
        // Instantiate all possible states
        lunchState = new LunchState();
        dinnerState = new DinnerState();
        breakfastState = new OptionalState();

        // You can choose a default state here
        currentState = lunchState;  // default to lunch
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getLunchState() {
        return lunchState;
    }

    public State getDinnerState() {
        return dinnerState;
    }

    public State getBreakfastState() {
        return breakfastState;
    }

    public void displayMenu() {
        currentState.displayMenu();
    }


    public static void demo(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Display menu in the default state (Lunch)
        restaurant.displayMenu();

        // Switch to Dinner
        System.out.println();
        System.out.println("Switching to Dinner...");
        restaurant.setState(restaurant.getDinnerState());
        restaurant.displayMenu();

        // Switch to Breakfast (our optional state)
        System.out.println();
        System.out.println("Switching to Breakfast...");
        restaurant.setState(restaurant.getBreakfastState());
        restaurant.displayMenu();
    }
}

