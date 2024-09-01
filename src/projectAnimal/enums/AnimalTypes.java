package projectAnimal.enums;

public enum AnimalTypes {
    CAT,
    DOG,
    DUCK;
    public static AnimalTypes fromString(String type){
        return AnimalTypes.valueOf(type.trim().toUpperCase());
    }
}
