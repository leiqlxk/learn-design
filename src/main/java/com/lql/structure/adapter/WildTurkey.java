package com.lql.structure.adapter;

/**
 * Title: WildTurkey <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 11:02 <br>
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble");
    }
}
