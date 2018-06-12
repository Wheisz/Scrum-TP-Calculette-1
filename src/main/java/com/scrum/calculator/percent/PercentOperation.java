package com.scrum.calculator.percent;

import com.scrum.calculator.core.AbstractOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Percentage.
 * @author ida
 */
public class PercentOperation  extends AbstractOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructor.
     */
    public PercentOperation() {
        super();
        super.setNumberOfParams(1);
        LOGGER.debug("Constructor");
    }

    /**
     * Execute Percentage operation.
     */
    @Override
    public final void execute() {
        LOGGER.info(this.getClass().getName() + " - Exécution soustaction");
        float result;
        result = this.getListNumber().get(0) / 100;
        this.setResult(result);
    }

    /**
     * ToString of Percentage operation.
     * @return string of a percentage operation
     */
    @Override
    public final String toStringOperation() {
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return this.getListNumber().get(0) + "% = " + this.getResult();
    }
}

