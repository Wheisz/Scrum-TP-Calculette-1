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
     * Execute Scientific operation.
     * @return result of sin, tan, cos
     */
    @Override
    public final void execute() {
        double result = Math.sin(this.getListNumber().get(0));
        super.result = result;
    }
}
