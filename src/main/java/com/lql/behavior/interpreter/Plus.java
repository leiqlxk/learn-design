package com.lql.behavior.interpreter;

/**
 * Title: Plus <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:48 <br>
 */
public class Plus implements Expression{
    private Expression left;
    private Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return this.left.interpreter(context) + this.right.interpreter(context);
    }

    @Override
    public String toString() {
        return "(" + this.left + "+" + this.right + ")";
    }
}
