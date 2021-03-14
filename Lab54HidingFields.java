public class Lab54HidingFields {
    
    public static void main(String a[]) {
        A x = new B();
        // property 
        System.out.println("(1) x.i is "+x.i);
        System.out.println("(2) (B)x.i is "+ ((B) x).i);
        System.out.println("(3) x.j is "+x.j);
        System.out.println("(4) (B)x.j is "+ ((B) x).j);
        // Method 
        x.m1();
        ((B) x).m1();

        x.m2();
        x.m3();

        ((B)x).m2();
        ((B)x).m3();

    }
}
