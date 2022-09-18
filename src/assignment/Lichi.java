package assignment;
public class Lichi extends Fruit {
    
    private double price;
    private int quantity;

    //Overloading 4 constructor
    
    Lichi(String name, String session) {
        this.name = name;
        this.session = session;
    }
    
    Lichi(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    Lichi(double price) {
        this.price = price;
    }
    Lichi(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}
