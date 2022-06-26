package com.lql.structure.adapter.class_adapter;

/**
 * Title: SDAdapterTF <br>
 * ProjectName: learn-design <br>
 * description: 适配器类，类适配器模式实现了目标抽象类并且继承了适配者具体实现类，将本来不可以一起工作的类转换成适用的类型，其不符合合成复用原则 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:47 <br>
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return super.readTF();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("adapter write tf card");
        super.writeTF(msg);
    }
}
