package com.lql.behavior.command;

/**
 * Title: Command <br>
 * ProjectName: learn-design <br>
 * description: 命令模式 <br>
 * 将命令封装在对象中，其作用：
 *  1.使用命令来参数化其它对象
 *  2.将命令放入队列中进行排队
 *  3.将命令的操作记录到日志中
 *  4.支持可撤销的操作
 *
 * Command：命令
 * Receivor：命令接收者，也就是命令真正的执行者
 * Invoker：通过它来调用命令
 * Client：可以设置命令与命令的接收者
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:43 <br>
 */
public interface Command {

    void execute();
}
