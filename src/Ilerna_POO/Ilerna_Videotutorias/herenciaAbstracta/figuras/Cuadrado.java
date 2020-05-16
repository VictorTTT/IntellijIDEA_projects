package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public class Cuadrado extends Figura {
    private double lado; //  variable que almacena la medida de cada lado
    public Cuadrado(double lado){// constructor que recibe la medida de un lado
        this.lado=lado; //iguala el parámetro recibido a el campo de clase
        this.lados=4;//  indica el número de lados que tiene una figura, como estamos con un cuadrado serán 4
         this.longitudLado=new double[]{lado,lado,lado,lado};
    }
// Los métodos area() y perímetro() estamos obligados a implementarlos ya que son abstractos en la clase de la que heredamos
    @Override
    public void area() {
        System.out.println("El area del cuadrado: "+(lado*lado));
    }

    @Override
    public void perimetro() {
        perimetro("cuadrado");
    }
}
