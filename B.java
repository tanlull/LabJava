public class B extends A{
    public int i=2;
    public static int j=12;


    public static void m1() {
        System.out.println(" m1 in B");
    }

    public void m2() {
        System.out.println(" m2 in B");
    }


    public static void main(String a[]) {
        B b = new B();
        b.m3();
    }
}
