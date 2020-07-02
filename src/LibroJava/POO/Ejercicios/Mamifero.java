package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

public abstract class  Mamifero extends Animal{


    public Mamifero() {
        super();
    }

    public void amamantar(){
        if (this.getSexo().equals(Sexo.MACHO)){
            System.out.println("Soy macho y no puedo amamantar");
        }else System.out.println("Toma teta hijito m�o, hazte grande");
    }
}
