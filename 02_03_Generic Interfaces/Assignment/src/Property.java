public class Property<T extends Comparable<T>> implements Inequality<T> {

    private T t;

    public Property(T t) {
        this.t = t;
    }

    public Property() {
        this.t = null;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    @Override
    public boolean isEqualTo(T other) {
        if (t.compareTo(other) == (t.compareTo(other))) {
            return true;
        } else {
            return false;
        }
    }

}
