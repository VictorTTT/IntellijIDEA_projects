package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.ArrayList;

public class EjemploArrayList03 {
    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");

        System.out.println("Contenido de la lista");

        for (String i : a) {
            System.out.println("Color " + i);

        }

        for (int i = 0; i <a.size() ; i++) {
            System.out.println(a.get(i));
        }
    }
}
