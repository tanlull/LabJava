import java.io.IOException;

public class Lab103Throw {
    public static void main(String[] args) throws Exception {
        int ans = 0;
        try {
            ans = MathDevider3.devider(10, 0); // java.lang.ArithmeticException
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Print from catch");
        } finally {
            System.out.println(ans);
        }

    }
}

class MathDevider3 {

    public static int devider(int num1, int num2) throws Exception {
        int result = (int) (num1 / num2);
        return result;
    }

    public static int checkZero(int num2) throws Exception {
        if (num2 == 0)
            throw new Exception("Zero Zero");
        else
            return num2;
    }
}