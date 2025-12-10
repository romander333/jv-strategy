package core.basesyntax.Imple;

import java.util.*;

public class NewDiscount {

    public static boolean isParne(int num) {
    if ((num & 1) == 0) {
        return true;
    }
    return false;
    }



    public static int binarnFind(int[] sortedArray, int element) {
        int left = 0;
        int rigth = sortedArray.length - 1;

        while (left <= rigth) {
            int middle = (left + rigth) / 2;
            int current = sortedArray[middle];

            if (current == element) {
                return middle;
            } else if (current > element) {
                rigth = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] input = new int[6];
        input[0] = 2;
        input[1] = 2;
        input[2] = 12;
        input[3] = 4;
        input[4] = 11;
        input[5] = 0;
        String str = """
                hello hello hi man man I am good
                """;
//        Map<String, Integer> count = count(str);
//        for (Map.Entry<String, Integer> entry : count.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        System.out.println(isParne(3));

        int i1 = binarnFind(input, 8);
        System.out.println(i1);
    }
}
