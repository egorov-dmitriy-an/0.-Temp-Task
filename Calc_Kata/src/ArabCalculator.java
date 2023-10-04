import java.util.Optional;
import java.util.regex.Pattern;

public class ArabCalculator extends Calculator{
    public ArabCalculator() {
        super(Pattern.compile("[1-9]|10"));
    }

    @Override
    public Optional<String> numberToVisible(int number) {
        return Optional.of(String.valueOf(number));
    }

    @Override
    public int visibleToNumber(String visible) {
        return Integer.parseInt(visible);
    }
}