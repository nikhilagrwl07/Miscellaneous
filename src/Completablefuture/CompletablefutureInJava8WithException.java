//package Completablefuture;
//
//import java.util.concurrent.CompletableFuture;
//
//public class CompletablefutureInJava8WithException {
//
//    public static void main(String[] args) {
//        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
//
//        processOnCompletableFuture(completableFuture);
//
////        completableFuture.complete(2);
//        completableFuture.completeExceptionally(new RuntimeException("Something went wrong!!"));
//    }
//
//    private static void processOnCompletableFuture(CompletableFuture<Integer> completableFuture) {
//        completableFuture
//                .exceptionally(throwable -> handle(throwable))
//                .thenApply(data -> data*2)
//                .thenApply(data -> data+1)
//                .thenAccept(System.out::println);
//
//    }
//
//    private static Integer handle(Throwable throwable) {
//        System.out.println("ERROR : " + throwable);
////        return 100;
//        return new
//    }
//}
