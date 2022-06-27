package com.lql.behavior.tempalte;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:20 <br>
 */
public class Client {

    public static void main(String[] args) {
        AbstractCookie cookie = new FriedCabbage();
        cookie.cookieProcess();
    }
}
