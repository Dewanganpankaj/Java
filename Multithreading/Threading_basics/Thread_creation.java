package Multithreading.Threading_basics;

class MultithreadingLearning implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running..." + Thread.currentThread().getName());
    }
}
public class Thread_creation {
    public static void main(String []args)
    {
        MultithreadingLearning  obj = new MultithreadingLearning();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Finish method :"+Thread.currentThread().getName());

    }
}
