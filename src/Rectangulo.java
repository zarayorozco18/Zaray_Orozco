public class Rectangulo {
    public double ancho = 6;
    public double alto = 5;

    public void area (double base, double altura){
        System.out.println("el area es " + (base * altura));
    }
    public void area (){
        System.out.println("el area es " + (this.ancho * this.alto));
    }
    public void perimetro (){
        System.out.println("el perimetro es " + ((this.ancho * this.alto)*2));
    }
    public void perimetro (double lados, double bases){
        System.out.println("el area es " + ((bases + lados)*2));
    }
}