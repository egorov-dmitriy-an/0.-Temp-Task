import java.util.Arrays;
import java.util.List;

/**
 * Класс - Отец
 */
public class Father implements Mann {

    int age;
    String name;
    String grandpa;

    /**
     * Конструктор создания экзепляра класса
     * @param name    Имя отца
     * @param age     Возраст отца
     * @param grandpa Имя дедушки
     */
    Father(String name, int age, String grandpa) {
        this.name = name;
        this.age = age;
        this.grandpa = grandpa;
    }

    /**
     * Метод показывает информацию о отце
     */
    @Override
    public void showInfo() {
        System.out.println("Father - " + name + ", Age - " + age);
    }

    /**
     * Метод добавления пары сын-отец
     */
    List <String> addFatherList() {
        return (Arrays.asList(name, grandpa));
    }

    /**
     * Метод показывает информацию о сыновьях человека
     */
    void showSon(List<List<String>> sonList) {
        boolean status = false;
        for (List<String> list : sonList) {
            if (list.get(1).equals(name)) {
                System.out.println(name + " has son - " + list.get(0));
                status = true;
            }
        }
        if (!status) System.out.println(name + " has no sons!");
    }
}