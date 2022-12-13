import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Seminar2Task2
{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.print("Введите начальное значение - ");
        int start = in.nextInt();
        System.out.print("Введите конечное значение - ");
        int end = in.nextInt();
        System.out.print("Введите шаг суммы - ");
        int sum = in.nextInt();
        System.out.print("Введите шаг произведения - ");
        int mult = in.nextInt();
        int limit = start;
        int total = way(start, end, sum, mult, limit);
        System.out.print("Количество путей равно - " + total);
    }

    public static int way (int a, int b, int k1, int k2, int stop){
        int count = 0;
        List result = new ArrayList();

        while

    }


    public static int provSum(int a, int b, int k1, int k2){
        if ((a + k1) = b){
            return 1;
        }
        else if ((a + k1) < b){
            return 2;
        }
        else return 3;
    }


}