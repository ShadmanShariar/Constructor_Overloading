package assignment;
public class Mango extends Fruit {
    
    private double price;
    private int quantity;

    //Overloading 4 constructor
    
    Mango(String name, String session) {
        this.name = name;
        this.session = session;
    }
    
    Mango(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    Mango(double price) {
        this.price = price;
    }
    Mango(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
 
    
    
}
