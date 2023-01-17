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
