package com.lql.behavior.nullvisitor;

/**
 * Title: RealOperation <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 15:36 <br>
 */
public class RealOperation extends AbstractOperation{
    @Override
    void request() {
        System.out.println("do something");
    }
}
