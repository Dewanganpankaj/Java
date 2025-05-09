package Multithreading.project;

public class ProductTask implements Runnable{
    
    Shared_resource sharedResource ; 
    //object creatioin of the previous class 

    ProductTask( Shared_resource sharedResource )
    {
        this.sharedResource  =  sharedResource;
    }


    @Override
    public void run()
    {
        System.out.println("Product thread" + Thread.currentThread().getName());
        try{
            Thread.sleep(5000);

        }
        catch(Exception e)
        {
            //handle any exception 
        }
        sharedResource.addItem();
    }
    
}
