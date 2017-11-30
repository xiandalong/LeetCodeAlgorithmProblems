import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelfDividingNumbers {

    @Test
    public void Test() {
        assertEquals(selfDividingNumbers(1, 22), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i)) {
                results.add(i);
            }
        }
        return results;
    }

    private boolean isDividingNumber(int num) {
        char[] digitsArray = Integer.toString(num).toCharArray();
        for (char digitChar : digitsArray) {
            int digit = Character.getNumericValue(digitChar);
            if (digit == 0 || num % digit != 0) {
                return false;
            }
        }
        return true;
    }
}
