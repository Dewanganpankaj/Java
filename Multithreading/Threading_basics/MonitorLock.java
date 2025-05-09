package Multithreading.Threading_basics;

public class MonitorLock {
    // thread is calling the function 
    // need to decalre the task for each thread 
    // making the 3 task inside the class 
    public synchronized void task1()
    {
        try{
            System.out.println("hello i am task1");
            Thread.sleep(1000);
        }
        catch (Exception e) // this is required
        {
            e.printStackTrace();
        }
    }
    public void task2()
    {
        System.out.println("task2 is in waiting state,untill task 1 completed ");
        synchronized(this)
        {
            System.out.println("task2 , inside the Synchronized");
        }
    }
    public void task3()
    {
        System.out.println("i am inside the task3");
    }
}
