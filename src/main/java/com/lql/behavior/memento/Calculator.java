package com.lql.behavior.memento;

/**
 * Title: Calculator <br>
 * ProjectName: learn-design <br>
 * description: 备忘录模式 <br>
 * 在不违反封装的情况下获得对象的内部状态，从而在需要的时候可以将对象恢复到初始状态
 *
 * 一下为计算器实例
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 11:24 <br>
 */
public interface Calculator {
    PreviousCalculationToCareTaker backupLastCalculation();

    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
