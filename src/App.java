
import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<Number> numbers = Arrays.asList(54.2, 28, 11.8, 29.11, 85.23, 261.9, 352.45, 37.7, 100.82, 99.0);
        //numbers.stream().collect(Collectors.averagingDouble(null));
        Double result =numbers.stream().collect(Collectors.averagingDouble(num ->Double.parseDouble(num.toString())));
        System.out.println(result);
    }
}
