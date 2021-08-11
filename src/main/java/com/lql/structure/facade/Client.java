package com.lql.structure.facade;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 10:37 <br>
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
