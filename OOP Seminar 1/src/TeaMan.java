/**
 * Это класс любителей чая
 */
public class TeaMan extends Person {
    /**
     * Это конструктор
     * @param name это имя
     * @param age это возраст
     */
    public TeaMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void iLike() {
        System.out.println("My name " + name + ", im " + age + ", im drink tea");
    }
}
