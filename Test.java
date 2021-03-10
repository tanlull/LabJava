
public class Test {

 
    public static void main(String[] args) {
        try{
            System.out.println("Start");
            int x = 10/0;
            System.out.println("END");
        }catch(ArithmeticException e){
            System.out.println("Catch ArithmeticException");
        }catch(Exception e){
            System.out.println("Catch ALL Exception");
        }
        finally{
            System.out.println("Finally");
        }
    }
}