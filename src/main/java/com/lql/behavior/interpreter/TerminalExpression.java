package com.lql.behavior.interpreter;

import java.util.StringTokenizer;

/**
 * Title: TerminalExpression <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 13:33 <br>
 */
public class TerminalExpression extends Expression {
    private String literal = null;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpreter(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            String test = stringTokenizer.nextToken();
            if (test.equals(this.literal)) {
                return true;
            }
        }
        return false;
    }
}
