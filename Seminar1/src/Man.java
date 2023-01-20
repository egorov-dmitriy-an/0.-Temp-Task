import java.util.List;

/**
 * Класс - Человек
 */
class Man {
    int age;
    String name;

    /**
     * Конструктор создания экзепляра класса человек
     *
     * @param name Имя
     * @param age  Возраст
     */
    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод показывает информацию о человеке
     */
    void showInfo() {
        System.out.println("Man - " + name + ", Age - " + age);
    }

    /**
     * Метод показывает информацию о сыновьях человека
     */
    public void showSon(List<List> sonList) {
        boolean status = false;
        for (List list : sonList) {
            if (list.get(1).equals(name)) {
                System.out.println(name + " has son - " + list.get(0));
                status = true;
            }
        }
        if (!status) System.out.println(name + " has no sons!");
    }

    /**
     * Метод показывает информацию о внуках человека
     */

    public void showGrandson(List<List> grandsonList) {
        boolean status = false;
        for (List list : grandsonList) {
            if (list.get(1).equals(name)) {
                System.out.println(name + " has grandson - " + list.get(0));
                status = true;
            }
        }
        if (!status) System.out.println(name + " has no grandsons!");
    }
}