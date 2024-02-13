import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> myList = List.of(1, 2, 3);

        Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(cumulativeSum);

        Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        // create a list of strings.
        // fill that list with your daily school schedule
        List<String> meList = List.of(
                "Japanese",
                "Biology",
                "History",
                "SoftwareDevelopment",
                "WebsiteAndDatabaseDevelopment",
                "Trig",
                "English");
        // write a Function<String, String> toLowerCase
        // the function will equal (s) -> s.toLowerCase();
        Function<String, String> toLowerCase = (s) -> s.toLowerCase();
        // map your list of strings to another list of strings using
        // .stream().map(toLowerCase).toList(); and set to a variable called
        // lowerCaseSchedule
        List<String> lowerCaseSchedule = meList.stream().map(toLowerCase).toList();
        // System.out.println(your lower cased list)
        System.out.println(lowerCaseSchedule);

    }
}
