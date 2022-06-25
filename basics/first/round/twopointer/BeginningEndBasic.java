package basics.first.round.twopointer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This class illustrate basic use of
 * Starting and End 2 Pointer technique
 * Time complexity O(n)
 * 
 * @author MKT
 */
public class BeginningEndBasic {

    private static final Logger logger = Logger.getLogger("BeginningEndBasic");

    private static void reverse(char[] str) {
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            swap(str, i, j);
            i++;
            j--;
        }
        String outputStr = Arrays.toString(str);
        logger.info(outputStr);
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        logger.info("Enter the string - ");
        try (Scanner inputScanner = new Scanner(System.in)) {
            String inputStr = inputScanner.nextLine();
            logger.info(inputStr);
            reverse(inputStr.toCharArray());
        }
    }
}
