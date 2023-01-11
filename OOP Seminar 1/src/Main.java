import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dmitriy", 36);
        Person teaMan = new TeaMan("Vladimir", 30);
        Person coffeeMan = new CoffeeMan("Andrew", 25);

        List<Person> personArrayList = Arrays.asList(person, teaMan, coffeeMan);
        for (Person p : personArrayList) {
            p.iLike();
        }

    }
}
