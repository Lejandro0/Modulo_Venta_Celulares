package negocio;

import datos.InventarioCelulares;
import datos.InventarioProxy;

// Clase para gestionar las ventas de celulares
public class VentaCelulares {
    private InventarioProxy inventarioProxy;
    private MetodoPago metodoPago;
    private NotificadorVentas notificadorVentas;

    // Constructor principal
    public VentaCelulares(InventarioProxy inventarioProxy, MetodoPago metodoPago) {
        this.inventarioProxy = inventarioProxy;
        this.metodoPago = metodoPago;
        this.notificadorVentas = new NotificadorVentas(); // Crear instancia de NotificadorVentas
    }

    // Constructor adicional que toma un InventarioCelulares
    public VentaCelulares(InventarioCelulares inventario, MetodoPago metodoPago) {
        this(new InventarioProxy(inventario), metodoPago); // Reutilizar el constructor principal
    }

    public void venderCelular(Celular celular) {
        if (inventarioProxy.verificarDisponibilidad(celular)) {
            metodoPago.realizarPago(celular.getPrecio());
            notificadorVentas.notificarVenta("Venta realizada correctamente.");
        } else {
            notificadorVentas.notificarVenta("El celular no está disponible en el inventario.");
        }
    }
}
