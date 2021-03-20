import java.util.ArrayList;

public class invoice {
    private String id;
    private Customer customer;
    private ArrayList<LineItem> items = new ArrayList<LineItem>();

    public invoice(String id,Customer customer){
        this.id = id;
        this.customer = customer;
    } 
    public void addItem(Product product,int quantity){
        LineItem a = new LineItem(product, quantity);
    }
    public String getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public LineItem getLineItem(int i){
        return items.get(i);
    }
    public double getTotalPrice(){
        double sum = 0.0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getTotal();
        }
        return sum;
    }
    public void print(){
        System.out.printf("INVOICE : #%s",id);
        System.out.printf("\nCUSTOMER: %s %s",customer.getfirstName(),customer.getlastName());
        System.out.println("\n ITEMS:");
        for (int i = 1; i < items.size(); i++) {
            System.out.println(i+". "+items.get(i).getProduct().getName()+" x "+items.get(i).getQuantity()+" = "+items.get(i).getTotal());
        System.out.printf("TOTAL : %.2F",getTotalPrice());
        }
    }
}
