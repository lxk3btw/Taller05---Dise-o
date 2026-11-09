package gestionproductos;

public class CreadorProductoDigital extends CreadorProducto {
    @Override
    public Producto crearProducto() {
        // Valores por defecto o extraídos de alguna configuración
        return new ProductoDigital(500.0, "PDF");
    }
}
