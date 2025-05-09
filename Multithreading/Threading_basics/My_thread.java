package Multithreading.Threading_basics;
public class My_thread {
    public static void main(String [] args)
    {
        MonitorLock obj = new MonitorLock();
        // this is the syntax for the thread creation 
        // /multiple thread is point to the same object
        // which is the object of the MonitorLock class to learn the lock System
        
        // we have two type of method calling one is directly call the class and another is the implements the runnable 
        // this is using the runnabkle class 
        
        MonitoreLockRunnable obj1 = new MonitoreLockRunnable(obj);
        Thread t1 = new Thread(obj1);
        
        
        // this is directly call by lambda method 
        Thread t2 = new Thread(()->obj.task2());
        Thread t3 = new Thread(()->obj.task3());

        // this is required to start the thread 
        t1.start();
        t2.start();
        t3.start();
        
    }
}
