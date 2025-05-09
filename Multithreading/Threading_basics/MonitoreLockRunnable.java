package Multithreading.Threading_basics;

public class MonitoreLockRunnable implements Runnable{
    MonitorLock obj ;

    //make a constructor for that 
    
    MonitoreLockRunnable(MonitorLock obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        // Add your logic here
        obj.task1();
    }
}
