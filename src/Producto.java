public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }

        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
https://github.com/eduardomejiaguardado2005-glitch/SistemaInventario/settings
    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero");
            return;
        }

        this.stock = this.stock + cantidad;
        System.out.println("Stock actualizado de " + this.nombre + ": " + this.stock);
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }

        if (cantidad > this.stock) {
            return false;
        }

        this.stock = this.stock - cantidad;
        return true;
    }
}
