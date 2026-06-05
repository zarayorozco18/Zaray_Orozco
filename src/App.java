import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        Automovil miAuto = new Automovil();
        Persona persona = new Persona();
        Calculadora = calculadora = new Calculadora(); 
        Rectangulo = new Rectangulo();

        //
        System.out.println(">>>> Ingresa la base:");
        double base = scanner.nextDouble();
        System.out.println(">>>> Ingresa la altura: ");


        //llamamos los metodos de la clase automovil
        miAuto.ImprimirInformacionvehiculo("Mercedes");
        miAuto.ImprimirInformacionvehiculo2();

        //llamamos los metodos de la clase persona
        persona.Saludar("Zaray");

        //
        calculadora.Sumar(50, 40);
        calculadora.SumaSinParams();
        calculadora.SumaParamConVarGlobal (70);

        //
        rectangulo.CalcularArea(base, altura);
        rectangulo.CalcularAreaSinParams();

        //
        cuenta.Depositar(100.000);
    }
    
}
    
