import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> str = new ArrayList<>();
       str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        List<Integer> ints = new ArrayList<>();
        int res;
        SumListElements sumListElements = new SumListElements();
        StringListToIntList stringListToIntList = new StringListToIntList();
        ints = stringListToIntList.stringToInt(str);
       res = sumListElements.sumListElements(ints);
        System.out.println(res);
    }
}