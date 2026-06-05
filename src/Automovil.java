public class Automovil {
    public String marca = "Ford";
    public String color;
    public String modelo;
    public boolean encendido;

    public void ImprimirInformacionvehiculo(String marca){
        System.out.println("Marca: " + marca);
    }
    public void ImprimirInformacionvehiculo2(){
        System.out.println("Marca: " + this.marca);
    }
}
