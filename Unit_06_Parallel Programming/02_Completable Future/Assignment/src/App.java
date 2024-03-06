import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Double> ranNum = CompletableFuture.supplyAsync(
            () -> Math.random()
        );
        CompletableFuture<Void> newRanNum = ranNum.thenAccept(s -> {
            System.out.println(s * 2);
        });

        newRanNum.get();
    }
}
