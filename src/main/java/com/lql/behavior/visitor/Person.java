package com.lql.behavior.visitor;

/**
 * Title: Person <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:54 <br>
 */
public interface Person {

    void feed(Dog dog);

    void feed(Cat cat);
}
