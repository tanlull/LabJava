import java.util.Scanner;

public class Lab32Arrays1 {
    public static void main(String[] args) {
        int i;
        int[] data = new int[5];
        for(i = 0 ; i < data.length ; i++){
            Scanner scan = new Scanner(System.in);
            data[i] = scan.nextInt();
            //System.out.println(data[i]);
        }
        System.out.println("Your data:");
        for(i = 0 ; i < data.length ; i++){
            System.out.println(data[i]);
        }
    }
}