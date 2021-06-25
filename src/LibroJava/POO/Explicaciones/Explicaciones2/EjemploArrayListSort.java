package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.*;

public class EjemploArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(67);
        listaNumeros.add(78);
        listaNumeros.add(10);
        listaNumeros.add(4);

        System.out.println("Números en el orden original:");

        // Por cada número en lista núemros, imprímemelo
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }


        System.out.println("Números después de ordenarlos");
        // Uso de clase static Collections cuyos metodos operan sobre colecciones
        Collections.sort(listaNumeros);
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }


    }
}
