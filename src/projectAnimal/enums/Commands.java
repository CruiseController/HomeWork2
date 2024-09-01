package projectAnimal.enums;

public enum Commands {
    ADD,
    LIST,
    EXIT;
    public static Commands fromString(String command){
        return Commands.valueOf(command.trim().toUpperCase());
    };
}
