package com.lql.behavior.interpreter;

/**
 * Title: OrExpression <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 13:46 <br>
 */
public class OrExpression extends Expression{
    private Expression expression1;

    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String str) {
        return this.expression1.interpreter(str) || this.expression2.interpreter(str);
    }
}
