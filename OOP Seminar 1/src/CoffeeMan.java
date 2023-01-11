/** *
 * Это класс любителей кофе
 */
public class CoffeeMan extends Person {
    /**
     * Это конструктор
     * @param name это имя
     * @param age это возраст
     */
    public CoffeeMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void iLike() {
        System.out.println("My name " + name + ", im " + age + ", im drink coffee");
    }
}


