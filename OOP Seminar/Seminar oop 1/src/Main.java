import java.util.*;

class Main {
    public static void main(String args[]) {
        Animal dog = new Dog("Barb", 15, "black");
        System.out.println(dog.age + "   " + dog.name);
        Animal animal = new Animal("Crock", 10);
        System.out.println(animal.age + "   " + animal.name);
        List<Animal> an = Arrays.asList(animal, dog);
        for (Animal a : an) {
            a.show();
        }
    }
}


