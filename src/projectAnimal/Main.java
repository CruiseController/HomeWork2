package projectAnimal;

import projectAnimal.birds.Duck;
import projectAnimal.pets.Cat;
import projectAnimal.pets.Dog;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Ввдедите одну из команд: Add, List или Exit");
            String inputCommand = scanner.nextLine();
            Commands command = Commands.fromString(inputCommand);
            //Не работает
            if (command == null) {
                System.out.println("Вы ввели некорректную команду");
            }
            //

            switch (command) {
                case ADD:
                    System.out.println(Arrays.toString(AnimalTypes.values()));
                    System.out.println("Выберите животное - ");
                    String inputAnimalType = scanner.nextLine();
                    AnimalTypes animalTypes = AnimalTypes.fromString(inputAnimalType);

                    System.out.println("Выберите имя: ");
                    String inputAnimalName = scanner.nextLine();

                    System.out.println("Выберите возраст: ");
                    Integer inputAnimalAge = Integer.valueOf(scanner.nextLine());

                    System.out.println("Выберите вес: ");
                    Double inputAnimalWeight = Double.valueOf(scanner.nextLine());

                    System.out.println("Выберите цвет: ");
                    String inputAnimalColor = scanner.nextLine();

                    switch (animalTypes){
                        case CAT:
                            Cat cat = new Cat(inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
                            animal.add(cat);
                            cat.say();
                            break;

                        case DOG:
                            Dog dog = new Dog(inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
                            animal.add(dog);
                            dog.say();

                            break;

                        case DUCK:
                            Duck duck = new Duck(inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
                            animal.add(duck);
                            duck.say();
                            duck.fly();
                            break;
                    }
                    break;
                case null:
                    break;
                case LIST:
                    for(Animal animalFromList: animal){
                        System.out.println(animalFromList.toString());
                    }
                    break;
                case EXIT:
                    exit = true;
                    System.out.println("Выполнение команды завершено");
                default:
                    System.out.println("Такого животного нет в списке");
                    break;
            }
        }
    }
}