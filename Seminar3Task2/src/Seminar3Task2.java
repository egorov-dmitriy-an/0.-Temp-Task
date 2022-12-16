import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


class Seminar3Task2
{
    public static void main(String args[]){
        List one = new ArrayList();
        List two = new ArrayList();
        one = create();
        two = create();
        System.out.println (one);
        System.out.println (two);
        sort(one, two);
        sort(two, one);

    }

// f z q w e r a s - 8
// f d q w a s r t e q a - 11
    public static void sort (List first, List second){
        int index = 0;
        List result = new ArrayList();
        for (int i = 0; i < first.size(); i ++) {
            for (int j = index; j < second.size(); j ++){
                System.out.println ("i = " + i + " j = " +j);

                if (second.get(i).equals(first.get(j))) {
                    System.out.println ("ok");
                    result.add(first.get(i));
                    System.out.println (first.get(i));
                    index = j + 1;
                    j = second.size();
                }
            }
        }
        System.out.println(result);
    }

    public static List create (){
        List arr = new ArrayList();
        Scanner in = new Scanner (System.in);
        System.out.print("Length array - ");
        int len = in.nextInt();
        for (int i = 0; i < len; i++){
            System.out.print("Element " + i + " - ");
            String num = in.next();
            arr.add(num);
        }
        return (arr);
    }
}
