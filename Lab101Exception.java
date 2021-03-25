public class Lab101Exception {
    public static void main(String[] args) {
        int x = 0;
        int ans = 0;
        if (x != 0) {
            ans = MathDevider1.devider(10, x);
        }
        System.out.println(ans);
    }
}

class MathDevider1 {
    public static int devider(int num1, int num2) {
        int result = (int) (num1 / num2);
        return result;
    }
}