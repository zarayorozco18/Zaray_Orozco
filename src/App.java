import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Automovil miAuto = new Automovil();
        miAuto.ImprimirInformacionVehiculo("Mercedes");
        miAuto.ImprimirInformacionVehiculoV2();
        System.out.println();


        Persona p = new Persona();
        p.saludar("Carlos"); // Debe imprimir: Hola, me llamo: Carlos
        p.presentarse(); // Debe imprimir: Me llamo: Ana, tengo: 25 anios
        System.out.println();


        Calculadora c = new Calculadora();
        c.SumarmedioInterna(3);
        c.SumarInterna();
        c.Sumar(3, 4);
        System.out.println();


        Rectangulo r = new Rectangulo();
        double base = scanner.nextDouble();
        double alto = scanner.nextDouble();
        r.area(base, alto);
        r.area();
        /*
         * r.perimetro();
         * r.perimetro(base, alto);
         * System.out.println();
         */
        System.out.println();


        Banco b = new Banco();
        b.depositar(1000);
        b.mostrarSaldo();
        System.out.println();


        Estudiante E = new Estudiante();
        E.registrarNota(5);
        E.verificarEstado();
        System.out.println();


        Temperatura T = new Temperatura();
        T.convertirAFahrenheit(18);
        T.mostrarTemperatura();
        System.out.println();


        Descuento pD = new Descuento();
        pD.aplicarDescuento(20000, 20);
        pD.mostrarInfo();
        System.out.println();


        Mascota M = new Mascota();
        M.emitirSonido("ladrido");
        M.describir();
        System.out.println();


        Reloj R = new Reloj();
        R.programarAlarma(6, 35);
        R.mostrarHora();
        System.out.println();

        
        Libro L = new Libro();
        L.mostrarCatalogo("fantasia", 20000);
        L.registrarProgreso(20);
        L.mostrarFicha();
    }

}
