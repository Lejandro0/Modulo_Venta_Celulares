import datos.InventarioCelulares;
import negocio.Celular;
import negocio.MetodoPago;
import negocio.TarjetaCredito;
import negocio.VentaCelulares;

public class Main {//er
    public static void main(String[] args) {
        // Crear inventario de celulares
        InventarioCelulares inventario = new InventarioCelulares();

        // Seleccionar el método de pago deseado por el cliente
        MetodoPago metodoPago = new TarjetaCredito();

        // Crear instancia de venta de celulares
        VentaCelulares ventaCelulares = new VentaCelulares(inventario, metodoPago);

        // Crear un celular para la venta
        Celular celular = new Celular("iPhone 12", 1000.0);

        // Realizar la venta del celular
        ventaCelulares.venderCelular(celular);
    }
}
