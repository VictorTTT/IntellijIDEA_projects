package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/

import java.time.LocalDate;

public class Pinguino extends  Animal implements Ave{

    public Pinguino(Sexo sexo, int patas, String sonido) {
        super(sexo, patas, sonido);
    }

    @Override
    public void volar() {

    }

    @Override
    public void ponerHuevo() {

    }

    @Override
    public void depredador(Animal alqueMata) {
        if (alqueMata.equals("Pescado")){
            System.out.println("Me encanta este tipo de comida ");
        }else System.out.println("Prefiero comer otra cosa, gracias...");
    }

    @Override
    public void depredadoPor(Animal porelqueMuere) {
        System.out.println("Voy a correr por mi vida");
    }

    public void andarHaciendoRidiculo(){
        System.out.println("Cuando estoy fuera del agua parezco muy patoso, pero dentro de ella soy muy hábil");
    }

    @Override
    public String toString() {
        return super.toString()+" y soy un Pingüino";
    }
}
