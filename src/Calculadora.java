public class Calculadora {
    public double num1 = 10.0;
    public double num2 = 5.0;

    // TODO: Metodo CON parametros - recibe dos doubles: a y b
    // Imprime: "Suma: " + (a + b)
    public void Sumar(double a, double b) {
        // Escribe aqui tu codigo
    }
    public void SumarInterna() {
        System.out.println("Suma interna: " + (this.num1 + this.num2));
        // Escribe aqui tu codigo
    }

    // TODO: Metodo SIN parametro - usa this.num1 y this.num2
    // Imprime: "Suma interna: " + (this.num1 + this.num2)
    public void SumarmedioInterna(double b) {
        System.out.println("Suma interna: " + (this.num1 + b));
        // Escribe aqui tu codigo
    }
}
