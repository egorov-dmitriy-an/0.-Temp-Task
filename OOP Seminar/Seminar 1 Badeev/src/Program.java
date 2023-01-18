import java.util.HashMap;
import java.util.Map;

class Program {
    public static void main(String args[]) {

        Grandpa grandpa = new Grandpa("Anatoliy", 67);
        grandpa.showInfo();

        Father father1 = new Father("Dmitriy", 36, "Anatoliy");
        father1.showInfo();

        Father father2 = new Father("Mikhail", 36, "Anatoliy");
        father2.showInfo();

        Son son1 = new Son("Leonid", 6, "Anatoliy", "Dmitriy");
        son1.showInfo();

        Son son2 = new Son("Semion", 8, "Anatoliy", "Dmitriy");
        son2.showInfo();

        Son son3 = new Son("Aleksey", 8, "Anatoliy", "Mikhail");
        son3.showInfo();

        Map<Son, Grandpa> grandpaHashMap = new HashMap<>();
        Map<Son, Father> fatherHashMap = new HashMap<>();



        }

        void addSon (Son s, Grandpa g) {
        


    }
}






