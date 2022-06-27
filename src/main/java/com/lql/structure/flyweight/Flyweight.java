package com.lql.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Flyweight <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 20:55 <br>
 */
public class Flyweight {

    private static Map<String, Block> map;

    private Flyweight() {
        map = new HashMap<>();

        IBlock iBlock = new IBlock();
        JBlock jBlock = new JBlock();
        LBlock lBlock = new LBlock();

        map.put("I", iBlock);
        map.put("J", jBlock);
        map.put("L", lBlock);
    }

    private static class SingletonHolder{
        private static final Flyweight FLYWEIGHT = new Flyweight();
    }

    public static Flyweight getInstance() {
        return SingletonHolder.FLYWEIGHT;
    }

    public Block getBlock(String type) {
        return map.get(type);
    }
}
