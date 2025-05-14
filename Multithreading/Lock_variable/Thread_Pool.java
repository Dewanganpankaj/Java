package Multithreading.Lock_variable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ThreadFactory;

public class Thread_Pool {
    public static void main(String[] args) {
        // Create a custom thread pool
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                1, // core pool size
                2, // max pool size
                10, TimeUnit.SECONDS, // keep-alive time
                new ArrayBlockingQueue<>(2), // work queue
                new CustomThreadFactory(),
                new CustomRejectHandler()
        );
        threadPool.allowCoreThreadTimeOut(true);
        // Submit 10 tasks to test rejection
        for (int i = 0; i < 2; i++) {
            final int taskId = i;
           
            // create the thread task is here 
            Future<?>future_obj = threadPool.submit(() -> {
                try {
                    Thread.sleep(10000); // Simulate long-running task
                } catch (InterruptedException e) {
                    // e.printStackTrace();
                    // exception is handling here 
                }
                
            });
            System.out.println(" Is done " + future_obj.isDone());
            try{
                future_obj.get(2,TimeUnit.SECONDS); // Wait for the task to complete
            }
            catch(TimeoutException e)
            {
                System.out.println("Timeout exception");
                //exception is handling here 
            }
            catch(Exception e)
            {
                // handle the exception
                System.out.println("Exception is handling here ");
            }

            try{

                // here main is in waiting state 
                future_obj.get();

            }
            catch(Exception e)
            {
                // again handle the exception
            }
            System.out.println("is done" + future_obj.isDone());
            System.out.println("Is canceled " + future_obj.isCancelled());


        }

        threadPool.shutdown(); // Gracefully shut down the pool
    }
}

// Custom thread factory to configure threads
class CustomThreadFactory implements ThreadFactory {
    private int count = 1;

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        th.setName("CustomThread-" + count++);
        return th;
    }
}

// Custom rejection handler to log rejected tasks
class CustomRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(" Task rejected: " + r.toString());
        System.out.println(" Rejected by thread: " + Thread.currentThread().getName());
    }
}
