package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gato extends Mamifero {



    public Gato() {
        super();
    }

    public void arania() {
        System.out.println("Toma zarpazo!!!");
    }

    public void comer(Animal animal) {
        if (animal instanceof Canario) {
            System.out.println("Lo siento canario pero soy tu cazador natural y ahora mismo tengo mucha hambre");
        } else System.out.println("Este animal no me lo puedo comer, prefiero un canario");
    }


}