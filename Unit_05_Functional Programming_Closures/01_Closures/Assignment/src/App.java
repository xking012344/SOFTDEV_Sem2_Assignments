import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {

        DoubleProperty startProperty = DoubleProperty.of(7);
        Function<DoubleProperty, DoubleProperty> addToDoubleProperty = (d) -> {
            startProperty.plus(d);
            return startProperty;
        };

        StringProperty startProperty2 = StringProperty.of("you just got ");
        Function<StringProperty, StringProperty> addToStringProperty = (String) -> {
            startProperty2.plus(String);
            return startProperty2;
        };

        startProperty.plus(DoubleProperty.of(1)).plus(DoubleProperty.of(10));
        System.out.println(startProperty);

        startProperty2.plus(StringProperty.of("coconut ")).plus(StringProperty.of("malled"));
        System.out.println(startProperty2);
    }
}
