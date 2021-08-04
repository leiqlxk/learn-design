package com.lql.behavior.iterator;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:41 <br>
 */
public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        Iterator<Integer> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
