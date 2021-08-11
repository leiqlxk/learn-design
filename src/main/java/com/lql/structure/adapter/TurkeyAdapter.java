package com.lql.structure.adapter;

/**
 * Title: TurkeyAdapter <br>
 * ProjectName: learn-design <br>
 * description: 适配器模式 <br>
 * 把一个类接口转换成另一个用户需要的接口。
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 11:02 <br>
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
