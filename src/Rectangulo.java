public class Rectangulo {
    public double base = 8.0;
    public double altura = 4.0;

    public void CalcularArea(double base, double altura){
        double resultado_area = base * altura;
        System.out.println("El area del rectangulo es: " + resultado_area);
    }
 
    public void CalcularAreaSinParams(){
        double resultado_area = this.base * this.altura;
        System.out.println("El area del rectangulo es: " + resultado_area);
    }

    

}