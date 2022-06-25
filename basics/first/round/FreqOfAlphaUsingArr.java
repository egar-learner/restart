package basics.first.round;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This class contains a function that will only use simple array and tell the
 * frequency of all the alphabets/any character
 * Time complexity - O(n)
 * 
 * @author MKT
 */
class FreqOfAlphaUsingArr {

    private static final Logger logger = Logger.getLogger("FreqOfAlpha");

    /**
     * Entry method for the program
     */
    public static void main(String[] args) {
        logger.info("Enter the string - ");
        try (Scanner inputScanner = new Scanner(System.in)) {
            String inputStr = inputScanner.nextLine();
            printFreqOfChars(inputStr.toCharArray());
        }
    }

    /**
     * This method takes an input character array and prints the frequency of each
     * of its character
     * 
     * @param charArray Input character array
     */
    private static void printFreqOfChars(char[] charArray) {
        int[] freq = new int[256];
        for (int i = 0; i < charArray.length; i++) {
            freq[charArray[i]]++;
        }

        logger.info("Printing frequency next!!");

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                strBuilder.append("[" + (char) (i) + "] = " + freq[i] + " | ");
            }
        }
        String finalStr = strBuilder.toString();
        logger.info(finalStr);
    }

}