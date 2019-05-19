import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringListToIntListTest {
    StringListToIntList stringListToIntList = new StringListToIntList();
    ArrayList<String> strings = new ArrayList<>(
            Arrays.asList("1", "2", "3"));
    ArrayList<Integer> ints = new ArrayList<>(
            Arrays.asList(1, 2, 3));
    @Test
    public void stringToInt() {
        List<Integer> actual = stringListToIntList.stringToInt(strings);
        List<Integer> expected = ints;
        assertEquals(actual,expected);
    }
}