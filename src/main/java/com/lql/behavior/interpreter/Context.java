package com.lql.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Context <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:45 <br>
 */
public class Context {

    private Map<Expression, Integer> map = new HashMap<>();

    public void assign(Expression expression, Integer var) {
        this.map.put(expression, var);
    }

    public int getValue(Expression expression) {
        return this.map.get(expression);
    }
}
