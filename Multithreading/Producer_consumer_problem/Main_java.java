package Multithreading.Producer_consumer_problem;

public class Main_java {
    public static void main(String []args)
    {
        Buffer obj = new Buffer(6) ;
        Thread ProducerThread = new Thread(new Producer(obj));
        Thread ConsumerThread = new Thread(new Consumer(obj));
        
        ProducerThread.start();
        ConsumerThread.start();

    }
    
}
