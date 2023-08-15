package polymorphism;

/**
 * if parent and child class have same method and with same signature it is
 * called method overriding.
 */

public class Animal {

    public void sound() {
        System.out.println("Animal Sound.");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }

    @Override
    public void sound() {
        System.out.println("Dog Sound.");
    }
}


class Cat extends Animal {

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

    @Override
    public void sound() {
        System.out.println("Cat Sound.");
    }
}
