package negocio;

// Importa la interfaz Vendible desde el paquete negocio
import negocio.Vendible;

// Clase base para los celulares
public class Celular implements Vendible {
    private String nombre;
    private double precio;

    public Celular(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
