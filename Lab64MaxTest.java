public class Lab64MaxTest {
    public static void main(String[] args) {
        ComparableRectangle rectangle1 = new ComparableRectangle(4, 5);
        ComparableRectangle rectangle2 = new ComparableRectangle(3, 6);
        Rectangle r = (ComparableRectangle) Max.max(rectangle1, rectangle2);
        System.out.println(r.getArea());
        /* เพิ่ม code เพื่อทดสอบ class comparableCircle ด้วยตนเอง */
    }
}
