// ApplyAsync , then apply and thenapplyAsync and all method for the chainning 
package Multithreading.Lock_variable;

import java.util.concurrent.*;

public class CompleteTableFuture {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
            1, // core pool size
            2, // max pool size
            10, TimeUnit.SECONDS, // keep-alive time
            new ArrayBlockingQueue<>(10), // work queue
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

        try {
            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                // supply the fucntion that you need to work on it 
                return "Task Completed";
            }, threadPool).thenApply((String val) -> {
                return val + " Coding";
            });

            // Wait for the result and print it
            String result = asyncTask1.get(); // or asyncTask1.join();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging
        } finally {
            threadPool.shutdown(); // Always shut down the executor
        }
        
        // second thrtead is created here to perform the task 
        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
            try{
                System.out.println("ThreadName of SupplyAsync:" + Thread.currentThread().getName());
                Thread.sleep(2000);
            }    
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return "Mai hu new thread2 new operation perform kro ";
            }, threadPool);
            
            CompletableFuture<String> ans = asyncTask2.thenApplyAsync((String val)->{
                System.out.println("ThreadName of Then Apply method :" + Thread.currentThread().getName());
                return "AND";
                // when we pass the same pool 
                // it wil take the same pool with same thread also 
            },threadPool);
            System.out.println("new answer is " + ans) ;
            
            
        // then combine is also used for that when we need to chaining the thing
        // we create t ethread 3rd for that perform the operations 
        CompletableFuture<String> asyncTask3 = CompletableFuture.supplyAsync(() -> "world", threadPool);
        CompletableFuture<String> asyncTask4 = CompletableFuture.supplyAsync(() -> "Hello", threadPool);
        CompletableFuture<String>ans1=asyncTask3.thenCombine(asyncTask4, (val1, val2) -> val1 + val2);
        try{
            System.out.println(ans1.get());
        }
        catch(Exception e)
        {
            System.out.println("error hu bhai ");
        }

        // this is the logic for the then accept also 
//    combined.thenAccept(result -> System.out.println("Combined Result: " + result));

//  same for the then compose also we are doing 
        
    }
}
