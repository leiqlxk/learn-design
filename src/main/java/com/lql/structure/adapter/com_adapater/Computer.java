package com.lql.structure.adapter.com_adapater;

/**
 * Title: Computer <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:50 <br>
 */
public class Computer {

    public String readSd(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard can not be null");
        }

        String msg = sdCard.readSD();
        return msg;
    }
}
