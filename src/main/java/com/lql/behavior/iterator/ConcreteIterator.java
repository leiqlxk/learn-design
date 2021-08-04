package com.lql.behavior.iterator;

/**
 * Title: ConcreteIterator <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:38 <br>
 */
public class ConcreteIterator<Item> implements Iterator{
    private Item[] items;
    private int position = 0;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return this.items[this.position++];
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.length;
    }
}
