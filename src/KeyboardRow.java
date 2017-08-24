import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class KeyboardRow {
    @Test
    public void test() {
        String[] input = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] expected = new String[]{"Alaska", "Dad"};
        Assert.assertArrayEquals(expected, findWords(input));
    }

    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        List<String> res = new ArrayList<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (wordInLowerCase.length() != 0) {
                if (areAllCharInSameRow(wordInLowerCase, row1)) {
                    res.add(word);
                } else if (areAllCharInSameRow(wordInLowerCase, row2)) {
                    res.add(word);
                } else if (areAllCharInSameRow(wordInLowerCase, row3)) {
                    res.add(word);
                }
            }
        }
        return res.toArray(new String[0]);
    }

    private boolean areAllCharInSameRow(String word, Set<Character> row) {
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
