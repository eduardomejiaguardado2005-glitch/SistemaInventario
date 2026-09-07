public class Entrada {

    private String idEntrada;
    private String fecha;
    private int cantidad;

    public Entrada(String idEntrada, String fecha, int cantidad) {
        if (idEntrada == null || idEntrada.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID de entrada no puede estar vacio");
        }

        if (fecha == null || fecha.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha no puede estar vacia");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }

        this.idEntrada = idEntrada;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public void aplicarEntrada(Producto producto) {
        producto.aumentarStock(this.cantidad);

        System.out.println(
            "Entrada " + this.idEntrada +
            " aplicada correctamente"
        );
    }
}
