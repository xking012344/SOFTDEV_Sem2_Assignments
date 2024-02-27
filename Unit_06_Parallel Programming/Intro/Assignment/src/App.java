public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i <= 100000; i++){
            SqrtRunnable demoSqrtRunnable = new SqrtRunnable(i);
            demoSqrtRunnable.start();
        }

        // for(int i = 0; i < 100000; i++){
        //     System.out.println(Math.sqrt(i));
        // }
    }
}
