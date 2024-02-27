public class SqrtRunnable implements Runnable {

    private Thread t;
    private double number;

    SqrtRunnable(double number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(Math.sqrt(number));
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
