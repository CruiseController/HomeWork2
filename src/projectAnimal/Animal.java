package projectAnimal;

public abstract class Animal{
    private String name;
    private Integer age;
    private Double weight;
    private String color;

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

    public abstract void say();

    private void go(){};

    private void drink(){};

    private void eat(){};

    public Animal(String name, Integer age, Double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

        public String toString() {
        YearType yearType = new YearType();
        return "Привет меня зовут " +
                name +
                ", мне " + yearType.ageYear(age) +
                ", мой вес " + weight + " кг." +
                ", мой цвет " + color;

    }

}
