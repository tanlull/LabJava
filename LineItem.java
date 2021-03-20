public class LineItem {
    private Product item;
    private int quantity;
    public LineItem(Product product,int quantity){
        this.item = product;
        if (this.quantity < 0){
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
    }
    public Product getProduct(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotal(){
        return quantity*item.getPrice();
    }
}
