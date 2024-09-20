package projectAnimal.enums;

public enum Commands {
    ADD,
    LIST,
    LIST1,
    EXIT;
    public static Commands fromString(String command){
        return Commands.valueOf(command.trim().toUpperCase());
    };
}
