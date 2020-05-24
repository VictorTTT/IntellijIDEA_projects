package LibroJava.POO;

import java.util.SortedMap;

public class PruebaCubo {
    public static void main(String[] args) {

        Cubo cubito = new Cubo(2.50); // Creamos un cubo que como máximo le caben 2,50 litros
        Cubo cubote = new Cubo(7.50); // Creamos un cubo que como máximo le caben 7,50 litros

        System.out.println("Cubito: \n");
        cubito.pinta();

        System.out.println("\nCubote: \n");
        cubote.pinta();

        System.out.println("\n Lleno el cubito \n");
        cubito.llena();
        cubito.pinta();

        System.out.println("\n Elcubote sigue vacío \n");
        cubote.pinta();

        System.out.println("\n Ahora vuelco lo que tiene el cubito en el cubote \n");
        cubito.vuelcaEn(cubote);

        System.out.println("\n Cubito: \n");
        cubito.pinta();

        System.out.println("\nCubote: \n");
        cubote.pinta();

















    }
}
