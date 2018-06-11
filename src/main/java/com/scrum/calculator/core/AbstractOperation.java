package com.scrum.calculator.core;

import java.util.List;

/**
 * Abstract Operation class.
 * @author willy drouin
 */
public abstract class AbstractOperation {

    /**
     * Number of parameters necessary to do the operation.
     */
    private int numberOfParams;

    /**
     * List of numbers to operate.
     */
    private List<Float> listNumber;

    /**
     * Constructor.
     */
    protected AbstractOperation() {
        // It's normal
    }

    /**
     * Method to execute operation.
     * @return result of operation.
     */
    public abstract float execute();

    /**
     * Getter number of parameters for operation.
     * @return Number of wanted parameters.
     */
    public final int getNumberOfParams() {
        return this.numberOfParams;
    }

    /**
     * Set the number of parameters.
     * @param numberToSet Number to set
     */
    public final void setNumberOfParams(final int numberToSet) {
       this.numberOfParams = numberToSet;
    }

    /**
     * Setter of the list of number to operate.
     * @param listOfFloat The list of float numbers
     */
    public final void setListNumber(final List<Float> listOfFloat) {
        this.listNumber = listOfFloat;
    }

    /**
     * Return the list of float.
     * @return List of float The list of float
     */
    public final List<Float> getListNumber() {
        return this.listNumber;
    }
}
