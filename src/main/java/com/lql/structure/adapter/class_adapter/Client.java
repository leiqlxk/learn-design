package com.lql.structure.adapter.class_adapter;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:53 <br>
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSd(new SDCardImpl());
        System.out.println(msg);

        System.out.println("==========================");
        String msg1 = computer.readSd(new SDAdapterTF());
        System.out.println(msg1);
    }
}
