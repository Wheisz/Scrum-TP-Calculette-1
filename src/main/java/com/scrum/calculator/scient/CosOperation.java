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
     * Execute Scientific operation.
     * @return result of sin, tan, cos
     */
    @Override
    public final void execute() {
        double result = Math.cos(this.getListNumber().get(0));
        super.result = result;
    }
}
