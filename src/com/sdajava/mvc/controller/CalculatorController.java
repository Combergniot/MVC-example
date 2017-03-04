package com.sdajava.mvc.controller;

import com.sdajava.mvc.model.CalculatorModel;
import com.sdajava.mvc.viev.CalculatorViev;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-03-02.
 */
public class CalculatorController {

    private CalculatorModel calculatorModel;
    private CalculatorViev calculatorViev;


    public CalculatorController(CalculatorModel calculatorModel,
                                CalculatorViev calculatorViev) {
        this.calculatorModel = calculatorModel;
        this.calculatorViev = calculatorViev;
        this.calculatorViev.addCalculateListener(new CalculatorListener());
    }

    //Klasa zagnieżdzona

    class CalculatorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            firstNumber = calculatorViev.getFirstNumber();
            secondNumber = calculatorViev.getSecondNumber();

            calculatorModel.addTwoNumbers(firstNumber, secondNumber);

            calculatorViev.setCalcResult(calculatorModel.getCalculatorResult());
        }
    }
}
