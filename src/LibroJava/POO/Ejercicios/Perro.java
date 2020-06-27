package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/

public class Perro extends Animal implements Mamifero{
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

    }

    @Override
    public void depredadoPor(Animal porelqueMuere) {

    }
}
