package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Subtraction.
 * @author ida
 */
public class CosOperation extends AbstractOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructor.
     */
    public CosOperation() {
        super();
        super.setNumberOfParams(1);
        LOGGER.debug(this.getClass().getName() + " - Constructor");
    }

    /**
     * Execute Cos operation.
     */
    @Override
    public final void execute() {
        LOGGER.info(this.getClass().getName() + " - Exécution cosinus");
        double div = 100.0;
        double result = Math.cos(Math.toRadians(
        this.getListNumber().get(0)));
        this.setResult((float) (Math.round(result * div) / div));
    }

    /**
     * ToString of cosinus operation.
     * @return string of a cosinus operation
     */
    @Override
    public final String toStringOperation() {
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return " Cos(" + this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
