package com.lql.behavior.interpreter;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:51 <br>
 */
public class Client {

    public static void main(String[] args) {
        VariableExpression a = new VariableExpression("a");
        VariableExpression b = new VariableExpression("b");
        VariableExpression c = new VariableExpression("c");
        VariableExpression d = new VariableExpression("d");

        Context context = new Context();
        context.assign(a, 10);
        context.assign(b, 5);
        context.assign(c, 7);
        context.assign(d, 3);

        Plus plus = new Plus(a, new Plus(b, new Minus(c, d)));
        System.out.println(plus);
        System.out.println(plus.interpreter(context));
    }
}
