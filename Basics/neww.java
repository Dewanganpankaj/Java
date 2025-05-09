class OuterClass {
    int vari1 = 10;
    int vari2 = 30;

    // Inner class (non-static)
    class inner {
        public void display() {
            System.out.println("Hello from the inner class!");
            System.out.println("Outer class variables: " + vari1 + ", " + vari2);
        }
    }
}

public class neww {
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass obj = new OuterClass();
        
        // Create an instance of the inner class using the outer class instance
        OuterClass.inner innerObj = obj.new inner();
        
        // Call the method from the inner class
        innerObj.display();
    }
}
