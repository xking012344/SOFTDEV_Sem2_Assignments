public class SqrtRunnable implements Runnable {

    private Thread t;
    private double number;

    SqrtRunnable(double number) {
        this.number = number;
    }

    @Override
    public void run() {
<<<<<<< HEAD
        System.out.println(Math.sqrt(number));
=======
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
