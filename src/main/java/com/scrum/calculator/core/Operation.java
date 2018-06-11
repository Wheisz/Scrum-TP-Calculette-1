package com.scrum.calculator.core;

import java.util.ArrayList;

/**
 * Abstract Operation class.
 * @author willy drouin
 */
public abstract class Operation {

    /**
     * Number of parameters necessary to do the operation.
     */
    private int numberOfParams;

    /**
     * List of numbers to operate.
     */
    private ArrayList<Float> listNumber;

    /**
     * Constructor.
     */
    protected Operation() {
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
     * @param listOfFloatNumbers The list of float numbers
     */
    public final void setListNumber(final ArrayList<Float> listOfFloatNumbers) {
        this.listNumber = listOfFloatNumbers;
    }

    /**
     * Return the list of float.
     * @return List of float The list of float
     */
    public final ArrayList<Float> getListNumber() {
        return this.listNumber;
    }
}
