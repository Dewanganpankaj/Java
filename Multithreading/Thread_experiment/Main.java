package Multithreading.Thread_experiment;

public class Main {
    public static void main(String []args)
    {
        Shared_Resource obj = new Shared_Resource();
        System.out.println(" Main thread is calling ") ;

        Thread t1 = new Thread( ()->{
            System.out.println("Thread1 is calling the same resource");
            obj.Prodcuced();
            
            
            
            
            // try{
            //     System.out.println("Thread1 is calling the same resource");
               
            // }
            // catch(Exception e){
            //     //handling the exception here 
            // }
        });
        // Thread t2 = new Thread(()->{
        //     try{
        //         Thread.sleep(1000);
        //     }
        //     catch(Exception e)
        //     {

        //     }
        //     System.out.println("Thread2 is calling the same resource");
        //     obj.Prodcuced();

        // });

        t1.start();
        // t2.start();
        try{
            System.out.println("MAin thread is waiting for the th1 to complete  ");
            // to hold only the main thread 
            t1.join();
        }
        catch(Exception e)
        {
            //handling the exception 
        }
        
        System.out.println("Main thread is finish its works");
    }
}
