import java.util.Arrays;
import java.util.List;

/**
 * Класс - Сын
 */
class Son extends Man {
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
        List<String> fath = Arrays.asList(name, father);
        return fath;
    }

    List addGrandpaList(){
        List<String> grand = Arrays.asList(name, grandpa);
        return grand;
    }
}
