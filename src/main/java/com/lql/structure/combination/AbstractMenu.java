package com.lql.structure.combination;

/**
 * Title: AbstractMenu <br>
 * ProjectName: learn-design <br>
 * description: 透明抽象类，即不区分是何种子类，将相关方法都集中定义 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:07 <br>
 */
public abstract class AbstractMenu {

    protected String name;

    protected int level;

    public AbstractMenu() {
    }

    public AbstractMenu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(AbstractMenu menu) {
        throw new UnsupportedOperationException("非法操作");
    }

    public void remove(AbstractMenu menu) {
        throw new UnsupportedOperationException("非法操作");
    }

    public AbstractMenu getChild(int index) {
        throw new UnsupportedOperationException("非法操作");
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
