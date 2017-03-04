package com.sdajava.mvc.model;

/**
 * Created by RENT on 2017-03-02.
 */
public class CalculatorModel {

    private int calculatorResult;

    public void  addTwoNumbers(int a, int b){
        calculatorResult = a+b;
    }
    public int getCalculatorResult(){
        return calculatorResult;
    }
}
