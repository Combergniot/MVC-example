package com.sdajava.mvc;

import com.sdajava.mvc.controller.CalculatorController;
import com.sdajava.mvc.model.CalculatorModel;
import com.sdajava.mvc.viev.CalculatorViev;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CalculatorViev calculatorViev = new CalculatorViev();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorController calculatorController
                = new CalculatorController(calculatorModel,calculatorViev);

        calculatorViev.setVisible(true);

    }
}
