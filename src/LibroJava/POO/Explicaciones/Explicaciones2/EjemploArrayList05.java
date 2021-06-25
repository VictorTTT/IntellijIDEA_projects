package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.ArrayList;

public class EjemploArrayList05 {
    public static void main(String[] args) {

        ArrayList<String> colores=new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista:");
        System.out.println(colores);

        // Borrará los elementos que cumplan la condición
        colores.removeIf(color->color.startsWith("b"));

        System.out.println("Contenido de la lista después de removeIf:");
        System.out.println(colores);
    }
}
