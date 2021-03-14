public class Lab61GeometricTest {
    public static void main(String arg[]){
        double area = 0.0;
        // GeometricObject a = new Circle(5);
        // GeometricObject b = new  Rectangle(2,4);
        GeometricObject [] objs = {new Circle(5),new Rectangle(2,4)};
        for(GeometricObject obj:objs){
            area += obj.getArea();
        }
        System.out.println("Total Area ="+area);
    }
}
