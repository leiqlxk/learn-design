package com.lql.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: AnimalContainer <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:57 <br>
 */
public class AnimalContainer {
    private List<Animal> animals;

    public AnimalContainer() {
        this.animals = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : this.animals) {
            animal.accept(person);
        }
    }
}
