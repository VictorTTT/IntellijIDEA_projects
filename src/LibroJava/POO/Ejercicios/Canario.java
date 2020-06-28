package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

import java.time.LocalDate;

public class Canario extends Animal implements Ave{

    public Canario(Sexo sexo, int patas, String sonido) {
        super(sexo, patas, sonido);
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }

    @Override
    public void ponerHuevo() {
        System.out.println("He puesto un huevo");
    }

    @Override
    public void depredador(Animal alqueMata) {
        System.out.println("No soy depredador de nig�n animal");
    }

    @Override
    public void depredadoPor(Animal porelqueMuere) {
        System.out.println("Voy a correr por mi  vida");
    }

    @Override
    public String toString() {
        return super.toString()+ " y soy un canario";
    }

    //M�todos propios de los canarios

    public void cantar(){
        System.out.println("pio,pio");
    }

}
