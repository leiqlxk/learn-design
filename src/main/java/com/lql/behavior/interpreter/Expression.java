package com.lql.behavior.interpreter;

/**
 * Title: Expression <br>
 * ProjectName: learn-design <br>
 * description: 解释器模式 <br>
 * 为语言创建解释器，通常由语言的语法和语法分析来定义
 *
 * TerminalExpression：终结表达式，每个终结符都需要一个TerminalExpression
 * Context：上下文，包含解释器之外的一些全局信息
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 13:30 <br>
 */
public abstract class Expression {

    public abstract boolean interpreter(String str);
}
