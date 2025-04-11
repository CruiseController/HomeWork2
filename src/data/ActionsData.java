package data;

public enum ActionsData {
    ADD, LIST, EXIT, SEARCH, UPDATE;

    public static ActionsData toEnumActionsFunc(String userInputData) {

        userInputData = userInputData.toUpperCase().trim();
        return ActionsData.valueOf(userInputData);
    }


}
