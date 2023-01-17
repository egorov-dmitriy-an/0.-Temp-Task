/**
 * Это класс человек
 */
public class Person {
    public String name;
    public int age;

    /**
     * Это конструктор
     * @param name это имя
     * @param age это возраст
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    /**
     * Это метод приветствия
     */
    public void iLike() {
        System.out.println("My name " + name + ", im " + age + ", im drink");
    }
}
