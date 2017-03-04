package com.sdajava.mvc.viev;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-03-02.
 */
public class CalculatorViev extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calcButton = new JButton("Oblicz");
    private JTextField calcResult = new JTextField(10);

    public CalculatorViev(){

        JPanel calcPanel = new JPanel();
        this.setSize(600,600);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calcButton);
        calcPanel.add(calcResult);

        this.add(calcPanel);
        // Nasza klasa dziedziczy po JFramie, ta komenda pozwoli zaś dodać nasz panel do Jframe'a
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber (){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcResult (){
        return Integer.parseInt(calcResult.getText());
    }

    public void setCalcResult (int result){
        calcResult.setText(Integer.toString(result));
    }

    public void addCalculateListener(ActionListener actionListener){
        calcButton.addActionListener(actionListener);
    }



}
