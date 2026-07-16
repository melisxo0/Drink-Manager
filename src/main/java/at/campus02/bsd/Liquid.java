package at.campus02.bsd;

/**
 * Represents a liquid ingredient used to make drinks.
 * Contains information about the liquid's name, volume, and alcohol concentration.
 */
public class Liquid {

    /**
     * The name of the liquid.
     */
    private String name;

    /**
     * The volume of the liquid in liters (l).
     */
    private double volume;

    /**
     * The alcohol content of the liquid in percent (e.g., 42.0).
     */
    private double alcoholPercent;

    /**
     * Constructor to create a new Liquid with all details.
     *
     * @param name           the name of the liquid
     * @param volume         the volume of the liquid in liters
     * @param alcoholPercent the alcohol percentage of the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets the name of the liquid.
     *
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     *
     * @param name the new name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume of the liquid.
     *
     * @return the volume of the liquid in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid.
     *
     * @param volume the new volume of the liquid in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets the alcohol percentage of the liquid.
     *
     * @return the alcohol percentage
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage of the liquid.
     *
     * @param alcoholPercent the new alcohol percentage
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
