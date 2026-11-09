package gestionproductos;

public class ProductoFisico implements Producto { private double peso;
    private String dimensiones;

    public ProductoFisico(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public String getDetalles() {
        return "Peso: " + peso + "kg, Dimensiones: " + dimensiones;
    }
}
