package Phonebook.Core.MVP;

import java.util.Scanner;

public class ConsoleView {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    public String getFirstName() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
    }
}
