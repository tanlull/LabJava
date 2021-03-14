public class Employee {
    int id;
    String myName;

    public  Employee(){
        System.out.println("Empty Employee Constructure");
    }  

    public  Employee(String s){
        System.out.println(s);
    }  

    public  Employee(int i){
        System.out.println(i);
    } 

    public Employee(int i, String string) {
    }

    public Employee getEmployee(String i){
        return new Employee();
    }

    public String getName(){
        return myName;
    }

    public int getID(){
        return id;
    }

    public void setEmployee(int id, String name){
        this.id= id;
        myName= name;
    }

    public static void main(String argd[]) {
        Employee emp = new Employee(100,"Hello"); // สร้าง Object => menmory  
    }
}
