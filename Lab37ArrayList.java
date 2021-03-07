import java.util.ArrayList;

public class Lab37ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arryList = new ArrayList<Integer>();
        System.out.println(arryList);
        arryList.add(23);
        arryList.add(28);
        arryList.add(35);
        arryList.add(21); //
        arryList.add(19);
        System.out.println(arryList);
        //System.out.println(arryList.indexOf(21));
        arryList.remove(3);
        System.out.println(arryList);
        //arryList.set(0,100);
        //System.out.println(arryList.size());
    }
}


// Array ->    x.length    , x[index]
// String ->   x.length()  , x.chatAt(index)
// ArrayList -> x.size()   , x.get(index)