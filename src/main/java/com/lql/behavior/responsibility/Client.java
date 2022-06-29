package com.lql.behavior.responsibility;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:32 <br>
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new GroupHandler();
        Handler handler2 = new Manager();
        Handler handler3 = new GeneralManager();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        LeaveRequest request = new LeaveRequest("张三", 4, "不开心。。。");
        handler1.submit(request);
    }
}
