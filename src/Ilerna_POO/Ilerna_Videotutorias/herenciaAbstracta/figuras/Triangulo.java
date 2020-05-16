package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public class Triangulo extends Figura{  //triángulo es una figura por lo tanto hereda las características generales de las figuras
    private double base; //pero añade sus características propias como son la base y la altura
    private double altura;

    public Triangulo(double base, double altura,double lado){//  creamos un constructor que recibe tres parámetros
        this.lados=3; //inicializamos esta variable que viene declarada en las clase padre
        this.longitudLado=new double[]{base,altura,lado}; //inicializamos este array que nos viene declarado en la clase padre
        //  con los parámetros que recibe el constructor
        this.base=base;//  inicializamos el campo de clase con lo recibido por parámetro
        this.altura=altura;//  inicializamos el campo de clase con lo recibido por parámetro
    }
// Segumos estando obligados a implementar los métodos abstractos de la clase padre:
    public void perimetro(){
        perimetro("triangulo");
    }

    @Override
    public void area() {
        System.out.println("Area del triangualo: "+(base*altura)/2);
    }


}
