package projectAnimal.pets;

import projectAnimal.Animal;

public class Dog extends Animal {

    public Dog(String name, Integer age, Double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав-Гав");

    }
}
