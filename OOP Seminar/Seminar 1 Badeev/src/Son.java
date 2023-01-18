import java.util.Arrays;
import java.util.List;

/**
 * Класс - Сын
 */
class Son extends Grandpa {
    String grandpa;
    String father;

    /**
     * @param name    Имя сына
     * @param age     Возраст сына
     * @param grandpa Имя дедушки
     * @param father  Имя отца
     */

    Son(String name, int age, String grandpa, String father) {
        super(name, age);
        this.grandpa = grandpa;
        this.father = father;
    }

    /**
     * Метод показывает информацию об сыне
     */
    @Override
    void showInfo() {
        System.out.println("Son - " + name + ", Age - " + age);
    }

    List addFatherList() {
        List<String> fat = Arrays.asList(name, father);
        return fat;
    }

    List addGrandpaList(){
        List<String> gran = Arrays.asList(name, grandpa);
        return gran;
    }
}
