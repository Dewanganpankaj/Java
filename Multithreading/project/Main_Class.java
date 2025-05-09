package Multithreading.project;

public class Main_Class {
    public static void main(String [] args)
    {
        System.out.println("this is the main method");
        
        Shared_resource sharedResource = new Shared_resource();
         // creating the thread \

         //producer thread 
         ProductTask obj1 = new ProductTask(sharedResource);
         Thread t1 = new Thread(obj1);

         //Consumer thread 
         Consumer obj2 = new Consumer(sharedResource);
         Thread t2 = new Thread(obj2);

         t1.start();
         t2.start();

         System.out.println("main task is ended ");

    }
    
}
