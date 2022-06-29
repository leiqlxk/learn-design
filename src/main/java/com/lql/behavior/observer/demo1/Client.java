package com.lql.behavior.observer.demo1;
/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:23 <br>
 */
public class Client {

    public static void main(String[] args) {
        WeiXinUser user = new WeiXinUser("张三");
        WeiXinUser user1 = new WeiXinUser("李四");
        WeiXinUser user2 = new WeiXinUser("王五");
        WeiXinUser user3 = new WeiXinUser("赵六");

        ArticleSubject subject = new ArticleSubject();
        subject.addObserver(user);
        subject.addObserver(user1);
        subject.addObserver(user2);
        subject.addObserver(user3);

        subject.updateState("文章已更新");
    }
}
