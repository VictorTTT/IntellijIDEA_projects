package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

import java.time.LocalDate;

public class Canario extends  Ave{


    public Canario() {
        super();
    }

    public void cantar(){
        System.out.println("Estoy cantandoi una linda canci�n: piiiiio,pio,pio,piop");
    }

}

