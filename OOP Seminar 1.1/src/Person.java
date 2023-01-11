import java.util.ArrayList;

public class Person {
    public String fullName;
    private ArrayList<Person> family = new ArrayList<>();

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void appendToFamily(Person person) {
        family.add(person);
    }

    public ArrayList<Person> getFamily() {
        return family;
    }

    public String getFullName() {
        return fullName;
    }
}
