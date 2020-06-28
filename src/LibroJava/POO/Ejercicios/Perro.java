package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

import java.time.LocalDate;

public class Perro extends Animal implements Mamifero{

    public Perro(Sexo sexo, int patas, String sonido) {
        super(sexo, patas, sonido);
    }

    @Override
    public void amamantar() {
        if (this.getSexo().equals(Sexo.MACHO)){
            System.out.println("Los perros no podemos amamantar");
        }else System.out.println("Las perras somos las que podemos amamantar");
    }

    @Override
    public void sangreCaliente() {

    }

    @Override
    public void depredador(Animal alqueMata) {
        System.out.println("Te voy a comer porque tengo que sobrevivir pero no tengo nada en contra de t�");
    }

    @Override
    public void depredadoPor(Animal porelqueMuere) {
        System.out.println("Voy a correr por mi vida");
    }

    @Override
    public String toString() {
        return super.toString()+ "y soy un perro.";
    }

    //Comportamiento propio e los perros

    public void perseguirPelota(){
        System.out.println("L�nzame la pelota por favor que tengo ganas de ir a por ella");

    }
}
