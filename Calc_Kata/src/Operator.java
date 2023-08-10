public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTI("*"),
    DEL("/");

    private final String sign;

    public String getSign() {
        return sign;
    }

    public static Operator getOfSign(String sign) {
        return switch (sign) {
            case "+" -> PLUS;
            case "-" -> MINUS;
            case "*" -> MULTI;
            case "/" -> DEL;
            default -> throw new IllegalArgumentException("Оператор не найден");
        };
    }

    Operator(String sign) {
        this.sign = sign;
    }
}