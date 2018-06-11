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
    public final void execute() {
        double result = Math.sin(this.getListNumber().get(0));
        this.setResult((float)result);
    }
    
    @Override
    public String toString() {
    	return "Tan("+this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
