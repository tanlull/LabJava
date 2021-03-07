import java.util.Scanner;

public class Lab3ForLoop1 {
    public static void main(String[] args) {
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : "); //-5   => 0,-1,-2
        N = scan.nextInt();
        for (i = 0; i >= N; i--) {
            System.out.print(i+"\n");
        }
    }
}