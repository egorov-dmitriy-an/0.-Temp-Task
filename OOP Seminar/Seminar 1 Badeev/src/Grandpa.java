/**
 * Класс - Дедушка
 */
class Grandpa {
    int age;
    String name;

    /**
     * Конструктор создания экзепляра класса
     *
     * @param name Имя
     * @param age  Возраст
     */
    Grandpa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод показывает информацию о дедушке
     */
    void showInfo() {
        System.out.println("Grandpa - " + name + ", Age - " + age);
    }
}