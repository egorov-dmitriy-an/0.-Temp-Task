/**
 * Класс - Дедушка
 */
class Grandpa extends Man{
    int age;
    String name;

    /**
     * Конструктор создания экзепляра класса
     *
     * @param name Имя
     * @param age  Возраст
     */
    Grandpa(String name, int age) {
        super(name, age);
    }

    /**
     * Метод показывает информацию о дедушке
     */
    @Override
    void showInfo() {
        System.out.println("Grandpa - " + name + ", Age - " + age);
    }
}