package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/


import java.time.LocalDate;

public class Lagarto extends   Reptil{


    public Lagarto() {
        super();
    }

    public void perderLaCola(){
        System.out.println("Acabo de recibir un ataque y he perdido mi preciada colita");
    }

    @Override
    public String toString() {
        return super.toString()+"y es un LAGARTO";
    }
}

