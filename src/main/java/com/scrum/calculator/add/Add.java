package com.scrum.calculator.add;

import com.scrum.calculator.core.Operation;

import java.util.ArrayList;

/**
 * Addition
 * @author tsupio
 */
public class Add extends Operation {

    /**
     * Constructor
     */
    public Add(){
        super.numberOfParameters = 2;
    }

    @Override
    public float execute(final ArrayList<Float> listNumber) {
        float result = 0;

        for (int i = 0; i < super.numberOfParameters; i++){
            result += listNumber.get(i);
        }

        return result;
    }

    @Override
    public int getNumberOfParameters() {
        return super.getNumberOfParameters();
    }
}
