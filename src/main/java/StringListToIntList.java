import java.util.ArrayList;
import java.util.List;
        import java.util.stream.Collectors;

public class StringListToIntList {

   private List<Integer> ints = new ArrayList();

    public  List<Integer> stringToInt(List<String> list) throws NumberFormatException{
        try {
            ints =  list.stream().map(Integer::parseInt).collect(Collectors.toList());
        }catch (NumberFormatException e){
            System.out.println("Неверный формат числа в списке строк");
        }
        return ints;
    }
}
