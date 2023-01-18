import java.util.ArrayList;
import java.util.List;

class Program {
    public static void main(String args[]) {
        List<List> fathers = new ArrayList<List>();
        List<List> sons = new ArrayList<List>();

        Grandpa grandpa = new Grandpa("Anatoliy", 67);

        Father father1 = new Father("Dmitriy", 36, "Anatoliy");
        fathers.add(father1.addFatherList());

        Father father2 = new Father("Mikhail", 36, "Anatoliy");
        fathers.add(father2.addFatherList());

        Son son1 = new Son("Leonid", 6, "Anatoliy", "Dmitriy");
        sons.add(son1.addGrandpaList());
        fathers.add(son1.addFatherList());

        Son son2 = new Son("Semion", 8, "Anatoliy", "Dmitriy");
        sons.add(son2.addGrandpaList());
        fathers.add(son2.addFatherList());

        Son son3 = new Son("Aleksey", 8, "Anatoliy", "Mikhail");
        sons.add(son3.addGrandpaList());
        fathers.add(son3.addFatherList());

        System.out.println();
        System.out.println("Arrays from fathers" + fathers);
        System.out.println();
        System.out.println("Arrays from grandpa" + sons);
    }
}