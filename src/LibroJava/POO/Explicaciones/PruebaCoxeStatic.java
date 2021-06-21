package LibroJava.POO;
/*Como ya hemos comentado, el atributo kilometrajeTotal almacena el número total de
kilómetros que recorren todos los objetos de la clase Coche, es un único valor, por eso
se declara como static. Por el contrario, el atributo kilometraje almacena los kilómetros
recorridos por un objeto concreto y tendrá un valor distinto para cada uno de ellos.
Si en el programa principal se crean 20 objetos de la clase Coche, cada uno tendrá su
propio kilometraje.*/

public class PruebaCoxeStatic {
    public static void main(String[] args) {

        CoxeStatic cocheVictor=new CoxeStatic("Voklswagen","Passat",1400);
        CoxeStatic cocheCorinne=new CoxeStatic("Renault","Scenic",1500);

        cocheVictor.recorre(81000);
        cocheCorinne.recorre(72300);
        System.out.println(cocheCorinne);
        System.out.println(cocheVictor);
        System.out.println();
        System.out.println();
        System.out.println("El coche de Víctor ha recorrido "+cocheVictor.getKilometraje()+" Km ");
        System.out.println("El coche de Corinne ha recorrido "+cocheCorinne.getKilometraje()+" Km ");
        System.out.println("La suma de ambos kilometrajes es de  "+CoxeStatic.getKilometrajeTotal()+" Km ");

        //El método getKilometrajeTotal() se aplica a la clase Coche por tratarse de un método de
        //clase (método static). Este método no se podría aplicar a una instancia (objeto), de la misma
        //manera que un método que no sea static no se puede aplicar a la clase directamente, sino a los
        //objetos.





























    }


























}
