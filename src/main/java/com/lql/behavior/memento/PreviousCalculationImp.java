package com.lql.behavior.memento;

/**
 * Title: PreviousCalculationImp <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 11:31 <br>
 */
public class PreviousCalculationImp implements PreviousCalculationToOriginator, PreviousCalculationToCareTaker{
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    @Override
    public int getFirstNumber() {
        return this.firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return this.secondNumber;
    }
}
