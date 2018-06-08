package com.scrum.calculator.add;

import com.scrum.calculator.core.Operation;

import java.util.ArrayList;

public class Add extends Operation {


    public Add(){
        super.numberOfParameters = 2;
    }

    @Override
    public float execute(ArrayList<Float> listNumber) {
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
