package negocio;
import negocio.TarjetaCredito;
import negocio.MetodoPago;

// Clase para manejar la creación de métodos de pago
public class MetodoPagoFactory {
    public MetodoPago crearMetodoPago() {
        // Por simplicidad, seleccionaremos el método de pago con tarjeta de crédito
        return new TarjetaCredito();
    }
}
