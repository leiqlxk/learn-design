package com.lql.structure.adapter.com_adapater;

/**
 * Title: SDAdapterTF <br>
 * ProjectName: learn-design <br>
 * description: 适配器类，聚合方式实现，符合组合复用原则 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:47 <br>
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return this.tfCard.readTF();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("adapter write tf card");
        this.tfCard.writeTF(msg);
    }
}
