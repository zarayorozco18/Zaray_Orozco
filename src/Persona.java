public class Persona {
    //1. Atributos de la clase
    public String nombre = "Ana";
    public int edad = 25;

    //2. Métodos de la clase 
    // Método con parametro
    
    public void Saludar(String nombre) {
        System.out.println("Hola, me llamo " + nombre);

    // Método sin parametro, que trabaja con las variables globales de la clase 
    public void Presentar(){
        System.out.println("Me llamo " + this.nombre + " y tengo " + this.edad + 
    }

}
