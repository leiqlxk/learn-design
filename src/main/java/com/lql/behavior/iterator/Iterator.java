package com.lql.behavior.iterator;

/**
 * Title: Iterator <br>
 * ProjectName: learn-design <br>
 * description: 迭代器模式 <br>
 * 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示
 *
 * Aggregate：聚合类，其中createIterator()方法可以产生一个Iterator
 * Iterator：主要定义了hasNext()和next()方法
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:35 <br>
 */
public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}
