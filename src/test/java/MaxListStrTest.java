import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaxListStrTest {
    MaxListStr maxListStr = new MaxListStr();
    ArrayList<String> strings = new ArrayList<>(
            Arrays.asList("bombombom", "bombombombom", "bom"));
    @Test
    public void findMaxStr() {
        String actual = maxListStr.findMaxStr(strings);
        String expected = "bombombombom";
        assertEquals(actual,expected);
    }
}