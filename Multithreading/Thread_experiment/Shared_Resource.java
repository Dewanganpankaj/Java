package Multithreading.Thread_experiment;
import java.util.*;
public class Shared_Resource {
    boolean isavailable = true ; 
    public synchronized void Prodcuced() {
        System.out.println("Lock Acquire");
        isavailable = true ;
        try{
            Thread.sleep(8000);
        }
        catch(Exception e)
        {
            // handle the lock 
        }
        System.out.println("Lock released");

    }
}
