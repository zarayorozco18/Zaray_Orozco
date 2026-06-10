public class Libro {
    public String titulo = "El Principito";
    public String autor = "Antoine de Saint-Exupery";
    public int año = 1943;
    public int paginas = 96;

    // TODO: Metodo CON parametros - recibe String categoria y double precio
    // Imprime: "Categoria: " + categoria + " | Precio: $" + precio
    public void mostrarCatalogo(String categoria, double precio) {
        // Escribe aqui tu codigo
        System.out.println("Categoria: " + categoria + " | Precio: $" + precio);
    }

    // TODO: Metodo CON un solo parametro - recibe int paginasLeidas
    // Si paginasLeidas >= this.paginas imprime: "Libro completado"
    // Si no: imprime: "Progreso: " + paginasLeidas + " de " + this.paginas + " paginas"
    public void registrarProgreso(int paginasLeidas) {
        // Escribe aqui tu codigo
        if (paginasLeidas >= this.paginas){
            System.out.println("Libro completado");
        }else{
            System.out.println("Progreso: " + paginasLeidas + " de " + this.paginas + " paginas");
        }
    }

    // TODO: Metodo SIN parametro - usa todos los atributos con this
    // Imprime en una sola linea:
    // "Titulo: " + this.titulo + " | Autor: " + this.autor +
    //  " | Anio: " + this.anio + " | Paginas: " + this.paginas
    public void mostrarFicha() {
        // Escribe aqui tu codigo
        System.out.println("Titulo: " + this.titulo + " | Autor: " + this.autor + " | Año: " + this.año + " | Paginas: " + this.paginas);
    }

}
