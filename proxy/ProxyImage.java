package Proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // La lógica de carga perezosa (lazy loading)
        if (realImage == null) {
            realImage = new RealImage(filename); // Se carga solo cuando es necesario
        }
        realImage.display(); // Delega la acción al objeto real
    }
}