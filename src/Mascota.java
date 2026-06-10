public class Mascota {
    public String nombre = "Max";
    public String especie = "Perro";

    // TODO: Metodo CON parametro - recibe String sonido
    // Imprime: this.nombre + " hace: " + sonido
    public void emitirSonido(String sonido) {
        // Escribe aqui tu codigo
        System.out.println(this.nombre + " hace: " + sonido);
    }

    // TODO: Metodo SIN parametro - usa this.nombre y this.especie
    // Imprime: "Mascota: " + this.nombre + " | Especie: " + this.especie
    public void describir() {
        // Escribe aqui tu codigo
        System.out.println("Mascota: " + this.nombre + " | Especie: " + this.especie);
    }

}
