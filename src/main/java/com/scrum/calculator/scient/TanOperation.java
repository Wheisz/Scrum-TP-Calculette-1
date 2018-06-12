package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Subtraction.
 * @author ida
 */
public class TanOperation extends AbstractOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructor.
     */
    public TanOperation() {
        super();
        super.setNumberOfParams(1);
        LOGGER.debug(this.getClass().getName() + " - Constructor");
    }

    /**
     * Execute Tan operation.
     */
    @Override
    public final void execute() throws ArithmeticException{
        LOGGER.info(this.getClass().getName() + " - Exécution tangente");
        double div = 100.0;
        double result = Math.tan(Math.toRadians(
        this.getListNumber().get(0)));
        this.setResult((float) (Math.round(result * div) / div));
    }

    /**
     * ToString of tang operation.
     * @return string of a tang operation
     */
    @Override
    public final String toStringOperation() {
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return " Tan(" + this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
