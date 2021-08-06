package com.lql.behavior.visitor;

/**
 * Title: Item <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 15:27 <br>
 */
public class Item implements Element{

    private String name;

    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
