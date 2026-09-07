public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto(
            "P001",
            "Teclado",
            25.50,
            10
        );

        Producto producto2 = new Producto(
            "P002",
            "Mouse",
            15.00,
            8
        );

        Entrada entrada1 = new Entrada(
            "E001",
            "06/09/2026",
            5
        );

        Entrada entrada2 = new Entrada(
            "E002",
            "06/09/2026",
            10
        );

        Salida salida1 = new Salida(
            "S001",
            "06/09/2026",
            3
        );

        Salida salida2 = new Salida(
            "S002",
            "06/09/2026",
            4
        );

        System.out.println("=== SISTEMA DE INVENTARIO ===");

        System.out.println("\nAplicando entradas:");
        entrada1.aplicarEntrada(producto1);
        entrada2.aplicarEntrada(producto2);

        System.out.println("\nAplicando salidas:");
        salida1.aplicarSalida(producto1);
        salida2.aplicarSalida(producto2);

        System.out.println("\nPrueba de stock adicional:");
        producto1.aumentarStock(2);

        System.out.println("\nSistema ejecutado correctamente.");
    }
}
