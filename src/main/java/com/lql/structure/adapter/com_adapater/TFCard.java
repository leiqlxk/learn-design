package com.lql.structure.adapter.com_adapater;

/**
 * Title: TFCard <br>
 * ProjectName: learn-design <br>
 * description: 适配者抽象类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:42 <br>
 */
public interface TFCard {

    String readTF();

    void writeTF(String msg);
}
