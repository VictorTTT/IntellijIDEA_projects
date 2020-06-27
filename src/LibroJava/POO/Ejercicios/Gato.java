package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

public class Gato extends Animal implements Mamifero {
    @Override
    public void amamantar() {
        if (this.getSexo().equals(Sexo.MACHO)){
            System.out.println("Yo no puedo amamantare, ves en b�squeda de tu madre");
        }else System.out.println("Ven hijo m�o, que tengo leche rica para t�");
    }

    @Override
    public void sangreCaliente() {

    }

    @Override
    public void depredador(Animal alqueMata) {
        System.out.println("Te voy a comer porque tengo que sobrevivir pero no tengo nada encontra de t�");
    }

    @Override
    public void depredadoPor(Animal porelqueMuere) {
        System.out.println("Voy a correr por mi vida");
    }

    //Comportamiento �nicos de lor gatos

    public void  araniar (){
        System.out.println("Lo siento pero es que tengo las u�as muy largas y no lo puedo evitar");
    }


}
