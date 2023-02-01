public class Main {
    public static void main(String[] args) {
        /**
         * Создание экзепляра интерфейса дискриминанта с лямбда-функцией
         */
        I__Discriminant disk = (a, b, c) -> (b * b - 4 * a * c) > 0;

        int a = 1, b = -15, c = 36;

        /**
         * Нахождение корней уравнения
         */
        if (disk.square(a, b, c)) {
            System.out.print("x1 = " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a) + ", x2 = " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        } else {
            System.out.print("Действительных корней нет");
        }
    }
}