package averybigsum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class test {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        int amount = Integer.valueOf(scanner.nextLine());
        long number;
        long[] numberList = new long[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number #" + (i+1) + " of " + amount);
            number = Long.valueOf(scanner.nextLine());
            Array.setLong(numberList, i, number);
        }
        System.out.print(aVeryBigSum(numberList));
    }

    public static long aVeryBigSum(long[] ar) {
        long total = 0;

        for (long amount : ar) {
                total += amount;
            }

        return total;
        }
    }
