public class Lab41Method {
    public static void main(String args[]) {
        //System.out.println("Hello");
        String str = "DEF";
        String j = "3";
        printClass(str,j);
        //printUniversity();
         //printClass()
        //printUniversity();
    }

    public static void printClass(String name,int length){
        for(int i=0;i<=length;i++)
        System.out.print("=");
        System.out.println(name);
    }

    public static void printUniversity(){
        for(int i=0;i<=5;i++)
        System.out.print("=");
        System.out.println("University xxx");
    }
}
