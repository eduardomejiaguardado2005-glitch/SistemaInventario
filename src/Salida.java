public class Salida {

    private String idSalida;
    private String fecha;
    private int cantidad;

    public Salida(String idSalida, String fecha, int cantidad) {
        if (idSalida == null || idSalida.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID de salida no puede estar vacio");
        }

        if (fecha == null || fecha.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha no puede estar vacia");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }

        this.idSalida = idSalida;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public boolean aplicarSalida(Producto producto) {
        boolean realizada = producto.reducirStock(this.cantidad);

        if (realizada) {
            System.out.println(
                "Salida " + this.idSalida +
                " aplicada correctamente"
            );
        } else {
            System.out.println(
                "No hay suficiente stock para realizar la salida " +
                this.idSalida
            );
        }

        return realizada;
    }
}
