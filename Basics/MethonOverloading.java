class val{
    public int sum(int num1 ,int num2)
    {
        return num1+num2 ;
    }
}
/*method over loading same function(method)
 name with different parameter  */ 
public class MethonOverloading {
    public static void main(String args[])
    {
        val v = new val();
        int sum = v.sum(4,3);
        System.out.println("sum of the number is the " );
        System.out.println(sum );
    }
}
