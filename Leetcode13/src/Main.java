import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        System.out.println(romanToInt(number));
    }

    public static int romanToInt(String s) {
        int rom = 0;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') num.add(1);
            if (s.charAt(i) == 'V') num.add(5);
            if (s.charAt(i) == 'X') num.add(10);
            if (s.charAt(i) == 'L') num.add(50);
            if (s.charAt(i) == 'C') num.add(100);
            if (s.charAt(i) == 'D') num.add(500);
            if (s.charAt(i) == 'M') num.add(1000);
        }
        System.out.println(num);
        ArrayList<Integer> num2 = new ArrayList<>();
        int k = 1;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < num.get(i + 1)) {
                switch (num.get(i + 1)) {
                    case 5:
                        rom += 4;
                        i++;
                        break;
                    case 10:
                        rom += 9;
                        i++;
                        break;
                    case 50:
                        rom += 40;
                        i++;
                        break;
                    case 100:
                        rom += 90;
                        i++;
                        break;
                    case 500:
                        rom += 400;
                        i++;
                        break;
                    case 1000:
                        rom += 900;
                        i++;
                        break;
                    default:
                        break;
                }
            }
            else {
                rom = +num.get(i);
            }
        }
        return rom;
    }
}