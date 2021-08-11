package com.lql.structure.facade;

/**
 * Title: Facade <br>
 * ProjectName: learn-design <br>
 * description: 门面模式（外观） <br>
 * 提供了一个统一的接口，用来访问子系统内一群接口，从而让子系统更易用
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 10:32 <br>
 */
public class Facade {

    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTv();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
