package com.lql.behavior.visitor;

/**
 * Title: Element <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 15:04 <br>
 */
public interface Element {

    void accept(Visitor visitor);
}
