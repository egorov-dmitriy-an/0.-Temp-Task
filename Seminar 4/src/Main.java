public class Main {
    public static void main(String[] args) {
        Arrays<Integer> integerArray = new Arrays<> (1, 2, 3, 4, 5);
        Arrays<Integer> anotherIntegerArray = new Arrays<> (1, 2, 4, 3, 5);
        Arrays<Double> doubleArrays = new Arrays<> (1.0, 2.0, 3.0, 4.0, 4.0);
        System.out.println("sred = " + integerArray.avg());
        System.out.println(integerArray.samAvg(anotherIntegerArray));
        System.out.println(integerArray.samAvg(doubleArrays));
    }
}