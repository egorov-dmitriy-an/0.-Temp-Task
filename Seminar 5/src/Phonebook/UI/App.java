package Phonebook.UI;

import java.util.Scanner;

import Phonebook.Config;
import Phonebook.Core.MVP.Presenter;
import Phonebook.Core.MVP.ConsoleView;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        ConsoleView view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
