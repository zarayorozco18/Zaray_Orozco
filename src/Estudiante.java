public class Estudiante {
    public String nombre = "Maria";
    public double nota = 3.8;

    // TODO: Metodo CON parametro - recibe double notaRecibida
    // Imprime: "Nota registrada: " + notaRecibida
    public void registrarNota(double notaRecibida) {
        // Escribe aqui tu codigo
        double promedio = (this.nota + notaRecibida) / 2;
        System.out.println("Nota registrada: " + notaRecibida);
        System.out.println("promedio " + promedio );
        if (promedio >= 3){
            System.out.println("aprobo el semestre con promedio de: " + promedio);
        }else{
            System.out.println("reprobo el semestre con promedio de: " + promedio);
        }
    }
    
    // TODO: Metodo SIN parametro - usa this.nombre y this.nota
    // Si this.nota >= 3.0 imprime: this.nombre + " APROBO"
    // Si no, imprime: this.nombre + " REPROBO"
    public void verificarEstado() {
        if (this.nota >= 3) {
            System.out.println(this.nombre + " APROBO");
        }
        else{
            System.out.println(this.nombre + " REPROBO");
        }
        System.out.println();
        // Escribe aqui tu codigo
    }
}
