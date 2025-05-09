import java.util.*;
public class Stream_java {
    public static void main(String []args)
    {
        List<Integer> l1 = new ArrayList<>();
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        l1.add(90);

        // using stream we are creating the pipeline 
        long output = l1.stream().filter((Integer val) -> val >50).count();
        System.out.println("Your count is the :" + output);

    }
}
