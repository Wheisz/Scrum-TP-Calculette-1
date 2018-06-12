package com.scrum.calculator.modulo;

import com.scrum.calculator.core.AbstractOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Modulo.
 * @author ida
 */
public class ModOperation extends AbstractOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructor.
     */
    public ModOperation() {
        super();
        LOGGER.debug("Constructor");
    }

    /**
     * Execute Modulo operation.
     */
    @Override
    public final void execute() throws ArithmeticException {
        LOGGER.info(this.getClass().getName() + " - Exécution modulo");
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
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return this.getListNumber().get(0) + " Mod "
             + this.getListNumber().get(1)
               + " = " + this.getResult();
    }
}
