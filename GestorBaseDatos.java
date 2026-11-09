package accesodatos;

import java.sql.Connection;
import java.sql.ResultSet;

public class GestorBaseDatos {
    // Patrón Singleton: Instancia única
    private static GestorBaseDatos instancia;
    private Connection conexion;

    private GestorBaseDatos() {
        conectar();
    }

    // Método de acceso global
    public static GestorBaseDatos getInstance() {
        if (instancia == null) {
            instancia = new GestorBaseDatos();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conectando a la base de datos...");
        // Lógica de conexión real iría aquí
    }

    public ResultSet ejecutarConsulta(String sql) {
        System.out.println("Ejecutando consulta: " + sql);
        return null; // Retorno simulado
    }

    public int ejecutarActualizacion(String sql) {
        System.out.println("Ejecutando actualización: " + sql);
        return 1; // Retorno simulado de filas afectadas
    }

    public void cerrarConexion() {
        System.out.println("Cerrando conexión a la base de datos...");
    }
}

