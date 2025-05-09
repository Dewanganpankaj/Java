/* this class we need to type cast every time to avoid this problem we use this structure */

// class print{
//     Object value ;
//     public Object getValue(){
//         return value;
//     }
//     public void setValue(Object value){
//         this.value = value;
//     }

    
// }
// public class genericClass {
//     public static void main(String args[])
//     {
//         print pal = new print();
//         pal.setValue(1);
//         Object i = pal.getValue();
//         if((int)i == 1)
//         {
//             System.out.println(i) ;
//         }

//     }
// }


// structure of the generic clss 
//  T is used as retur type here 
class Print<T> {
    T value;
    
    public T getPrintValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
}

public class genericClass {
    public static void main(String args[]) {
        // Corrected object creation
        Print<Integer> obj = new Print<Integer>();
        obj.setValue(1);
        Integer val = obj.getPrintValue();
        
        if (val == 1) {
            System.out.println("hello");
        }
    }
}