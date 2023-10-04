import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Calculator {

    private final Pattern numberPattern;
    private final Pattern expressionPattern;

    protected Calculator(Pattern numberPattern) {
        this.numberPattern = numberPattern;
        this.expressionPattern = Pattern.compile(String.format("(%s) ([+\\-\\*/]) (%s)", getNumberPattern().pattern(), getNumberPattern().pattern()));
    }

    public int calculate(int one, Operator operator, int two) {
        return switch (operator) {
            case PLUS -> one + two;
            case MINUS -> one - two;
            case MULTI -> one * two;
            case DEL -> one / two;
        };
    }

    public Pattern getNumberPattern() {
        return numberPattern;
    };

    public Pattern getExpressionPattern() {
        return expressionPattern;
    }

    public boolean isValidExpression(String expression) {
        return expressionPattern.matcher(expression).matches();
    }

    public abstract Optional<String> numberToVisible(int number);

    public abstract int visibleToNumber(String visible);

    public Optional<String> eval(String expression) {
        Pattern expressionPattern = getExpressionPattern();
        Matcher matcher = expressionPattern.matcher(expression);
        if(!matcher.matches()) throw new IllegalStateException("Выражение '"+expression+"' не является валидным.");
        int one = visibleToNumber(matcher.group(1));
        Operator operator = Operator.getOfSign(matcher.group(2));
        int two = visibleToNumber(matcher.group(3));
        int result = calculate(one, operator, two);
        return numberToVisible(result);
    }
}