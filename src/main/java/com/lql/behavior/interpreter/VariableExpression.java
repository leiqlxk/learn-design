package com.lql.behavior.interpreter;

/**
 * Title: VariableExpression <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:44 <br>
 */
public class VariableExpression implements Expression{

    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }


    @Override
    public int interpreter(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
