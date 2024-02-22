public class StringProperty {

    public static StringProperty of(String value) {
        return new StringProperty(value);
    }

    private String value;

    private StringProperty(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }

    public void set(String value) {
        this.value = value;
    }

    public StringProperty plus(StringProperty value) {
        this.value += value.get();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
