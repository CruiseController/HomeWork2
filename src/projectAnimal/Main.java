package projectAnimal;

import projectAnimal.birds.Duck;
import projectAnimal.enums.AnimalTypes;
import projectAnimal.enums.Commands;
import projectAnimal.utils.AnimalFabrique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ввдедите одну из команд: Add, List. Для выхода нажмите Exit");
            String inputCommand = scanner.nextLine();
            Commands command;
            try {
                command = Commands.fromString(inputCommand);
            }
            catch (IllegalArgumentException com) {
                com.fillInStackTrace();
                System.out.println("Вы ввели некорректную команду, повторите попытку");
                continue;
            }
            switch (command) {

                case ADD:
                    System.out.println(Arrays.toString(AnimalTypes.values()));
                    System.out.println("Выберите животное - ");
                    String inputAnimalType = scanner.nextLine();
                    AnimalTypes animalTypes;
                    try {
                         animalTypes = AnimalTypes.fromString(inputAnimalType);
                    }catch (IllegalArgumentException e){
                        System.out.println("Вы ввели некорректную команду, повторите попытку");
                        continue;
                    }

                    System.out.println("Выберите имя: ");
                    String inputAnimalName = scanner.nextLine();

                    System.out.println("Выберите возраст: ");
                    Integer inputAnimalAge = Integer.valueOf(scanner.nextLine());

                    System.out.println("Выберите вес: ");
                    Double inputAnimalWeight = Double.valueOf(scanner.nextLine());

                    System.out.println("Выберите цвет: ");
                    String inputAnimalColor = scanner.nextLine();

                    AnimalFabrique fabrique = new AnimalFabrique();
                    Animal animal = fabrique.createAnimal(animalTypes, inputAnimalName, inputAnimalAge, inputAnimalWeight, inputAnimalColor);
                    animal.say();
                    if(animal instanceof Duck){
                        ((Duck) animal).fly();
                    }
                    animalList.add(animal);
                    break;

                case LIST:
                    for(Animal animalFromList: animalList){
                        System.out.println(animalFromList.toString());
                    }
                    break;

                case EXIT:
                    System.out.println("Выполнение команды завершено");
                    System.exit(0);

                default:
                    System.out.println("Для выхода введите exit");
                    System.exit(0);
                    break;
            }
        }
    }
}