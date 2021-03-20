public class Product {
    private String id;
    private String name;
    private double price;
    public Product(String id,String name,double price){
        this.id = id;
        this.name = name;
        if(this.price < 0 ){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
}