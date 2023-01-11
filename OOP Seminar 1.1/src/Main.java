public class Main {
    public static void main(String[] args) {
        Person first = new Person("Ivanov Ivan");
        Person second = new Person("Petrov Petr");
        Person third = new Person("Vasiliev Vasiliy");
        first.appendToFamily(second);
        first.appendToFamily(third);
        view(first);
    }

    static void view(Person rootPerson) {
        System.out.println(rootPerson.fullName);
        for (Person person : rootPerson.getFamily()) {
            if (person != null) {
                view(person);
            }
        }
    }
}