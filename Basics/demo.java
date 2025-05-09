class Sum {
    int val = 10; 
    
    public int value() {
        return val;
    }
    
    public int function() {
        return val;
    }
}

public class demo {
    public static void main(String[] args) {
        Sum s = new Sum(); // object creation happens
        System.out.println(s.value());
        s.val = 20;
        System.out.println(s.value());
    }
}