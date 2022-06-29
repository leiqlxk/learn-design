package com.lql.behavior.visitor.test;

/**
 * Title: Executor <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 22:03 <br>
 */
public class Executor {

    public void exe(Animal animal) {
        System.out.println("Animal");
    }

    public void exe(Dog dog) {
        System.out.println("Dog");
    }

    public void exe(Cat cat) {
        System.out.println("cat");
    }
}
