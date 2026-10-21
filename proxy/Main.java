package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application started.");
        
        
        Image image = new ProxyImage("photo.jpg");
        System.out.println("Proxy created, but RealImage not loaded yet.");
        
        System.out.println("\n--- Primera llamada a display() ---");
        image.display();
        
        System.out.println("\n--- Segunda llamada a display() ---");
        image.display();
    }
}