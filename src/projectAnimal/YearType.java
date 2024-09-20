package projectAnimal;

public class YearType {


    public String ageYear(Integer age) {
        if (age % 10 == 1 && age % 100 != 11) {
            return age + " год";
        }
        if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
            return age + " года";
        }
        return age + " лет";
    }

    }
