public class ComparableCircle extends Circle implements Comparable{


    public ComparableCircle(int radius){
        super(radius);
    }

    public int compareTo(Object o){
        if(getArea() > ((ComparableRectangle)o).getArea()){
            return 1;
        }else if (getArea() < ((ComparableRectangle)o).getArea()){
            return -1;
        }else{
            return 0;
        }
    }
}
