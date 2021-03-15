public class Lab62GeometricTest {
    public static void main(String arg[]){
        double area = 0.0;
        GeometricObject [] objs = {new Circle(5),new Rectangle(2,4)};
        for(GeometricObject obj:objs){
            // if(obj instanceof Circle){ // obj
            //     Circle circle = (Circle) obj;
            //     double diameter = circle.getDiameter(); // Object Circle
            //     System.out.println("diameter = "+diameter);
            // }
            double perimeter = obj.getPerimeter(); // Object Circle
            System.out.println("diameter = "+perimeter);

            //area += obj.getArea();
        }
        System.out.println("Total Area ="+area);
    }
}
