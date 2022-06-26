package com.lql.creator.builder.demo2;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 18:20 <br>
 */
public class Client {

    public static void main(String[] args) {
        Phone.Builder builder = new Phone.Builder();
        Phone phone = builder.builderCpu("Intel")
                .builderBoard("华硕")
                .builderMemory("海力士")
                .builderScreen("三星")
                .build();

        System.out.println(phone);
    }
}
