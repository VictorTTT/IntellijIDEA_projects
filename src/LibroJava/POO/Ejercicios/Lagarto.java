package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/


import java.time.LocalDate;

public class Lagarto extends Animal implements Reptil{

    public Lagarto(Sexo sexo, int patas, String sonido) {
        super(sexo, patas, sonido);
    }

    @Override
    public void regularTemperatura() {
        System.out.println("Puedo regular la temperatura de mi cuerpo a voluntad");
    }

    @Override
    public void reproduccion() {
        System.out.println("La forma de reproducci�n de los reptiles se pruduce por medio de la fecundaci�n iterna");

    }

    @Override
    public String toString() {
        return super.toString()+ " y soy un lagarto";
    }

    //Comportamiento propio de los lagartos

    public  void treparPared(){
        System.out.println("Puedo trepar gracias a las garras que tengo");
    }
}
