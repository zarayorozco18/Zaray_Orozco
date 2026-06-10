public class Persona {
    public String nombre = "Ana";
        public int edad = 25;

        // TODO: Metodo CON parametro - recibe un String llamado nombre
        // Imprime: "Hola, me llamo: " + nombre
        public void saludar(String nombre) {
            // Escribe aqui tu codigo
            System.out.println("hola me llamo " + nombre);
        }

        // TODO: Metodo SIN parametro - usa this.nombre y this.edad
        // Imprime: "Me llamo: " + this.nombre + ", tengo: " + this.edad + " anios"
        public void presentarse() {
            // Escribe aqui tu codigo
            System.out.println("me llamo "+ this.nombre +", tengo: " + this.edad + " años");
        }
}

