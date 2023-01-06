/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author L.S. Marshall, SCE, Carleton University
 * (incomplete implementation for SYSC 2004 Lab 2)
 * @author Riya Arora (101190033).
 * @version 1.03 May 15th, 2022
 */
public class Heater
{
    /** The temperature setting that the heater should maintain. */
    private int temperature;
    
    /** The temperature setting for a newly created heater. */
    private static final int INITIAL_TEMPERATURE = 15;
    
    /** 
     * The amount by which the temperature setting is raised/lowered when
     * warmer() and cooler() are invoked.
     */
     private int increment;
    
    /** 
     * The default amount by which the temperature setting is 
     * increased when warmer() is invoked and decreased when cooler()
     * is invoked.
     */
    private static final int DEFAULT_INCREMENT = 5;
    
    /**
     * The maximum temperature setting of the heater
     */
    private int max;
    
    /**
     * The minimum temperature setting of the heater
     */
    private int min;
    
    /**
     * The default minimum temperature setting of the heater
     */
    private static final int DEFAULT_MIN = 0;
    
    /**
     * The default minimum temperature setting of the heater
     */
    private static final int DEFAULT_MAX = 100;
    
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees.The minimum possible 
     * temperature is set to 0, and the maximum is set to 100.
     */
    public Heater()
    {
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
        min = DEFAULT_MIN;
        max = DEFAULT_MAX;
    }
 
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees. The maximum and minim possible
     * temperatures are also set. 
     * 
     * @param minTemp  the minimum possible temperature of the heater.
     * @param maxTemp  the maximum possible temperature of the heater.
     */    
    public Heater(int minTemp, int maxTemp)
    {
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
        min = minTemp;
        max = maxTemp;
    }

    /**
     * Returns the current temperature setting.
     */    
    public int temperature()
    {
        return temperature;
    }
    
    /**
     * Increases the current temperature by value stored 
     * in 'increment'
     */
    public void warmer()
    {
        if ((temperature + increment) <= max) {
            temperature += increment;
        }
    }

    /**
     * Decreases the current temperature by value stored 
     * in 'increment'
     */    
    public void cooler()
    { 
        if ((temperature - increment) >= min) {
            temperature -= increment;
        }
    }
    
    
    /**
     * Sets the value by which the temperature will increase or 
     * decrease
     * @param newIncrement representing the value of the new 
     * increment, must be a positive integer
     */    
    public void setIncrement(int newIncrement)
    { 
        if (newIncrement > 0) {
            increment = newIncrement;
        }
    }
    
    /**
     * Conversion of Celsius to Fahrenheit
     * Conversion uses the temperature method
     */
    public float fahrenheit()
    {
        float Temp;
        return Temp = ((temperature * 9)/5) + 32;
    }
}
