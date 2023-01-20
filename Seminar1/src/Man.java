/**
 * Класс - Человек
 */
class Man {
    int age;
    String name;

    /**
     * Конструктор создания экзепляра класса
     *
     * @param name Имя
     * @param age  Возраст
     */
    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод показывает информацию
     */
    void showInfo() {
        System.out.println("Man - " + name + ", Age - " + age);
    }
}