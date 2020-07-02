package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/

public abstract class  Mamifero extends Animal{


    public Mamifero() {
        super();
    }

    public void amamantar(){
        if (this.getSexo().equals(Sexo.MACHO)){
            System.out.println("Soy macho y no puedo amamantar");
        }else System.out.println("Toma teta hijito mío, hazte grande");
    }
}
