package basics.first.round;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * This class is used to calculate the frequency of any character that is given
 * in the input string
 * We are hardcoding and taking the input to ensure that it also works for
 * UNICODE characters
 * 
 * Time complexity O(n)
 * 
 * @author MKT
 */
public class FreqOfAnyCharUsingHash {

    private static final Logger logger = Logger.getLogger("FreqOfAnyCharUsingHash");

    private static void printFreq(char[] str) {
        HashMap<Character, Integer> freqHashMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (null == freqHashMap.get(str[i]))
                freqHashMap.put(str[i], 1);
            else
                freqHashMap.put(str[i], freqHashMap.get(str[i]) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freqHashMap.entrySet()) {
            logger.info("[" + entry.getKey() + "] = " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        char[] str = "◣⚽◢⚡◣⚾⚡◢".toCharArray();
        printFreq(str);
    }
}
