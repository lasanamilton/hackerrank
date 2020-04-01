import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class scratc {

    public static void main (String[] ars) {
        System.out.println("Enter number of rows and columns: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> tempRow = new ArrayList<>();
        boolean loopTrigger = true;
        int tempRowPlace = 0;

        while(loopTrigger) {

            for (int i = 0; i < input; i++) {
                for (int j = 0; j < input; j++) {
                    System.out.println("Enter array for row #" + (i+1) + " of column #" + (j+1));
                    Integer number = scanner.nextInt();
                    tempRow.add(tempRowPlace, number);
                    tempRowPlace++;
                }
                matrix.add(i, tempRow.stream().skip((i*input)).limit(input).collect(Collectors.toList()));
//                tempRow.clear();
            }

            System.out.println(diagonalDifference(matrix));
        }
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int totalDifference = 0;
        List<Integer> firstRow = arr.get(0);
        List<Integer> tempRow = new ArrayList<>();
        IntStream stream = Arrays.stream(arr)

        for (int i = 0; i < firstRow.size(); i++) {
            for (int j = i; j <= i; j++) {
                tempRow.add(j, arr.stream().skip(i).limit(1).map(arr -> Stream.of(arr).mapToInt(arr.get(i)+arr.get(j)));
            }

            for (int number : tempRow) {
                totalDifference += number;
            }
        }

        return totalDifference;
    }
}
