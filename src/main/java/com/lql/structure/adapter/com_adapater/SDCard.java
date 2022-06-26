package com.lql.structure.adapter.com_adapater;

/**
 * Title: SDCard <br>
 * ProjectName: learn-design <br>
 * description: 目标抽象类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:41 <br>
 */
public interface SDCard {

    String readSD();

    void writeSd(String msg);
}
