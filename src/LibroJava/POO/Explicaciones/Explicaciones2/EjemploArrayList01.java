package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.ArrayList;

public class EjemploArrayList01 {
    public static void main(String[] args) {

        //Al crear un objeto de tipo Array list hay que indicar el tipo de dato que se almacenar�, en este caso <String>
        ArrayList<String> a = new ArrayList<>();

        System.out.println("N�mero de elementos " + a.size());

        a.add("rojo");
        a.add("verde");
        a.add("azul");

        System.out.println("N�mero de elementos " + a.size());

        a.add("Blanco");

        System.out.println("N�mero de elementos " + a.size());

        System.out.println("El elemento que hay en la posici�n 0 es " + a.get(0));
        System.out.println("El elemento que hay en la posici�n 3 es " + a.get(3));


    }
}
