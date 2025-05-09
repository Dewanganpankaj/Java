package Multithreading.project;

public class Consumer implements Runnable {
    Shared_resource sharedResource ;
    
    Consumer(Shared_resource sharedResource )
    {
        this.sharedResource = sharedResource ;
    }
    @Override
    public void run()
    {
        
        System.out.println("consumer Thread :" + Thread.currentThread().getName());
        sharedResource.consumeItem();
    }

}
