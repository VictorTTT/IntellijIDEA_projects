package LibroJava.POO.Explicaciones.Explicaciones2;

import LibroJava.POO.Animal;
import LibroJava.POO.Gato;

import java.util.ArrayList;

public class EjemploArrayListObjetos {

    public static void main(String[] args) {
        // Array list de la clase envolvente Gato que fue definida por nosotros dentro de este propio proyecto
        ArrayList<Gato> listaGatos = new ArrayList<Gato>();

        listaGatos.add(new Gato(Animal.Sexo.MACHO, "Garfield"));
        listaGatos.add(new Gato(Animal.Sexo.MACHO, "Angora"));
        listaGatos.add(new Gato(Animal.Sexo.MACHO, "Manx"));
        listaGatos.add(new Gato(Animal.Sexo.MACHO, "Persa"));

        for (Gato gato : listaGatos) {
            System.out.println(gato);
        }


    }


}
