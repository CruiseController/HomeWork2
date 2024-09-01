package projectAnimal;

public abstract class Animal {
    String name;
    Integer age;
    Double weight;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String ageYear() {
        if (age % 10 == 1 && age % 100 != 11) {
            return age + " год";
        }
        if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
            return age + " года";
        }
        return age + " лет";
    }

    public abstract void say();

    public abstract void go();

    public abstract void drink();

    public abstract void eat();

    public Animal(String name, Integer age, Double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Привет меня зовут " +
                name +
                ", мне " + ageYear() +
                ", мой вес " + weight +
                ", мой цвет " + color + " кг.";

    }

}
