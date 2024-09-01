package projectAnimal;

import java.util.Arrays;

public enum AnimalTypes {
    CAT,
    DOG,
    DUCK;
    public static AnimalTypes fromString(String type){
        return AnimalTypes.valueOf(type.trim().toUpperCase());
    }
}
