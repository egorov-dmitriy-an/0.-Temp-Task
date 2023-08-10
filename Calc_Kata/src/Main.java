import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }

    private static ArabCalculator arabCalculator = new ArabCalculator();
    private static RimCalculator rimCalculator = new RimCalculator();

    public static String calc(String input) {
        Optional<String> result = Optional.empty();
        if (arabCalculator.isValidExpression(input)) {
            result = arabCalculator.eval(input);
        }
        else if (rimCalculator.isValidExpression(input)) {
            result = rimCalculator.eval(input);
        }
        if (result.isEmpty()) throw new IllegalStateException("Выражение '"+input+"' является неверным.");
        return result.get();

    }
}