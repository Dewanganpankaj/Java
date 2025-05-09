package Multithreading.Producer_consumer_problem;

import java.util.*;

public class Buffer {
    
    private final int maxSize;
    private final Queue<Integer> queue;

    
    public Buffer(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    // here we can define the size of the buffer and the queue 
    public synchronized void addItem(int item) 
    {
        while(queue.size() == maxSize)
        {
            System.out.print("buffer size if full ");
            try{
                // if buffer is full then wait()
                wait();
            }
            catch(Exception e)
            {
                // handling the exception 
                System.out.println("it throws some exception on that ");
            }
            
        }
        queue.add(item);
        System.out.println("Produced :" + item);
        // notify is also the important to notify all of them 
        notifyAll(); // its work if any object for the same calss is in 
        //  waiting state then it will notify with the all tha waiting thread 

    }
    public synchronized int removeItem()
    {
        // check for the queue empty if it is then wait for sometime 
        if(queue.isEmpty())
        {
            try{
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Queue is empty ");
            }
            
        }
        int item = queue.remove();
        System.out.println("Consumed item is :" + item);
        notifyAll(); // this is reqiured for the notigy all 
        return item;
    }


    
}
