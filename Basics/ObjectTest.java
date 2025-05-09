class OuterClass{
    int insvari = 10 ;
    static int statvari = 20;
    
    static class InnerClass{
        // define one method 
        public void display(){
            System.out.println("hello nested");
            
        }
    }
}

public class ObjectTest {
    public static void main(String args[])
    {
        // this create the object of the outer class 
        OuterClass obj = new OuterClass();

        // if i want to access the inner class than we acess throught the class name of the outer class 
        // static class ko sirf class name se hi access kr skte hai hum 
        OuterClass.InnerClass innerobj = new OuterClass.InnerClass();
        
        // yadi call krna hai toh object ke through dirct call krskte hai  
        innerobj.display();
    }
}