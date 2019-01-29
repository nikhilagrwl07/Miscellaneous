package Completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletablefutureInJava8Example2 {

    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();

        processOnCompletableFuture(completableFuture);

        completableFuture.complete(2);
    }

    private static void processOnCompletableFuture(CompletableFuture<Integer> completableFuture) {
        completableFuture
                .thenApply(data -> data*2)
                .thenApply(data -> data+1)
                .thenAccept(System.out::println);

    }
}
