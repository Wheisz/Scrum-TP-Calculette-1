package com.scrum.calculator.modulo;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Subtraction.
 * @author ida
 */
public class ModOperation extends AbstractOperation {
    /**
     * Constructor.
     */
    public ModOperation() {
        super();
    }

    /**
     * Execute Modulo operation.
     */
    @Override
    public final void execute() throws ArithmeticException {
        float result;
        if (this.getListNumber().get(1) == 0) {
             throw new ArithmeticException("Division by zero is impossible. "
                     + "Please change second value");
        }
        result = this.getListNumber().get(0) % this.getListNumber().get(1);
        this.setResult(result);
    }

    /**
     * ToString of Modulo operation.
     * @return string of a modulo operation
     */
    @Override
    public final String toStringOperation() {
        return this.getListNumber().get(0) + " Mod "
             + this.getListNumber().get(1)
               + " = " + this.getResult();
    }
}
