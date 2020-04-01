package simplearraysum;

    import java.util.Arrays;

public class test {

    public static void main (String[] args) {
        simpleArraySum(new int[]{4, 3, 2, 1});
    }

    public static int simpleArraySum(int[] ar) {
        int total = 0;
        int counter = 0;
        String operator = "";

        for (int digit : ar) {
            System.out.print(digit);
            total += digit;
            operator = (counter < (ar.length-1)) ? " + " : " = ";
            System.out.print(operator);
            counter++;
        }

        System.out.print(total);

        return total;
    }

}
