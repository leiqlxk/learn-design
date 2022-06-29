package com.lql.behavior.visitor;

/**
 * Title: Owner <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:55 <br>
 */
public class Owner implements Person{
    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }
}
