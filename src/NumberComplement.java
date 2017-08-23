import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class NumberComplement {
    @Test
    public void test(){
        Assert.assertEquals(2, findComplement(5));
        Assert.assertEquals(0, findComplement(1));
    }

    public int findComplement(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            if ((num & 1) == 1) {
                stack.push(0);
            } else {
                stack.push(1);
            }
            num >>= 1;
        }
        int res = 0;
        while (!stack.empty()) {
            res = (res << 1) + stack.pop();
        }
        return res;
    }

    public int findComplementBestSolution(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
