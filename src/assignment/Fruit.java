package assignment;
public class Fruit {
    
    String name;
    String session;

    public String getName() {
        return name;
    }

    public String getSession() {
        return session;
    }

    @Override
    public String toString() {
        return "Fruit " + "name = " + name + ", session = " + session;
    }

    
    
}
