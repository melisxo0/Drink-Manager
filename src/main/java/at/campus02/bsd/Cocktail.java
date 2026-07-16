package at.campus02.bsd;

import java.util.List;

/**
 * Represents a cocktail consisting of multiple liquid ingredients.
 * Extends the abstract Drink class.
 */
public class Cocktail extends Drink {

    /**
     * The list of liquid ingredients in this cocktail.
     */
    private List<Liquid> liquids;

    /**
     * Constructor to create a new Cocktail.
     *
     * @param name    the name of the cocktail
     * @param liquids the list of liquid ingredients
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    /**
     * Calculates the total volume of this cocktail by summing the volumes of all ingredients.
     *
     * @return the total volume of the cocktail in liters
     */
    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    /**
     * Calculates the total alcohol percentage of this cocktail based on its ingredients.
     *
     * @return the average alcohol percentage of the combined liquids, or 0.0 if empty
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0.0) {
            return 0.0;
        }

        double totalAlcoholVolume = 0.0;
        for (Liquid liquid : liquids) {
            totalAlcoholVolume += (liquid.getVolume() * (liquid.getAlcoholPercent() / 100.0));
        }

        return (totalAlcoholVolume / totalVolume) * 100.0;
    }

    /**
     * Checks if this cocktail contains any alcoholic liquid ingredients.
     *
     * @return true if at least one ingredient has an alcohol percentage greater than 0, false otherwise
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid : liquids) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the list of liquids in this cocktail.
     *
     * @return the list of liquids
     */
    public List<Liquid> getLiquids() {
        return liquids;
    }

    /**
     * Sets the list of liquids in this cocktail.
     *
     * @param liquids the new list of liquids
     */
    public void setLiquids(List<Liquid> liquids) {
        this.liquids = liquids;
    }
}