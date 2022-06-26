package com.lql.structure.adapter.com_adapater;

/**
 * Title: TFCardImpl <br>
 * ProjectName: learn-design <br>
 * description: 适配者具体类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:45 <br>
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "tf card read a msg: hello word tf";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write msg: " + msg);
    }
}
