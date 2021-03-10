
//Pass by Value  => Primitive (int/double/boolean/char/float..)

//Pass by Reference  => Object


public class PassByRef {

    public static void doubleMe2(Integer y) {
        y = y * 2;
        System.out.println("inside Method x = "+y); //20
    }

    public static void doubleMe1(int y) {
        y = y * 2;
        System.out.println("inside Method x = "+y); //20
    }


    public static void main(String [] args) {
        
         
         //Pass by Value
         int x = 10;
         System.out.println("x="+x); // 10
         doubleMe1(x); // Pass by value => Primitive
         System.out.println("After Call x = "+x); // 10
 
        //  //Pass by Reference
        //  Integer x = (10);
        //  System.out.println("x="+x); // 10
        //  doubleMe2(x); // Pass by Reference => Object
        //  System.out.println("After Call x = "+x); // 20      

        // Object a
        IntergerA a = new IntergerA();
        a.x = 10;
        System.out.println("x="+a.x); // 10
        doubleMe3(a);
        System.out.println("After Call x = "+a.x); //20
     }


     public static void doubleMe3(IntergerA y) {
        y.x = y.x * 2;
        System.out.println("inside Method x = "+y.x); //20
    }
    



} 



