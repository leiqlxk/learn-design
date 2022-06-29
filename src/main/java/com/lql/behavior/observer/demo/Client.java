package com.lql.behavior.observer.demo;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:19 <br>
 */
public class Client {

    public static void main(String[] args) {
        WeiXinUser user = new WeiXinUser("张三");
        WeiXinUser user1 = new WeiXinUser("李四");
        WeiXinUser user2 = new WeiXinUser("王五");
        WeiXinUser user3 = new WeiXinUser("赵六");

        ArticleSubject subject = new ArticleSubject();
        subject.attach(user);
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        subject.notify("文章已更新");
    }
}
