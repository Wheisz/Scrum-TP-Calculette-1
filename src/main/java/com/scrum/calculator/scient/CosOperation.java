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
        double div = 100.0;
        double result = Math.cos(Math.toRadians(
        this.getListNumber().get(0)));        
        this.setResult((float) (Math.round(result * div) / div));
    }

    /**
     * ToString of cosinus operation.
     * @return string of a cosinus operation
     */
    @Override
    public final String toStringOperation() {
        return " Cos(" + this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
