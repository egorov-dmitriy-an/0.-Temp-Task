/**
 * Класс - Отец
 */
class Father extends Grandpa {
    String grandpa;

    /**
     * @param name Имя отца
     * @param age  Возраст отца
     * @param grandpa  Имя дедушки
     */
    Father(String name, int age, String grandpa) {
        super(name, age);
        this.grandpa = grandpa;
    }

    /**
     * Метод показывает информацию об отце
     */
    @Override
    void showInfo() {
        System.out.println("Father - " + name + ", Age - " + age);
    }
}