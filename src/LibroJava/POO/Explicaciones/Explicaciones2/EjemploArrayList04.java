package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.ArrayList;

public class EjemploArrayList04 {

    public static void main(String[] args) {

        ArrayList<String> colores=new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");
        colores.add("blanco");

        System.out.println("Contenido de la lista");
        System.out.println(colores);


        System.out.println("Contenido de la lista después de usar add junto con el indice");
        colores.add(1,"turquesa");

        System.out.println(colores);

    }
}
