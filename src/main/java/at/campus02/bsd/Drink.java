package at.campus02.bsd;

/**
 * Abstract base class representing a generic drink.
 * Concrete drink types should extend this class and implement its abstract methods.
 */
public abstract class Drink {

    /**
     * The name of the drink.
     */
    protected String name;

    /**
     * Constructor to initialize a drink with a name.
     *
     * @param name the name of the drink
     */
    public Drink(String name) {
        this.name = name;
    }

    /**
     * Abstract method to get the total volume of the drink.
     *
     * @return volume of the drink in liters
     */
    public abstract double getVolume();

    /**
     * Abstract method to get the alcohol percentage of the drink.
     *
     * @return alcohol percentage of the drink
     */
    public abstract double getAlcoholPercent();

    /**
     * Abstract method to check if the drink contains alcohol.
     *
     * @return true if alcoholic, false otherwise
     */
    public abstract boolean isAlcoholic();

    /**
     * Gets the name of the drink.
     *
     * @return the name of the drink
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink.
     *
     * @param name the new name of the drink
     */
    public void setName(String name) {
        this.name = name;
    }
}