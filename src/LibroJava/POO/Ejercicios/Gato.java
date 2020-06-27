package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/

public class Gato extends Animal implements Mamifero {
    @Override
    public void amamantar() {
        if (this.getSexo().equals(Sexo.MACHO)){
            System.out.println("Yo no puedo amamantare, ves en búsqueda de tu madre");
        }else System.out.println("Ven hijo mío, que tengo leche rica para tí");
    }

    @Override
    public void sangreCaliente() {

    }

    @Override
    public void depredador(Animal alqueMata) {
        System.out.println("Te voy a comer porque tengo que sobrevivir pero no tengo nada encontra de tí");
    }

    @Override
    public void depredadoPor(Animal porelqueMuere) {
        System.out.println("Voy a correr por mi vida");
    }

    //Comportamiento únicos de lor gatos

    public void  araniar (){
        System.out.println("Lo siento pero es que tengo las uñas muy largas y no lo puedo evitar");
    }


}
