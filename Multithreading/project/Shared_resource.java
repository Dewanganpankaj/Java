package Multithreading.project;

// import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class Shared_resource {
    boolean ItemAvailable = true ;
    public synchronized void addItem()
    {
        ItemAvailable = true ;
        System.out.println("Producer is notify all of them " + Thread.currentThread().getName());
        notifyAll();
    }
    public synchronized void consumeItem()
    {
        System.out.println("Consumed method invoked by  " + Thread.currentThread().getName());
        while(!ItemAvailable)
        {
            try{
                System.out.println("Thread" + Thread.currentThread().getName() + "is waiting now");
                wait();
            }
            catch(Exception e)
            {
                //handling the exception 
            }
            System.out.println("Item consumed by " + Thread.currentThread().getName());
            ItemAvailable = false ;
        }
    }
}
