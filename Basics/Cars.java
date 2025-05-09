import java.util.Scanner;
class computer{
    public void playMusic()
    {

    }
    public String getMePen( int cost)
    {
        if(cost > 5)
            return "pen mil jayega  ";
        else 
            return "Pene nhi milega "; 
    }
}
public class Cars {
    public static void main(String args[])
    {
        // System.out.println("Hello");
        computer compu = new computer();
        // we need to take an input from here 
        System.out.print("enter your amount which you have :-");
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();

        String str = compu.getMePen(cost);
        System.out.println(str);
    }
    
}
