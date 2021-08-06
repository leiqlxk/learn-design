package com.lql.behavior.state;

/**
 * Title: State <br>
 * ProjectName: learn-design <br>
 * description: 状态模式 <br>
 * 允许对象内部状态改变时改变它的行为，对象看起来好像修改了它所属的类
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 14:41 <br>
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
