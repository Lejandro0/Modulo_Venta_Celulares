package datos;

// Importa la clase Celular desde el paquete negocio
import negocio.Celular;

// Clase Proxy para controlar el acceso al inventario de celulares
public class InventarioProxy {
    private InventarioCelulares inventario;

    public InventarioProxy(InventarioCelulares inventario) {
        this.inventario = inventario;
    }

   public boolean verificarDisponibilidad(Celular celular) {
        // por simplicidad ingresamos directo
        return inventario.verificarDisponibilidad(celular);
    }
}
