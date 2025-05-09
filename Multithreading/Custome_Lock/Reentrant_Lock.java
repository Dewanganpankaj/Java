package Multithreading.Custome_Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_Lock {
    
    public void Product(ReentrantLock lock) // not required the synchronized keyword for this Custome lock that we are used 
    {
         

        try{
            lock.lock();
            System.out.println("lock acquired" + Thread.currentThread().getName());
        }
        catch(Exception e)
        {
            // hadling the exception is here 
        }
        finally{
            lock.unlock();
            System.out.println("Rentrant lock is released " +  Thread.currentThread().getName());
        }
    }
    
}
