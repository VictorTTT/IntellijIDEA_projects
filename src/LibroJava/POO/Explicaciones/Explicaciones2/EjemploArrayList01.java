package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.ArrayList;

public class EjemploArrayList01 {
    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();

        System.out.println("Número de elementos " + a.size());

        a.add("rojo");
        a.add("verde");
        a.add("azul");

        System.out.println("Número de elementos " + a.size());

        a.add("Blanco");

        System.out.println("Número de elementos " + a.size());


    }
}
