package com.lql.structure.facade;

/**
 * Title: SubSystem <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 10:33 <br>
 */
public class SubSystem {

    public void turnOnTv() {
        System.out.println("turnOnTv");
    }

    public void setCD(String cd) {
        System.out.println("set(" + cd + ")");
    }

    public void startWatching() {
        System.out.println("startWatching");
    }
}
