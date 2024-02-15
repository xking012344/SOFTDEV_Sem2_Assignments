import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> ints = IntStream.rangeClosed(0, 10).boxed().toList();
        Function<Integer, Integer> add5Func = (number) -> number + 5;

        List<Integer> intsPlus5 = ints.stream().map(add5Func).toList();

        Consumer<Integer> intPrinter = (number) -> System.out.println(number);
        intsPlus5.stream().forEach(intPrinter);

        //TODO:  write a div2Func Function like I did with add5Func
        Function<Integer, Integer> div2Func = (number) -> number / 2;
        //TODO:  apply div2Func to intsPlus5 with map
        List<Integer> intPlus5Div2 = intsPlus5.stream().map(div2Func).toList();
        //TODO:  print with foreach.  
        Consumer<Integer> intPrinter2 = (number) -> System.out.println(number);
        intPlus5Div2.stream().forEach(intPrinter2);

    }
}
