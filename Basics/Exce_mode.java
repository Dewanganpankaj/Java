import javax.crypto.AEADBadTagException;

public class Exce_mode {
    public static void main(String []args)
    {
        value obj = new value() ;
        
        try{
            obj.method();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Hello i am catch block ");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("i am in the finally block ");
        }

    }
}
class value{
    public static void method() throws ArithmeticException
    {
        int i = 10/0 ;
        throw new ArithmeticException();
    }
}
