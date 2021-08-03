package com.lql.behavior.interpreter;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 14:03 <br>
 */
public class Client {

    /**
     * 构建解析树
     */
    public static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");

        // B C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // A OR (B OR C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        // D AND (A OR (B OR C))
        return new AndExpression(terminal4, alternation2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();

        String context1 = "D A";
        String context2 = "A B";

        System.out.println(define.interpreter(context1));
        System.out.println(define.interpreter(context2));
    }
}
