
public class TryCatch{
    public static void main(String[] args) {

            // System.out.println("Start");
            // int x = 10/0;
            // System.out.println("END");
        
        try{
            System.out.println("Start");
            //int x = 10/0;
            int [] x = {1,2,3};
            x[10]=0;
            System.out.println("END");
        }catch(ArithmeticException e){
            System.out.println("Catch ArithmeticException");
        }catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("Catch  ArrayIndexOutOfBoundsException ");
        }catch(Exception e){
            System.out.println("Catch ALL Exception");
        }
        finally{
            System.out.println("Finally");
        }
    }
}