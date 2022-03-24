package by.itland.itjava.naumenko.lesson18;

public class Patterns {
    public static void main(String[] args) {
        Dog dog2 =Dog.getInstance();
        Dog dog3 =Dog.getInstance();
        Dog dog4 =Dog.getInstance();
        Dog dog5 =Dog.getInstance();

        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
    }
}

class Cat {

    int age;
    String name;
    double weight;
    String clas;
    String color;
    int foot;

    public Cat(int age, String name, double weight, String clas, String color, int foot, boolean isStreeet) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.clas = clas;
        this.color = color;
        this.foot = foot;
        this.isStreeet = isStreeet;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    boolean isStreeet;

    private static Cat instance;

    private Cat() {
    }

    public static Cat getInstance() {
        if (instance == null) {
            instance = new Cat();
        }
        return instance;
    }

}

class Dog {

    private final static Dog instance = new Dog();

    private Dog() {
    }

    public static Dog getInstance() {
       return instance;
    }

}
