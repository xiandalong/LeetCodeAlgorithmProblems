import org.junit.Assert;
import org.junit.Test;

public class HammingDistance {

    @Test
    public void test() {
        Assert.assertEquals(2, hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        int sum = 0;
        int join = x ^ y;
        while (join != 0) {
            if ((join & 1) == 1) {
                sum++;
            }
            join = join >> 1;
        }
        return sum;
    }
}
