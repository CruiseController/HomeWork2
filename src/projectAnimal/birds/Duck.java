package projectAnimal.birds;

import projectAnimal.Animal;
import projectAnimal.Flying;

public class Duck extends Animal implements Flying {

    public Duck(String name, Integer age, Double weight, String color) {
        super(name, age, weight, color);
    }


    @Override
    public void say() {
        System.out.println("Кря-кря-кря!");

    }

    @Override
    public void go() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        System.out.println("Я лечу!");

    }
}
