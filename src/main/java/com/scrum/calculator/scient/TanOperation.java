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
     */
    @Override
    public final void execute() throws ArithmeticException{
        double result = Math.sin(this.getListNumber().get(0));
        this.setResult((float)result);
    }

    /**
     * ToString of tang operation.
     * @return string of a tang operation
     */
    @Override
    public final String toStringOperation() {
        return " Tan(" + this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}