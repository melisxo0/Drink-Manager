package at.campus02.bsd;

import java.util.List;

/**
 * Represents a Cocktail which implements the Drink interface.
 * A cocktail consists of a name and a list of liquid ingredients.
 */
public class Cocktail extends Drink {

    private String name;
    private List<Liquid> liquids;

    /**
     * Constructor for Cocktail.
     * @param name The name of the cocktail
     * @param liquids The list of liquid ingredients in the cocktail
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name); // This passes the name to the Drink parent class
        this.liquids = liquids;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

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

        // Return the percentage back on a scale from 0 to 100
        return (totalAlcoholVolume / totalVolume) * 100.0;
    }

    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid : liquids) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    // Getters and Setters (Optional but highly recommended)
    public List<Liquid> getLiquids() {
        return liquids;
    }

    public void setLiquids(List<Liquid> liquids) {
        this.liquids = liquids;
    }

    public void setName(String name) {
        this.name = name;
    }
}