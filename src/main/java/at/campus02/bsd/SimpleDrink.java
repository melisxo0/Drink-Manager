package at.campus02.bsd;

/**
 * Represents a simple drink consisting of exactly one liquid ingredient.
 * Extends the abstract Drink class.
 */
public class SimpleDrink extends Drink {

    /**
     * The single liquid ingredient of this drink.
     */
    protected Liquid l;

    /**
     * Constructor to create a new SimpleDrink.
     *
     * @param name   the name of the drink
     * @param liquid the single liquid ingredient of the drink
     */
    public SimpleDrink(String name, Liquid liquid) {
        super(name);
        this.l = liquid;
    }

    /**
     * Calculates the total volume of this drink, which is the volume of its single liquid.
     *
     * @return the volume of the drink in liters
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Gets the alcohol percentage of this drink, which is the alcohol percentage of its single liquid.
     *
     * @return the alcohol percentage
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Checks if this drink contains alcohol.
     *
     * @return true if the liquid ingredient has an alcohol percentage greater than 0, false otherwise
     */
    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }
}
