package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Subtraction.
 * @author ida
 */
public class SinOperation extends AbstractOperation {

    /**
     * Value of div.
     */
    private static final double DIV = 100.0;

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructor.
     */
    public SinOperation() {
        super();
        super.setNumberOfParams(1);
        LOGGER.debug(this.getClass().getName() + " - Constructor");
    }

    /**
     * Execute Sin operation.
     */
    @Override
    public final void execute() {
        LOGGER.info(this.getClass().getName() + " - Exécution sinus");
        double result = Math.sin(Math.toRadians(
            this.getListNumber().get(0)));
        this.setResult((float) (Math.round(result * DIV) / DIV));
    }

    /**
     * ToString of sinus operation.
     * @return string of a sinus operation
     */
    @Override
    public final String toStringOperation() {
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return " Sin(" + this.getListNumber().get(0) + ")"
               + " = " + this.getResult();
    }
}
