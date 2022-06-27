package com.lql.structure.combination;

/**
 * Title: MenuItem <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:14 <br>
 */
public class MenuItem extends AbstractMenu{

    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 1; i < super.level; i++) {
            System.out.print("--");
        }

        System.out.println(super.getName());
    }
}
