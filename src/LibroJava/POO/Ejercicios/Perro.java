package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

import java.time.LocalDate;

public class Perro extends Mamifero {


    public Perro() {
        super();
    }

    public void dameLaPata(){
        System.out.println("Toma mi patita XD");
    }

    public void comer(Animal animal){
        if(animal instanceof Gato){
            System.out.println("Me voy a comer a este gato porque tengo hambre y los gatos me caen mal");
        }else System.out.println("No me gusta el animal que me est�s ofreciendo, prefiero lo gatos");
    }


}