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
     * Result of operation.
     */
    private float result;

    /**
     * Constructor.
     */
    protected AbstractOperation() {
        numberOfParams = 2;
    }

    /**
     * Method to execute operation.
     * @throws ArithmeticException if operation fails
     */
    public abstract void execute() throws ArithmeticException;

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
    protected final void setNumberOfParams(final int numberToSet) {
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

    /**
     * Getter result.
     * @return get result of operation
     */
    public final float getResult() {
        return this.result;
    }

    /**
     * Setter result.
     * @param value result of operation
     */
    protected final void setResult(final float value) {
        this.result = value;
    }

    /**
     * Method to get the string of the operation.
     * @return string of operation
     */
    public abstract String toStringOperation();
}
