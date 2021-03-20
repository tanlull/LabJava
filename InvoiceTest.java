public class InvoiceTest {
    public static void main(String[] args) {
        Customer customer1 =new Customer("1234","Narudon","Saehan");
        Customer customer2 =new Customer("5678","John","Johnson");
        invoice invoice1 =new invoice("00001",customer1);
        invoice invoice2 =new invoice("00002",customer2);
        invoice invoice3 =new invoice("00003",customer1);
        Product water = new Product("0001","Water",10.0);
        Product apple = new Product("0002","Apple",17.50);
        Product cake = new Product("0003","Cake",50.0);
        Product iceCream = new Product("0004","Ice cream",15.0);
        Product book = new Product("0005","Book",150.0);
        invoice1.addItem(water,2);
        invoice1.addItem(apple,7);
        invoice1.addItem(cake,2);
        invoice1.addItem(book,1);
    
        invoice2.addItem(water,2);
        invoice2.addItem(apple,5);
        invoice2.addItem(book,3);
    
        invoice3.addItem(water,1);
        invoice3.addItem(apple,4);
        invoice3.addItem(iceCream,2);
        invoice3.addItem(cake,1);
    
        invoice1.print();
        invoice2.print();
        invoice3.print();
    }
}
