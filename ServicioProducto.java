package gestionproductos;

import accesodatos.GestorBaseDatos;

public class ServicioProducto {
    private GestorBaseDatos gestorBD;

    public ServicioProducto() {
        // Usa el Singleton para obtener la conexión
        this.gestorBD = GestorBaseDatos.getInstance();
    }

    public void registrarProducto() {
        // Ejemplo de uso del Factory Method para crear un producto
        CreadorProducto creador = new CreadorProductoDigital();
        Producto nuevoProducto = creador.crearProducto();
        
        System.out.println("Registrando: " + nuevoProducto.getDetalles());
        
        // Uso del Gestor de Base de Datos
        gestorBD.ejecutarActualizacion("INSERT INTO productos ...");
    }

    public void consultarInventario() {
        System.out.println("Consultando inventario general...");
        gestorBD.ejecutarConsulta("SELECT * FROM productos");
    }
}
