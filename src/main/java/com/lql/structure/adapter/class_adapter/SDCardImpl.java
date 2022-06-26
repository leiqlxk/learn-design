package com.lql.structure.adapter.class_adapter;

/**
 * Title: SDCardImpl <br>
 * ProjectName: learn-design <br>
 * description: 目标具体类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:43 <br>
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "sd card read a msg: hello word sd";
        return msg;
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("sd card write msg: " + msg);
    }
}
