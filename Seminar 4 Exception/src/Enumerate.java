public class Enumerate {
    enum Color {
        red("#FF0000", 1), green("#00FF00", 2), blue("#0000FF", 3);
        private final String code;
        private final int text;

        Color(String code, int text) {
            this.code = code;
            this.text = text;
        }

        public String getCode() {
            return code;
        }

        public int getText() {
            return text;
        }
    }

    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.printf("%s(%s) (%s)", c, c.getCode(), c.getText());
        }
    }
}