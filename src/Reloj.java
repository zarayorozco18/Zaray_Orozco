public class Reloj {
    public int hora = 10;
    public int minuto = 30;

    // TODO: Metodo CON parametros - recibe int horaAlarma y int minutoAlarma
    // Imprime: "Alarma programada a las: " + horaAlarma + ":" + minutoAlarma
    public void programarAlarma(int horaAlarma, int minutoAlarma) {
        // Escribe aqui tu codigo
        System.out.println("Alarma programada a las: " + horaAlarma + ":" + minutoAlarma);
    }

    // TODO: Metodo SIN parametro - usa this.hora y this.minuto
    // Imprime: "Hora actual: " + this.hora + ":" + this.minuto
    public void mostrarHora() {
        // Escribe aqui tu codigo
        System.out.println("Hora actual: " + this.hora + ":" + this.minuto);
    }
}
