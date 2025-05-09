package Multithreading.Producer_consumer_problem;

public class Consumer implements Runnable{
    Buffer obj ;
    Consumer(Buffer obj)
    {
        this.obj = obj ;
    }
    
    @Override
    public void run()
    {
        try{
            for(int i = 0 ;i<10 ;i++)
            {
                // removeItem is a function that is defined in the buffer class 
                // to make an convinent
                obj.removeItem();
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("some of the error is occur");
        }
    }

    
}
