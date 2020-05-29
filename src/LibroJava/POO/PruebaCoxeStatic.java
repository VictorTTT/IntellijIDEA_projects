package LibroJava.POO;
/*Como ya hemos comentado, el atributo kilometrajeTotal almacena el n�mero total de
kil�metros que recorren todos los objetos de la clase Coche, es un �nico valor, por eso
se declara como static. Por el contrario, el atributo kilometraje almacena los kil�metros
recorridos por un objeto concreto y tendr� un valor distinto para cada uno de ellos.
Si en el programa principal se crean 20 objetos de la clase Coche, cada uno tendr� su
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
        System.out.println("El coche de V�ctor ha recorrido "+cocheVictor.getKilometraje()+" Km ");
        System.out.println("El coche de Corinne ha recorrido "+cocheCorinne.getKilometraje()+" Km ");
        System.out.println("La suma de ambos kilometrajes es de  "+CoxeStatic.getKilometrajeTotal()+" Km ");

        //El m�todo getKilometrajeTotal() se aplica a la clase Coche por tratarse de un m�todo de
        //clase (m�todo static). Este m�todo no se podr�a aplicar a una instancia (objeto), de la misma
        //manera que un m�todo que no sea static no se puede aplicar a la clase directamente, sino a los
        //objetos.





























    }


























}
