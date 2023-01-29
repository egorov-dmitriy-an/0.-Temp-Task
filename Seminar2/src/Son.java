import java.util.Arrays;
import java.util.List;

/**
 * Класс - Сын
 */
public class Son implements Mann {

    int age;
    String name;
    String grandpa;
    String father;

    /**
     * Конструктор создания экзепляра класса
     * @param name    Имя сына
     * @param age     Возраст сына
     * @param grandpa Имя дедушки
     * @param father  Имя отца
     */
    Son(String name, int age, String grandpa, String father) {
        this.name = name;
        this.age = age;
        this.grandpa = grandpa;
        this.father = father;
    }

    /**
     * Метод показывает информацию о сыне
     */
    @Override
    public void showInfo() {
        System.out.println("Son - " + name + ", Age - " + age);
    }

    /**
     * Метод добавления пары сын-отец
     * @return
     */
    List addFatherList() {
        List<String> fat = Arrays.asList(name, father);
        return fat;
    }

    /**
     * Метод добавления пары внук-дед
     * @return
     */
    List addGrandpaList(){
        List<String> grand = Arrays.asList(name, grandpa);
        return grand;
    }
}