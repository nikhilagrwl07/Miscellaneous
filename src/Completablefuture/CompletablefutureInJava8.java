package Completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class CompletablefutureInJava8 {

    private static ForkJoinPool forkJoinPool = new ForkJoinPool(100);

    public static int compute(){
        System.out.println("compute : "+ Thread.currentThread());
        return 2;
    }

    public static void printIt(int value){
        System.out.println("printIt value : " + value);
        System.out.println("printIt : " + Thread.currentThread());
    }

    public static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync(() ->  compute(),forkJoinPool);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main : " + Thread.currentThread());
        CompletableFuture<Integer> integerCompletableFuture = create(); // CompletableFuture thread is in pending state
//        Thread.sleep(1000); // CompletableFuture thread is in resolved state and done it's work
        integerCompletableFuture
                .thenApply(data -> data*2)
                .thenApply(data -> data+1)
                .thenAccept(data -> printIt(data));  // Since CompletableFuture thread has done it's job, so printIt has ran on main thread
//        Thread.sleep(1000);
    }
}
