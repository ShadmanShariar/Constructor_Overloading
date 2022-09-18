package assignment;
public class Main {

    public static void main(String[] args) {
        
        // Constructor Overloading Call For Mango
        
        // Overriding 4 call for Mango Class
        
        Mango obj1 = new Mango(34.56,14);
        
        System.out.println("Mango Price and Quantity "+obj1.getPrice()+" "+obj1.getQuantity());
        
        Mango obj2 = new Mango(45.55);
        
        System.out.println("Mango Only Price "+obj2.getPrice());
        
        Mango obj3 = new Mango(123);
        
        System.out.println("Mango Only Quantity "+obj3.getQuantity());
        
        System.out.println();
        
        Mango f1 = new Mango("Himshagor","Summer");
        
        System.out.println("Inherited Class Fruit "+f1.getName()+" "+f1.getSession());
        
        System.out.println(f1.toString());
        // Overriding 4 call for Lichi Class
        System.out.println();
        
        Lichi obj4 = new Lichi(314.56,16);
        
        System.out.println("Lichi Price and Quantity "+obj4.getPrice()+" "+obj4.getQuantity());
        
        Lichi obj5 = new Lichi(425.55);
        
        System.out.println("Lichi Only Price "+obj5.getPrice());
        
        Lichi obj6 = new Lichi(122);
        
        System.out.println("Lichi Only Quantity "+obj6.getQuantity());
        
        System.out.println();
        
        Lichi f2 = new Lichi("Red Lichi","Summer");
        
        System.out.println("Inherited Class Fruit "+f2.getName()+" "+f2.getSession());
    
        System.out.println(f2.toString());
        
        System.out.println();
        
    }
    
}
