class sum {

    public int add(int num1,int num2)
    {
        return num1 + num2 ;
    }
}
public class second {
    public static void main(String args[])
    {
       int num1 = 14 ;
       int num2 = 9 ;
       //  object creation on that 
       sum s = new sum();
       int val = s.add(num1,num2);
       System.out.println(val);


    }
}
