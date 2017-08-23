import org.junit.Assert;
import org.junit.Test;

public class JudgeRouteCircle {
    @Test
    public void test() {
        Assert.assertEquals(true, judgeCircle("UUDDLLRR"));
        Assert.assertEquals(false, judgeCircle("UDLLR"));
    }

    public boolean judgeCircle(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;
        int d = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                default:
                    break;
            }
        }

        return l == r && u == d;
    }
}
