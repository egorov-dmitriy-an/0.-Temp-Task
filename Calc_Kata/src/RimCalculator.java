import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

public class RimCalculator extends Calculator {

    static class RimConverter {
        private static Map<Integer, String> arabToRim = new LinkedHashMap<>(){{
            put(1000, "M");
            put(900, "CM");
            put(500, "M");
            put(400, "CM");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};

        private static Map.Entry<Integer, String> getMaxRimNumber(int number) {
            if (number < 1) throw new IllegalArgumentException("Число должно быть не отрицательным");
            return arabToRim.entrySet().stream().filter(entry->entry.getKey() <= number).findFirst().get();
        }

        public static String toRim(int number) {
            if (number < 1) return null;
            int currentNumber = number;
            StringBuilder result = new StringBuilder();
            while (currentNumber > 0) {
                Map.Entry<Integer, String> entry = getMaxRimNumber(currentNumber);
                currentNumber -= entry.getKey();
                result.append(entry.getValue());
            }
            return result.toString();
        }
    }

    public RimCalculator() {
        super(Pattern.compile("VIII|VII|VI|IV|V|III|II|IX|X|I"));
    }

    @Override
    public Optional<String> numberToVisible(int number) {
        return Optional.ofNullable(RimConverter.toRim(number));
    }

    @Override
    public int visibleToNumber(String visible) {
        return switch (visible) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };
    }
}