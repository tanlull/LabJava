import java.util.Scanner;

public class Lab3ForLoop2 {
    public static void main(String[] args) {
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : "); //10 => 7 14 21 .. 70
        N = scan.nextInt();
        for (i = 1; i <= N; i++) {
            int j = i * 7;
            System.out.print(j+"\n");
        }
    }
}