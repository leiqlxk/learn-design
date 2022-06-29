package com.lql.behavior.visitor;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:59 <br>
 */
public class Client {
    public static void main(String[] args) {
        AnimalContainer animalContainer = new AnimalContainer();

        Cat cat = new Cat();
        Dog dog = new Dog();
        animalContainer.add(cat);
        animalContainer.add(dog);

        animalContainer.action(new Owner());
    }
}
