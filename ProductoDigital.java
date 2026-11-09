package gestionproductos;

public class ProductoDigital implements Producto {
    private double tamano;
    private String formato;

    public ProductoDigital(double tamano, String formato) {
        this.tamano = tamano;
        this.formato = formato;
    }

    @Override
    public String getDetalles() {
        return "Producto Digital [Tamaño: " + tamano + "MB, Formato: " + formato + "]";
    }
}
