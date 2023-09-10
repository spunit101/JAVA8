import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Punit", "Vasant", "Shirsal");
        List<String> punit = list.stream().filter(e -> e.equals("Punit")).collect(Collectors.toList());
        System.out.println(punit);
    }
}
