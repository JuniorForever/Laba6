import java.util.List;

public class SumListElements {

    private static int sum;

    public  int sumListElements(List<Integer> list){
        list.stream().forEach(value->sum+=value);
        return sum;
    }
}
