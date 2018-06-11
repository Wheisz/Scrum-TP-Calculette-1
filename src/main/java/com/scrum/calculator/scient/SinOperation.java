package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Subtraction.
 * @author ida
 */
public class SinOperation extends AbstractOperation {
    /**
     * Constructor.
     */
    public SinOperation() {
        super();
        super.setNumberOfParams(1);
    }

    /**
     * Execute Sin operation.
     * @return result of cos
     */
    @Override
    public final void execute() {
        double result = Math.sin(
        		Math.toRadians(this.getListNumber().get(0)));
        this.setResult(Math.round(result * 100) / 100);
    }
    
    @Override
    public String toString() {
        return "Sin("+this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
