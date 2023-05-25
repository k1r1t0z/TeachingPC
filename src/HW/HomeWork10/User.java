package HW.HomeWork10;

public class User {
    private int age;
    private String name;
    private char gen;

    public User(int age, String name, char gen) {
        this.age = age;
        this.name = name;
        this.gen = gen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    @Override
    public int hashCode() {
        return 100 * age * 345;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gen=" + gen +
                '}';
    }
}
