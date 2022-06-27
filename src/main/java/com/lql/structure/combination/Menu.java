package com.lql.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Menu <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:10 <br>
 */
public class Menu extends AbstractMenu{
    private List<AbstractMenu> list;

    public Menu(String name, int level) {
        super(name, level);
        this.list = new ArrayList<>();
    }

    @Override
    public void add(AbstractMenu menu) {
        this.list.add(menu);
    }

    @Override
    public void remove(AbstractMenu menu) {
        this.remove(menu);
    }

    @Override
    public AbstractMenu getChild(int index) {
        return this.list.get(index);
    }

    @Override
    public void print() {
        for (int i = 1; i < this.level; i++) {
            System.out.print("--");
        }

        System.out.println(super.getName());

        for (AbstractMenu abstractMenu : this.list) {
            abstractMenu.print();
        }
    }
}
