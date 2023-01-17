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