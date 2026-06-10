public class Descuento {
    public String nombre = "Camisa";
    public double precio = 80000.0;

    // TODO: Metodo CON parametros - recibe double precio y double descuento (porcentaje)
    // Formula: precioFinal = precio - (precio * descuento / 100)
    // Imprime: "Precio final: " + precioFinal
    public void aplicarDescuento(double precio, double descuento) {
        // Escribe aqui tu codigo
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("Precio final: " + precioFinal);
    }

    // TODO: Metodo SIN parametro - usa this.nombre y this.precio
    // Imprime: "Producto: " + this.nombre + " | Precio base: " + this.precio
    public void mostrarInfo() {
        // Escribe aqui tu codigo
        System.out.println("Producto: " + this.nombre + " | Precio base: " + this.precio);
    }
}
