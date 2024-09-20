package projectAnimal.utils;

import projectAnimal.Animal;
import projectAnimal.birds.Duck;
import projectAnimal.enums.AnimalTypes;
import projectAnimal.pets.Cat;
import projectAnimal.pets.Dog;


public class AnimalFabrique {

    public Animal createAnimal(AnimalTypes type, String inputAnimalName, Integer inputAnimalAge, Double inputAnimalWeight, String inputAnimalColor) {
        switch (type) {
            case CAT:
                return new Cat(inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
            case DOG:
                return new Dog(inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
            case DUCK:
                return new Duck(inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
        }
        throw new IllegalArgumentException("asdasd");
    }
}
