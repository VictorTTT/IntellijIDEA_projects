package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.*;

public class EjemploArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(67);
        listaNumeros.add(78);
        listaNumeros.add(10);
        listaNumeros.add(4);

        System.out.println("N�meros en el orden original:");

        // Por cada n�mero en lista n�emros, impr�memelo
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }


        System.out.println("N�meros despu�s de ordenarlos");
        // Uso de clase static Collections cuyos metodos operan sobre colecciones
        Collections.sort(listaNumeros);
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }


    }
}
