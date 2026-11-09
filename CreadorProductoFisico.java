package gestionproductos;

public class CreadorProductoFisico extends CreadorProducto {
    @Override
    public Producto crearProducto() {
        // Valores por defecto o extraídos de alguna configuración
        return new ProductoFisico(2.5, "10x20x30 cm");
    }
}
