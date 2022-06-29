package com.lql.behavior.iterator;

/**
 * Title: Iterator <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:45 <br>
 */
public interface Iterator {

    boolean hasNext();

    Student next();
}
