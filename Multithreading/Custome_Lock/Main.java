package Multithreading.Custome_Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main {
    public static void main(String args[])
    {
        Reentrant_Lock obj = new Reentrant_Lock();
        // declaration of ReetrantLock 
        ReentrantLock lock = new ReentrantLock();

        // Declaration of the new ReadWrite lock 
        // ReadWriteLock lock = new ReetrantReadWriteLock();


        Thread th1 = new Thread(()->{
            obj.Product(lock);
            System.out.println("main hu thread one");
        });
        Thread th2 = new Thread(()->{
            obj.Product(lock);
            System.out.println("main hu thread two");
        });
        //  we need to start the thread
        // th1.start();
        // th2.start();
        th1.start();
        th2.start();


    }
}
