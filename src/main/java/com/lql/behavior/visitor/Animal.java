package com.lql.behavior.visitor;

/**
 * Title: Animal <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:53 <br>
 */
public interface Animal {

    void accept(Person person);
}
