public class Temperatura {
    private double celcius = 25.0;
    // TODO: Metodo CON parametro - recibe double celsius
    // Formula: fahrenheit = (celsius * 9/5) + 32
    // Imprime: celsius + " C = " + fahrenheit + " F"
    public void convertirAFahrenheit(double cel) {
        // Escribe aqui tu codigo
        double fahrenheit = (cel * 9/5) + 32;
        System.out.println(cel + " C = " + fahrenheit + " F");
    }

    // TODO: Metodo SIN parametro - usa this.celsius
    // Imprime: "Temperatura actual: " + this.celsius + " grados Celsius"
    public void mostrarTemperatura() {
        // Escribe aqui tu codigo
        System.out.println("Temperatura actual: " + this.celcius + " grados Celsius");
    }
}
