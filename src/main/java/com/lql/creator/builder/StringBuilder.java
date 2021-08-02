package com.lql.creator.builder;

/**
 * Title: StringBuilder <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 15:45 <br>
 */
public class StringBuilder extends AbstractStringBuilder{
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
