package com.lql.behavior.visitor.test;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 22:05 <br>
 */
public class Client {

    public static void main(String[] args) {
        // 双分派：静态分派和动态分派，方法重载调用为静态分派，编译时根据静态类型匹配，方法重写调用为动态分派，运行时根据实际类型匹配
        Executor executor = new Executor();

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        /*Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();*/

        executor.exe(animal);
        executor.exe(dog);
        executor.exe(cat);
    }
}
