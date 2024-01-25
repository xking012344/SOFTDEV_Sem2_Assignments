public class App {
    public static void main(String[] args) throws Exception {
        Property<Double> number1 = new Property<Double>(3.0);
        Property<Double> number2 = new Property<Double>(2.0);

        System.out.println("number1 > number2" + number1.isGreaterThan(number2));
        System.out.println("number1 > number2" + number1.isLessThan(number2));
        //TODO:  repeat for equals, notequals, greaterThanorequals, less than or equals
        Property<Double> number3 = new Property<Double>(5.0);
        Property<Double> number4 = new Property<Double>(5.0);
        System.out.println("number1 = number2" + number3.isEqual(number4));

        Property<Double> number5 = new Property<Double>(5.0);
        Property<Double> number6 = new Property<Double>(6.0);
        System.out.println("number5 doesn't = number6" + number5.isNotEqual(number6));

        Property<Double> number7 = new Property<Double>(5.0);
        Property<Double> number8 = new Property<Double>(5.0);
        System.out.println("number7 >/= number8" + number7.isGreaterThanOrEqual(number8));
        System.out.println("number7 </= number8" + number7.isLessThanOrEqual(number8));
        
    }
}
