package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;

public class TanOperation extends AbstractOperation {
	/**
     * Constructor.
     */
    public TanOperation() {
        super();
        super.setNumberOfParams(1);
    }

    /**
     * Execute Tan operation.
     * @return result of tan
     */
    @Override
    public final void execute() throws ArithmeticException{
        double result = Math.sin(Math.toRadians(
              this.getListNumber().get(0)));
        this.setResult(Math.round(result * 100) / 100);
    }
    
    @Override
    public String toString() {
    	return "Tan("+this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
