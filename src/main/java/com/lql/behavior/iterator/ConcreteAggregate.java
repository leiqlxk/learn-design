package com.lql.behavior.iterator;

/**
 * Title: ConcreteAggregate <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:36 <br>
 */
public class ConcreteAggregate implements Aggregate{

    private Integer[] items;

    public ConcreteAggregate() {
        this.items = new Integer[10];
        for (int i = 0; i < this.items.length; i++) {
            this.items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(this.items);
    }
}
