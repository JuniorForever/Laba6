import java.util.Comparator;
import java.util.List;

public class MaxListStr {

    private  String maxString;

    public  String findMaxStr(List<String> list) {
        list.stream().max(Comparator.comparing(String::length)).ifPresent(max -> maxString = max);
        return maxString;
    }
}
