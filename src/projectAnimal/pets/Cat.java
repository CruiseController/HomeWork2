package projectAnimal.pets;

import projectAnimal.Animal;

public class Cat extends Animal {
    public Cat (String name, Integer age, Double weight, String color) {
        super(name, age, weight, color);
    }

    public void say(){
        System.out.println("Мяу-мяу");
    }

}