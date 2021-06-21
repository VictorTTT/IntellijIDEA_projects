package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres m�todos espec�ficos de cada clase y redefne el/los m�todo/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen m�todos.*/

public abstract class Ave extends Animal {




    public Ave() {
        super();
    }

    public void ponerHuevo(){
        if (this.getSexo().equals(Sexo.MACHO)){
            System.out.println("Soy macho y no puedo poner un huevo");
        }else System.out.println(" Pap!, he puesto un huevecito!");
    }

    public void limpiate(){
        System.out.println("Me estoy limpiando las plumas");
    }

    public void vuela(Ave tipoAve){ // En este m�todo comprobamos el tipo de ave que quiere volar
        System.out.println("estoy volando");
        if (tipoAve instanceof Pinguino){ // Si el ave es instancia de la clase Ping�ino no podr� volar
            System.out.println("Soy un ping�ino y como peso mucho no puedo volar");
        }else System.out.println("Estoy volando");
    }

    @Override
    public String toString() {
        return super.toString()+" es un AVE ";
    }
}



