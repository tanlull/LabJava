public class Customer {
    private String id;
    private  String firstName;
    private String lastName;
    public Customer(String id,String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getId(){
        return id;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
}
