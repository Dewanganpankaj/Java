package Multithreading.Producer_consumer_problem;

public class Producer implements Runnable {

    // producer is produce the item 
    Buffer obj ;
    Producer(Buffer obj)
    {
        this.obj = obj ;
    }
    @Override
    public void run()
    {
        // if the buffer is full then wait for the consumer to the consume
        //  from the buffer 
        for(int i = 0 ;i<10;i++)
        {
            obj.addItem(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted: " + Thread.currentThread().getName());
            }
            

        }
    }
    
}
