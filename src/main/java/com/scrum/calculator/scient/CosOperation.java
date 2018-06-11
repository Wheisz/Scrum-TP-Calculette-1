package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Subtraction.
 * @author ida
 */
public class CosOperation extends AbstractOperation {
	/**
     * Constructor.
     */
    public CosOperation() {
        super();
        super.setNumberOfParams(1);
    }

    /**
     * Execute Cos operation.
     */
    @Override
    public final void execute() {
        double result = Math.cos(this.getListNumber().get(0));
        this.setResult((float)result);
    }

    /**
     * ToString of cosinus operation.
     * @return string of a cosinus operation
     */
    @Override
    public String toStringOperation() {
        return " Cos(" + this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
