package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public class Cuadrado extends Figura {
    private double lado; //  variable que almacena la medida de cada lado
    public Cuadrado(double lado){// constructor que recibe la medida de un lado
        this.lado=lado; //iguala el par�metro recibido a el campo de clase
        this.lados=4;//  indica el n�mero de lados que tiene una figura, como estamos con un cuadrado ser�n 4
         this.longitudLado=new double[]{lado,lado,lado,lado};
    }
// Los m�todos area() y per�metro() estamos obligados a implementarlos ya que son abstractos en la clase de la que heredamos
    @Override
    public void area() {
        System.out.println("El area del cuadrado: "+(lado*lado));
    }

    @Override
    public void perimetro() {
        perimetro("cuadrado");
    }
}
