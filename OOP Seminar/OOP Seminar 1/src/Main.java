import java.util.*;

class Main {
    public static void main(String args[]) {
        Animal dog = new Dog("Barbos", 15, "black");
        System.out.println(dog.age + "   " + dog.name);
        Animal animal = new Animal("Crock", 10);
        System.out.println(animal.age + "   " + animal.name);
        List<Animal> an = Arrays.asList(animal, dog);
        for (Animal a : an) {
            a.show();
        }
    }
}


public class Animal {
    int age;
    String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " - animal");
    }
}

public class Dog extends Animal {
    String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void show() {
        System.out.println(name + " - dog");
    }
}