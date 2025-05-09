
import java.util.Scanner ;

import java.io.File;

public class Exception {
    public static void main(String[]args)
    {
        myClass obj1 = new myClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the String" );
        String str = scanner.nextLine();
        System.out.println("your entered" + str);

        try {
            obj1.method(str);
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException
            e.printStackTrace();
        }
        catch(InterruptedException e)
        {
            System.out.println("e.InterruptedException()");
        }
    }
}
class myClass{
    public static void method(String val) throws ClassNotFoundException,InterruptedException
    {
        if(val.equals("dummy"))
        {
            throw new ClassNotFoundException();
        }
        else if(val.equals("inter")){
            throw new InterruptedException();
        }
        
        // throw new ClassNotFoundException();

    }
}
